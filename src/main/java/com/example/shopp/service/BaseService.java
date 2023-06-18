package com.example.shopp.service;

import java.util.UUID;

public interface BaseService<T> {

    T create(T t);

    void delete(UUID id);

    T update(T t);


}
