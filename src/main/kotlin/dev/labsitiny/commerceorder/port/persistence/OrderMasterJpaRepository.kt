package dev.labsitiny.commerceorder.port.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderMasterJpaRepository : JpaRepository<OrderMasterJpaEntity, Long> {
}