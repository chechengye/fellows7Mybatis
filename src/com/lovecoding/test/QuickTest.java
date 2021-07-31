package com.lovecoding.test;

import com.lovecoding.mapper.BmsBookMapper;
import com.lovecoding.mapper.UserMapper;
import com.lovecoding.pojo.BmsBook;
import com.lovecoding.pojo.UmsUser;
import com.lovecoding.util.SqlSessionUtil;
import com.lovecoding.vo.QueryVo;
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
        System.out.println(bmsBookMapper.deleteBookById(2));
    }

    /**
     * 添加用户
     */
    @Test
    public void testFn2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UmsUser user = new UmsUser();
        user.setName("诸葛亮");
        user.setUsername("zhugeliang");
        user.setPassword("123");
        int rows = userMapper.addUser(user);
    }

    /**
     * 需求：根据用户名模糊查询用户信息，查询条件放到QueryVo的user属性中
     */
    @Test
    public void testFn3(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        UmsUser umsUser = new UmsUser();
        umsUser.setName("飞");
        vo.setUmsUser(umsUser);
        List<UmsUser> umsUserList =  userMapper.getUsersByQueryVo(vo);
        System.out.println(umsUserList);
    }

    /**
     * 多参数、并且不想封装对象的情况
     * 根据用户名与密码获取用户
     */
    @Test
    public void testFn4(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UmsUser umsUser = userMapper.getUserByUserNameAndPassword("zhangsan","123");
        System.out.println(umsUser);
    }

    @Test
    public void testFn5(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BmsBookMapper bmsBookMapper = sqlSession.getMapper(BmsBookMapper.class);
        BmsBook bmsBook = bmsBookMapper.getBookById(3);
        System.out.println(bmsBook);
    }
}
