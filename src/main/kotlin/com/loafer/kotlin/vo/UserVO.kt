package com.loafer.kotlin.vo

import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse

/**
 * 用户视图对象
 * @author loafer
 * @since 2025-07-21 23:19:56
 **/
@ApiResponse(description = "用户视图对象")
class UserVO {

    @Schema(description = "用户id")
    var id: Int? = null
    @Schema(description = "用户名", example = "loafer")
    var username: String? = null
    @Schema(description = "密码", example = "Abc123!@#")
    var password: String? = null
    @Schema(description = "姓名", example = "loafer")
    var name: String? = null
}