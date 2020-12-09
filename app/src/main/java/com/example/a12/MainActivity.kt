package com.example.a12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x: Int
        x=0
            for (i in 1..100){
                if (i%15==0) {x=1}
               else{ if (i%3==0) x=2
                if (i%5==0) x=3}
            when (x) {
                1 -> println("Piff Paff")
                2 -> println("Piff ")
                3 -> println("Paff")
            }
            }
    }
}