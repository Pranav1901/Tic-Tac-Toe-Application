package android.example.tictactoeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToToss(view: View) {                   //function for changing the activity from main activity to toss page activity.
        val intent = Intent(this,TossPage::class.java)  //Created the intent variable for toss Page
        startActivity(intent)                                          //Started the toss activity
    }
}