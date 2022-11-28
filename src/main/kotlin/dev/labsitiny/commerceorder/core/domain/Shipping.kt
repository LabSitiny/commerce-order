package dev.labsitiny.commerceorder.core.domain

data class Shipping(
    val id: Long,
    val receiver: User
) {
}