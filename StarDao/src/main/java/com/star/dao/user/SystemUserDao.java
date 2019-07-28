package com.star.dao.user;

import com.star.pojo.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Author Star.Wu
 * @Date 2019/5/25 11:49
 * @description 系统管理员数据层
 */
@Mapper
@Component
public interface SystemUserDao {
    SystemUser getUserInfoByUserName(String userName);
}
