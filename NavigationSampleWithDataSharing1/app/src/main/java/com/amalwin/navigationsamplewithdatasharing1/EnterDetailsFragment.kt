package com.amalwin.navigationsamplewithdatasharing1

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class EnterDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_enter_details, container, false)
        val buttonEnterDetails = rootView.findViewById<Button>(R.id.btn_enter_details)
        val etName = rootView.findViewById<EditText>(R.id.et_name)
        val etDesignation = rootView.findViewById<EditText>(R.id.et_designation)

        buttonEnterDetails.setOnClickListener {
            val name = etName.text.toString()
            val designation = etDesignation.text.toString()
            when {
                TextUtils.isEmpty(name) -> {
                    Toast.makeText(
                        requireActivity(),
                        "Please fill name!",
                        Toast.LENGTH_LONG
                    ).show()
                }
                TextUtils.isEmpty(designation) -> {
                    Toast.makeText(
                        requireActivity(),
                        "Please fill designation!",
                        Toast.LENGTH_LONG
                    ).show()
                }
                else -> {
                    /*val bundle = bundleOf(
                        "name" to name,
                        "designation" to designation
                    )
                    findNavController().navigate(
                        R.id.action_enterDetailsFragment_to_verifyDetailsFragment,
                        bundle
                    )*/

                    EnterDetailsFragmentDirections.actionEnterDetailsFragmentToVerifyDetailsFragment(name, designation)
                }
            }
        }
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}