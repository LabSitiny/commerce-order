package dev.labsitiny.commerceorder.core.domain

data class Item(
    val id : Long,
    val name: String,
    val price: Long,
    val shippingFee: Long
) {
}