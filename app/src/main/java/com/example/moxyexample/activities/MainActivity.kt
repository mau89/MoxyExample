package com.example.moxyexample.activities

import android.os.Bundle
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.moxyexample.R
import com.example.moxyexample.presenter.MainPresenter
import com.example.moxyexample.views.MainView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : MvpAppCompatActivity(),
    MainView {

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_sum.setOnClickListener {

            mainPresenter.sum(edit_number1.text.toString(), edit_number2.text.toString())
        }
        btn_division.setOnClickListener {

            mainPresenter.division(edit_number1.text.toString(), edit_number2.text.toString())
        }
        btn_subtraction.setOnClickListener {

            mainPresenter.subtraction(edit_number1.text.toString(), edit_number2.text.toString())
        }
        btn_multiplication.setOnClickListener {

            mainPresenter.multiplication(edit_number1.text.toString(), edit_number2.text.toString())
        }
    }

    override fun sum(result: String) {
        txt_result.text = result
    }

    override fun subtraction(result: String) {
        txt_result.text = result
    }

    override fun multiplication(result: String) {
        txt_result.text = result
    }

    override fun division(result: String) {
        txt_result.text = result
    }

    override fun showError(message: Int) {
        Toast.makeText(this, getString(message), Toast.LENGTH_LONG).show()
    }

}
