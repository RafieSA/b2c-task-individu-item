package com.example.task_individu_item.controller;

import com.example.task_individu_item.dto.ItemsRequest;
import com.example.task_individu_item.service.ItemsService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@NoArgsConstructor
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @PostMapping("/create")
    String createItems(@RequestBody ItemsRequest itemsRequest) {
        return itemsService.createItem(itemsRequest);
    }

    //TODO GET ALL

    @PutMapping("update/{id}")
    String updateItem(@PathVariable String id, @RequestBody ItemsRequest itemsRequest) {
        return itemsService.updateItem(id, itemsRequest);
    }

    @DeleteMapping("/delete/{id}")
    String deleteItem(@PathVariable String id){
        return itemsService.deleteItem(id);
    }
}
