package com.example.task_individu_item.repository;

import com.example.task_individu_item.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, String> {
}
