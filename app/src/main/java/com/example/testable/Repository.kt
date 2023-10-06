package com.example.testable

class Repository(client: ApiClient) {
    private val client = client.getService().create(ApiInterface::class.java)
    suspend fun getWeather():WeatherResponse {
        return client.getWeather()
    }

}