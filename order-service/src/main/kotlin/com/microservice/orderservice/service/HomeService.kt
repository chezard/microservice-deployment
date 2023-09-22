package com.microservice.orderservice.service

import com.microservice.orderservice.aspect.ValidationAnnotation
import com.microservice.orderservice.dto.HomeDto
import jakarta.validation.Valid
import org.springframework.stereotype.Service
import org.springframework.validation.annotation.Validated

@Validated
@Service
class HomeService {

    fun get() = "HomeService worked..."

    @ValidationAnnotation(name = "name")
    fun post(@Valid homeDto: HomeDto) {
        println(homeDto)
    }

}