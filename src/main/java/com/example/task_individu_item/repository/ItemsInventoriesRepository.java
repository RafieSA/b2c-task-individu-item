package com.example.task_individu_item.repository;

import com.example.task_individu_item.entity.ItemsInventories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsInventoriesRepository extends JpaRepository<ItemsInventories, String> {
}
