package android.example.tictactoeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toss__page.*
import kotlin.random.Random

class Toss_Page : AppCompatActivity() {
    companion object{
        const val STATE = "state"
        var WINNER = "winner"
        var LOOSER = "looser"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toss__page)
        var startButton = findViewById(R.id.start_game_button )as Button
        val tossButton = findViewById(R.id.toss_button) as ImageButton
        var x =rand(1,2)
        var winner = ""
        startButton.setVisibility(View.INVISIBLE)
        tossButton.setOnClickListener{
            if(tossButton.isPressed){
                tossButton.setImageResource(R.drawable.coin)
                startButton.setVisibility(View.VISIBLE)
                if(x == 1) {
                    state_text.text = "Player 1"
                    WINNER = "Player 1"
                    LOOSER = "Player 2"
                }
                else if(x == 2){
                    state_text.text = "Player 2"
                    WINNER = "Player 2"
                    LOOSER = "Player 1"
                }
            }
            winner_name.text = " $WINNER won the toss "
        }
    }
    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        val rand = Random(System.nanoTime())
        return (start..end).random(rand)
    }

    fun startGame(view: View) {
        val intent = Intent(this,Game_Page::class.java)
        //intent.putExtra(resultPage.RESULT,WINNER)
        //intent.putExtra(gamePage.TOSS_LOOSER,LOOSER)
        intent.putExtra(Game_Page.TOSS_WINNER,WINNER)
        startActivity(intent)
    }
}