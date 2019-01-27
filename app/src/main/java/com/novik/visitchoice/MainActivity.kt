package com.novik.visitchoice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val visitList = arrayListOf("Tahoe lake", "Carmel", "Yosemity", "Las Vegas", "Kolomna")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var occupation = "developer"

        decideBtn.setOnClickListener {
            val random = java.util.Random()
            val randomVisit = random.nextInt(visitList.count())
            selectedVisitTxt.text = visitList[randomVisit]
        }

        addVisitBtn.setOnClickListener {
            val newVisit = addVisitTxt.text.toString().trimStart()
            if (newVisit != "") visitList.add(newVisit)
            addVisitTxt.text?.clear()
            println(visitList)
        }

    }
}
