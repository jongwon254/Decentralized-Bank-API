package com.jongwonlee.api.bank.database

import org.jetbrains.exposed.sql.Table

// Database model
object Banks: Table() {
    val id = integer("id").autoIncrement()
    val ip_address = varchar("ip_address", 50)
    val account_number = varchar("account_number", 50)
    val port = integer("port")
    val node_identifier = varchar("node_identifier", 50)
    val version = varchar("version", 50)
    val protocol = varchar("protocol", 50)
    val transaction_fee = integer("transaction_fee")
    val trust = integer("trust")
}