package com.example.androidbasic_musquad2

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast

class Formation343Fragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.formation343, container, false)
        val btnSt : ImageButton = view.findViewById(R.id.st343)
        val btnLf : ImageButton = view.findViewById(R.id.lf343)
        val btnRf : ImageButton = view.findViewById(R.id.rf343)
        val btnLm : ImageButton = view.findViewById(R.id.lm343)
        val btnLcm : ImageButton = view.findViewById(R.id.lcm343)
        val btnRcm : ImageButton = view.findViewById(R.id.rcm343)
        val btnRm : ImageButton = view.findViewById(R.id.rm343)
        val btnLcb : ImageButton = view.findViewById(R.id.lcb343)
        val btnCb : ImageButton = view.findViewById(R.id.cb343)
        val btnRcb : ImageButton = view.findViewById(R.id.rcb343)
        val btnGk : ImageButton = view.findViewById(R.id.gk343)

        btnSt.setOnClickListener(this)
        btnLf.setOnClickListener(this)
        btnRf.setOnClickListener(this)
        btnLm.setOnClickListener(this)
        btnLcm.setOnClickListener(this)
        btnRcm.setOnClickListener(this)
        btnRm.setOnClickListener(this)
        btnLcb.setOnClickListener(this)
        btnCb.setOnClickListener(this)
        btnRcb.setOnClickListener(this)
        btnGk.setOnClickListener(this)

        return view
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.st343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 0)
                startActivityForResult(intent,102)
            }
            R.id.lf343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 1)
                startActivityForResult(intent,102)
            }
            R.id.rf343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 2)
                startActivityForResult(intent,102)
            }
            R.id.lm343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 3)
                startActivityForResult(intent,102)
            }
            R.id.lcm343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 4)
                startActivityForResult(intent,102)
            }
            R.id.rcm343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 5)
                startActivityForResult(intent,102)
            }
            R.id.rm343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 6)
                startActivityForResult(intent,102)
            }
            R.id.lcb343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 7)
                startActivityForResult(intent,102)
            }
            R.id.cb343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 8)
                startActivityForResult(intent,102)
            }
            R.id.rcb343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 9)
                startActivityForResult(intent,102)
            }
            R.id.gk343->{
                val intent = Intent(context, SelectActivity::class.java)
                intent.putExtra("player_position", 10)
                startActivityForResult(intent,102)
            }
        }
    }

    var player_image_src_0 : Int = 0
    var player_image_src_1 : Int = 0
    var player_image_src_2 : Int = 0
    var player_image_src_3 : Int = 0
    var player_image_src_4 : Int = 0
    var player_image_src_5 : Int = 0
    var player_image_src_6 : Int = 0
    var player_image_src_7 : Int = 0
    var player_image_src_8 : Int = 0
    var player_image_src_9 : Int = 0
    var player_image_src_10 : Int = 0

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            when(requestCode){
                102->{
                    var position = data?.getIntExtra("player_position",0)
                    var player_image_src = data!!.getIntExtra("image_src",0)
                    var player_name = data!!.getStringExtra("name")

                    when(position){
                        0->{
                            Log.d("Toast", "0")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.st343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_0 = player_image_src
                        }
                        1->{
                            Log.d("Toast", "1")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.lf343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_1 = player_image_src
                        }
                        2->{
                            Log.d("Toast", "2")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.rf343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_2 = player_image_src
                        }
                        3->{
                            Log.d("Toast", "3")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.lm343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_3 = player_image_src
                        }
                        4->{
                            Log.d("Toast", "4")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.lcm343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_4 = player_image_src
                        }
                        5->{
                            Log.d("Toast", "5")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.rcm343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_5 = player_image_src
                        }
                        6->{
                            Log.d("Toast", "6")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.rm343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_6 = player_image_src
                        }
                        7->{
                            Log.d("Toast", "7")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.lcb343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_7 = player_image_src
                        }
                        8->{
                            Log.d("Toast", "8")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.cb343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_8 = player_image_src
                        }
                        9->{
                            Log.d("Toast", "9")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.rcb343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_9 = player_image_src
                        }
                        10->{
                            Log.d("Toast", "10")
                            Log.d("Toast", player_image_src.toString()+player_name.toString())
                            val imageButton : ImageButton? = getView()?.findViewById(R.id.gk343)
                            imageButton?.setImageResource(player_image_src)
                            Toast.makeText(context, player_name, Toast.LENGTH_SHORT).show()
                            player_image_src_10 = player_image_src
                        }
                    }
                }
            }
        }
    }

    fun getImageResource(): List<Int> {
        val list : List<Int> = listOf(player_image_src_0, player_image_src_1, player_image_src_2, player_image_src_3, player_image_src_4, player_image_src_5, player_image_src_6, player_image_src_7, player_image_src_8, player_image_src_9, player_image_src_10)

        return list
    }

    lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    fun setImageResource(list: List<Int>){
        player_image_src_0 = list.get(0)
        player_image_src_1 = list.get(1)
        player_image_src_2 = list.get(2)
        player_image_src_3 = list.get(3)
        player_image_src_4 = list.get(4)
        player_image_src_5 = list.get(5)
        player_image_src_6 = list.get(6)
        player_image_src_7 = list.get(7)
        player_image_src_8 = list.get(8)
        player_image_src_9 = list.get(9)
        player_image_src_10 = list.get(10)

        val btnSt : ImageButton = mainActivity.findViewById(R.id.st343)
        val btnLf : ImageButton = mainActivity.findViewById(R.id.lf343)
        val btnRf : ImageButton = mainActivity.findViewById(R.id.rf343)
        val btnLm : ImageButton = mainActivity.findViewById(R.id.lm343)
        val btnLcm : ImageButton = mainActivity.findViewById(R.id.lcm343)
        val btnRcm : ImageButton = mainActivity.findViewById(R.id.rcm343)
        val btnRm : ImageButton = mainActivity.findViewById(R.id.rm343)
        val btnLcb : ImageButton = mainActivity.findViewById(R.id.lcb343)
        val btnCb : ImageButton = mainActivity.findViewById(R.id.cb343)
        val btnRcb : ImageButton = mainActivity.findViewById(R.id.rcb343)
        val btnGk : ImageButton = mainActivity.findViewById(R.id.gk343)

        btnSt.setImageResource(player_image_src_0)
        btnLf.setImageResource(player_image_src_1)
        btnRf.setImageResource(player_image_src_2)
        btnLm.setImageResource(player_image_src_3)
        btnLcm.setImageResource(player_image_src_4)
        btnRcm.setImageResource(player_image_src_5)
        btnRm.setImageResource(player_image_src_6)
        btnLcb.setImageResource(player_image_src_7)
        btnCb.setImageResource(player_image_src_8)
        btnRcb.setImageResource(player_image_src_9)
        btnGk.setImageResource(player_image_src_10)
    }

}