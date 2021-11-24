package akakom.nomhs.login19090119

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val bundle:Bundle? = intent.extras
    val username:String = "admin";
    val password:String = "admin";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener() {
            intent = Intent(this, Home::class.java)
            intent.putExtra("user", txtUser)
            intent.putExtra("pass", txtPass)
            startActivity(intent)
    }
}
    
