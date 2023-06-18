package com.example.shopp.service.product;

import com.example.shopp.entity.product.Product;
import com.example.shopp.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
