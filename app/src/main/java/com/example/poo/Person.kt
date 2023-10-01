package com.example.poo

class Person(var name:String = "Anonimo", var passport:String? = null) {
    var alive: Boolean = true
    fun die(){
        alive = false
    }
    fun Person(){
        name = "Juan"
        passport = "1234"
        alive = true
    }
}