package com.amalwin.navigationsamplewithdatasharing1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class VerifyDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*arguments.let {
            val name = it?.getString("name")
            val designation = it?.getString("designation")
            Log.i("VerifyDetailsFragment", "$name and $designation")
        }*/
        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)
        val args: VerifyDetailsFragmentArgs by navArgs<VerifyDetailsFragmentArgs>()
        val title = rootView.findViewById<TextView>(R.id.tv_verify_details)
        title.text =
            "My name is ${args.name}.\n I'm working as ${args.designation}."
            //StringBuilder().append(args.name).append(",").append(args.designation).toString()
        // Inflate the layout for this fragment
        return rootView
    }
}