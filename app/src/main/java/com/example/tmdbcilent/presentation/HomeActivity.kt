package com.example.tmdbcilent.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tmdbcilent.R
import com.example.tmdbcilent.databinding.ActivityHomeBinding
import com.example.tmdbcilent.presentation.artist.ArtistActivity
import com.example.tmdbcilent.presentation.movie.MovieActivity
import com.example.tmdbcilent.presentation.tvshow.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
        binding.movieButton.setOnClickListener{
            val intent = Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }
        binding.artistsButton.setOnClickListener{
            val intent = Intent(this,ArtistActivity::class.java)
            startActivity(intent)
        }
        binding.tvButton.setOnClickListener{
            val intent = Intent(this,TvShowActivity::class.java)
            startActivity(intent)
        }
    }
}