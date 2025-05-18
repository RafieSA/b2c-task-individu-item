package com.example.task_individu_item.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionsResponse {
    private Long id;
    private String trxCode;
    private Long createdBy;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isDeleted;
    private Long item_inventory_id;
    private Integer quantity;
    private Integer price;
}
