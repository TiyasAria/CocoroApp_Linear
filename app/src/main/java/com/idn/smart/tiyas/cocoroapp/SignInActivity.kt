package com.idn.smart.tiyas.cocoroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signin.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        //support itu untuk menghilangkan taskbar atas cocoroAppnya biar gak muncul
        supportActionBar?.hide()
        //fungsi dari setOnclickListener untuk mengeklik akan ke halaman selanjutnya
        id_create.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
            finish()
        }
    }
}