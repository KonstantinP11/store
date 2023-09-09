package com.pk.basket.Service;

import com.pk.basket.Repository.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    private Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Long> id) {
        id.forEach(item -> basket.add(item));
    }

    @Override
    public List<Long> get() {
        return basket.get();
    }
}