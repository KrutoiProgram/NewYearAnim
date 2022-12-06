package com.example.newyearanimation

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Filter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.airbnb.lottie.LottieAnimationView

private lateinit var el_btn: ImageButton
private lateinit var santa: ImageButton
private lateinit var anim: Animation



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        el_btn = findViewById(R.id.imageView7)
        santa = findViewById(R.id.imageView17)
        santa.isVisible = false
        santa.isEnabled = false
        el_btn.setOnClickListener {
            santa.isVisible = true
            santa.isEnabled = true
            anim = AnimationUtils.loadAnimation(this,R.anim.snowflake_anim)
            santa.startAnimation(anim)

        }
        santa.setOnClickListener {

        }
        santa.isVisible = false









    }

}