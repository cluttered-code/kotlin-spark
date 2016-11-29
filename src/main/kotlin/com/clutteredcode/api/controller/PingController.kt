package com.clutteredcode.api.controller

import spark.Request
import spark.Response

/**
 * Created by david on 11/29/16.
 */
class PingController {

    fun handle(request: Request?, response: Response?): String {
        return "pong"
    }
}