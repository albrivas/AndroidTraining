package com.example.androidtraining.model

data class Person(
    var name: String = "Alberto",
    var age: Int,
    val address: String = "Calle Rios Rosas 26"
) {
    fun getLengthName(): Int = name.length

    fun getAll(): String = "Nombre: $name, Edad: $age, Direccion: $address"

    fun setOtherName(newName: String) {
        name = newName
    }

    fun setOtherName2(newName: String) {
        name = newName
    }

    fun randomName() = listOf("Juan", "Alejandro", "Norberto").random()

    fun getAverage(): String {

        when(age) {
            in 20..50 -> "srfgwe"
            in 51..54 -> "rgwerg "
            10 -> "wregwerg"
            else -> "null"
        }

        when(age) {
            20, 30, 40 -> "srfgwe"
            50 -> "rgwerg "
            60 -> "wregwerg"
            else -> "null"
        }


        return when(age) {
            20 -> "srfgwe"
            30 -> "rgwerg "
            10 -> "wregwerg"
            else -> "null"
        }
    }

    override fun toString(): String {
        return super.toString()

    }
}
