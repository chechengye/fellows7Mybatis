package com.lovecoding.test;

import com.lovecoding.mapper.BmsBookMapper;
import com.lovecoding.mapper.UserMapper;
import com.lovecoding.pojo.UmsUser;
import com.lovecoding.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class QuickTest {


    @Test
    public void testFn(){

        try {
            //1、获取到主核心配置文件的位置
            String res = "sqlMapConfig.xml";
            //2、根据核心配置文件生成输入流
            InputStream inputStream = Resources.getResourceAsStream(res);
            //3、根据输入流创建SQL会话工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //4、由会话工厂对象来开启会话
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //5、会话是直接可以获取mapper相关的
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<UmsUser> userList = mapper.getAllUser();
            System.out.println(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFn1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BmsBookMapper bmsBookMapper = sqlSession.getMapper(BmsBookMapper.class);
        bmsBookMapper.deleteBookById(1);
    }
}
