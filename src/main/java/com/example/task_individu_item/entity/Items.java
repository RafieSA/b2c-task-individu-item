package com.example.task_individu_item.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


import java.sql.Time;
import java.sql.Timestamp;

@Table(name = "items")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Items {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @OneToMany(mappedBy = "items", cascade = CascadeType.ALL)
    private List<ItemsInventories> itemsInventories;
}
