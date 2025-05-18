package com.example.task_individu_item.dto;

import lombok.*;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemsResponse {
    private Long id;
    private String code;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isDeleted;
}
