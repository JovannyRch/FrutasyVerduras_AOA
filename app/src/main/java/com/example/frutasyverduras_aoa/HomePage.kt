package com.example.frutasyverduras_aoa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

@Composable
fun HomePage(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("El instituto de nutrición “La vida es verde”: Frutas y verduras", style = TextStyle(textAlign = TextAlign.Center)) })
        }
    ){
        padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier.width(8.dp))

            Box(modifier = Modifier.height(120.dp)){
                Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier
                    .size(120.dp))
            }

            Spacer(modifier = Modifier.width(8.dp))
            Text("Nombre Completo: Armando Olarte Ávila ", fontWeight = FontWeight.Bold)
            Text("Matrícula: ES202105032")
            Text("Correo institucional: armando.olarteavi@nube.unadmexico.mx")
            Text("Figura académica: Verónica Espinoza Romo")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("fruits") }) {
                Text("Frutas")
            }
            Button(onClick = { navController.navigate("vegetables") }) {
                Text("Verduras")
            }
            Button(onClick = {  }) {
                Text("Salir")
            }
        }
    }
}
