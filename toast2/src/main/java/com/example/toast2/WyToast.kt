package com.example.toast2

import android.content.Context
import android.widget.Toast

object WyToast {
    fun showToast(context: Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
    }
}