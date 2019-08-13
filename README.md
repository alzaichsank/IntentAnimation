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
  * pahlevikun resource :
https://github.com/pahlevikun/AcTrans 
  

