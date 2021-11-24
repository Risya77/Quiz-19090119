package akakom.nomhs.login19090119

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home);

        val bundle:Bundle? = intent.extras
        val user = bundle?.get("user")
        val pass = bundle?.get("pass")
        Toast.makeText(applicationContext,user.toString()+" "+pass, Toast.LENGTH_LONG).show()


        logout.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

    }
}