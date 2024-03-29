package com.example.uas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.uas.databinding.UiUlulAzmiBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UlulAzmi.newInstance] factory method to
 * create an instance of this fragment.
 */
class UlulAzmi : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            val binding = UiUlulAzmiBinding.inflate(inflater, container, false)

        binding.btnIbrahim.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_ululAzmi_to_nabiIbrahim)
        }
        binding.btnNuh.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_ululAzmi_to_nabiNuh)
        }
            binding.btnMusa.setOnClickListener{
                it.findNavController()
                    .navigate(R.id.action_ululAzmi_to_nabiMusa)
            }
            binding.btnIsa.setOnClickListener {
                it.findNavController()
                    .navigate(R.id.action_ululAzmi_to_nabiIsa)
            }
                binding.btnMuhammad.setOnClickListener {
                    it.findNavController()
                        .navigate(R.id.action_ululAzmi_to_nabiMuhammad)
                }

        return binding.root
    }
}