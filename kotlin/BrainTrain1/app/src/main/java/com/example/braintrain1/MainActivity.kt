package com.example.braintrain1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.braintrain1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var answer= mutableListOf<Int>()
    lateinit var tvAnswer:TextView
    private lateinit var tvCounter: TextView
    private lateinit var num1:Button
    private lateinit var num2:Button
    private lateinit var num3:Button
    private lateinit var num4:Button
    private lateinit var tvTask:TextView
    lateinit var tvTimer:TextView
    private lateinit var btAgain: Button
    private var score=0
    private var correctAnswer=0
    private var numOfTry=0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        num1=binding.tvNum1
        num2=binding.tvNum2
        num3=binding.tvNum3
        num4=binding.tvNum4
        tvTask=binding.tvTask
        tvAnswer=binding.tvAnswer
        tvCounter=binding.tvCounter
        tvTimer=binding.tvTimer
        btAgain=binding.btnAgain
        newTry()

        btnClick()

        val timer = object: CountDownTimer(5100, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                tvTimer.text=(millisUntilFinished/1000).toString()+"s"
            }
            override fun onFinish() {
                tvAnswer.text="Done!"
                btAgain.visibility= View.VISIBLE
                btnNoClick()
            }
        }
        timer.start()
        btAgain.setOnClickListener{
            newTry()
            score=0
            numOfTry=0
            tvTimer.text="30s"
            tvCounter.text= "$score/$numOfTry"
            timer.start()
            btAgain.visibility= View.INVISIBLE
            tvAnswer.text=""
            btnClick()
        }
    }

    private fun btnClick() {
        num3.setOnClickListener{
            if (correctAnswer.toString() == num3.text.toString()){
                tvAnswer.text="Correct :)"
                score++
            }else{
                tvAnswer.text="Wrong :("
            }
            numOfTry++
            tvCounter.text= "$score/$numOfTry"
            newTry()
        }
        num2.setOnClickListener{
            if (correctAnswer.toString() == num2.text.toString()){
                tvAnswer.text="Correct :)"
                score++
            }else{
                tvAnswer.text="Wrong :("
            }
            numOfTry++
            tvCounter.text= "$score/$numOfTry"
            newTry()
        }
        num1.setOnClickListener{
            if (correctAnswer.toString() == num1.text.toString()){
                tvAnswer.text="Correct :)"
                score++
            }else{
                tvAnswer.text="Wrong :("
            }
            numOfTry++
            tvCounter.text= "$score/$numOfTry"
            newTry()
        }
        num4.setOnClickListener{
            if (correctAnswer.toString() == num4.text.toString()){
                tvAnswer.text="Correct :)"
                score++
            }else{
                tvAnswer.text="Wrong :("
            }
            numOfTry++
            tvCounter.text= "$score/$numOfTry"
            newTry()
        }
    }

    private fun btnNoClick() {
        num1.setOnClickListener{
            btAgain.error = "Click"
        }
        num2.setOnClickListener{
            btAgain.error = "Click"
        }
        num3.setOnClickListener{
            btAgain.error = "Click"
        }
        num4.setOnClickListener{
            btAgain.error = "Click"
        }
    }

    @SuppressLint("SetTextI18n")
    private fun newTry(){
        val rand1=(1..20).shuffled().first()
        val rand2=(1..20).shuffled().first()
        tvTask.text= "$rand1+$rand2"
        correctAnswer=(1..4).shuffled().first()
        answer.clear()
        for (i in 1..4){
                if (i==correctAnswer){
                    answer.add(rand1+rand2)
                    correctAnswer=rand1+rand2
                }else{
                    var wrongAnswer=(1..40).shuffled().first()
                    while (wrongAnswer==(rand1+rand2)){
                        wrongAnswer=(1..40).shuffled().first()
                    }
                    answer.add(wrongAnswer)
                }
            }
        num1.text= answer[0].toString()
        num2.text= answer[1].toString()
        num3.text= answer[2].toString()
        num4.text= answer[3].toString()
    }
 }
