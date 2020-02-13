package org.ndp.dns_query_ns.bean

import com.squareup.moshi.Json

data class MQResult(
    @Json(name = "task-id") val taskID: Int,
    val result: List<DNSRR>,
    val status: Int,
    val desc: String
)