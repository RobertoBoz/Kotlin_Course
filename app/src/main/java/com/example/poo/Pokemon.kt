package com.example.poo

class Pokemon(private var name: String = "Mew", private var attackPower: Float = 30f, private var life: Float = 100f) {

    fun Pokemon(n:String,aP:Float){
        this.name = n
        this.attackPower = aP
        this.life = 100f
    }

    fun getName():String{
        return this.name
    }

    fun setName(n:String){
        this.name = n
    }

    fun setAttackPower(aP:Float){
        this.attackPower = aP
    }

    fun getAttackPower():Float{
        return this.attackPower
    }

    fun setLife(l:Float){
        this.life = l
    }

    fun getLife():Float{
        return this.life
    }

}