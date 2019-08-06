package alzaichsank.com.exampleapp

import alzaichsank.com.intentanimation.AnimIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_main.setOnClickListener {
            startActivity(Intent(this,MenuActivity::class.java))
            AnimIntent.Builder(this).performSlideToLeft()
        }
    }
}
