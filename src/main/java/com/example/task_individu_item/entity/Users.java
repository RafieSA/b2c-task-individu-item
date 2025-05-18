package com.example.task_individu_item.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Users {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
