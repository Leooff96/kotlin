package com.teste.demo.adapter.persistence

import com.teste.demo.adapter.persistence.entity.UserEntity
import com.teste.demo.adapter.persistence.repository.UserJPARepository
import com.teste.demo.business.repository.UserRepository
import com.teste.demo.domain.User
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import java.util.Optional

@Component
class UserRepositoryImpl(private val repository: UserJPARepository): UserRepository {

    override fun get(): User? {
        return repository.findByIdOrNull(1)?.toDomain()
    }

    override fun getAll(): List<User> {
        return repository.findAll().map { it.toDomain() }
    }

    override fun create(user: User): User {
        val user = repository.save(UserEntity.fromDomain(user))
        return user.toDomain()
    }

}