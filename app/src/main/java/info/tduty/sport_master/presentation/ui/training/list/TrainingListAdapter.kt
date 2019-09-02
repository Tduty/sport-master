package info.tduty.sport_master.presentation.ui.training.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import info.tduty.sport_master.utils.DateConverter
import info.tduty.sport_master.R
import info.tduty.sport_master.presentation.model.TrainingVO
import kotlinx.android.synthetic.main.item_training.view.*

/**
 * Created by Evgeniy Mezentsev on 2019-08-30.
 */
class TrainingListAdapter : RecyclerView.Adapter<TrainingListAdapter.ViewHolder>() {

    private val list: MutableList<TrainingVO> = ArrayList()

    fun setTrainingList(trainingList: List<TrainingVO>) {
        list.clear()
        list.addAll(trainingList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_training, parent, true)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position != RecyclerView.NO_POSITION) {
            holder.onBind(list[position])
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(trainingVO: TrainingVO) {
            itemView.tv_date.text =
                DateConverter.convertDayOfWeek(itemView.context, trainingVO.dayOfWeek)
            itemView.tv_title.text = trainingVO.title
            itemView.tv_time.text = DateConverter.convertSecondsToTimeOfDay(
                itemView.context,
                trainingVO.startTime
            )
        }
    }
}