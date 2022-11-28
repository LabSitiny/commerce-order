package dev.labsitiny.commerceorder.port.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(path = "")
interface ItemClient {
}