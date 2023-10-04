package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var pokemonGenerico: Pokemon
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         //Variables de prueba
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

        var messi = Athlete("Messi", "1234", "Futbol")
        println( messi.alive)
        println( messi.name)
        println( messi.passport)
        println( messi.sport)
        messi.die()
        println( messi.alive)

    }

    fun createNewPokemon(v: View){
        var etName = findViewById<EditText>(R.id.etName)
        var etAttackPower = findViewById<EditText>(R.id.etAttackPower)

        pokemonGenerico = Pokemon()

        if(etName.text.isNullOrEmpty() && etAttackPower.text.isNullOrEmpty()){
            pokemonGenerico.Pokemon(etName.text.toString(),etAttackPower.text.toString().toFloat())
        }

        var ivPokemon = findViewById<ImageView>(R.id.ivPokemon)
        ivPokemon.setImageResource(R.mipmap.pokemon)


        loadDataPokemon(pokemonGenerico)
    }

    private fun loadDataPokemon( pokemon: Pokemon) {
        var description: String = ""
        description += pokemon.getName() + "("
        description += "AP: " + pokemon.getAttackPower().toInt()
        description += "- L: " + pokemon.getLife().toInt() + ")"

        findViewById<TextView>(R.id.tvPokemon).text = description

    }
}