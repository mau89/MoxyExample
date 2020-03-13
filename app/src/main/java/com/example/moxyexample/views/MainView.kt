package com.example.moxyexample.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {
    fun sum(result: String)
    fun subtraction(result: String)
    fun multiplication(result: String)
    fun division(result: String)
    fun showError(message: Int)
}