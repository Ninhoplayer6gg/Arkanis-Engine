package com.arkanis.engine.core

import com.arkanis.engine.math.Vector3

open class GameObject(

    var position: Vector3 = Vector3(0f, 0f, 0f),
    var rotation: Vector3 = Vector3(0f, 0f, 0f),
    var scale: Vector3 = Vector3(1f, 1f, 1f)

) {

    var isActive: Boolean = true

    open fun start() {
        // Chamado quando o objeto entra na cena
    }

    open fun update(deltaTime: Float) {
        // Chamado a cada frame
    }

    open fun render() {
        // Renderização futura
    }

    fun translate(direction: Vector3) {
        position = position + direction
    }

    fun rotate(amount: Vector3) {
        rotation = rotation + amount
    }

    fun setScale(newScale: Vector3) {
        scale = newScale
    }
}
