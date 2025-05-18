package com.example.task_individu_item.repository;

import com.example.task_individu_item.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
}
