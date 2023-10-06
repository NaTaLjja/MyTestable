package com.example.testable

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito


internal class MyViewModelTest{

    //підготовча робота щоб працювало
    //---

    //щоб не було проблем з Looper в LifeData
    @Rule
    fun getRule() = InstantTaskExecutorRule()

    //for coroutines
    @Before
    fun setup(){
        Dispatchers.setMain(UnconfinedTestDispatcher())
    }
    //---

    //ф-я в якій будемо отримувати вдалий результат
    //створемо умови,mock репозиторію, і замокаєм функцію, тобто зімітуєм функцію цього мока
// що вона повертала нам результат не нульовий

  //потрібно відтестувати LiveData : 1- зробити Mock репозиторія(уявимо що репозит уже відтестували
    // і він точно працює і повертає 2 варіанти - або weatherResponse with currentWeather not null
    //або weatherResponse with currentWeather null(коли наприклад немає інету)
    // репозиторій повертає Retrofit, а його тестувати складно. в даному прикладі тестуємо ViewModel

    @Test
    fun when_response_is_success_return_update_data(){
        val repository = Mockito.mock(Repository::class.java)//створюємо мок класу, пустий мок який
            //нічого не робить(ф-я нічого не повертає)
    }


}