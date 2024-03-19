package com.example.springdemoapp.service;

import com.example.springdemoapp.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private Long ID = 0L;
    private List<Product> products = new ArrayList<>();

    {
        products.add(new Product(++ID, "Sony Playstation 4", "fat32", 25000, "Moscow", "Sasha"));
    }
    public List<Product> listProducts() {return products;}

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
}
