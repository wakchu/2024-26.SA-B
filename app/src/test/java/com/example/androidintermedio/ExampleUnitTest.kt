package com.example.androidintermedio

import com.example.androidintermedio.model.Product
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test(expected = Exception::class)
    fun product_isThumbnailNotCorrect() {
        val productId = 1L
        val title = "ciao titolo"
        val description = "ciao description"
        val url = "thumbnail-pippo"
        val p = Product(productId, title, description, url)

        assertEquals(productId, p.id)
        assertEquals(title, p.getProduct_title())
    }

    @Test()
    fun product_isCorrect() {
        val productId = 1L
        val title = "ciao titolo"
        val description = "ciao description"
        val url = "https://www.google.com/immagine.jpg"
        val p = Product(productId, title, description, url)

        assertEquals(productId, p.id)
        assertEquals(title, p.getProduct_title())
    }
}