package info.tduty.sport_master.utils

import android.content.Context
import info.tduty.sport_master.R

/**
 * Created by Evgeniy Mezentsev on 2019-08-30.
 */
class DateConverter {

    companion object {

        fun convertDayOfWeek(context: Context, dayOfWeek: DayOfWeek): String {
            return when (dayOfWeek) {
                DayOfWeek.MONDAY -> context.getString(R.string.monday)
                DayOfWeek.TUESDAY -> context.getString(R.string.tuesday)
                DayOfWeek.WEDNESDAY -> context.getString(R.string.wednesday)
                DayOfWeek.THURSDAY -> context.getString(R.string.thursday)
                DayOfWeek.FRIDAY -> context.getString(R.string.friday)
                DayOfWeek.SATURDAY -> context.getString(R.string.saturday)
                DayOfWeek.SUNDAY -> context.getString(R.string.sunday)
            }
        }

        fun convertSecondsToTimeOfDay(context: Context, seconds: Long): String {
            val hours = Time.toHours(seconds)
            val minutes = Time.toMinutes(seconds % hours)
            return context.getString(R.string.time_of_day_without_seconds, hours, minutes)
        }
    }
}
