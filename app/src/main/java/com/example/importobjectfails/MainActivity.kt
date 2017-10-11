package com.example.importobjectfails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.library.Turtles
import com.example.library.canYouHearTheDrums

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        Log.d("THIS", canYouHearTheDrums.toString())

        Log.d("THAT", Turtles.allTheWayDown)
    }
}
