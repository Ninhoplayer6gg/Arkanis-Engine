package com.arkanis.engine.math

import kotlin.math.sqrt

data class Vector3(
    val x: Float,
    val y: Float,
    val z: Float
) {

    fun add(other: Vector3): Vector3 {
        return Vector3(x + other.x, y + other.y, z + other.z)
    }

    fun subtract(other: Vector3): Vector3 {
        return Vector3(x - other.x, y - other.y, z - other.z)
    }

    fun multiply(scalar: Float): Vector3 {
        return Vector3(x * scalar, y * scalar, z * scalar)
    }

    fun length(): Float {
        return sqrt(x * x + y * y + z * z)
    }

    fun normalize(): Vector3 {
        val len = length()
        if (len == 0f) return Vector3(0f, 0f, 0f)
        return Vector3(x / len, y / len, z / len)
    }

    fun dot(other: Vector3): Float {
        return x * other.x + y * other.y + z * other.z
    }

    fun distance(other: Vector3): Float {
        return subtract(other).length()
    }

    operator fun plus(other: Vector3) = add(other)
    operator fun minus(other: Vector3) = subtract(other)
    operator fun times(scalar: Float) = multiply(scalar)
}
