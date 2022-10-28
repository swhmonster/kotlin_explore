package com.waltersun.mykotlin_pro.aspect

import com.waltersun.mykotlin_pro.annoation.MyAnnotation
import lombok.extern.slf4j.Slf4j
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.*
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

/**
 * @author  道禹 Walter
 * @date    2022-10-28
 */
@Component
@Aspect
@Slf4j
class MyAspect {

    @Pointcut("@annotation(com.waltersun.mykotlin_pro.annoation.MyAnnotation)")
    private fun pointCut() {
    }

    @Before("pointCut()")
    fun beforeAdvice() {
        MyAspect.log.debug("aspect before")
    }

    @After("pointCut()")
    fun afterAdvice() {
        MyAspect.log.debug("aspect after")
    }

    /**
     * around 的优先级高于 before 和 after
     */
    @Around("pointCut()")
    @Throws(Throwable::class)
    fun aroundAdvice(proceedingJoinPoint: ProceedingJoinPoint) {
        // get annotation params
        val signature: MethodSignature = proceedingJoinPoint.getSignature() as MethodSignature
        val annotation: MyAnnotation = signature.getMethod().getAnnotation(MyAnnotation::class.java)
        val annotationValue: String = annotation.value()
        MyAspect.log.debug("annotationValue:{},aspect around front", annotationValue)
        val obj: Any = proceedingJoinPoint.proceed()
        MyAspect.log.debug("annotationValue:{},aspect around end :{}", annotationValue, JSON.toJSONString(obj))
    }
}