package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    /* Las constantes se agrega al companion object se declara fuera del proceso de creación de la pantalla para poder acceder a ellas desde
        cualquier punto de la aplicación */
    companion object {
        // Declarar constantes no son aplicables a variables locales
        const val moneda = "MX"
    }

    /*
        Estos son los tipos de datos numéricos que hay en Kotlin, el numero de bits que usa. Con eso podremos saber el numero de valores
        que pueda almacenar :
        Double 64
        Float 32
        Long 64
        Int 32
        Short 16
        Byte 8
    */
    // Para declarar un valor Float en kotlin al final del valor se colocara una F mayusculas
    var saldo : Float = 300.15F
    var sueldoFloat : Float = 764.154f
    // En caso de no colocar una asignacion de Floar a un valor el ID asumira que sera un valor tipo doble sin necesidad de declararlo asi
    var sueldo = 764.154
    // De esta manera se declara un valor entero
    var id: Int = 62

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  Los valores sé declararán con val son pueden tener cambios en tiempo de ejecución
        val fecha = "99/99/1999"
        // Las variables declaradas con var son las que pueden tener cambios en tiempo de ejecución
        var nombre:String = "Roberto"
        // Para declarar valores boleanos se hace de la siguiente manera
        var vip: Boolean = false
        // Para declarar valores tipo char se hace de la siguiente manera
        var inicial: Char = 'i'
        // Para imprimir como en todos los lenguajes se ocupa println o  print
        println("$nombre $fecha")
        // Cambiamos el nombre por otro e imprimimos de nuevo
        nombre = "Alberto"
        println("$nombre $fecha")
        // Al intentar cambiar la fecha se generara un error
        println(moneda)
        // Tipos de datos Int , Strings, String ,Boolean, Float y Double
        println("id: $id Nombre: $nombre Fecha: $fecha Vip: $vip  Saldo: $saldo Sueldo: $sueldoFloat")
    }
}