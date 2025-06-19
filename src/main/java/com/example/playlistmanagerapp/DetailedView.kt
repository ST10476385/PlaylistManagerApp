// Student Number: ST10476385
// Full Name: Khanyisa Shikwambana

package com.example.playlistmanagerapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DetailedView : AppCompatActivity() {

    @SuppressLint("SetTextI18n" , "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val btnShowDetails = findViewById<Button>(R.id.btnShowDetails)
        val btnShowAverage = findViewById<Button>(R.id.btnShowAverage)
        val btnBack = findViewById<Button>(R.id.btnBackMainScreen)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)

        val songs = intent.getStringArrayExtra("songs")
        val artists = intent.getStringArrayExtra("artists")
        val ratings = intent.getIntArrayExtra("ratings")
        val comments = intent.getStringArrayExtra("comments")

        btnShowDetails.setOnClickListener {
            var output = ""

            if (songs != null && artists != null && ratings != null && comments != null) {
                for (i in songs.indices) {
                    if (songs[i].isNotEmpty()) {
                        output += "Song: ${songs[i]}\n"
                        output += "Artist: ${artists[i]}\n"
                        output += "Rating: ${ratings[i]}\n"
                        output += "Comment: ${comments[i]}\n\n"
                    }
                }
                if (output.isEmpty()) {
                    output = "No songs in the playlist yet."
                }
            } else {
                output = "Error retrieving data."
            }

            txtOutput.text = output
        }

        btnShowAverage.setOnClickListener {
            var total = 0
            var count = 0

            if (ratings != null) {
                for (rating in ratings) {
                    if (rating != 0) {
                        total += rating
                        count++
                    }
                }

                val average = if (count > 0) total.toDouble() / count else 0.0
                txtOutput.text = " Average Rating: %.2f".format(average)
            } else {
                txtOutput.text = "No ratings available."
            }
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}
