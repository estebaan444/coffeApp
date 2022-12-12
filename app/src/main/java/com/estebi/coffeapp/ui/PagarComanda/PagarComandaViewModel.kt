package com.estebi.coffeapp.ui.PagarComanda

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PagarComandaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Pagar comanda"
    }
    val text: LiveData<String> = _text
}