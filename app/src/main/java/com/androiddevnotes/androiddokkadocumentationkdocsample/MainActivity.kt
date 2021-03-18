package com.androiddevnotes.androiddokkadocumentationkdocsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Main activity description example.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        normalFunction("Android Dev Notes")
    }

    /**
     * Normal function
     *
     * @param input description example.
     */
    fun normalFunction(input: String) {
        Log.d("TAG", input)
    }

    /**
     * Deprecated Function used as an Example to show the `skipDeprecated` configuration
     */
    @Deprecated("Deprecated for fun")
    fun deprecatedFunction() {

    }
}