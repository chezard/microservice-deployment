package com.microservice.orderservice.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component


@Aspect
@Component
class ValidationAspect {
    @Before(value = "@annotation(validationAnnotation)")
    fun beforeTargetAnnotation(validationAnnotation: ValidationAnnotation) {
        println("Before advice: Annotated with MyCustomAnnotation: ${validationAnnotation.name}")
    }
}

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class ValidationAnnotation(
    val name: String
)