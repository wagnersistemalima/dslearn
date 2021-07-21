package com.br.wagner.dslearn.roles.model

import javax.persistence.*

// perfil de usuario

@Entity
@Table(name = "tb_role")
class Role(

    val authority: String
){
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
