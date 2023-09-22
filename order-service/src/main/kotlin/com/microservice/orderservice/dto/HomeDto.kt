package com.microservice.orderservice.dto

import jakarta.validation.constraints.Size

data class HomeDto(
    @field: Size(min = 4, max = 60)
    val home: String? = null
)