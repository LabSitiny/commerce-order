package dev.labsitiny.commerceorder.core.domain

data class Payment(
    val id: Long,
    val paymentType: PaymentType
) {
}