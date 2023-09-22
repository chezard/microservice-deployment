package com.microservice.orderservice.controller

import com.microservice.orderservice.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.annotation.Validated

@Validated
class BaseController {

    @Autowired
    lateinit var userService: UserService

    fun getUser() = userService.getUser()

}