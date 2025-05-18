package com.example.task_individu_item.service;

import com.example.task_individu_item.dto.ItemsRequest;
import com.example.task_individu_item.dto.UsersRequest;

public interface ItemsService {
    String createItem(ItemsRequest itemsRequest);

    //TODO GETALL

    String updateItem(String id, ItemsRequest itemsRequest);

    String deleteItem(String id);
}
