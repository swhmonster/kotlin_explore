package com.waltersun.mykotlin_pro.service.impl

import com.alibaba.middleware.jingwei.enums.TableEnum
import com.waltersun.mykotlin_pro.annoation.MyAnnotation
import com.waltersun.mykotlin_pro.service.TestService
import com.waltersun.mykotlin_pro.utils.LogUtils
import java.io.StringReader
import java.util.Properties

/**
 * @author  道禹 Walter
 * @date    2022-09-26
 */
class TestServiceImpl : TestService {
    @MyAnnotation("commonTest")
    override fun commonTest() {
        TableEnum.getServiceName("aaa")
        LogUtils.logInfo("enum test TableEnum.getServiceName:{}", TableEnum.getServiceName("aaa"))
    }

}

fun main(){
    val s = "backdoor=false\n" +
            "request-timeout=3888000000\n" +
            "test-env=product"
    print(Properties().load(StringReader(s)))
}
