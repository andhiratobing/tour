package com.ratobing.tour.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ratobing.tour.R
import com.ratobing.tour.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //initializing back pressed
    private var backPressedTime: Long = 0
    private var backToast: Toast? = null

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        // Setup the bottom navigation view with navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navBottom)
        bottomNavigationView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        if (backPressedTime + 2_000 > System.currentTimeMillis()) {
            backToast!!.cancel()
            super.onBackPressed()
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            startActivity(intent)
            return
        } else {
            backToast = Toast.makeText(baseContext, "Tekan lagi untuk keluar", Toast.LENGTH_SHORT)
            backToast!!.show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}
