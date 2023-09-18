package com.microservice.shippingservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping
    fun get() = "Shipping Service is running!"

}