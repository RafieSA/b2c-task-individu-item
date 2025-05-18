package com.example.task_individu_item.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemsRequest {
    private Long id;
    private String code;
    private String name;
}
