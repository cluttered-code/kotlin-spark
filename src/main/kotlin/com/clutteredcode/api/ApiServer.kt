package com.clutteredcode.api

import spark.Spark.get

/**
 * Created by david on 11/28/16.
 */

fun main(args : Array<String>) {
    get("/ping", { request, response -> "pong" })
}