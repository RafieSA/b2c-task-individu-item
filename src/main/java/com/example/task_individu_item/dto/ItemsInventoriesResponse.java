package com.example.task_individu_item.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemsInventoriesResponse {
    private Long id;
    private Long item_id;
    private BigDecimal price;
    private Integer quantity;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isDeleted;
}
