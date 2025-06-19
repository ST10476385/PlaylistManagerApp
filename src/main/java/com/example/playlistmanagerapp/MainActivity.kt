// Student Number: ST10476385
// Full Name: Khanyisa Ntsako Shikwambana

package com.example.playlistmanagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val songTitles = Array(4) { "" }
    val artistNames = Array(4) { "" }
    val ratings = IntArray(4)
    val comments = Array(4) { "" }
    var songIndex = 0  // Keeps track of how many songs have been added

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etSongTitle = findViewById<EditText>(R.id.SongTitle)
        val etArtistName = findViewById<EditText>(R.id.ArtistName)
        val etRating = findViewById<EditText>(R.id.Rating)
        val etComment = findViewById<EditText>(R.id.Comment)

        val btnAdd = findViewById<Button>(R.id.AddToPlaylistbtn)
        val btnDetails = findViewById<Button>(R.id.NextPagebtn)
        val btnExit = findViewById<Button>(R.id.Exitbtn)

        btnAdd.setOnClickListener {
            val title = etSongTitle.text.toString().trim()
            val artist = etArtistName.text.toString().trim()
            val ratingStr = etRating.text.toString().trim()
            val comment = etComment.text.toString().trim()

            if (title.isEmpty() || artist.isEmpty() || ratingStr.isEmpty() || comment.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val rating = ratingStr.toIntOrNull()
            if (rating == null || rating !in 1..5) {
                Toast.makeText(this, "Rating must be a number between 1 and 5", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (songIndex < 4) {
                songTitles[songIndex] = title
                artistNames[songIndex] = artist
                ratings[songIndex] = rating
                comments[songIndex] = comment
                songIndex++

                Toast.makeText(this, "Song added to playlist!", Toast.LENGTH_SHORT).show()

                // Clear input fields
                etSongTitle.text.clear()
                etArtistName.text.clear()
                etRating.text.clear()
                etComment.text.clear()
            } else {
                Toast.makeText(this, "Playlist is full (4 songs only)", Toast.LENGTH_SHORT).show()
            }
        }

        btnDetails.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            intent.putExtra("songs", songTitles)
            intent.putExtra("artists", artistNames)
            intent.putExtra("ratings", ratings)
            intent.putExtra("comments", comments)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finishAffinity()  // Closes the app
        }
    }
}