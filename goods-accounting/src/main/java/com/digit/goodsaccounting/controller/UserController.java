package com.digit.goodsaccounting.controller;

import com.digit.goodsaccounting.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public String getItemPage(Model model) {
        model.addAttribute("items", itemService.getAllItem());
        return "items";
    }
}
