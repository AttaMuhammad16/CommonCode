package com.atta.common

import android.app.Activity
import androidx.core.content.ContextCompat

class MyUtils {
    fun statusBar(context:Activity,color:Int){
        context.window.statusBarColor=ContextCompat.getColor(context,color)
    }
}