package com.example.task_individu_item.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionsRequest {
    private Long id;
    private String trxCode;
    private Integer quantity;
    private Integer price;
    private Long itemInventoryId;
    private Long createdBy;
}
