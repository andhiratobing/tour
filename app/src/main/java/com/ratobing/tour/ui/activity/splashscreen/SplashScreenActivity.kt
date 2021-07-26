package com.ratobing.tour.ui.activity.splashscreen

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.ratobing.tour.databinding.ActivitySplashScreenBinding
import com.ratobing.tour.ui.activity.MainActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.TRANSPARENT


        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }

}