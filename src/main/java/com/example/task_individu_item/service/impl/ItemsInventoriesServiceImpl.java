package com.example.task_individu_item.service.impl;

import com.example.task_individu_item.dto.ItemsInventoriesRequest;
import com.example.task_individu_item.entity.ItemsInventories;
import com.example.task_individu_item.repository.ItemsInventoriesRepository;
import com.example.task_individu_item.service.ItemsInventoriesService;
import com.example.task_individu_item.utils.exception.BusinessException;
import com.example.task_individu_item.utils.exception.GlobalErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class ItemsInventoriesServiceImpl implements ItemsInventoriesService {
    @Autowired
    ItemsInventoriesRepository itemsInventoriesRepository;

    @Override
    public String createItemInventories(ItemsInventoriesRequest itemsInventoriesRequest) {
        if (itemsInventoriesRepository.findById(String.valueOf(itemsInventoriesRequest.getItemId())).isPresent()) {
            throw new BusinessException(HttpStatus.BAD_REQUEST, GlobalErrorMapping.ID_ITEM_NOT_FOUND);
        }

        ItemsInventories itemsInventories = ItemsInventories.builder()
                .id(itemsInventoriesRequest.getId())
                .price(itemsInventoriesRequest.getPrice())
                .quantity(itemsInventoriesRequest.getQuantity())
                .build();
        itemsInventoriesRepository.save(itemsInventories);
        return "success create item inventories";
    }

    @Override
    public String updateItemInventories(ItemsInventoriesRequest itemsInventoriesRequest) {
        return "success update item inventories";
    }

    @Override
    public String deleteItemInventories(ItemsInventoriesRequest itemsInventoriesRequest) {
        return "success delete item inventories";
    }
}
