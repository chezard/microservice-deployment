package com.microservice.shippingservice.controller

import com.microservice.shippingservice.entity.Category
import com.microservice.shippingservice.entity.Product
import com.microservice.shippingservice.repository.CategoryRepository
import com.microservice.shippingservice.repository.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(
    val productRepository: ProductRepository,
    val categoryRepository: CategoryRepository
) {

    @GetMapping("/save-product")
    fun saveProduct(): Product {
        var category = Category(name="Category1")
        category = categoryRepository.save(category)
        val product = Product(name = "Product1", category = category)
        productRepository.save(product)
        return product
    }

    @GetMapping("/save-category")
    fun saveCategory(): Category {
        val category = Category(name = "New")
        categoryRepository.save(category)
        return category
    }

    @GetMapping("/products")
    fun getProducts(): List<Product> {
        return productRepository.findAll().toList()
    }

    @GetMapping("/categories")
    fun getCategories(): List<Category> {
        return categoryRepository.findAll().toList()
    }

}