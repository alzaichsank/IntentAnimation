package alzaichsank.com.intentanimation

import android.app.Activity
import android.content.Context

/**
 * Created by alzaichsank on 2019-06-23.
 */

class AnimIntent private constructor(private var builder: Builder) {

    class Builder(private var context: Context) {

        val activity = this.context as Activity

        fun performNoAnimation() {
            activity.overridePendingTransition(0, 0)
        }

        fun performSlideToLeft() {
            activity.overridePendingTransition(R.anim.slide_left_start, R.anim.slide_left_end)
        }

        fun performSlideToRight() {
            activity.overridePendingTransition(R.anim.slide_right_start, R.anim.slide_right_end)
        }

        fun performSlideToBottom() {
            activity.overridePendingTransition(R.anim.slide_bottom_start, R.anim.slide_bottom_end)
        }

        fun performSlideToTop() {
            activity.overridePendingTransition(R.anim.slide_top_start, R.anim.slide_top_end)
        }

        fun performFade() {
            activity.overridePendingTransition(R.anim.fade_start, R.anim.fade_end)
        }
    }

}