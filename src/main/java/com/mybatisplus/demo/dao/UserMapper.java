package com.mybatisplus.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.demo.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;


public interface UserMapper extends BaseMapper<User> {


}
