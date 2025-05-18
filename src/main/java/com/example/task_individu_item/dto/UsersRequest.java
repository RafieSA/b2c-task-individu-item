package com.example.task_individu_item.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersRequest {
    private Long id;
    private String fullName;
}
