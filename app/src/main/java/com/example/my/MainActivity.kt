package com.example.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.my.feature.main_screen.ui.MainScreenViewModel
import com.example.my.feature.main_screen.domain.model.NewsDomainModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.Observer

class MainActivity : AppCompatActivity() {
    val newsScreenViewModel by viewModel<MainScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportFragmentManager.beginTransaction().replace(R.id.container, MainScreenFragment, Fragment)

        newsScreenViewModel.lifeData.observe(this, Observer(::render))
    }

    fun render(state: NewsDomainModel) {
        findViewById<TextView>(R.id.textView).let {
            it.text = "${state.content}"
        }
    }
}

