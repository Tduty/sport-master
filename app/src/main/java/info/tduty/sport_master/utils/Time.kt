package info.tduty.sport_master.utils

/**
 * Created by Evgeniy Mezentsev on 2019-08-30.
 */
enum class Time(val seconds: Long) {
    MINUTE(60),
    HOUR(3600),
    DAY(86400);

    companion object {

        fun toMinutes(seconds: Long): Long {
            return seconds / MINUTE.seconds
        }

        fun toHours(seconds: Long): Long {
            return seconds / HOUR.seconds
        }
    }
}
