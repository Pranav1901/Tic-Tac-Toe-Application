package android.example.tictactoeapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_toss__page.*
import kotlin.random.Random

class TossPage : AppCompatActivity() {
    companion object{
        var WINNER = "winner"
        var LOOSER = "looser"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toss__page)


        //variable to manage clicks of start Button
        val startButton = findViewById<Button>(R.id.start_game_button )

        //variable to manage clicks of toss Button
        val tossButton = findViewById<ImageButton>(R.id.toss_button)

        //varible for taking a random value between 1 and 2
        val x =rand(1,2)

        // setting the visiblity of the start button to invisble so that it cant be clicked  before the tossed button
        startButton.visibility = View.INVISIBLE

        // setting the visiblity of the start button to invisble so that it cant be clicked  before the tossed button
        tossButton.setOnClickListener{
            if(tossButton.isPressed){
                //changing the image of the image button for showing the result
                tossButton.setImageResource(R.drawable.coin)

                //setting the visibility of the start button to visible so , that it can be clicked now
                startButton.visibility = View.VISIBLE

                //if the random varible is 1 then the toss is won by the player 1
                if(x == 1) {
                    state_text.text = "Player 1"
                    WINNER = "Player 1"
                    LOOSER = "Player 2"
                }
                //if the random variable is 2 then the toss is won by the player 2
                else if(x == 2){
                    state_text.text = "Player 2"
                    WINNER = "Player 2"
                    LOOSER = "Player 1"
                }
            }
            //setting the textview for winner of the toss
            winner_name.text = " $WINNER won the toss "
        }
    }

    // a function to give a random value between 1 and 2
   private fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        val rand = Random(System.nanoTime())
        return (start..end).random(rand)
    }
    // a function to start the game activity
    fun startGame(view: View) {
        val intent = Intent(this,Game_Page::class.java)
        intent.putExtra(Game_Page.TOSS_WINNER,WINNER)
        startActivity(intent)
    }


}