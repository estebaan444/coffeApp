package com.estebi.coffeapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.estebi.coffeapp.R
import com.estebi.coffeapp.databinding.FragmentHomeBinding
import com.estebi.coffeapp.ui.PagarComanda.PagarComandaViewModel

class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null

  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root


    val button: Button = binding.PantallaInicialBtn
    homeViewModel.text.observe(viewLifecycleOwner) {
      button.findViewById<Button>(R.id.PantallaInicialBtn)
    }

      button.setOnClickListener{
        findNavController().navigate(R.id.nav_gallery)
      }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}