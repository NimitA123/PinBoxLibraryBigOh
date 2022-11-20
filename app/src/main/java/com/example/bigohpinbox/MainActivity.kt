package com.example.bigohpinbox

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.example.bigohpinbox.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this,   R.layout.activity_main)
        pinView()
    }

    @SuppressLint("ResourceType")
    private fun pinView() {
        //hidden password
        activityMainBinding.circlePinView.setPasswordHidden(true)
        //To change Color of the item entering wrong or right otp
     activityMainBinding.circlePinView.addTextChangedListener {
            if(it?.length == activityMainBinding.circlePinView.itemCount){
                activityMainBinding.circlePinView.setLineColor(
                    ResourcesCompat.getColor(resources,R.color.teal_700, theme))
            }
        }
        //To change color of the focus Text box

    }
}