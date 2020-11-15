package com.example.app_kotlin_wheather.data.model

data class CityModel (var id: Long, var name: String) {

    constructor(name: String) : this(-1, name)
}