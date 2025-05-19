package com.example.task_individu_item.service.impl;

import com.example.task_individu_item.dto.TransactionsRequest;
import com.example.task_individu_item.entity.Transactions;
import com.example.task_individu_item.entity.Users;
import com.example.task_individu_item.repository.TransactionsRepository;
import com.example.task_individu_item.repository.UsersRepository;
import com.example.task_individu_item.service.TransactionsService;
import com.example.task_individu_item.utils.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
@RequiredArgsConstructor
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;

    @Autowired
    UsersRepository usersRepository;

    @Override
    public String createTransaction(TransactionsRequest transactionsRequest) {
        Users user = usersRepository.findById(String.valueOf(transactionsRequest.getCreatedBy()))
                .orElseThrow(() -> new BusinessException(HttpStatus.BAD_REQUEST, "User with that ID not found"));

        Transactions transactions = Transactions.builder()
//                .id(transactionsRequest.getId())
                .trxCode(transactionsRequest.getTrxCode())
                .itemInventoryId(transactionsRequest.getItemInventoryId())
                .quantity(transactionsRequest.getQuantity())
                .price(transactionsRequest.getPrice())
                .isDeleted(false)
                .createdAt(Timestamp.from(Instant.now()))
                .updatedAt(Timestamp.from(Instant.now()))
                .createdBy(user)
                .build();

        transactionsRepository.save(transactions);

        return "success create transaction";
    }
}
