package com.br.wagner.dslearn.section.model

import com.br.wagner.dslearn.resource.model.Resource
import javax.persistence.*

@Entity
@Table(name = "tb_section")
class Section(

    val title: String,
    val description: String,
    val position: String,
    val imgUri: String,

    @field:ManyToOne           // associação varias sections esta contida em um resource
    @field:JoinColumn(name = "resource_id")  // chave estrangeira na tabela section
    val resource: Resource,

    // associação recursiva unidirecional

    @field:ManyToOne
    @field:JoinColumn(name = "prerequisite_id")
    val prerequisite: Section
){

    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}
