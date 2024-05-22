package com.example.frutasyverduras_aoa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.frutasyverduras_aoa.ui.theme.FrutasyVerduras_AOATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrutasyVerduras_AOATheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "home") {
                    composable("home") { HomePage(navController) }
                    composable("fruits") { FruitsPage(navController) }
                    composable("vegetables") { VegetablesPage(navController) }
                    composable(
                        route = "fruit_detail/{fruit}",
                        arguments = listOf(navArgument("fruit") { type = NavType.StringType })
                    ) { backStackEntry ->
                        val fruit = backStackEntry.arguments?.getString("fruit") ?: ""
                        FruitDetailPage(navController, fruit)
                    }
                    composable(
                        route = "vegetable_detail/{vegetable}",
                        arguments = listOf(navArgument("vegetable") { type = NavType.StringType })
                    ) { backStackEntry ->
                        val vegetable = backStackEntry.arguments?.getString("vegetable") ?: ""
                        VegetableDetailPage(navController, vegetable)
                    }
                }
            }
        }
    }
}
