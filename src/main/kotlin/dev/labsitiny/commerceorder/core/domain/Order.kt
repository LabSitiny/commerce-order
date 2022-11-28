package dev.labsitiny.commerceorder.core.domain

data class Order(
    val id: Long,
    val items: List<Item>,
    val payment: Payment,
    val shipping: Shipping,
    val owner: User
) {
}