package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*
import android.widget.Toast

class ActivityKedua : AppCompatActivity() {

    private lateinit var getnim: TextView
    private lateinit var getnama: TextView
    private lateinit var getnilai: TextView
    private lateinit var getketerangan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        getnim.setText(intent.getStringExtra("nim"))
        getnama.setText(intent.getStringExtra("nama"))
        getnilai.setText(intent.getStringExtra("nilai"))
        if(nilai.toString().toInt()>=80){
                intent.putExtra("keterangan", "Keterangan     = A")
            }else if (nilai.toString().toInt()>=60){
                intent.putExtra("keterangan", "Keterangan     = B")
            }else if (nilai.toString().toInt()>=40){
                intent.putExtra("keterangan", "Keterangan     = C")
            }else if (nilai.toString().toInt()>=20){
                intent.putExtra("keterangan", "Keterangan     = D")
            }else if (nilai.toString().toInt()>=0){
                intent.putExtra("keterangan", "Keterangan     = E")
            }


//        val Nim = findViewById<TextView>(R.id.nim) as TextView
//        val Nama = findViewById<TextView>(R.id.nama) as TextView
//        val Nilai = findViewById<TextView>(R.id.nilai) as TextView
//        val Keterangan = findViewById<TextView>(R.id.keterangan) as TextView
//
//        var intent = intent
//        val dtnim = intent.getStringExtra("nim")
//        getnim = TextView(this)
//        val dtnama = intent.getStringExtra("nama")
//        getnama = TextView(this)
//        val dtnilai = intent.getStringExtra("nilai")
//        getnilai = TextView(this)
//        val dtketerangan = intent.getStringExtra("keterangan")
//        getketerangan = TextView(this)
//          startActivity(intent)

        btn_back.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
