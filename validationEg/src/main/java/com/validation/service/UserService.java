package com.validation.service;

import com.validation.dto.UserDto;
import com.validation.entity.User;
import com.validation.mapper.UserMapper;
import com.validation.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(UserDto userDto){
         User user = UserMapper.convertUserDtoToUser(userDto);
         return userRepository.save(user);
    }

    public List<UserDto> findAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream().map(UserMapper::convertUserToUserDto).collect(Collectors.toUnmodifiableList());
    }

    public User findUserById(int id){
       return userRepository.findByUserId(id);
    }
}
