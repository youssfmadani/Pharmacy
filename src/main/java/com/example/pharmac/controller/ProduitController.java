package com.example.pharmac.controller;

import com.example.pharmac.model.Produit;
import com.example.pharmac.service.ProduitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produit")
public class ProduitController {

    private final ProduitService productService;

    public ProduitController(ProduitService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Produit> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/AddProduit")
    public Produit createProduct(@RequestBody Produit product) {
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produit> updateProduct(@PathVariable Long id, @RequestBody Produit updatedProduct) {
        return productService.updateProduct(id, updatedProduct)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
