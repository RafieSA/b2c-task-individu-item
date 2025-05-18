package com.example.task_individu_item.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Transactions {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "trx_code")
    private String trxCode;

    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private Long createdBy;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "is_deleted")
    private Builder isDeleted;

    @Column(name = "item_inventory_id")
    private Long itemInventoryId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Integer price;
}
