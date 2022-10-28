package com.waltersun.mykotlin_pro.annoation

/**
 * @author  道禹 Walter
 * @date    2022-10-28
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class MyAnnotation(val why: String)
