package com.example.frutasyverduras_aoa

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FruitsPage(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Frutas") })
        },
    ){
        padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val fruits = listOf("Fresa", "Cereza", "Guayaba", "Mango", "Piña", "Manzana", "Banana", "Uva", "Naranja", "Kiwi")
            fruits.forEach { fruit ->
                Text(fruit, modifier = Modifier.clickable { navController.navigate("fruit_detail/$fruit") })
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("home") }) {
                Text("Regresar")
            }
        }
    }
}
