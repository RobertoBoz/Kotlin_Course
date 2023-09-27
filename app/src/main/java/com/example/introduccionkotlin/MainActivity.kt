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
        // Operadoress
        var a:Int = 5 + 5 // 10
        var b:Int = 10 - 2 // 8
        var c:Int = 3 * 4 // 12
        var d:Int = 10 / 5 // 2
        var e:Int = 10 % 3 // 1 no se puede dividr y solo se queda con el resto
        var f:Int = 10 / 6 // 1 divicion es infinita solo se mantiene la parte entera

        var aPreIncremento:Int = 5
        var bPreDecremento:Int = 5
        var cPostIncremento:Int = 5
        var dPostDecremento:Int = 5

        println(aPreIncremento)
        println(++aPreIncremento)   // Incrementa en 1 , y luego imprime Salida: 6
        println(aPreIncremento)

        println(bPreDecremento)
        println(--bPreDecremento)  // Primero se decrementa en 1 y luego imprime Salida: 4
        println(bPreDecremento)

        println(cPostIncremento)
        println(cPostIncremento++)    // Primero regresa luego decrementa Salida: 5
        println(cPostIncremento)

        println(dPostDecremento)
        println(dPostDecremento--)    // Primero regresa luego decrementa Salida: 4
        println(dPostDecremento)

        /*Cuando se declara una variable y hay una modificacion respecto a si misma el operador se
          puede combinar con el igual (+=) y despues el dato con el que se va a modificar la variable */

        saldo += sueldoFloat

        saldo += 1 // Se le suma uno a saldo de diferete forma
        saldo++ // Se le suma uno a saldo de diferente forma


        // Los operadores de comparación siempre retornaraun un valor booleano
        // En el caso de este operador de comparacion se usa para saber si dos valores son iguales
        a == b
        // En el caso de este operador de comparacion se usa para saber si dos valores son diferentes
        a != b
        // En el caso de este operador de comparacion se usa para saber si a es mayor que b
        a > b
        // En el caso de este operador de comparacion se usa para saber si a es menor que b
        a < b
        // En el caso de este operador de comparacion se usa para saber si a es mayor o igual que b
        a>= b
        // En el caso de este operador de comparacion se usa para saber si a es menor o igual que b
        a<= b

    }
}