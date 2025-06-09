package org.example.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.order.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    User selectUsers(Long id);
}
