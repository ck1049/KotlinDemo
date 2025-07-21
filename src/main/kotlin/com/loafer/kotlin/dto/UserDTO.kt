package com.loafer.kotlin.dto

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotNull

/**
 * 用户数据传输对象
 * @author loafer
 * @since 2025-07-21 22:24:28
 **/
@Schema(description = "用户数据传输对象")
class UserDTO {

    @Schema(description = "用户名", example = "loafer", required = true)
    @NotNull(message = "用户名不能为空")
    var username: String? = null
    @Schema(description = "密码", example = "Abc123!@#", required = true)
    @NotNull(message = "密码不能为空")
    var password: String? = null
    @Schema(description = "姓名", example = "loafer", required = true)
    @NotNull(message = "姓名不能为空")
    var name: String? = null
}