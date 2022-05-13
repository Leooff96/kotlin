package com.teste.demo.adapter.endpoint

import com.teste.demo.domain.User
import com.teste.demo.business.CreateUserUseCase
import com.teste.demo.business.dto.UserDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class UserController(private val createUserUseCase: CreateUserUseCase) {

    @PostMapping
    fun createUser(@RequestBody user: UserDTO): User {
        return createUserUseCase.create(user.toDomain())
    }
}