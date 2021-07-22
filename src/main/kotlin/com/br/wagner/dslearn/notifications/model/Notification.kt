package com.br.wagner.dslearn.notifications.model

import com.br.wagner.dslearn.user.model.User
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "tb_notification")
class Notification(

    val text: String,
    val momment: Instant,
    val read: Boolean = false,
    val route: String,

    @field:ManyToOne               // associação, varias notificaçoes pode pertencer a um usuario
    @field:JoinColumn(name = "user_id")         // chave estrangeira user na tabela notification
    val user: User

){

    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null


}
