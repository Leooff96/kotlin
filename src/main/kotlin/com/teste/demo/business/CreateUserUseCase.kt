package com.teste.demo.business

import com.teste.demo.business.repository.UserRepository
import com.teste.demo.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CreateUserUseCase(private val repository: UserRepository) {

    fun create(user: User) : User{
        return repository.create(user)
    }
}