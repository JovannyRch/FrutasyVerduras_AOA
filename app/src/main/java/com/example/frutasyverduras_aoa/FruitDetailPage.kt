package com.example.frutasyverduras_aoa


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun FruitDetailPage(navController: NavController, fruit: String) {

    val item = fruits.find { it.name == fruit }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(fruit) })
        },

    ){
        padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            //Image(painter = painterResource(id = R.drawable.fruit_image), contentDescription = null)
            GetImage(fruit)
            Text(fruit, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            if (item != null) {
                Text(item.description)
            }
            if (item != null) {
                Text(item.benefits)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text("Regresar")
            }
        }
    }
}

@Composable
fun GetImage(item: String){
    if (item == "Cereza"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.cereza), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Fresa"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.fresa), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Guayaba"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.guayaba), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Mango"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.mango), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Piña"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.pina), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Manzana"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.manzana), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }
    if (item == "Banana"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.banana), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }
    if (item == "Uva"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.uva), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }
    if (item == "Naranja"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.naranja), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }
    if (item == "Kiwi"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.kiwi), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }
    if (item == "Brócoli"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.brocoli), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }


    if (item == "Lechuga"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.lechuga), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Espinaca"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.espinaca), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Zanahoria"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.zanahoria), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }
    if (item == "Pepino"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.pepino), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }



    if (item == "Tomate"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.tomate), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }
    if (item == "Pimiento"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.pimiento), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Calabacín"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.calabacin), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Coliflor"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.coliflor), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }

    if (item == "Berenjena"){
        return  Box(modifier = Modifier.height(120.dp)){
            Image(painter = painterResource(id = R.drawable.berenjena), contentDescription = null, modifier = Modifier
                .size(120.dp))
        }

    }


    return Box(modifier = Modifier.height(120.dp))
}


@Composable
fun VegetableDetailPage(navController: NavController, vegetable: String) {
    val item = vegetables.find { it.name == vegetable }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(vegetable) })
        },
    ){
        padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Image(painter = painterResource(id = R.drawable.vegetable_image), contentDescription = null)
            GetImage(vegetable)
            Text(vegetable, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text(item!!.description)
            Text(item.benefits)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text("Regresar")
            }
        }
    }
}
