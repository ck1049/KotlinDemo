package com.loafer.kotlin.vo

import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse

/**
 *
 * @author loafer
 * @since 2025-07-21 23:27:19
 **/
@ApiResponse(description = "接口返回数据模型")
class ApiRspModel<T> {

    @Schema(description = "状态码")
    var code: Int = 0
    @Schema(description = "返回信息")
    var message: String = "success"
    @Schema(description = "返回数据")
    var data: T? = null
}