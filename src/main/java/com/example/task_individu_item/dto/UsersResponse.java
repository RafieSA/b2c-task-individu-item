package com.example.task_individu_item.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersResponse {
    private Long id;
    private String fullName;
    private Timestamp createdAt;
}
