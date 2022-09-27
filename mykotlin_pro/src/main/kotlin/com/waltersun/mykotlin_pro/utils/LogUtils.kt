package com.waltersun.mykotlin_pro.utils

import lombok.experimental.UtilityClass
import org.slf4j.LoggerFactory

/**
 * @author  道禹 Walter
 * @date    2022-09-27
 */
@UtilityClass
class LogUtils {
    companion object {
        val LOGGER_ERROR = LoggerFactory.getLogger("LOGGER_ERROR")
        val LOGGER_WARN = LoggerFactory.getLogger("LOGGER_WARN")
        val LOGGER_INFO = LoggerFactory.getLogger("LOGGER_INFO")

        fun logInfo(format: String, vararg arguments: Any) {
            LOGGER_INFO.warn(format, arguments)
        }

        fun logWarn(format: String, vararg arguments: Any) {
            LOGGER_WARN.warn(format, arguments)
        }

        fun logError(format: String, vararg arguments: Any) {
            LOGGER_ERROR.error(format, arguments)
        }

        fun logError(format: String, t: Throwable) {
            LOGGER_ERROR.error(format, t)
        }
    }
}