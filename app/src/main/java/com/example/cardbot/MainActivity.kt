package com.example.cardbot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                colorScheme = lightColorScheme(
                    primary = Color(0xFF6200EE),
                    onPrimary = Color.White,
                    background = Color(0xFFF5F5F5),
                    surface = Color.White,
                    secondary = Color(0xFF3700B3)
                ),
                typography = Typography()
            ) {
                BotCard()
            }
        }
    }
}

@Composable
fun BotCard() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.bot_image),
            contentDescription = "Bot Image",
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 16.dp)
        )


        Text(
            text = "Jeremiah Kurmaty",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp),
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "jeremiah.kurmaty@utp.ac.pa",
            style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 16.sp),
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(32.dp))



        Text(
            text = "Skills",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp),
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SkillItem(skill = "Web Development")
            SkillItem(skill = "Python, PHP, Javascript")
            SkillItem(skill = "Data Science")
            SkillItem(skill = "AI Engineering")
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Follow me:",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp),
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        SocialMediaList()


    }
}
@Composable
fun SkillItem(skill: String) {
    Text(
        text = skill,
        style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 16.sp),
        color = Color.Gray
    )
}
@Composable
fun SocialMediaRow(resourceId: Int, username: String) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "Social Media Icon",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = username,
            style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 16.sp),
            color = Color.Gray
        )
    }
}
@Composable
fun SocialMediaList() {
    // Lista de redes sociales
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //
        SocialMediaRow(
            resourceId = R.drawable.ic_linkedin,
            username = "Jeremiah Kurmaty"
        )

    }
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Color(0xFF6200EE),
            onPrimary = Color.White,
            background = Color(0xFFF5F5F5),
            surface = Color.White,
            secondary = Color(0xFF3700B3)
        ),
        typography = Typography()
    ) {
        BotCard()
    }
}