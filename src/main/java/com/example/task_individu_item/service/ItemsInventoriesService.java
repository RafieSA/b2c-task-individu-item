package com.example.task_individu_item.service;

import com.example.task_individu_item.dto.ItemsInventoriesRequest;

public interface ItemsInventoriesService {
    String createItemInventories(ItemsInventoriesRequest itemsInventoriesRequest);

    // TODO GETALL

    String updateItemInventories(ItemsInventoriesRequest itemsInventoriesRequest);

    String deleteItemInventories(ItemsInventoriesRequest itemsInventoriesRequest);
}
