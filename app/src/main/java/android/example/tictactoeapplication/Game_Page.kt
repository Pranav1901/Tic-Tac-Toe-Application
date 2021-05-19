package android.example.tictactoeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Game_Page : AppCompatActivity() {
    companion object{

        const val Player1Sym ='X'
        const val Player2Sym ='O'
        const val TOSS_WINNER = ""

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game__page)
    }
}