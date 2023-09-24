package com.microservice.shippingservice.repository

import com.microservice.shippingservice.entity.Category
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface CategoryRepository : ElasticsearchRepository<Category, String> {
}