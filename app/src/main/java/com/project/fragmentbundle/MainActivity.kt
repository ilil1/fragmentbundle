package com.project.fragmentbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        val transaction2 : FragmentTransaction = supportFragmentManager.beginTransaction()

        val SenderFragment = SenderFragment()
        transaction.replace(R.id.sender, SenderFragment)
        transaction.commit()

        val RecieverFragment = RecieverFragment()
        transaction2.replace(R.id.receiver, RecieverFragment)
        transaction2.commit()
    }
}