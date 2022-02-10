package com.digit.goodsaccounting.controller;

import com.digit.goodsaccounting.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AdminController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/admin/items")
    public String getAllItems(Model model) {
        model.addAttribute("items", itemService.getAllItem());
        return "items";
    }

    @GetMapping("/admin/item/add")
    public String getFileUploadPage() {
        return "item_upload";
    }

    @PostMapping("/admin/item/add")
    public String addItem(@RequestParam("file") MultipartFile file) {
        itemService.save(file);
        return "redirect:/admin/items";
    }
}
