package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //clase log
        Log.v(MainActivity::class.java.name, "Este es un log v")
        Log.d(MainActivity::class.java.name, "Este es un log d de debugger")
        Log.i(MainActivity::class.java.name, "Este es un log i de information")
        Log.w(MainActivity::class.java.name, "Este es un log w de warning")
        Log.e(MainActivity::class.java.name, "Este es un log e de error") //cuando hagamos un try catch

        var=getString(R.string.hello)

    }
}