package com.example.task_individu_item.service;

import com.example.task_individu_item.dto.UsersRequest;

public interface UsersService {
    String createUser(UsersRequest usersRequest);

    //TODO GETALL
    String updateUser(String id, UsersRequest usersRequest);

    String deleteUser(String id);

}
