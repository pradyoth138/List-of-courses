package com.example.lazy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazy.ui.theme.LazyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

                }
            }
        }



@Composable
fun Greeting() {
    val listOfCourses = mutableListOf<CourseModel>()
    listOfCourses.add(CourseModel(R.drawable.java, courseName = "Java", courseDes = "Java for beginners"))
    listOfCourses.add(CourseModel(R.drawable.kotlin, courseName = "Kotlin", courseDes = "Kotlin for beginners"))
    listOfCourses.add(CourseModel(R.drawable.c, courseName = "C", courseDes = "C for beginners"))
    listOfCourses.add(CourseModel(R.drawable.cc, courseName = "C++", courseDes = "C++ for beginners"))
    listOfCourses.add(CourseModel(R.drawable.dsa, courseName = "DSA", courseDes = "DSA for beginners"))
    listOfCourses.add(CourseModel(R.drawable.html, courseName = "HTML", courseDes = "HTML for beginners"))
    listOfCourses.add(CourseModel(R.drawable.css, courseName = "CSS", courseDes = "CSS for beginners"))
    listOfCourses.add(CourseModel(R.drawable.js, courseName = "JavaScript", courseDes = "JavaScript for beginners"))
    listOfCourses.add(CourseModel(R.drawable.images, courseName = "Node.js", courseDes = "Node.js for beginners"))
    listOfCourses.add(CourseModel(R.drawable.react, courseName = "React.js", courseDes = "React.js for beginners"))
    listOfCourses.add(CourseModel(R.drawable.java, courseName = "Java", courseDes = "Java for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.kotlin, courseName = "Kotlin", courseDes = "Kotlin for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.c, courseName = "C", courseDes = "C for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.cc, courseName = "C++", courseDes = "C++ for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.dsa, courseName = "DSA", courseDes = "DSA for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.html, courseName = "HTML", courseDes = "HTML for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.css, courseName = "CSS", courseDes = "CSS for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.js, courseName = "JavaScript", courseDes = "JavaScript for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.images, courseName = "Node.js", courseDes = "Node.js for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.react, courseName = "React.js", courseDes = "React.js for Advanced"))
    listOfCourses.add(CourseModel(R.drawable.java, courseName = "Java", courseDes = "Java for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.kotlin, courseName = "Kotlin", courseDes = "Kotlin for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.c, courseName = "C", courseDes = "C for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.cc, courseName = "C++", courseDes = "C++ for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.dsa, courseName = "DSA", courseDes = "DSA for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.html, courseName = "HTML", courseDes = "HTML for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.css, courseName = "CSS", courseDes = "CSS for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.js, courseName = "JavaScript", courseDes = "JavaScript for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.images, courseName = "Node.js", courseDes = "Node.js for Intermediate"))
    listOfCourses.add(CourseModel(R.drawable.react, courseName = "React.js", courseDes = "React.js for Intermediate"))
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            itemsIndexed(listOfCourses) { index, item ->
                CourseModuleUi(imageResource = item.imageResource, courseName = item.courseName, courseDes = item.courseDes)
            }
        }
    }
}

class CourseModel(
    val imageResource: Int,  // Image resource ID
    val courseName: String,  // Course name
    val courseDes: String    // Course description
)

@Composable
fun CourseModuleUi(
    imageResource: Int,  // Dynamic image resource
    courseName: String,
    courseDes: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = "course",
            modifier = Modifier
                .width(60.dp)
                .padding(6.dp)
        )
        Column {
            Text(
                text = courseName,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = courseDes,
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}