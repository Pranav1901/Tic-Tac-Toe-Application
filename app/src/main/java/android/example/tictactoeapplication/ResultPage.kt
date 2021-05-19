package android.example.tictactoeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result_page.*

class ResultPage : AppCompatActivity() {
    // object for storing the game result
    companion object{
        const val RESULT = "Result"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)

        val res = intent.getStringExtra(RESULT)   //storing result string appeared with intent

        if(res.equals("Draw")){
            matchResult.text="Game is draw"   //when no one wins
        }
        else{

            matchResult.text="Match has won by $res"   //when any of the player wins
        }
    }

    fun tostart(view: View) {    // method called for restarting the game
        val intent= Intent(this,MainActivity::class.java)    // calling te main activity
        startActivity(intent)
    }

}