package com.lxb.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lxb.entity.User;

@Mapper
public interface UserMapper {

	@Select("select * from user where id = #{id}")
	User selectUserById(@Param("id") Integer id);

	@Insert("INSERT INTO user (`id`, `username`, `sex`) VALUES (NULL, #{name}, #{sex});")
	int insert(@Param("name") String name, @Param("sex") String sex);

}
