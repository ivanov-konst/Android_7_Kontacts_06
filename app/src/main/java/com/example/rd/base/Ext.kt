package com.example.rd.base

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewTreeObserver
import android.view.inputmethod.InputMethodManager

//val Context.inputMethodManager: InputMethodManager
//    get() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//
//fun Activity.hideKeyboard() {
//    inputMethodManager.hideSoftInputFromWindow(window.decorView.windowToken, 0)
//}
//
//fun View.focusAndShowKeyboard() {
//
//    fun View.showTheKeyboardNow() {
//        if (isFocused) {
//            post {
//                context.inputMethodManager.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
//            }
//        }
//    }
//
//    requestFocus()
//
//    if (hasWindowFocus()) {
//        showTheKeyboardNow()
//    } else {
//        viewTreeObserver.addOnWindowFocusChangeListener(
//            object : ViewTreeObserver.OnWindowFocusChangeListener {
//                override fun onWindowFocusChanged(hasFocus: Boolean) {
//                    if (hasFocus) {
//                        this@focusAndShowKeyboard.showTheKeyboardNow()
//                        viewTreeObserver.removeOnWindowFocusChangeListener(this)
//                    }
//                }
//            })
//    }
//}
