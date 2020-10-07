package com.alibekus.diablo_ver2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageButton
import android.widget.TextView
import kotlin.random.Random

class secondActivity : AppCompatActivity() {
    var arraySubs: Array<Int> = arrayOf(
        R.string.hl1,
        R.string.hl2,
        R.string.hl3,
        R.string.hl4,
        R.string.hl5,
        R.string.hl6,
        R.string.hl7,
        R.string.hl8,
        R.string.hl9,
        R.string.hl10,
        R.string.hl11,
        R.string.hl12,
        R.string.hl13
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val diablo: ImageButton = findViewById(R.id.diablo)
        diablo.setOnClickListener {
            randomSub()
        }
    }

    fun randomSub() {
        val textView: TextView = findViewById(R.id.sub)
        val randomNumber = Random.nextInt(0, arraySubs.size)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.text = getText(arraySubs[randomNumber])
    }
}