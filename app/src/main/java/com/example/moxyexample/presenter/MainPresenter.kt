package com.example.moxyexample.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.moxyexample.R
import com.example.moxyexample.views.MainView

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    fun sum(number1: String, number2: String) {
        if (inputError(number1, number2)) {
            viewState.sum((number1.toDouble() + number2.toDouble()).toString())
        } else {
            viewState.showError(R.string.ErrorNumber)
        }


    }


    fun division(number1: String, number2: String) {
        when {
            !inputError(number1, number2) -> {
                viewState.showError(R.string.ErrorNumber)
            }
            !inputErrorNumber2(number2) -> {
                viewState.showError(R.string.ErrorNull)
            }
            else -> {
                viewState.division((number1.toDouble() / number2.toDouble()).toString())
            }
        }
    }


    fun subtraction(number1: String, number2: String) {
        if (inputError(number1, number2)) {
            viewState.subtraction((number1.toDouble() - number2.toDouble()).toString())
        } else {
            viewState.showError(R.string.ErrorNumber)
        }
    }

    fun multiplication(number1: String, number2: String) {
        if (inputError(number1, number2)) {
            viewState.subtraction((number1.toDouble() * number2.toDouble()).toString())
        } else {
            viewState.showError(R.string.ErrorNumber)
        }
    }

    private fun inputErrorNumber2(number2: String): Boolean {
        return number2.toDouble() != 0.0
    }

    private fun inputError(number1: String, number2: String): Boolean {
        return try {
            (number1.toDouble() is Double && number2.toDouble() is Double)
            true
        } catch (e: NumberFormatException) {
            false
        }

    }
}