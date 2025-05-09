package com.example.pharmac.service;

import com.example.pharmac.model.Produit;
import com.example.pharmac.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {
    private final ProduitRepository productRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.productRepository = produitRepository;
    }

    public List<Produit> getAllProducts() {
        return productRepository.findAll();
    }

    public Produit addProduct(Produit product) {
        return productRepository.save(product);
    }

    public Optional<Produit> updateProduct(Long id, Produit updatedProduct) {
        return productRepository.findById(id).map(product -> {
            product.setName(updatedProduct.getName());
            product.setQuantity(updatedProduct.getQuantity());
            product.setPrice(updatedProduct.getPrice());
            product.setDescription(updatedProduct.getDescription());
            return productRepository.save(product);
        });
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
