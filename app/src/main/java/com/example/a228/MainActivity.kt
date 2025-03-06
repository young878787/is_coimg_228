package imd.ntub.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.example.a228.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * setContentView(R.layout.activity_main)
        val txtScissors: TextView = findViewById(R.id.txtScissors)
        val txtRock = findViewById<TextView>(R.id.txtRock)
        val txtPaper: TextView = findViewById<TextView>(R.id.txtPaper)
        val txtResult: TextView = findViewById<TextView>(R.id.txtResult)
        val rbtnScissors = findViewById<RadioButton>(R.id.rbtnScissors)
        val rbtnRock = findViewById<RadioButton>(R.id.rbtnRock)
        val rbtnPaper = findViewById<RadioButton>(R.id.rbtnPaper)
        val rdbguss = findViewById<RadioGroup>(R.id.rdgGuess)
        val btnGuess = findViewById<Button>(R.id.btnGuess)
        **/
        //1:剪刀 2:石頭 3:布
        binding.btnGuess.setOnClickListener { it: View ->
            /*
            txtResult.text = when(rdbguss.checkedRadioButtonId){
                R.id.rbtnPaper->"你按布"
                R.id.rbtnScissors->"你按剪刀"
                R.id.rbtnRock->"你按了石頭"
                else->"沒有選東西"
            }*/
            //1:剪刀 2:石頭 3:布
            val random = (1..3).random()
            when(rdbguss.checkedRadioButtonId){
                R.id.rbtnScissors->{
                    when (random) {
                        1 -> txtResult.text = "電腦出剪刀-平手"
                        2 -> txtResult.text = "電腦出石頭-你輸了"
                        3 -> txtResult.text = "電腦出布-你贏了"
                    }
                }
                R.id.rbtnPaper->{
                    when (random) {
                        1 -> txtResult.text = "電腦出剪刀-你輸了"
                        2 -> txtResult.text = "電腦出石頭-你贏了"
                        3 -> txtResult.text = "電腦出布-平手"
                    }
                }
                R.id.rbtnRock->{
                    when (random) {
                        1 -> txtResult.text = "電腦出剪刀-你贏了"
                        2 -> txtResult.text = "電腦出石頭-平手"
                        3 -> txtResult.text = "電腦出布-你輸了"
                    }
                }
                else->{
                    txtResult.text = "沒有選東西"
                }
            }

        }


    }
}