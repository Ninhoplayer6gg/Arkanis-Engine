package com.ninho.rpgxp

import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var glView: GLSurfaceView

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    try {

        val glView = GLSurfaceView(this)
        glView.setEGLContextClientVersion(2)
        glView.setRenderer(SimpleRenderer())

        setContentView(glView)

    } catch (e: Exception) {
        val textView = TextView(this)
        textView.text = e.toString()
        setContentView(textView)
    }
}
