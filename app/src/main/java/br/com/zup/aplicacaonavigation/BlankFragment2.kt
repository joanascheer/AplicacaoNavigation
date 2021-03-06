package br.com.zup.aplicacaonavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.zup.aplicacaonavigation.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBlank2Binding>(
            inflater,
            R.layout.fragment_blank2, container, false
        )

        val args = BlankFragment2Args.fromBundle(requireArguments())
        binding.tv2.text = "Recebendo ${args.int} e ${args.boolean}"


        binding.btn1f2.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(BlankFragment2Directions.actionBlankFragment2ToBlankFragment3())
        }

        binding.btn2f2.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(BlankFragment2Directions.actionBlankFragment2ToBlankFragment1())
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}