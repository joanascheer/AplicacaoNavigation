package br.com.zup.aplicacaonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.zup.aplicacaonavigation.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBlank1Binding>(
            inflater,
            R.layout.fragment_blank1, container, false
        )

        binding.btn1f1.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(BlankFragment1Directions.actionBlankFragment1ToBlankFragment2())
        }

        binding.btn2f1.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(BlankFragment1Directions.actionBlankFragment1ToBlankFragment3())
        }

        // Inflate the layout for this fragment
        return binding.root

    }

}