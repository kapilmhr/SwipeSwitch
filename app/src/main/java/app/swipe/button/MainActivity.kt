package app.swipe.button

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import app.frantic.swipeswitch.SwipeSwitch
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchbtn.setSwitchStateChangedListener(object :
            SwipeSwitch.SwitchStateChangedListener{
            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onChanged(newState: SwipeSwitch.State) {
                if(newState == SwipeSwitch.State.ON){
                    println("ON")
                    text.setText("Swipe to Lock")
                }else{
                    text.setText("Swipe to Unlock")
                    println("OFF")

                }
            }

        })

    }
}