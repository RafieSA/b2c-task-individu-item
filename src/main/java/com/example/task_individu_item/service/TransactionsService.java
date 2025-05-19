package com.example.task_individu_item.service;

import com.example.task_individu_item.dto.TransactionsRequest;
import com.example.task_individu_item.dto.TransactionsResponse;

public interface TransactionsService {
    String createTransaction(TransactionsRequest transactionsRequest);
}
