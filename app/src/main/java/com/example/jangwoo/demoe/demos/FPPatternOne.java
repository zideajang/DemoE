package com.example.jangwoo.demoe.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FPPatternOne {

    static UserRepo repo;


    public static void main(String[] args) {
        repo = new UserRepo();
        getAllUsers();
    }

    private static List<UserDto> getAllUsers() {
        return repo.findAll()
                .stream().map(user -> toDto(user))
                .collect(Collectors.toList());

//        UserRepo repo = new UserRepo();
//        List<User> users =  repo.findAll();
//        List<UserDto> dtos = new ArrayList<>();
//
//        for(User user: users){
//            UserDto dto = new UserDto();
//            dto.setUsername(user.getName());
//            dtos.add(dto);
//        }
//
//        return dtos;
    }

    private static UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setUsername(user.getName());
        return dto;
    }
}
