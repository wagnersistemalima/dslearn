package com.br.wagner.dslearn.course.model

import com.br.wagner.dslearn.offer.model.Offer
import javax.persistence.*

@Entity
@Table(name = "tb_course")
class Course(

    val name: String,
    val imgUri: String,
    val imgGrayUri: String
){
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @field:OneToMany(mappedBy = "course")          // um course possui varias ofertas
    val offers: List<Offer> = mutableListOf()
}
