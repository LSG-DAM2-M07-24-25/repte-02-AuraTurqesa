package com.example.navegacio.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.navegacio.R
import com.example.navegacio.Routes


@Composable
fun Screen2(navController: NavController, nomPersonatge: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
    ) {
        Box(
        ) {
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "Descripció"
            )
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
    ) {
       Row(

       ) {
           Column (
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center
           ){
               Box(
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.gomah),
                       contentDescription = "Descripció",
                       modifier = Modifier
                           .clickable {
                               nomPersonatge = "Gomah"
                               modifier = Modifier
                                   .border(Color.Black)
                           }

                   )
               }
           }

           Column (){
               Box(
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.goku),
                       contentDescription = "Descripció",
                       modifier = Modifier
                           .clickable {
                               nomPersonatge = "Goku"
                               modifier = Modifier
                                   .border(Color.Black)
                           }
                   )
               }
           }

           Column (
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center
           ){
               Box(
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.vegeta),
                       contentDescription = "Descripció",
                       modifier = Modifier
                           .clickable {
                               nomPersonatge = "Vegeta"
                               modifier = Modifier
                                   .border(Color.Black)
                           }
                   )
               }
           }
       }

       Row() {
           Column (
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center
           ){
               Box(
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.piccolo),
                       contentDescription = "Descripció",
                       modifier = Modifier
                           .clickable {
                               nomPersonatge = "Piccolo"
                               modifier = Modifier
                                   .border(Color.Black)
                           }
                   )
               }
           }

           Column (
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center
           ){
               Box(
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.supreme),
                       contentDescription = "Descripció",
                       modifier = Modifier
                           .clickable {
                               nomPersonatge = "Supreme"
                               modifier = Modifier
                                   .border(Color.Black)
                           }
                   )
               }
           }

           Column (
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center
           ){
               Box(
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.masked_majin),
                       contentDescription = "Descripció",
                       modifier = Modifier
                           .clickable {
                               nomPersonatge = "Masked Majin"
                               modifier = Modifier
                                   .border(Color.Black)
                           }
                   )
               }
           }
       }
   }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
    ) {
        Button(
            onClick = { navController.navigate(Routes.Pantalla3.createRoute(nomPersonatge)) },
            enabled = if (nomPersonatge.isNotEmpty()) true else false
        ) {
            Text("Continuar")
        }
    }
}