package com.arkanis.engine.render

import android.content.Context
import android.opengl.GLSurfaceView

class GameView(context: Context) : GLSurfaceView(context) {

    private val renderer: GameRenderer

    init {
        setEGLContextClientVersion(2) // OpenGL ES 2.0
        renderer = GameRenderer()
        setRenderer(renderer)
        renderMode = RENDERMODE_CONTINUOUSLY
    }
}
