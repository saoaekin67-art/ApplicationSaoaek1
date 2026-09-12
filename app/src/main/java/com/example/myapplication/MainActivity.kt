package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // 1. Toast สำหรับ onCreate
        Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_SHORT).show()

        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UserProfileScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    // 2. Toast สำหรับ onStart
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_SHORT).show()
    }

    // 3. Toast สำหรับ onResume
    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_SHORT).show()
    }

    // 4. Toast สำหรับ onPause
    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_SHORT).show()
    }

    // 5. Toast สำหรับ onStop
    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_SHORT).show()
    }

    // 6. Toast สำหรับ onDestroy
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_SHORT).show()
    }
}

@Composable
fun UserProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // ดึงรูปภาพ sudlor.jpg จากโฟลเดอร์ drawable
        Image(
            painter = painterResource(id = R.drawable.sudlor),
            contentDescription = "Student Face",
            modifier = Modifier
                .size(250.dp)
                .padding(bottom = 16.dp)
        )

        Text(
            text = "เสาร์เอก อินติยะ",
            fontSize = 20.sp
        )
        Text(
            text = "รหัสนักศึกษา: 67102122107",
            fontSize = 16.sp
        )
    }
}