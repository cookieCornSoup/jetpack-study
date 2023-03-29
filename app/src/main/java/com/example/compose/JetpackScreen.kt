package com.example.compose

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

enum class ComposeScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Column(title = R.string.column),
    Composable(title = R.string.composable),
    Box(title = R.string.box),
    List(title = R.string.list),
    Image(title = R.string.image),
    Field(title = R.string.field),
    Navigation(title = R.string.navigation),
    ViewModel(title = R.string.viewmodel),
    State(title = R.string.state)
}

@Composable
fun JetpackApp(modifier: Modifier = Modifier,
){

}


@Composable
fun ComposeScreenNav(modifier: Modifier = Modifier){
    val navController = rememberNavController()
}