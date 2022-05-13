package com.teste.demo.business.dto

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.teste.demo.domain.User

data class UserDTO (@JsonProperty("id") var Id: Long){

    fun toDomain() = User(Id)

    companion object{
        fun fromDomain(user: User) = UserDTO(user.Id)
    }
}
