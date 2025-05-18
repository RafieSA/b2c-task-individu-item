package com.example.task_individu_item.controller;

import com.example.task_individu_item.dto.UsersRequest;
import com.example.task_individu_item.service.UsersService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@NoArgsConstructor
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/create")
    String createUser(@RequestBody UsersRequest usersRequest) {
        return usersService.createUser(usersRequest);
    }

    //TODO GETALL

    @PutMapping("/update/{id}")
    String updateUser(@PathVariable String id, @RequestBody UsersRequest usersRequest){
        return usersService.updateUser(id, usersRequest);
    }

    @DeleteMapping("/delete/{id}")
    String deleteUser(@PathVariable String id) {
        return usersService.deleteUser(id);
    }
}
