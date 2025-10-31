package com.example.androidintermedio

import androidx.core.util.Predicate
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.androidintermedio.model.Product
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTestNoProducts {
    /**
     * https://developer.android.com/training/testing/espresso/setup#add-first-test
     */
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun noProducts()
    {
        activityRule.scenario.onActivity { activity ->
            // Set the mock data to an empty array
            activity.mockData = arrayOf<Product>()
            // Update the RecyclerView with the new empty adapter
            val recyclerView = activity.findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.adapter = ProductsAdapter(activity.mockData)
        }

        onView(ViewMatchers.withId(R.id.recycler_view)).check(ViewAssertions.matches(not(
            ViewMatchers.isDisplayed())))
    }
}