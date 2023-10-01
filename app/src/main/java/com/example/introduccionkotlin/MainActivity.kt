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
        val fecha = "99/03/1999"
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

        /* Estructuras de control if sirve para verificar si se cumple una
        condicion en caso de solo tener una instrucción puedes colocar el if sin corchetes*/
        if(vip) println("Hola $nombre")
        /* Estructuras de control else sirve para verificar si no se cumple una
        condicion en caso de solo tener una instrucción puedes colocar el else sin corchetes*/
        else println("Saludos aun no eres vip $nombre")

        /* Estructura de control when Sirve para verificar si se cumple una condicion o mas si necesidad de generar un ciclo de if y else
            el when es un switch en otros lenguajes*/
        var mes = fecha.subSequence(3,5).toString().toInt()
        when(mes) {
            1 -> println("Enero")
            2 -> println("Febrero")
            3 -> println("Marzo")
            4 -> println("Abril")
            5 -> println("Mayo")
            6 -> println("Junio")
            7 -> println("Julio")
            8 -> println("Agosto")
            9 -> println("Septiembre")
            10 -> println("Octubre")
            11 -> println("Noviembre")
            12 -> println("Diciembre")
            else -> println("No existe ese mes")
        }

        // Operadores lógicos

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


        var q = true
        var w = true
        var r = false
        var t = false

        // Operadores logicos
        q && w //  && = and condicion y condicion los dos deben ser true para que devuelva true
        //                  a == 5      3 <= valor
        q || w //  || = or condicion o condicion si uno es true devuelve true
        //                  a == 5      3 <= valor
        !t    // ! negacion de un booleano q = false w = false r = true t = true

        var pin:Int = 1234
        var intentos:Int = 0
        var clave_ingresada:Int = 1230
        // Ciclos do while
         do {
            println("Intentos: $intentos")
             println("Clave ingresada: ${clave_ingresada++}")
             if(pin == clave_ingresada) break
            intentos++
         }while (intentos < 3 && pin != clave_ingresada)

         if(intentos > 3) println("Tarjeta bloqueada")
        clave_ingresada = 1232
        // Ciclos do while
        do {
            println("Intentos: $intentos")
            println("Clave ingresada: ${++clave_ingresada}")
            if(pin == clave_ingresada) break
            intentos++
        }while (intentos < 3 && pin != clave_ingresada)

        var recibos: Array<String> = arrayOf("luz", "agua", "gas")
        recorrerArray(recibos)
        recibos.set(0, "internet")
        recorrerArray(recibos)
        var matriz = arrayOf(
            arrayOf(1,2,3),
            arrayOf(4,5,6,7,8,9),
            arrayOf(10,11,12,13,14,15,16,17,18,19,20)
        )
        recorrerMatriz(matriz)
        setset()
        if(intentos > 3) println("Tarjeta bloqueada")
        ingresar_sueldo()
        mostrar_saldo()
        ingreso_dinero(1000.0F)
        retirar_dinero(2000.0F)
        retirar_dinero(5000.0F)
        recorrerArray(recibos)
        listas()
        mapfuncion()
        tarea1()
        tarea2()
        tarea3()
        tarea4()
        tarea5()
    }

     fun recorrerMatriz(matriz: Array<Array<Int>>) {
        for (i in (0 until matriz.size)) {
            for (j in (0 until matriz[i].size)) {
                println("Posision: [$i] [$j]  ${matriz[i][j]}")
            }

        }
    }

    fun recorrerArray(recibos: Array<String>) {

        for (i in recibos) println(i)
        for (i in recibos.indices) {
            println(recibos[i])
        }
        for (i in recibos.indices) {
            println(recibos.get(i))
        }

    }

    fun mostrar_saldo(){
        println("Tu saldo es: $saldo $moneda")
    }

    fun ingresar_sueldo(){
        saldo += sueldoFloat
        println("Se ha ingresado el sueldo: $sueldoFloat $moneda")
        mostrar_saldo()
    }

    fun ingreso_dinero(dinero:Float){
        saldo += dinero
        mostrar_saldo()
    }

    fun retirar_dinero(dinero:Float){
        if(verificarCantidadDinero(dinero)){
            saldo -= dinero
            mostrar_saldo()
        }else println("No se puede retirar")
    }

    private fun verificarCantidadDinero(cantidadDinero:Float):Boolean{
        return cantidadDinero <= saldo
    }

    fun setset(){
        var clienteVip: Set<Int> = setOf(1,2,3,4,5)
        println(clienteVip)
        println( "Numero de clientes vip: ${clienteVip.size}")
        if (clienteVip.contains(1)) println("Cliente vip")
        var setMezclado = setOf(1,2,3,4,"a","b","c")
        var clientes:MutableSet<Int> = mutableSetOf(1,2,3,4,5)
        for (cliente in clientes){
            println(cliente)
        }
        clientes.add(6);
        for (cliente in clientes){
            println(cliente)
        }

    }

    fun listas(){
        var divisas:List<String> = listOf("MX","US","EU")
        print(divisas)
        var divisas2:MutableList<String> = mutableListOf("MX","US","EU")
        println(divisas2.first())
        println(divisas2.last())
        println(divisas2.elementAt(2))
        println(divisas2.none())
        divisas2.clear()
        println(divisas2.none())
    }
    fun mapfuncion(){

        var map: Map<Int,String> = mapOf(1 to "uno",2 to "dos",3 to "tres")
        println(map)
    }

    fun tarea1(){
        var count = 9

        do {
            println(count)
            count--
        } while (count >= 0)

        println("¡Despegue!")
    }
    fun tarea2() {
        var number = 1

        while (number <= 10) {
            if (number % 2 == 0) {
                println(number)
            }
            number++
        }
    }

    fun tarea3(){
        val platos = arrayOf("Hamburguesa", "Pizza", "Ensalada", "Sushi", "Pasta")

        for (plato in platos) {
            println(plato)
        }
    }
    fun tarea4() {
        val platos = arrayOf(
            Pair("Hamburguesa", 10.0),
            Pair("Pizza", 12.0),
            Pair("Ensalada", 8.0),
            Pair("Sushi", 15.0),
            Pair("Pasta", 11.0)
        )

        for (plato in platos) {
            val nombrePlato = plato.first
            val precioPlato = plato.second

            println("Plato: $nombrePlato")
            println("Precio: $precioPlato")
            println()
        }
    }

    fun tarea5(){
        val plato1 = mapOf(
            "plato" to "Hamburguesa",
            "precio" to 10.0,
            "ingredientes" to arrayOf("Pan", "Carne", "Queso", "Lechuga", "Tomate")
        )
        val plato2 = mapOf(
            "plato" to "Pizza",
            "precio" to 12.0,
            "ingredientes" to arrayOf("Masa de pizza", "Salsa de tomate", "Queso", "Jamón", "Champiñones")
        )
        val plato3 = mapOf(
            "plato" to "Ensalada",
            "precio" to 8.0,
            "ingredientes" to arrayOf("Lechuga", "Tomate", "Pepino", "Aceitunas", "Aderezo")
        )

        val arrayPlatos = arrayOf(plato1, plato2, plato3)

        for (plato in arrayPlatos) {
            val nombrePlato = plato["plato"] as String
            val precioPlato = plato["precio"] as Double
            val ingredientesPlato = plato["ingredientes"] as Array<String>

            println("Plato: $nombrePlato")
            println("Precio: $precioPlato")
            println("Ingredientes: ")
            for (ingrediente in ingredientesPlato) {
                println("- $ingrediente")
            }
            println()
        }

    }

}