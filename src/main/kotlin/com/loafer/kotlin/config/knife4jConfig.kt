package com.loafer.kotlin.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.tags.Tag
import org.springdoc.core.customizers.GlobalOpenApiCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer
import kotlin.random.Random

/**
 *
 * @author loafer
 * @since 2025-07-21 22:55:02
 **/
@Configuration
class knife4jConfig {

    /**
     * 根据@Tag 上的排序，写入x-order
     *
     * @return the global open api customizer
     */
    @Bean
    fun orderGlobalOpenApiCustomizer(): GlobalOpenApiCustomizer {
        return GlobalOpenApiCustomizer { openApi: OpenAPI? ->
            if (openApi!!.getTags() != null) {
                openApi.getTags().forEach(Consumer { tag: Tag? ->
                    val map: MutableMap<String?, Any?> = HashMap<String?, Any?>()
                    map.put("x-order", Random.nextInt(1, 100))
                    tag!!.setExtensions(map)
                })
            }
            if (openApi.getPaths() != null) {
                openApi.addExtension("x-test123", "333")
                openApi.getPaths().addExtension("x-abb", Random.nextInt(1, 100))
            }
        }
    }

    @Bean
    fun customOpenAPI(): OpenAPI? {
        return OpenAPI()
            .info(
                Info()
                    .title("kotlin demo")
                    .version("1.0.0")
                    .description("kotlin demo")
                    .termsOfService("http://doc.xiaominfo.com")
                    .license(
                        License().name("Apache 2.0")
                            .url("http://doc.xiaominfo.com")
                    )
            )
    }
}