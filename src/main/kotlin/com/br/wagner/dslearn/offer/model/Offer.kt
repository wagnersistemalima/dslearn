package com.br.wagner.dslearn.offer.model

import com.br.wagner.dslearn.course.model.Course
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "tb_offer")
class Offer(

    val edition: String,
    val starMoment: Instant,
    val endMoment: Instant,

    @field:ManyToOne                  // associação -> varias ofertas sao apresentadas para um course
    @field:JoinColumn(name = "course_id")       // chave estrangeira na tabela offer
    val course: Course
){
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}
