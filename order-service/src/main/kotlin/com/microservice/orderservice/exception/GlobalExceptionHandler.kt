package com.microservice.orderservice.exception

import jakarta.validation.ConstraintViolation
import jakarta.validation.ConstraintViolationException
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException
import org.springframework.validation.FieldError
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationErrors(ex: MethodArgumentNotValidException): ResponseEntity<Any?> {
        val errors = ex.bindingResult
            ?.fieldErrors
            ?.stream()
            ?.map(FieldError::getDefaultMessage)
            ?.toList()
        return ResponseEntity<Any?>(errors, HttpHeaders(), HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(ConstraintViolationException::class)
    fun handleValidationErrors(ex: ConstraintViolationException) : ResponseEntity<Any> {

        for( constraint in ex.constraintViolations){
            var c = constraint
        }

        return ResponseEntity.status(400).body("constraint")
    }
}