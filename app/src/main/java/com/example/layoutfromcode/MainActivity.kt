package com.example.layoutfromcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        createXmlElement("Test", "Just a test")
    }

    

    protected fun createXmlElement(title: String, description: String) {
        val parent = LinearLayout(this)
        parent.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        parent.orientation = LinearLayout.VERTICAL


        //children of parent linearlayout
        val imageView = ImageView(this)

        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        layoutParams.setMargins(0, 11, 7, 0)

        imageView.layoutParams = layoutParams
        imageView.setImageResource(R.drawable.c9)
//        imageView.getLayoutParams().height = 540
//        imageView.getLayoutParams().width = 546

        parent.addView(imageView); // lo agregamos al layout

        // buttons

        val firstButton = Button(this)

        val buttonLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        buttonLayoutParams.setMargins(30, 0, 30, 0)

        firstButton.layoutParams = buttonLayoutParams
        firstButton.text = "This is my button"

        parent.addView(firstButton)

        // setup listeners
        firstButton.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "You clicked on ${firstButton.text}", Toast.LENGTH_LONG)
            toast.show()
        }

        setContentView(parent)
    }
}