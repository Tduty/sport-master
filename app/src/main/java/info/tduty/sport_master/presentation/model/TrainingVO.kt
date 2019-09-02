package info.tduty.sport_master.presentation.model

import info.tduty.sport_master.utils.DayOfWeek

/**
 * Created by Evgeniy Mezentsev on 2019-08-30.
 */
data class TrainingVO(
    val dayOfWeek: DayOfWeek,
    val title: String,
    val startTime: Long
)