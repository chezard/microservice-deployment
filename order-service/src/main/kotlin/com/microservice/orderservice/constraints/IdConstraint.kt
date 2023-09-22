package com.microservice.orderservice.constraints

import jakarta.validation.Constraint
import jakarta.validation.Payload
import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.reflect.KClass

@NotBlank
@NotNull
@Size(min = 6, message = "Password size must be min. 6")
@Size(max = 20, message = "Password size must be max. 20")
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD)
@Constraint(validatedBy = [])
annotation class IdConstraint(
    @Valid val message: String = "Wrong password format",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)

