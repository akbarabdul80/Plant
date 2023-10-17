package com.olivia.plant.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.olivia.plant.databinding.ActivityMainBinding
import com.olivia.plant.ui.image_detection.camera.CameraActivity
import com.oratakashi.viewbinding.core.tools.onClick
import com.oratakashi.viewbinding.core.tools.startActivity
import com.zero.zerobase.presentation.viewbinding.BaseActivity


class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initUI() {
        super.initUI()

        with(binding) {
            bottomNavigationView.background = null
            fabCamera.onClick {
                startActivity(CameraActivity::class.java)
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.frameLayout.id, fragment)
        fragmentTransaction.commit()
    }
}