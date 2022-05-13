package com.teste.demo.adapter.persistence.entity

import com.teste.demo.domain.User
import javax.persistence.*

@Entity
@Table(name = "User")
data class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var Id: Long) {

        fun toDomain() = User(Id)

        companion object {
           fun fromDomain(user: User) = UserEntity(user.Id)
        }

}