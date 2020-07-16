# SwipeSwitch

Toggle the switch with swipe

<div>
  <img src="https://github.com/kapilmhr/SwipeSwitch/blob/master/swipe.gif" width="400" hspace="20" />
  <br/>
</div>

# Usage

in your build.gradle (Module)
```groovy
implementation 'com.frantic.swipeSwitch:releasebuild'
```

in your build.gradle (Project)
```groovy
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
# In your .xml
```groovy
   <app.frantic.swipeswitch.SwipeSwitch
            android:id="@+id/switchbtn"
            android:layout_width="match_parent"
            android:layout_height="80dp"
            android:layout_marginLeft="10dp"
            android:layout_marginRight="10dp"
            app:orientation="LANDSCAPE"
            app:actionOffDrawable="@drawable/ic_lock_open_black_24dp"
            app:actionOnDrawable="@drawable/ic_lock_outline_black_24dp"
            app:baseColor="#00B0F2"
            />
```

# In your activity/fragment
```groovy
// Kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchbtn.setSwitchStateChangedListener(object :
            SwipeSwitch.SwitchStateChangedListener{
            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onChanged(newState: SwipeSwitch.State) {
             
            }

        })
    }
```


# Options
 - custom **orientation**: "app:orientation" - sets the orientation of the switch (PORTRAIT/LANDSCAPE)
 - custom **actionOffDrawable**: "app:actionOffDrawable" - sets the drawable desired for the OFF state
 - custom **actionOnDrawable**: "app:actionOnDrawable" - sets the drawable desired for the ON state
 - custom **baseColor**: "app:baseColor" - sets the base color for the switch 
  - custom **backgroundImage**: "app:backgroundImage" - sets the background Image for the switch 
 
# Public Methods

- setSwitchStateChangedListener(listener: SwitchStateChangedListener): sets a listener for switch state changes
 
