package com.loafer.kotlin.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.loafer.kotlin.convert.UserConvert
import com.loafer.kotlin.dto.UserDTO
import com.loafer.kotlin.entity.User
import com.loafer.kotlin.mapper.UserMapper
import com.loafer.kotlin.service.UserService
import com.loafer.kotlin.vo.UserVO
import org.springframework.stereotype.Service

/**
 *
 * @author loafer
 * @since 2025-07-21 21:52:18
 **/
@Service
class UserServiceImpl(val userConvert: UserConvert): ServiceImpl<UserMapper, User>(), UserService {

    /**
     * 添加用户
     * @param userDTO 用户信息
     * @return Boolean
     */
    override fun listAll(): List<UserVO> {
        return list().map { userConvert.toVO(it) }
    }

    /**
     * 添加用户
     * @param userDTO 用户信息
     * @return Boolean
     */
    override fun add(userDTO: UserDTO): Boolean {
        val user = userConvert.toEntity(userDTO)
        return save(user)
    }
}