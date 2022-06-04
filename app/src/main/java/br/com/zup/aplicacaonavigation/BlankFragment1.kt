package br.com.zup.aplicacaonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.zup.aplicacaonavigation.BlankFragment1Args.Companion.fromBundle
import br.com.zup.aplicacaonavigation.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {

    private lateinit var intAEnviar: String
    private lateinit var booleanAEnviar: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBlank1Binding>(
            inflater,
            R.layout.fragment_blank1, container, false
        )

        //recebendo argumentos
        val args = BlankFragment1Args.fromBundle(requireArguments())
        binding.tv1.text = "Recebendo ${args.string}"


        //cria var que receb o que user digita no edittext
        //envia pra frag 2

//        binding.btn1f1.setOnClickListener {
//
//            this.intAEnviar = binding.et1f1.text.toString()
//            this.booleanAEnviar = binding.et2f1.text.toString()
//
//        }

        binding.btn1f1.setOnClickListener { view: View ->
            //recuperando valores digitados pelo usuario para enviar para fragment 2
            this.intAEnviar = binding.et1f1.text.toString()
            this.booleanAEnviar = binding.et2f1.text.toString()
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