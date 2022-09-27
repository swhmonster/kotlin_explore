package com.waltersun.mykotlin_pro.service.impl

import com.alibaba.middleware.jingwei.enums.TableEnum
import com.waltersun.mykotlin_pro.service.TestService
import com.waltersun.mykotlin_pro.utils.LogUtils

/**
 * @author  道禹 Walter
 * @date    2022-09-26
 */
class TestServiceImpl : TestService {
    override fun commonTest() {
        TableEnum.getServiceName("aaa")
        LogUtils.logInfo("enum test TableEnum.getServiceName:{}", TableEnum.getServiceName("aaa"))
    }

}