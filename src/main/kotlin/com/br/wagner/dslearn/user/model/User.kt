package com.br.wagner.dslearn.user.model

import com.br.wagner.dslearn.roles.model.Role
import javax.persistence.*

@Entity
@Table(name = "tb_user")
class User(

    val name: String,
    val email: String,
    val password: String
){

    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @field:ManyToMany(fetch = FetchType.EAGER)
    val roles: Set<Role> = hashSetOf()
}
