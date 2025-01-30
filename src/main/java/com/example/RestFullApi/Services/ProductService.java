package com.example.RestFullApi.Services;

import org.springframework.stereotype.Service;
import com.example.RestFullApi.Entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public Optional<Product> getProductById(Long id) {
        return productList.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public boolean updateProduct(Long id, Product updatedProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                updatedProduct.setId(id); // Ensuring the ID is not changed
                productList.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(Long id) {
        return productList.removeIf(product -> product.getId().equals(id));
    }
}
