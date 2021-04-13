package br.com.chicorialabs.coroutineplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.chicorialabs.coroutineplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val timer1tv by lazy {
        binding.timer1Tv
    }

    private val timer2tv by lazy {
        binding.timer2Tv
    }

    private val timer1StartBtn by lazy {
        binding.timer1StartBtn
    }

    private val timer2StarBtn by lazy {
        binding.timer2StartBtn
    }

    private val resetTimerBtn by lazy {
        binding.resetTimerBtn
    }


    var timer1: Double = 0.00
    var timer2: Double = 0.00


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        timer1StartBtn.setOnClickListener {
            Thread.sleep(1000)
            timer1 += 1.0
            updateTimers()

        }

        timer2StarBtn.setOnClickListener {
            Thread.sleep(5000)
            timer2 += 5.0
            updateTimers()
        }

        resetTimerBtn.setOnClickListener {
            timer1 = 0.0
            timer2 = 0.0
            updateTimers()
        }

        updateTimers()

    }

    private fun updateTimers() {
        timer1tv.text = timer1.toString()
        timer2tv.text = timer2.toString()
    }


}