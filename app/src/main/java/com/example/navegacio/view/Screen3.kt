package com.example.navegacio.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navegacio.Routes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen3
            (navController: NavController) {
    var nom: String by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
    ) {
        TextField(
            value = nom,
            placeholder = { Text("Nom del personatge") },
            onValueChange = { nom = it }
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
    ) {
        Button(
            onClick = { navController.navigate(Routes.Pantalla2.createRoute(nom)) },
            enabled = if (nom.isNotEmpty()) true else false
        ) {
            Text("Mostrar")
        }
    }
}