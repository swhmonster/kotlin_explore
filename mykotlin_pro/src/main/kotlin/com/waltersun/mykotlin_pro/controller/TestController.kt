package com.waltersun.mykotlin_pro.controller

import com.waltersun.mykotlin_pro.service.TestService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import lombok.RequiredArgsConstructor
import lombok.SneakyThrows
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * @author  道禹 Walter
 * @date    2022-10-28
 */
@RestController
@Api(tags = ["功能测试相关接口"])
@RequestMapping("test")
@Slf4j
@RequiredArgsConstructor
class TestController {
    private val testService: TestService? = null
    @SneakyThrows
    @GetMapping("queryTest")
    @ApiOperation(value = "查询测试", response = String::class)
    @ResponseBody
    fun commonTest() {
        testService?.commonTest()
    }
}