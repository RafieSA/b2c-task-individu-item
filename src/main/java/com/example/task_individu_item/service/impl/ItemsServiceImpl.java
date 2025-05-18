package com.example.task_individu_item.service.impl;

import com.example.task_individu_item.dto.ItemsRequest;
import com.example.task_individu_item.dto.UsersRequest;
import com.example.task_individu_item.entity.Items;
import com.example.task_individu_item.repository.ItemsRepository;
import com.example.task_individu_item.service.ItemsService;
import com.example.task_individu_item.utils.exception.BusinessException;
import com.example.task_individu_item.utils.exception.GlobalErrorMapping;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsRepository itemsRepository;

    @Override
    public String createItem(ItemsRequest itemsRequest) {
        if (itemsRepository.findById(String.valueOf(itemsRequest.getId())).isPresent()) {
            throw new BusinessException(HttpStatus.BAD_REQUEST, GlobalErrorMapping.ITEM_ID_ALREADY_EXISTS);
        }
        Items items = Items.builder()
                .id(itemsRequest.getId())
//                .code(usersRequest.)
                .name(itemsRequest.getName())
                .createdAt(Timestamp.from(Instant.now()))
                .updatedAt(Timestamp.from(Instant.now()))
                .isDeleted(Boolean.FALSE)
                .build();
        itemsRepository.save(items);
        return "success create item";
    }

    @Override
    public String updateItem(String id, ItemsRequest itemsRequest) {
        itemsRepository.findById(id).map(data -> {
            data.setName(itemsRequest.getName());
            data.setCode(itemsRequest.getCode());
            data.setUpdatedAt(Timestamp.from(Instant.now()));
            itemsRepository.save(data);

            return data;
        });
        return "success update item";
    }

    @Override
    public String deleteItem(String id) {
        itemsRepository.findById(id).map(data -> {
            data.setIsDeleted(Boolean.TRUE);
            itemsRepository.save(data);
            return data;
        });
        return "success delete item";
    }
}
