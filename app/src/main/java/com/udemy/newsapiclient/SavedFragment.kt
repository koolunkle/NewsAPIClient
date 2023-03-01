package com.udemy.newsapiclient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udemy.newsapiclient.databinding.FragmentSavedBinding
import com.udemy.newsapiclient.presentation.adapter.NewsAdapter
import com.udemy.newsapiclient.presentation.viewmodel.NewsViewModel

class SavedFragment : Fragment() {

    private lateinit var fragmentSavedBinding: FragmentSavedBinding

    private lateinit var viewModel: NewsViewModel

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_saved, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentSavedBinding = FragmentSavedBinding.bind(view)
        viewModel = (activity as MainActivity).viewModel
        newsAdapter = (activity as MainActivity).newsAdapter

        newsAdapter.setOnItemClickListener {
            if (it.equals(null)) {
                Toast.makeText(activity, "No article available", Toast.LENGTH_SHORT).show()
            } else {
                val bundle = Bundle().apply {
                    putParcelable("selected_article", it)
                }
                findNavController().navigate(R.id.action_savedFragment_to_infoFragment, bundle)
            }
        }
        initRecyclerView()
        viewModel.getSavedNews().observe(viewLifecycleOwner) {
            newsAdapter.differ.submitList(it)
        }
    }

    private fun initRecyclerView() {
        fragmentSavedBinding.rvSaved.adapter = newsAdapter
    }
}