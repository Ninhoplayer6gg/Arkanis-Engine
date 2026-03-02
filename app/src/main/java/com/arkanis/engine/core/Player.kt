package com.arkanis.engine.core

import com.arkanis.engine.math.Vector3

class Player : GameObject() {

    private var speed = 5f

    override fun start() {
        println("Player spawned at $position")
    }

    override fun update(deltaTime: Float) {

        // Movimento automático só para teste
        val movement = Vector3(speed * deltaTime, 0f, 0f)
        translate(movement)

        println("Player position: $position")
    }
}
