package br.com.caio.meuportifolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import br.com.caio.meuportifolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        clickListeners()
    }
     private fun clickListeners(){

        binding.btSegundaTela.setOnClickListener{
            startActivity(Intent(this, SegundaActivity::class.java))

        }

        }


    }
