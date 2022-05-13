package com.teste.demo.business.repository

import com.teste.demo.domain.User

interface UserRepository {

    fun get(): User?
    fun getAll(): List<User>
    fun create(user: User): User
}