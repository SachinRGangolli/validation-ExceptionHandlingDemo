package com.validation.mapper;

import com.validation.dto.UserDto;
import com.validation.entity.User;
public class UserMapper {

    private UserMapper() {
    }

    public static UserDto convertUserToUserDto(User user){
        return UserDto.builder()
                .userId(user.getUserId()).name(user.getName()).email(user.getEmail())
                .mobile(user.getMobile()).gender(user.getGender())
                .age(user.getAge()).nationality(user.getNationality())
                .build();
    }

    public static User convertUserDtoToUser(UserDto userDto)  {
        return User.builder()
                .userId(userDto.getUserId()).name(userDto.getName()).email(userDto.getEmail())
                .mobile(userDto.getMobile()).gender(userDto.getGender())
                .age(userDto.getAge()).nationality(userDto.getNationality())
                .build();
    }
}
