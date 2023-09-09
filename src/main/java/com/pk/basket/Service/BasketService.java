package com.pk.basket.Service;

import java.util.List;

public interface BasketService {
    void add(List<Long> id);

    List<Long> get();
}