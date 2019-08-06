package alzaichsank.com.exampleapp

import alzaichsank.com.intentanimation.AnimIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        AnimIntent.Builder(this).performSlideToRight()
    }
}
