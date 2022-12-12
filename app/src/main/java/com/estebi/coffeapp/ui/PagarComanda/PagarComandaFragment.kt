package com.estebi.coffeapp.ui.PagarComanda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.estebi.coffeapp.databinding.FragmentSlideshowBinding
import com.estebi.coffeapp.shared_VM.Shared_VM.Companion.listOfCaffes

class PagarComandaFragment : Fragment() {

private var _binding: FragmentSlideshowBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val PagarComandaViewModel =
            ViewModelProvider(this).get(PagarComandaViewModel::class.java)

    _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textSlideshow
      PagarComandaViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }


      return root
  }

    fun printCaffes(){
        println(listOfCaffes.toString())
    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}