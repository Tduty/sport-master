package info.tduty.sport_master.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.tduty.sport_master.R
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.setTitle(R.string.app_name)
    }
}
