package com.example.news_app.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.news_app.R
import com.example.news_app.databinding.FragmentArticleBinding
import com.example.news_app.models.Article
import com.example.news_app.ui.NewsActivity
import com.example.news_app.ui.NewsViewModel
import com.google.android.material.snackbar.Snackbar

class ArticleFragment : Fragment(R.layout.fragment_article) {
    lateinit var viewModel : NewsViewModel
    lateinit var binding : FragmentArticleBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArticleBinding.bind(view)
        viewModel = (activity as NewsActivity).viewModel
        val article =arguments?.getSerializable("article") as Article?
        binding.webView.apply{
            webViewClient = WebViewClient()
            article?.url?.let { loadUrl(it) }
        }


        binding.fab.setOnClickListener{
            if (article != null) {
                viewModel.saveArticle(article)
            }
            Snackbar.make(view,"Article saved successfully!",Snackbar.LENGTH_SHORT).show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        arguments?.clear()
    }
}