package com.teste.demo.adapter.persistence.repository

import com.teste.demo.adapter.persistence.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface UserJPARepository : CrudRepository<UserEntity,Long> {
}