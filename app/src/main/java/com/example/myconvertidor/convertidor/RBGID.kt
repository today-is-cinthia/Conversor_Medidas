package com.example.myconvertidor.convertidor

import android.widget.RadioButton
import android.widget.RadioGroup

class RBGID {
    val rgbid: Map<Int, String> = mapOf(
        0 to "Kilometros",
        1 to "Metros",
        2 to "Centimetro"
    ).withDefault { "error" }

    fun findCheckRBId(rbgGroup: RadioGroup):Int{
        val rbId: Int = rbgGroup.checkedRadioButtonId
        if (rbId == -1){
            return -1
        }

        val radioButton = rbgGroup.findViewById<RadioButton>(rbId)
        return  rbgGroup.indexOfChild(radioButton)
    }

}