package com.example.task_individu_item.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemsInventoriesRequest {
    private Long id;
    private Long itemId;
    private BigDecimal price;
    private Integer quantity;

}
