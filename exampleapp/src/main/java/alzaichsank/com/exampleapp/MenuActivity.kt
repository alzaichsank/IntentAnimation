package alzaichsank.com.exampleapp

import alzaichsank.com.intentanimation.AnimIntent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    companion object {
        const val TYPE_INTENT = "type.intent"
        const val normal = "normal"
        const val slide1 = "slide1"
        const val slide2 = "slide2"
        const val slide3 = "slide3"
        const val slide4 = "slide4"
        const val fade = "fade"
        const val explode = "explode"
    }

    private var intentString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        intentString = intent.getStringExtra(TYPE_INTENT)
        text_view_result.text = "this intent $intentString"
    }

    override fun onBackPressed() {
        super.onBackPressed()
        when (intentString) {
            normal -> {
                AnimIntent.Builder(this).performNoAnimation()
            }
            slide1 -> {
                AnimIntent.Builder(this).performSlideToRight()
            }
            slide2 -> {
                AnimIntent.Builder(this).performSlideToLeft()
            }
            slide3 -> {
                AnimIntent.Builder(this).performSlideToBottom()
            }
            slide4 -> {
                AnimIntent.Builder(this).performSlideToTop()
            }
            fade -> {
                AnimIntent.Builder(this).performFade()
            }
            explode -> {
                AnimIntent.Builder(this).performExplode()
            }
        }
    }
}
