package com.example.mycomposeapplication

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposeapplication.ui.theme.MycomposeapplicationTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Text("Hello world")
        MessageCard(Message("Jagadeesh","Jetpack Compose"))


        }
    }
}



//@Composable
//fun MessageCard(name: Message) {
//    Text(text = msg.author)
//    Text(text = msg.body)
//    }

//@Preview
//@Composable
//fun PreviewMessageCard() {
    //MessageCard("Andriod")
//}
data class Message(val author: String , val body : String)

@Composable
fun MessageCard(msg: Message) {
       Text(text = msg.author)
       Text(text=msg.body)

    
}

//
//@Preview
//@Composable
//fun PreviewMessageCard(){
//    MessageCard(
//        msg = Message(author = "Jagadeesh" , body ="Hey, take a look at Jetpack Compose, it's great!") )
}


