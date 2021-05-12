package com.example.androidlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var bottomNavigation: BottomNavigationView? = null
    private var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        bottomNavigation = findViewById(R.id.bottom_navigation)
        handleNavigation()
        createBadge()
    }

    private fun createBadge() {
        bottomNavigation?.getOrCreateBadge(R.id.action_menu_recycleview)?.also { badge ->
            badge.isVisible = true
            badge.number = 97
        }

        bottomNavigation?.getOrCreateBadge(R.id.action_menu_bottomsheet)?.also { badge ->
            badge.isVisible = true
            badge.clearNumber()
        }

        bottomNavigation?.getOrCreateBadge(R.id.action_menu_settings)?.also { badge ->
            badge.isVisible = true
            badge.number = 99999
        }
    }

    private fun handleNavigation() {
        bottomNavigation?.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_menu_recycleview -> navController?.navigate(R.id.recycleViewFragment).let { true }
                R.id.action_menu_bottomsheet -> navController?.navigate(R.id.bottomSheetFragment).let { true }
                R.id.action_menu_settings -> navController?.navigate(R.id.settingsFragment).let { true }
                else -> false
            }
        }
    }
}
