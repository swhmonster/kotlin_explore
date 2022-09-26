package com.waltersun.mykotlin_pro.service.impl

import com.alibaba.middleware.jingwei.enums.TableEnum
import com.waltersun.mykotlin_pro.service.TestService

/**
 * @author  道禹 Walter
 * @date    2022-09-26
 */
class TestServiceImpl : TestService {
    override fun commonTest() {
        TableEnum.getServiceName("aaa")
    }

}