package com.amalwin.navigationsamplewithdatasharing1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        val args = VerifyDetailsFragmentArgs by navArgs()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verify_details, container, false)
    }


}