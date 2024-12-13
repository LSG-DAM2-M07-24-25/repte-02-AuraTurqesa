package com.example.navegacio

sealed class Routes(val route: String) {
    // Definim la ruta per accedir a la primera pantalla sense paràmetres
    object Pantalla1 : Routes("pantalla1")

    // Definim la ruta per accedir a la segona pantalla amb el paràmetre 'nom'
    object Pantalla2 : Routes("pantalla2/{nomPersonatge}") {
        fun createRoute(nomPersonatge: String) = "pantalla2/$nomPersonatge"
    }

    // Definim la ruta per accedir a la tercera pantalla amb el paràmetres 'nom', 'salutacio', 'edat'
    object Pantalla3 : Routes("pantalla3/{nomUsuari}") {
        fun createRoute(nomUsuari: String) = "pantalla3/$nomUsuari"
    }

    object Pantalla4 : Routes("pantalla4/{nomUsuari}/{nomPersonatge}") {
        fun  createRoute(nomUsuari: String, nomPersonatge: String) = "pantalla4/$nomUsuari/$nomPersonatge"
    }

}