package com.exampl.motionlayout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.exampl.motionlayout.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewBinding().also {
            it.configureViews()
        }
    }

    private fun setupViewBinding() : ActivitySplashBinding {
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        return binding
    }

    private fun ActivitySplashBinding.configureViews() {
        widgetMotion.splashScreenEvents.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {}
            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {}
            override fun onTransitionTrigger(motionLayout: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {}
            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {}
        })
    }

    private fun goToMainScreen() = startActivity(Intent(this@SplashActivity, MainActivity::class.java))
}
