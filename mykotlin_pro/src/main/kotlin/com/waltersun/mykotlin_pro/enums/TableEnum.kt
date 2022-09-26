package com.alibaba.middleware.jingwei.enums


/**
 * @author  道禹 Walter
 * @date    2022-09-26
 */
enum class TableEnum(val tableName: String, val serviceName: String) {
    GLOBAL_USER_ADDRESS("__test_global_user_address", "globalUserAddress"),
    GLOBAL_USER_ADDRESS_SNAPSHOT("__test_global_user_address_snapshot", "globalUserAddressSnapshot");

    companion object {
        fun getServiceName(table: String): String {
            for (value in TableEnum.values()) {
                if (value.tableName == table) {
                    return value.serviceName
                }
            }
            return ""
        }
    }
}
