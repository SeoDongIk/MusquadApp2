package com.example.androidbasic_musquad2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.os.HandlerCompat.postDelayed
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.formation_spinner)
        val items = resources.getStringArray(R.array.formation)
        val spinneradapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        val formation4231fragment = Formation4231Fragment()
        val formation433fragment = Formation433Fragment()
        val formation343fragment = Formation343Fragment()

        spinner.adapter = spinneradapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2 == 0){ // 4231
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, formation4231fragment).commit()
                }
                if(p2 == 1){ // 433
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, formation433fragment).commit()
                }
                if(p2 == 2){ // 343
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, formation343fragment).commit()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        val load_btn = findViewById<Button>(R.id.load_btn)
        val save_btn = findViewById<Button>(R.id.save_btn)

        val database = Firebase.database
        val user = Firebase.auth.currentUser

        save_btn.setOnClickListener{
            val myRef = database.getReference(user?.uid.toString())
            val formation = spinner.selectedItem.toString()

            if(formation=="4231"){
                var Fragment : Formation4231Fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Formation4231Fragment
                val list : List<Int> = Fragment.getImageResource()
                myRef.setValue(SquadData(formation,list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),list.get(6),list.get(7),list.get(8),list.get(9),list.get(10)))
            }
            if(formation=="433"){
                var Fragment : Formation433Fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Formation433Fragment
                val list : List<Int> = Fragment.getImageResource()
                myRef.setValue(SquadData(formation,list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),list.get(6),list.get(7),list.get(8),list.get(9),list.get(10)))
            }
            if(formation=="343"){
                var Fragment : Formation343Fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Formation343Fragment
                val list : List<Int> = Fragment.getImageResource()
                myRef.setValue(SquadData(formation,list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),list.get(6),list.get(7),list.get(8),list.get(9),list.get(10)))
            }
        }

        load_btn.setOnClickListener{
            val myRef = database.getReference(user?.uid.toString())
            var formation : Any? = ""
            var image_src_0 : Any? = 0
            var image_src_1 : Any? = 0
            var image_src_2 : Any? = 0
            var image_src_3 : Any? = 0
            var image_src_4 : Any? = 0
            var image_src_5 : Any? = 0
            var image_src_6 : Any? = 0
            var image_src_7 : Any? = 0
            var image_src_8 : Any? = 0
            var image_src_9 : Any? = 0
            var image_src_10 : Any? = 0

            myRef.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    for (data in dataSnapshot.children){
                        when(data.key){
                            "formation" -> formation = data.value
                            "image_src_0" -> image_src_0 = data.value
                            "image_src_1" -> image_src_1 = data.value
                            "image_src_2" -> image_src_2 = data.value
                            "image_src_3" -> image_src_3 = data.value
                            "image_src_4" -> image_src_4 = data.value
                            "image_src_5" -> image_src_5 = data.value
                            "image_src_6" -> image_src_6 = data.value
                            "image_src_7" -> image_src_7 = data.value
                            "image_src_8" -> image_src_8 = data.value
                            "image_src_9" -> image_src_9 = data.value
                            "image_src_10" -> image_src_10 = data.value
                        }
                    }
                    if(formation.toString()=="4231"){ // 문제 발생 부분
                        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, formation4231fragment).commit()
                        spinner.setSelection(0)
                        Handler().postDelayed({
                            var Fragment : Formation4231Fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Formation4231Fragment
                            val list = mutableListOf<Int>(image_src_0.toString().toInt(), image_src_1.toString().toInt(), image_src_2.toString().toInt(), image_src_3.toString().toInt(), image_src_4.toString().toInt(), image_src_5.toString().toInt(), image_src_6.toString().toInt(), image_src_7.toString().toInt(), image_src_8.toString().toInt(), image_src_9.toString().toInt(), image_src_10.toString().toInt())
                            Fragment.setImageResource(list)
                        },100)
                    }
                    if(formation=="433"){ // 문제 발생 부분
                        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, formation433fragment).commit()
                        spinner.setSelection(1)
                        Handler().postDelayed({
                            var Fragment : Formation433Fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Formation433Fragment
                            val list = mutableListOf<Int>(image_src_0.toString().toInt(), image_src_1.toString().toInt(), image_src_2.toString().toInt(), image_src_3.toString().toInt(), image_src_4.toString().toInt(), image_src_5.toString().toInt(), image_src_6.toString().toInt(), image_src_7.toString().toInt(), image_src_8.toString().toInt(), image_src_9.toString().toInt(), image_src_10.toString().toInt())
                            Fragment.setImageResource(list)
                        },100)
                    }
                    if(formation=="343"){ // 문제 발생 부분
                        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, formation343fragment).commit()
                        spinner.setSelection(2)
                        Handler().postDelayed({
                            var Fragment : Formation343Fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Formation343Fragment
                            val list = mutableListOf<Int>(image_src_0.toString().toInt(), image_src_1.toString().toInt(), image_src_2.toString().toInt(), image_src_3.toString().toInt(), image_src_4.toString().toInt(), image_src_5.toString().toInt(), image_src_6.toString().toInt(), image_src_7.toString().toInt(), image_src_8.toString().toInt(), image_src_9.toString().toInt(), image_src_10.toString().toInt())
                            Fragment.setImageResource(list)
                        }, 100)
                    }
                }
                override fun onCancelled(error: DatabaseError) {
                    Log.d("tag", "Failed to read value.", error.toException())
                }
            })

        }
    }

    var mBackWait : Long = 0

    override fun onBackPressed() {
        if(System.currentTimeMillis() - mBackWait >=2000 ) {
            var view = findViewById<LinearLayout>(R.id.view)
            mBackWait = System.currentTimeMillis()
            Snackbar.make(view,"뒤로가기 버튼을 한번 더 누르면 종료됩니다.",Snackbar.LENGTH_LONG).show()
        } else {
            finishAffinity();
        }
    }

    var auth : FirebaseAuth?= null
    var googleSignInClient : GoogleSignInClient?= null

    override fun onDestroy() {
        super.onDestroy()

        var gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)

        auth = FirebaseAuth.getInstance()

        FirebaseAuth.getInstance().signOut()
        googleSignInClient?.signOut()

    }

}