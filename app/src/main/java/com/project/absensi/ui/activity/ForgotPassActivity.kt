package com.project.absensi.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isEmpty
import androidx.core.view.size
import com.project.absensi.MainActivity
import com.project.absensi.R
import com.project.absensi.databinding.ActivityForgotPassBinding
import com.project.absensi.databinding.ActivityLoginBinding
import com.project.absensi.databinding.ActivityMainBinding

class ForgotPassActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPassBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPassBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //set logic forgot password sisa tambah database
        binding.buttonForgotPass.setOnClickListener {
            if (binding.textFieldEmailForgot.isEmpty()) {
                binding.textHelperEmailReset.setText("Field tidak boleh kosong")
                binding.textHelperEmailReset.visibility = View.VISIBLE
            } else {
                binding.textHelperEmailReset.visibility = View.GONE
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }
    }
}