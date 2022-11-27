package dev.labsitiny.commerceorder.port.persistence

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Data
class OrderStatusJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 1
}