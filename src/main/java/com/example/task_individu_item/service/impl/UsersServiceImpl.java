package com.example.task_individu_item.service.impl;

import com.example.task_individu_item.dto.UsersRequest;
import com.example.task_individu_item.entity.Users;
import com.example.task_individu_item.repository.UsersRepository;
import com.example.task_individu_item.service.UsersService;
import com.example.task_individu_item.utils.exception.BusinessException;
import com.example.task_individu_item.utils.exception.GlobalErrorMapping;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public String createUser(UsersRequest usersRequest) {
        usersRepository.findById(String.valueOf(usersRequest.getId())).orElseThrow(() -> new BusinessException(HttpStatus.BAD_REQUEST, GlobalErrorMapping.ERROR));
        Users users = Users.builder()
                .id(usersRequest.getId())
                .fullName(usersRequest.getFullName())
                .build();
        usersRepository.save(users);
        return "success create user";
    }

    @Override
    public String updateUser(String id, UsersRequest usersRequest) {
        usersRepository.findById(id).map(data -> {
            data.setFullName(usersRequest.getFullName());
            usersRepository.save(data);
            return data;
        });
        return "success update user";
    }

    @Override
    public String deleteUser(String id) {
        usersRepository.findById(id).map(data -> {
            data.setIsDeleted(Boolean.TRUE);
            usersRepository.save(data);
            return data;
        });
        return "success delete user";
    }
}
