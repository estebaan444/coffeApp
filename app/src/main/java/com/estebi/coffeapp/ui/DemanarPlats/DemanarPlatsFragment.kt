package com.estebi.coffeapp.ui.DemanarPlats


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.estebi.coffeapp.adapters.Caffe
import com.estebi.coffeapp.adapters.CaffeAdapter
import com.estebi.coffeapp.adapters.CaffeProvider

import com.estebi.coffeapp.databinding.FragmentDemanarPlatsBinding
import com.estebi.coffeapp.shared_VM.Shared_VM.Companion.listOfCaffes
import com.estebi.coffeapp.shared_VM.Shared_VM.Companion.listOfPrices


class DemanarPlatsFragment : Fragment() {

    private lateinit var binding: FragmentDemanarPlatsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDemanarPlatsBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
        val root: View = binding.root

        binding.recyclerView.adapter =
            CaffeAdapter(CaffeProvider.caffeList) {caffe ->
                onItemSelected(
                    caffe
                )
            }
        return root
    }

    fun onItemSelected(caffe: Caffe){
        Toast.makeText(requireContext(), caffe.caffe, Toast.LENGTH_SHORT).show()
        listOfCaffes.add(caffe.caffe)
        listOfPrices.add(caffe.preu)
    }
}