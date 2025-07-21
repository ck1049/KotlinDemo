package com.loafer.kotlin.convert

import com.loafer.kotlin.dto.UserDTO
import com.loafer.kotlin.entity.User
import com.loafer.kotlin.vo.UserVO
import org.springframework.stereotype.Component

/**
 *
 * @author loafer
 * @since 2025-07-21 22:36:39
 **/
@Component
class UserConvert {

    fun toEntity(userDTO: UserDTO): User {
        return User().apply {
            username = userDTO.username
            password = userDTO.password
            name = userDTO.name
        }
    }

    fun toVO(user: User): UserVO {
        return UserVO().apply {
            id = user.id
            username = user.username
            password = user.password
            name = user.name
        }
    }
}