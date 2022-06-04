package br.com.zup.aplicacaonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.zup.aplicacaonavigation.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBlank3Binding>(
            inflater,
            R.layout.fragment_blank3,container,false
        )

        binding.btn1f3.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(BlankFragment3Directions.actionBlankFragment3ToBlankFragment1())
        }
        binding.btn2f3.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(BlankFragment3Directions.actionBlankFragment3ToBlankFragment2())
        }
        // Inflate the layout for this fragment
        return binding.root
    }
}