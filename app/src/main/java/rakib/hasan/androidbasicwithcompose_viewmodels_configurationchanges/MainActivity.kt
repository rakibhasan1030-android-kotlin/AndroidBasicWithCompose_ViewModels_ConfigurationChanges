package rakib.hasan.androidbasicwithcompose_viewmodels_configurationchanges

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import rakib.hasan.androidbasicwithcompose_viewmodels_configurationchanges.ui.theme.AndroidBasicWithCompose_ViewModels_ConfigurationChangesTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBasicWithCompose_ViewModels_ConfigurationChangesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Button(
                        modifier = Modifier.wrapContentSize(),
                        onClick = { viewModel.changeBackgroundColor() }
                    ) {
                        Text(text = "Click me!")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidBasicWithCompose_ViewModels_ConfigurationChangesTheme {
        Greeting("Android")
    }
}