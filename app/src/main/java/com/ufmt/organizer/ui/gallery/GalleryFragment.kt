package com.ufmt.organizer.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ufmt.organizer.CandidatoAdapter
import com.ufmt.organizer.R
import com.ufmt.organizer.ui.home.HomeFragment
import com.ufmt.organizer.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProvider(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        HomeFragment().candidatosList = HomeFragment().candidatosList.filter { it.status == "Aprovado" }
        return root
    }

}