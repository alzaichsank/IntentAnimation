package alzaichsank.com.exampleapp

import alzaichsank.com.exampleapp.MenuActivity.Companion.HyperSpace
import alzaichsank.com.exampleapp.MenuActivity.Companion.fade
import alzaichsank.com.exampleapp.MenuActivity.Companion.normal
import alzaichsank.com.exampleapp.MenuActivity.Companion.slide1
import alzaichsank.com.exampleapp.MenuActivity.Companion.slide2
import alzaichsank.com.exampleapp.MenuActivity.Companion.slide3
import alzaichsank.com.exampleapp.MenuActivity.Companion.slide4
import alzaichsank.com.intentanimation.AnimIntent
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intentAction()
    }

    private fun intentAction() {
        val go = Intent(this, MenuActivity::class.java)
        button_main_slide.setOnClickListener {
            go.putExtra(MenuActivity.TYPE_INTENT, normal)
            this.startActivity(go)
            AnimIntent.Builder(this).performNoAnimation()
        }
        button_main_slide1.setOnClickListener {
            go.putExtra(MenuActivity.TYPE_INTENT, slide1)
            this.startActivity(go)
            AnimIntent.Builder(this).performSlideToLeft()
        }
        button_main_slide2.setOnClickListener {
            go.putExtra(MenuActivity.TYPE_INTENT, slide2)
            this.startActivity(go)
            AnimIntent.Builder(this).performSlideToRight()
        }
        button_main_slide3.setOnClickListener {
            go.putExtra(MenuActivity.TYPE_INTENT, slide3)
            this.startActivity(go)
            AnimIntent.Builder(this).performSlideToTop()
        }
        button_main_slide4.setOnClickListener {
            go.putExtra(MenuActivity.TYPE_INTENT, slide4)
            this.startActivity(go)
            AnimIntent.Builder(this).performSlideToBottom()
        }
        button_main_fade.setOnClickListener {
            go.putExtra(MenuActivity.TYPE_INTENT, fade)
            this.startActivity(go)
            AnimIntent.Builder(this).performFade()
        }

        button_main_explode.setOnClickListener {
            go.putExtra(MenuActivity.TYPE_INTENT, HyperSpace)
            this.startActivity(go)
            AnimIntent.Builder(this).performHyperSpace()
        }
    }
}
