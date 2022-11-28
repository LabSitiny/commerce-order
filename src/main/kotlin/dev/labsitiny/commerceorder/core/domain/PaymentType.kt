package dev.labsitiny.commerceorder.core.domain

enum class PaymentType(
    val type: String
) {
    DEPOSIT("deposit"),
    CARD("card")
}