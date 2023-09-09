package com.pk.basket.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class Basket {
    private List<Long> basketList = new ArrayList<>();

    public void add(Long id) {
        basketList.add(id);
    }

    public List<Long> get() {
        return Collections.unmodifiableList(basketList);
    }
}