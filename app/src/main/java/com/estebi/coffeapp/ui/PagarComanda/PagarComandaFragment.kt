package com.estebi.coffeapp.ui.PagarComanda

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.estebi.coffeapp.R
import com.estebi.coffeapp.databinding.FragmentSlideshowBinding
import com.estebi.coffeapp.shared_VM.Shared_VM.Companion.listOfCaffes
import com.estebi.coffeapp.shared_VM.Shared_VM.Companion.listOfPrices
import com.estebi.coffeapp.shared_VM.Shared_VM.Companion.sumTotal

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

    val listView: ListView = binding.recibo
      PagarComandaViewModel.text.observe(viewLifecycleOwner) {
      listView.findViewById<ListView>(R.id.recibo)
    }
      val textView: TextView = binding.total
      PagarComandaViewModel.text.observe(viewLifecycleOwner) {
          textView.findViewById<TextView>(R.id.total)
      }

      val butonPagar: Button = binding.PAGAR
      PagarComandaViewModel.text.observe(viewLifecycleOwner){
          butonPagar.findViewById<Button>(R.id.PAGAR)
      }


      textView.setText(sumTotal().toString())

      val arrayAdapter: ArrayAdapter<*>
      var mListView = binding.recibo
      arrayAdapter = ArrayAdapter(requireContext(),
          android.R.layout.simple_list_item_1, listOfCaffes)
      mListView.adapter = arrayAdapter

      printCaffes()
      butonPagar.setOnClickListener{
          listOfPrices.clear()
          listOfCaffes.clear()
          Toast.makeText(requireContext(), "Gràcies per la seva comanda!", Toast.LENGTH_SHORT).show()
          findNavController().navigate(R.id.nav_home)
      }




      return root
  }
    fun printCaffes(){
        for(item in listOfCaffes){
            println(item)
        }
    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}