package com.example.verma0987.artbookcreation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflator : MenuInflater = menuInflater
        inflator.inflate(R.menu.art,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if(item?.itemId == R.id.addart){
            val intent = Intent(applicationContext,Main2Activity::class.java)
            startActivity(intent)

        }


        return super.onOptionsItemSelected(item)
    }
}
