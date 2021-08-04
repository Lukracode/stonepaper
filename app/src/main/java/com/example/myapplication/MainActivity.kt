package com.example.myapplication

import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    var threeVars : Array<String> = arrayOf("stone", "paper", "scissors")




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        lateinit var myChoice: String
        lateinit var roboChoice: String
        var winscore : Int = 0
        var losescore : Int = 0
        bindingClass.winScore.text = winscore.toString()
        bindingClass.loseScore.text = losescore.toString()

        bindingClass.yourStone.setOnClickListener {
            myChoice = "stone"
            roboChoice = threeVars.random()
            bindingClass.roboChoiceOut.text = roboChoice

                if (roboChoice == "stone") {
                    bindingClass.result.text = "DRAW"
            } else if (roboChoice == "paper") {
                    bindingClass.result.text = "YOU LOST"
                    losescore++
                    bindingClass.loseScore.text = losescore.toString()
                }
                else if (roboChoice == "scissors") {
                    bindingClass.result.text = "YOU WIN"
                    winscore++
                    bindingClass.winScore.text = winscore.toString()
                }
        }

        bindingClass.yourPaper.setOnClickListener {
            myChoice = "paper"
            roboChoice = threeVars.random()
            bindingClass.roboChoiceOut.text = roboChoice

            if (roboChoice == "stone") {
                bindingClass.result.text = "YOU WIN"
                winscore++
                bindingClass.winScore.text = winscore.toString()
            } else if (roboChoice == "paper") {
                bindingClass.result.text = "DRAW"
            }
            else if (roboChoice == "scissors") {
                bindingClass.result.text = "YOU LOST"
                losescore++
                bindingClass.loseScore.text = losescore.toString()
            }
        }

        bindingClass.yourScissors.setOnClickListener {
            myChoice = "scissors"
            roboChoice = threeVars.random()
            bindingClass.roboChoiceOut.text = roboChoice

            if (roboChoice == "stone") {
                bindingClass.result.text = "YOU LOST"
                losescore++
                bindingClass.loseScore.text = losescore.toString()
            } else if (roboChoice == "paper") {
                bindingClass.result.text = "YOU WIN"
                winscore++
                bindingClass.winScore.text = winscore.toString()
            }
            else if (roboChoice == "scissors") {
                bindingClass.result.text = "DRAW"
            }
        }


    }

}