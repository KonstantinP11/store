package com.pk.basket.Controllers;

import com.pk.basket.Service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController
@RequestMapping("/order")

public class BasketController {
    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam List<Long> id) {
        basketService.add(id);
        return "Товары добавлены";
    }

    @GetMapping("/get")
    public List<Long> get() {
        return basketService.get();
    }
}