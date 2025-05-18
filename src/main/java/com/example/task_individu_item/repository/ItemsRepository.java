package com.example.task_individu_item.repository;

import com.example.task_individu_item.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Items, String> {
}
