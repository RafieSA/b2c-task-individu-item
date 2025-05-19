package com.example.task_individu_item.controller;

import com.example.task_individu_item.dto.TransactionsRequest;
import com.example.task_individu_item.dto.UsersRequest;
import com.example.task_individu_item.service.TransactionsService;
import com.example.task_individu_item.service.UsersService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
@NoArgsConstructor
public class TransactionsController {

    @Autowired
    TransactionsService transactionsService;

    @PostMapping("/create")
    String createTransaction(@RequestBody TransactionsRequest transactionsRequest) {
        return transactionsService.createTransaction(transactionsRequest);
    }
}
