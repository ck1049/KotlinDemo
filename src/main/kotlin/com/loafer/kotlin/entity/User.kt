package com.loafer.kotlin.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName

/**
 *
 * @author loafer
 * @since 2025-07-21 21:46:52
 **/
@TableName("user")
class User {

    @TableId(type = IdType.AUTO)
    var id: Int? = null
    var username: String? = null
    var password: String? = null
    var name: String? = null
}