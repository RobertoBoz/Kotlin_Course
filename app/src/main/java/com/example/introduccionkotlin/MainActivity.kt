package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    /* Las constantes se agrega al companion object se declara fuera del proceso de creación de la pantalla para poder acceder a ellas desde
        cualquier punto de la aplicación */
    companion object {
        // Declarar constantes no son aplicables a variables locales
        const val moneda = "EUR"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  Los valores sé declararán con val son pueden tener cambios en tiempo de ejecución
        val fecha = "99/99/1999"
        // Las variables declaradas con var son las que pueden tener cambios en tiempo de ejecución
        var nombre = "Roberto"
        // Para imprimir como en todos los lenguajes se ocupa println o  print
        println("$nombre $fecha")
        // Cambiamos el nombre por otro e imprimimos de nuevo
        nombre = "Alberto"
        println("$nombre $fecha")
        // Al intentar cambiar la fecha se generara un error
        println(moneda)

    }
}