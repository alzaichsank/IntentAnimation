# IntentAnimation

A simple Android Library for animation transition

## Support
Support from android api 16

## Permission
No needed special permission in AndroidManifest

## Special Case 
For several case, please add this if you are using android version >= 21 in the style.xml file in the values-v21
```xml
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
       <item name="android:windowActivityTransitions">true</item>
</style>
```
## Installing 
Add repository in root build.gradle
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
And add dependency to module build.gradle:
```gradle
dependencies {
    implementation 'com.github.alzaichsank:IntentAnimation:1.0.1'
}
```

## Sample Code 
Animation for can be work in Activity Transition so please place the code after intent or other activity transition event
```kotlin
startActivity(Intent(this,MenuActivity::class.java))
            AnimIntent.Builder(this).performSlideToLeft()
```
```kotlin
 override fun onBackPressed() {
        super.onBackPressed()
        AnimIntent.Builder(this).performSlideToRight()
    }
```



# More information
  * https://github.com/pahlevikun/AcTrans 
  * Alex Lockwood posts about Transition Framework. A great in deep into this topic: [http://www.androiddesignpatterns.com/2014/12/activity-fragment-transitions-in-android-lollipop-part1.html](http://www.androiddesignpatterns.com/2014/12/activity-fragment-transitions-in-android-lollipop-part1.html)
  * Amazing repository with lot of Material Design samples by Saul Molinero: [https://github.com/saulmm/Android-Material-Examples](https://github.com/saulmm/Android-Material-Examples)
  * Chet Hasse video explaining Transition framework: [https://www.youtube.com/watch?v=S3H7nJ4QaD8](https://www.youtube.com/watch?v=S3H7nJ4QaD8)

[transition-framework]: https://developer.android.com/training/transitions/overview.html

[explode_link]: https://developer.android.com/reference/android/transition/Explode.html
[fade_link]: https://developer.android.com/reference/android/transition/Fade.html
[slide_link]: https://developer.android.com/reference/android/transition/Slide.html

[transition_explode]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/transition_explode.gif
[transition_slide]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/transition_slide.gif
[transition_fade]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/transition_fade.gif
[transition_fade2]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/transition_fade2.gif
[transition_a_to_b]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/transition_A_to_B.png
[transition_b_to_a]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/transition_B_to_A.png

[shared_element]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/shared_element.png
[shared_element_anim]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/shared_element_anim.gif
[shared_element_no_overlap]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/shared_element_no_overlap.gif
[shared_element_overlap]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/shared_element_overlap.gif

[scenes_anim]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/scenes_anim.gif
[view_layout_anim]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/view_layout_anim.gif

[reveal_blue]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/reveal_blue.gif
[reveal_red]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/reveal_red.gif
[reveal_green]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/reveal_green.gif
[reveal_yellow]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/reveal_yellow.gif
[reveal_shared_anim]: https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/shared_reveal_anim.gif

