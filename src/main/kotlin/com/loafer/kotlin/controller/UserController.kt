package com.loafer.kotlin.controller

import com.loafer.kotlin.dto.UserDTO
import com.loafer.kotlin.service.UserService
import com.loafer.kotlin.vo.ApiRspModel
import com.loafer.kotlin.vo.UserVO
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author loafer
 * @since 2025-07-21 21:53:08
 **/
@Tag(name = "用户控制器")
@RestController
@RequestMapping("/user")
class UserController(val userService: UserService) {

    /**
     * 获取用户列表
     */
    @Operation(summary = "获取用户列表")
    @GetMapping("/list")
    fun list(): ApiRspModel<List<UserVO>> = ApiRspModel<List<UserVO>>().apply { data = userService.listAll() }

    /**
     * 添加用户
     */
    @Operation(summary = "添加用户")
    @PostMapping("/add")
    fun add(@Validated @RequestBody userDTO: UserDTO): Boolean {
        return userService.add(userDTO)
    }
}