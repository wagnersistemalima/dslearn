package com.br.wagner.dslearn.resource.model

import com.br.wagner.dslearn.offer.model.Offer
import javax.persistence.*

@Entity
@Table(name = "tb_resource")
class Resource(

    val title: String,
    val description: String,
    val position: Int,
    val imgUri: String,
    val type: ResourceType,

    @field:ManyToOne         // varios recursos pode pertencer a uma oferta
    @field:JoinColumn(name = "offer_id")      // chave estrangeira offer na tabela resource
    val offer: Offer

){

    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}
