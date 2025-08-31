package com.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their ID
        val usernameInput: EditText = findViewById(R.id.username_input)
        val passwordInput: EditText = findViewById(R.id.password_input)
        val loginButton: Button = findViewById(R.id.login_button)

        // Set an OnClickListener for the login button
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            // Check if either field is empty
            if (username.isEmpty() || password.isEmpty()) {
                // Display a message if fields are empty
                Toast.makeText(this, getString(R.string.add_text_validation), Toast.LENGTH_SHORT).show()
            } else {
                // Display a success message with the username
                val successMessage = getString(R.string.login_success, username)
                Toast.makeText(this, successMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
