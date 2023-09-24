package com.microservice.shippingservice.entity

import jakarta.persistence.GeneratedValue
import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "products")
data class Product(

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,

    val name: String? = null,

    val category: Category? = null
) {
}