package com.example.androidintermedio

import com.example.androidintermedio.model.Product
import org.junit.Assert.assertEquals
import org.junit.Test

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

    @Test
    fun product_isCorrect(){
        val titleDescription = "The Essence Mascara Lash Princess is a popular mascara known for its volumizing and lengthening effects. Achieve dramatic lashes with this long-lasting and cruelty-free formula."
        val titleThumbnail = "https://cdn.dummyjson.com/products/images/beauty/Essence%20Mascara%20Lash%20Princess/thumbnail.png"
        val title = "Essence Mascara Lash Princess"
        val productId = 1L
        val p =
            Product(
                productId,
                title,
                titleDescription,
                titleThumbnail
            )

        assertEquals(productId, p.getId())
        assertEquals(title, p.getProduct_title())
        assertEquals(titleDescription, p.getTitle_description())
        assertEquals(titleThumbnail, p.getTitle_thumbnail())
    }
}