package com.microservice.shippingservice.repository

import com.microservice.shippingservice.entity.Product
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface ProductRepository : ElasticsearchRepository<Product, String> {
}