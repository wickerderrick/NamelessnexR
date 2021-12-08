package com.namelessness.org.fragments.patrons

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.namelessness.org.R

class PatronFragment : Fragment() {

    companion object {
        fun newInstance() = PatronFragment()
    }

    private lateinit var viewModel: PatronViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.patron_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PatronViewModel::class.java)
        // TODO: Use the ViewModel
    }

}