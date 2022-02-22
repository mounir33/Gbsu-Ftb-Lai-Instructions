package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        val inputNumber = 9;
        var  number = inputNumber.toString()
        var  result=""
        val diffIn3 = inputNumber % 3
        val diffIn5 = inputNumber % 5

        if(diffIn3.equals(0)){
            result = "Gbsu"
        }
        if(number.contains("3")){
            result += "Gbsu"
        }
        if(diffIn5.equals(0)){
            result += "Ftb"
        }
        if(number.contains("5")){
            result += "Ftb"
        }
        if(number.contains("7")){
            result += "Lai"
        }

        return result
    }

}