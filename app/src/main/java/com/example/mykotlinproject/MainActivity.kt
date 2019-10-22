package com.example.mykotlinproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //private TextView Nim, Nama, Nilai;
    //private Button Proses;
    private lateinit var Nim: EditText
    private lateinit var Nama: EditText
    private lateinit var Nilai: EditText
    private lateinit var Proses: Button
    private lateinit var dtnim: String
    private lateinit var dtnama: String
    private lateinit var dtnilai:String
    //internal var dtnilai: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nim=findViewById(R.id.nim)
        Nama=findViewById(R.id.nama)
        Nilai=findViewById(R.id.nilai)



//        val Nim = findViewById<View>(R.id.nim) as EditText
//        val Nama = findViewById<View>(R.id.nama) as EditText
//        val Nilai = findViewById<View>(R.id.nilai) as EditText
//        val Proses = findViewById<View>(R.id.btn_proses) as Button
        //Proses.setOnClickListener(this);

        btn_proses.setOnClickListener {
            val dtnim = Nim.text.toString()
            val dtnama = Nama.text.toString()
            val dtnilai = Nilai.text.toString()
            val intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("nim", "Nim         : "+dtnim)
            intent.putExtra("nama", "Nama       :"+dtnama)
            intent.putExtra("nilai", "Nilai     :"+dtnilai)
//            if(dtnilai.toInt()>=80){
//                intent.putExtra("keterangan", "Keterangan     = A")
//            }else if (dtnilai.toInt()>=60){
//                intent.putExtra("keterangan", "Keterangan     = B")
//            }else if (dtnilai.toInt()>=40){
//                intent.putExtra("keterangan", "Keterangan     = C")
//            }else if (dtnilai.toInt()>=20){
//                intent.putExtra("keterangan", "Keterangan     = D")
//            }else if (dtnilai.toInt()>=0){
//                intent.putExtra("keterangan", "Keterangan     = E")
//            }
            startActivity(intent)
        }
    }
}
