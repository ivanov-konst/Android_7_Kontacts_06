package com.example.rd.presenter

import com.example.rd.data.Contact


interface MainAction {

    fun onAddContact(contacts: List<Contact>)

}