package za.co.varsitycollege.st10473840.st1047380assigment1

import android.os.Bundle
import android.text.format.DateFormat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val reset = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textView)
        val produce = findViewById<Button>(R.id.button3)
        val entertime = findViewById<EditText>(R.id.editTextText2)
        val food = findViewById<TextView>(R.id.textView3)

        // the meals of the menu
        val morning = listOf("Beacon and eggs", "Tea", "Cornflakes", "future Life")
        val midday = listOf("Simba", "Orange Juice", "Tea and Biscuits", "yogurt")
        val afternoon =
            listOf("Bread and Jam", "KFC", "Fries", "Egg Salad Sandwich", "chicken Salad")
        val midafternoon = listOf("Apples", "Cucumber sticks", "Herbal tea", "Granola Bars")
        val dinner = listOf("Spaghetti", "Omelette", "Tacos", "Meat and Rice")
         produce.setOnClickListener {}

        //if the user enter the wromg time
        if (entertime.text.toString() == "morning") {
            food.text = "hi your food is ready${morning}"

        } else if (entertime.text.toString() == "midday")
            food.text = "hi your food is ready ${midday}"
        else if (
            entertime.text.toString() == "afternoon")
            food.text = "hi your food is ready ${afternoon}"
        else if (
            entertime.text.toString() == "midafternoon")
            food.text = "hi your food is ready ${midafternoon}"
        else if (
            entertime.text.toString() == "dinner")
            food.text = "hi your food is ready${dinner}"



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}