package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rboz = Person("Roberto", null)

        println( rboz.alive)
        println( rboz.name)
        println( rboz.passport)
        rboz.die()
        println( rboz.alive)

        var anonimo = Person()
        println( anonimo.alive)
        println( anonimo.name)
        println( anonimo.passport)
        anonimo.die()
        println( anonimo.alive)

        anonimo.Person()
        println( anonimo.alive)
        println( anonimo.name)
        println( anonimo.passport)
        anonimo.die()
        println( anonimo.alive)
    }
}