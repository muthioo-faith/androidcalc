package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CalculatorApp : AppCompatActivity() {
    lateinit var etNumber1: EditText
    lateinit var etnum2: EditText
    lateinit var btnplus: Button
    lateinit var btnminus: Button
    lateinit var btntimes: Button
    lateinit var btnmodulus: Button
    lateinit var btnresult: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_app)
        etNumber1 = findViewById(R.id.etNumber1)
        etnum2 = findViewById(R.id.etnum2)
        btnplus = findViewById(R.id.btnplus)
        btnminus = findViewById(R.id.btnminus)
        btntimes = findViewById(R.id.btntimes)
        btnmodulus = findViewById(R.id.btnmodulus)
        btnresult=findViewById(R.id.btnresult)

        btnplus.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var num2 = etnum2.text.toString().toInt()
            plus(number1,num2)
        }
        btnminus.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var num2 = etnum2.text.toString().toInt()
            minus(number1, num2)
        }
        btnmodulus.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var num2 = etnum2.text.toString().toInt()
            modulus(number1, num2)
        }
        btntimes.setOnClickListener {
            var number1 = etNumber1.text.toString().toInt()
            var num2 = etnum2.text.toString().toInt()
            Times(number1,num2)
        }
    }

    fun plus(number1: Int, num2: Int) {
        var plus= number1 + num2
      btnresult.text = plus.toString()

    }

    fun minus(number1: Int, num2: Int) {
        var minus = number1 - num2
        btnresult.text = minus.toString()
    }
    fun Times(number1: Int,num2: Int){
        var Times=number1*num2
        btnresult.text=Times.toString()
    }
    fun modulus(number1: Int,num2: Int){
        var modulus=number1%num2
        btnresult.text= modulus.toString()
    }

}