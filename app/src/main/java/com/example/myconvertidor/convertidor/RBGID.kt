package com.example.myconvertidor.convertidor

import android.widget.RadioButton
import android.widget.RadioGroup

class RBGID {
    val rgbid: Map<Int, String> = mapOf(
        0 to "kilometro",
        1 to "metro",
        2 to "centimetro"
    ).withDefault { "error" }

    fun findCheckRBId(rbgGroup: RadioGroup):Int{
        val rbId: Int = rbgGroup.checkedRadioButtonId
        if (rbId == -1){
            return -1
        }

        val radioButton = rbgGroup.findViewById<RadioButton>(rbId)
        return  rbgGroup.indexOfChild(radioButton)
    }

    fun Rgbid(index: Int) : String{
        when (rgbid[index]){
            "kilometro" ->{return "km"}
            "metro" ->{return "m"}
            "centimetro" ->{return "cm"}
        }

        return ""
    }
}