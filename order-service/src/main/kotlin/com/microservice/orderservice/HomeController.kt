package com.microservice.orderservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping
    fun get() = "Order Service is running!"

}