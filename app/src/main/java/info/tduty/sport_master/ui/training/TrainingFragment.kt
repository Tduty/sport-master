package info.tduty.sport_master.ui.training

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import info.tduty.sport_master.R
import kotlinx.android.synthetic.main.fragment_training.*

class TrainingFragment : Fragment(R.layout.fragment_training) {

    private var adapter: TrainingAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TrainingAdapter()
        rv_training.layoutManager = LinearLayoutManager(requireContext())
        rv_training.adapter = adapter
    }
}
