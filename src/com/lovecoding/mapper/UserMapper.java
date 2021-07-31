package com.lovecoding.mapper;

import com.lovecoding.pojo.UmsUser;
import com.lovecoding.vo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<UmsUser> getAllUser();

    int addUser(UmsUser user);

    List<UmsUser> getUsersByQueryVo(QueryVo vo);

    //多参数需要借助于@Param 来帮我们取别名，供#{}、${}
    UmsUser getUserByUserNameAndPassword(@Param("username") String username, @Param("password") String password);
}
