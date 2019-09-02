package info.tduty.sport_master.presentation.ui.training.list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import info.tduty.sport_master.R
import info.tduty.sport_master.presentation.model.TrainingVO
import kotlinx.android.synthetic.main.fragment_training_list.*

class TrainingListFragment : Fragment(R.layout.fragment_training_list) {

    private var adapter: TrainingListAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TrainingListAdapter()
        rv_training.layoutManager = LinearLayoutManager(requireContext())
        rv_training.adapter = adapter
    }

    fun setTrainingList(trainingList: List<TrainingVO>) {
        adapter?.setTrainingList(trainingList)
    }
}
