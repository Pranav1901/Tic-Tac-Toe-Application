package android.example.tictactoeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game__page.*
import kotlinx.android.synthetic.main.activity_main.*

class Game_Page : AppCompatActivity() {
    companion object{

        const val Player1Sym ='X'    //object to store tosswinner's variable
        const val Player2Sym ='O'     //object to store tosslooser's variable
        const val TOSS_WINNER = ""

    }
    var countOfXO = 0
    var toss_win = ""
    var temp = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game__page)

        val tossWinner = intent.getStringExtra(TOSS_WINNER)//storing the tosswinner appeared with intent  in a variable

        if (tossWinner != null) {
            toss_win = tossWinner
        }
        if(toss_win == "Player 1"){    //checking which player is the toss winner
            temp = "Player 2"
        }
        else{
            temp = "Player 1"
        }

        toss_l.text = "$temp"
        toss_w.text = "$toss_win"

          player_name.text = "$tossWinner make first move"     //displaying the name of tosswinner to start the game


        val gridButton1 = findViewById(R.id.gridButton_1) as ImageButton
        val gridButton2 = findViewById(R.id.gridButton_2) as ImageButton
        val gridButton3 = findViewById(R.id.gridButton_3) as ImageButton
        val gridButton4 = findViewById(R.id.gridButton_4) as ImageButton
        val gridButton5 = findViewById(R.id.gridButton_5) as ImageButton
        val gridButton6 = findViewById(R.id.gridButton_6) as ImageButton
        val gridButton7 = findViewById(R.id.gridButton_7) as ImageButton
        val gridButton8 = findViewById(R.id.gridButton_8) as ImageButton
        val gridButton9 = findViewById(R.id.gridButton_9) as ImageButton

        //following are the 9 buttons which on click will display image of cross/zero(tossWinner's image will be cross by default)
        //first move will display cross image
        //cross image will be displayed on even count and zero image will be displayed on odd count

        //button 1
        gridButton1.setOnClickListener {


            if(gridButton1.isPressed){       //condition to check if button is pressed
                if(countOfXO%2 == 0) {       //condition to check which image to display
                    gridButton1.setImageResource(R.drawable.crossy)   //displaying cross image
                    matrix[0][0] = Player1Sym   //storing tosswinner's variable in corresponding mattrix
                }
                else{
                    gridButton1.setImageResource(R.drawable.zeroy)  //displaying zero image
                    matrix[0][0] = Player2Sym    //storing tosslooser's variable in corresponding mattrix
                }
                gridButton1.setEnabled(false)    //method to disable multiple clicks
                countOfXO++
                check()
                if(checking()){         //calling method checking
                    sendResult()
                }
            }
        }

        //button 2
        gridButton2.setOnClickListener {


            if(gridButton2.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton2.setImageResource(R.drawable.crossy)
                    matrix[1][0] = Player1Sym
                }
                else{
                    gridButton2.setImageResource(R.drawable.zeroy)
                    matrix[1][0] = Player2Sym
                }
                gridButton2.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }

        //button 3
        gridButton3.setOnClickListener {


            if(gridButton3.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton3.setImageResource(R.drawable.crossy)
                    matrix[2][0] = Player1Sym
                }
                else{
                    gridButton3.setImageResource(R.drawable.zeroy)
                    matrix[2][0] = Player2Sym
                }
                gridButton3.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }

        //button4
        gridButton4.setOnClickListener {


            if(gridButton4.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton4.setImageResource(R.drawable.crossy)
                    matrix[0][1] = Player1Sym
                }
                else{
                    gridButton4.setImageResource(R.drawable.zeroy)
                    matrix[0][1] = Player2Sym
                }
                gridButton4.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }

        //button5
        gridButton5.setOnClickListener {


            if(gridButton5.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton5.setImageResource(R.drawable.crossy)
                    matrix[1][1] = Player1Sym
                }
                else{
                    gridButton5.setImageResource(R.drawable.zeroy)
                    matrix[1][1] = Player2Sym
                }
                gridButton5.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }

        //button6
        gridButton6.setOnClickListener {


            if(gridButton6.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton6.setImageResource(R.drawable.crossy)
                    matrix[2][1] = Player1Sym
                }
                else{
                    gridButton6.setImageResource(R.drawable.zeroy)
                    matrix[2][1] = Player2Sym
                }
                gridButton6.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }

        //button7
        gridButton7.setOnClickListener {


            if(gridButton7.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton7.setImageResource(R.drawable.crossy)
                    matrix[0][2] = Player1Sym
                }
                else{
                    gridButton7.setImageResource(R.drawable.zeroy)
                    matrix[0][2] = Player2Sym
                }
                gridButton7.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }

        //button8
        gridButton8.setOnClickListener {


            if(gridButton8.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton8.setImageResource(R.drawable.crossy)
                    matrix[1][2] = Player1Sym
                }
                else{
                    gridButton8.setImageResource(R.drawable.zeroy)
                    matrix[1][2] = Player2Sym
                }
                gridButton8.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }

        //button9
        gridButton9.setOnClickListener {

            if(gridButton9.isPressed){
                if(countOfXO%2 == 0) {
                    gridButton9.setImageResource(R.drawable.crossy)

                    matrix[2][2] = Player1Sym
                }
                else{
                    gridButton9.setImageResource(R.drawable.zeroy)
                    matrix[2][2] = Player2Sym
                }
                gridButton9.setEnabled(false)
                countOfXO++
                check()
                if(checking()){
                    sendResult()
                }
            }
        }
    }
    var count :Int =0;
    var matrix = arrayOf(          //matrix for storing player variables X/O
        arrayOf('_','_','_'),
        arrayOf('_','_','_'),
        arrayOf('_','_','_')
    )

    fun check(){
        var text =""
        for (array in matrix) {
            for (value in array) {
                text+=value
            }
            text+=" \n $count"
        }

    }

    fun checking():Boolean{          //method to check if any of the winning case row/col/diagonal or draw occurred
        return(countOfXO>=9 || rowChecked()||colchecked()||daigonalchecked())
    }
    fun sendResult(){                //method to send result of the game state(game Winner / draw) to result screen
        val intent = Intent(this,ResultPage::class.java)   //storing intent of result screen
                //storing toss looser

        if(countOfXO>=9) {         //condition to check the last move
            if(rowChecked()||colchecked()||daigonalchecked()){     //condition to check if toss winner wins in last move
                intent.putExtra(ResultPage.RESULT, toss_win)
            }
            else {
                intent.putExtra(ResultPage.RESULT, "Draw")    //condition if no player wins
            }
        }


        else if(countOfXO%2==0){         //condition to check if toss looser wins the game

            intent.putExtra(ResultPage.RESULT, temp)
        }
        else if(countOfXO%2!=0){         //condition to check if toss winner wins the game

            intent.putExtra(ResultPage.RESULT, toss_win)
        }

        startActivity(intent)        //starting the next activity
    }

    private fun daigonalchecked(): Boolean {        //method to check winning case(all images are same) of diagonals
        if(matrix[0][0]==matrix[1][1]&&matrix[1][1]==matrix[2][2]&&matrix[0][0]!='_'){    //condition to check 1st diagonal
            return true
        }
        else if(matrix[0][2]==matrix[1][1]&&matrix[1][1]==matrix[2][0]&&matrix[2][0]!='_'){  //condition to check 2nd diagonal
            return true
        }

        return false
    }

    private fun colchecked(): Boolean {          //method to check winning case(all images are same) of columns
        if(matrix[0][0]==matrix[1][0]&&matrix[1][0]==matrix[2][0]&&matrix[0][0]!='_'){ //condition to check 1st column
            return true
        }
        else if(matrix[0][1]==matrix[1][1]&&matrix[1][1]==matrix[2][1]&&matrix[0][1]!='_'){  //condition to check 2nd column
            return true
        }
        else if(matrix[0][2]==matrix[1][2]&&matrix[1][2]==matrix[2][2]&&matrix[0][2]!='_'){  //condition to check 3rd column
            return true
        }
        return false
    }

    private fun rowChecked(): Boolean {       //method to check winning case(all images are same) of rows
        if(matrix[0][0]==matrix[0][1]&&matrix[0][1]==matrix[0][2]&&matrix[0][0]!='_'){     //condition to check 1st row
            return true
        }
        else if(matrix[1][0]==matrix[1][1]&&matrix[1][1]==matrix[1][2]&&matrix[1][0]!='_'){ //condition to check 2nd row
            return true
        }
        else if(matrix[2][0]==matrix[2][1]&&matrix[2][1]==matrix[2][2]&&matrix[2][0]!='_'){   //condition to check 3rd row
            return true
        }
        return false
    }
}