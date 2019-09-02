package info.tduty.sport_master.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.tduty.sport_master.R
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toolbar.setTitle(R.string.app_name)
    }
}
