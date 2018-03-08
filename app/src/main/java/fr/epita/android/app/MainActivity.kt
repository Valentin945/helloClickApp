package fr.epita.android.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isReverse: Boolean = false
    var increment: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.helloWorldText).setOnClickListener({
            Toast.makeText(this@MainActivity, "Toast", Toast.LENGTH_SHORT).show()
        })

        normalButton.setOnClickListener({
            changeIncrement(1)
        })

        bigButton.setOnClickListener({
            changeIncrement(5)
        })

        reverseButton.setOnClickListener({
            reverse()
        })

        clickMeButton.setOnClickListener({
            incrementFunction()
        })

        resetButton.setOnClickListener({
            reset()
        })
    }

    fun incrementFunction()
    {
        var tmp: Int = mainCounter.text.toString().toInt()
        if (isReverse)
        {
            tmp -= increment;
        }
        else
        {
            tmp += increment;
        }
        mainCounter.text = tmp.toString()
    }

    fun changeIncrement(i: Int)
    {
        this.increment = i;
    }

    fun reverse()
    {
        this.isReverse = !this.isReverse;
    }

    fun reset()
    {
        mainCounter.text = "0"
    }
}
