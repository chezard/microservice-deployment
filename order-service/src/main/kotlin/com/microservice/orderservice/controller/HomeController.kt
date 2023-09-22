package com.microservice.orderservice.controller

import com.microservice.orderservice.constraints.IdConstraint
import com.microservice.orderservice.dto.HomeDto
import com.microservice.orderservice.service.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(val homeService: HomeService) : BaseController() {

    @GetMapping
    fun get() = homeService.get()

    @GetMapping("/post")
    fun post(): String {
        val homeDto = HomeDto("s")
        val user = getUser()
        println(user)
        homeService.post(homeDto)
        return "OK"
    }

    @GetMapping("/id/{id}")
    fun getById(@IdConstraint @PathVariable id: String) = id

}