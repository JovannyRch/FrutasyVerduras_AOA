package com.example.frutasyverduras_aoa
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun VegetablesPage(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Verduras") })
        },
    ){
        padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val vegetables = listOf("Brócoli", "Lechuga", "Espinaca", "Zanahoria", "Pepino", "Tomate", "Pimiento", "Calabacín", "Coliflor", "Berenjena")
            vegetables.forEach { vegetable ->
                Text(vegetable, modifier = Modifier.clickable { navController.navigate("vegetable_detail/$vegetable") })
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("home") }) {
                Text("Regresar")
            }
        }
    }
}