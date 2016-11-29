@file:JvmName("ApiServer")
package com.clutteredcode.api

import com.clutteredcode.api.controller.PingController
import spark.Spark.get

/**
 * Created by david on 11/28/16.
 */

fun main(args : Array<String>) {
    val pingController : PingController = PingController()
    get("/ping", { request, response -> pingController.handle(request, response) })
}