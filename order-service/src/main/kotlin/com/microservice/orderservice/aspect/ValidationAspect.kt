package com.microservice.orderservice.aspect

import com.microservice.orderservice.dto.HomeDto
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.AfterThrowing
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType


@Aspect
@Component
class ValidationAspect {
//    @Before(value = "@annotation(validationAnnotation)")
//    fun beforeTargetAnnotation(joinPoint: JoinPoint, validationAnnotation: ValidationAnnotation) {
//        val  a : HomeDto = joinPoint.args[0] as HomeDto
//        println(a)
//        println("Before advice: Annotated with MyCustomAnnotation: ${validationAnnotation.name}")
//    }

    @AfterReturning(value = "@annotation(validationAnnotation)", returning = "r")
    fun afterTargetAnnotation(joinPoint: JoinPoint, validationAnnotation: ValidationAnnotation, r: Any?) {
        val a: HomeDto = joinPoint.args[0] as HomeDto
        println(a)
        println("runned")
        println(r)
        println("Before advice: Annotated with MyCustomAnnotation: ${validationAnnotation.name}")
        println("Before advice: Annotated with MyCustomAnnotation: ${validationAnnotation.num}")
    }
}

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class ValidationAnnotation(
    val name: String,
    val num : Int
)