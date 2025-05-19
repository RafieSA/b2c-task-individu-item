package com.example.task_individu_item.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemsRequest {
    private Long id;
    private String code;
    private String name;

    private BigDecimal price;
    private Integer quantity;
}
