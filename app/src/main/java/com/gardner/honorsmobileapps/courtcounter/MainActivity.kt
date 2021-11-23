package com.gardner.honorsmobileapps.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

var a = 0
var b = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val myClickListener: View.OnClickListener
        val pointsA: TextView = findViewById(R.id.pointA)
        val threeA: Button = findViewById(R.id.threepointA)
        threeA.setOnClickListener{view -> a = a+3
        pointsA.text = "${a}"
        Snackbar.make(findViewById(R.id.snackbar_one),"YAY TEAM A" , Snackbar.LENGTH_SHORT).show() }
        val twoA: Button = findViewById(R.id.twopointA)
        twoA.setOnClickListener{view -> a = a+2
            pointsA.text = "${a}"}
        val freeA: Button = findViewById(R.id.freethrowA)
        freeA.setOnClickListener{view -> a = a+1
            pointsA.text = "${a}"}

        val pointsB: TextView = findViewById(R.id.pointB)
        val threeB: Button = findViewById(R.id.threepointsB)
        threeB.setOnClickListener{view -> b = b+3
            pointsB.text = "${b}"
            Snackbar.make(findViewById(R.id.snackbar_one),"YAY TEAM B" , Snackbar.LENGTH_SHORT).show()}
        val twoB: Button = findViewById(R.id.twopointsB)
        twoB.setOnClickListener{view -> b = b+2
            pointsB.text = "${b}"}
        val freeB: Button = findViewById(R.id.freethrowB)
        freeB.setOnClickListener{view -> b = b+1
            pointsB.text = "${b}"}

        val reset: Button = findViewById(R.id.reset)
        reset.setOnClickListener{view -> a=0
            pointsA.text = "0"
            b=0
            pointsB.text ="0"
        }
    }
}