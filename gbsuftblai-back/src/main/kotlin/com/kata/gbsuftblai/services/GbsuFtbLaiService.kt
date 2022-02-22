package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var number = inputNumber.toString()
        var result = ""
        val diffIn3 = inputNumber % 3
        val diffIn5 = inputNumber % 5

        var start = 0
        var end = number.length - 1

        if (number.length > 1 && checkSameDigits(inputNumber).equals("Yes")) {
            for (i in start..end) {


                if (number.contains("7")) {

                    result += "Lai"
                }
            }
        } else {
            if (number.contains("7")) {

                result += "Lai"
            }
        }

        if (diffIn5.equals(0)) {

            result += "Ftb"
        }


        if (number.length > 1 && checkSameDigits(inputNumber).equals("Yes")) {
            for (i in start..end) {


                if (number.contains("5")) {

                    result += "Ftb"
                }
            }
        } else {
            if (number.contains("5")) {

                result += "Ftb"
            }
        }

        if (diffIn3.equals(0)) {
            result += "Gbsu"
        }

        if (number.length > 1 && checkSameDigits(inputNumber).equals("Yes")) {
            for (i in start..end) {

                if (number.contains("3")) {

                    result += "Gbsu"
                }
            }
        } else {
            if (number.contains("3")) {

                result += "Gbsu"
            }
        }

        return result
    }

    fun checkSameDigits(N: Int): String {
        var N = N
        val digit = N % 10
        while (N != 0) {

            val current_digit = N % 10

            N = N / 10

            if (current_digit != digit) {
                return "No"
            }
        }

        return "Yes"
    }


}