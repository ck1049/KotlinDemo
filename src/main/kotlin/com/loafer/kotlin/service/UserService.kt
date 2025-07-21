package com.loafer.kotlin.service

import com.baomidou.mybatisplus.extension.service.IService
import com.loafer.kotlin.dto.UserDTO
import com.loafer.kotlin.entity.User
import com.loafer.kotlin.vo.UserVO

/**
 *
 * @author loafer
 * @since 2025-07-21 21:51:55
 **/
interface UserService: IService<User> {

    /**
     * 获取用户列表
     * @return 用户列表
     */
    fun listAll() : List<UserVO>

    /**
     * 添加用户
     * @param userDTO 用户信息
     * @return 是否添加成功
     */
    fun add(userDTO: UserDTO) : Boolean
}