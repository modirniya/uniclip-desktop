package xyz.uniclip.ucd.util

import java.time.ZonedDateTime

class LogHelper {
    companion object {

        fun l(origin: String) {
            log("LOCATE", origin, "")
        }

        fun d(origin: String, content: String) {
            log("DEBUG", origin, content)
        }

        fun e(origin: String, content: String) {
            log("ERROR", origin, content)
        }

        fun i(origin: String, content: String) {
            log("INFO", origin, content)
        }

        fun w(origin: String, content: String) {
            log("WARNING", origin, content)
        }

        private fun log(type: String, origin: String, content: String) {
            println("[$type] $origin: $content ${ZonedDateTime.now().toLocalDateTime()}")
        }
    }
}