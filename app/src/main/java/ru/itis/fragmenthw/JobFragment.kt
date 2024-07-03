package ru.itis.fragmenthw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import ru.itis.fragmenthw.databinding.FragmentJobBinding
import ru.itis.fragmenthw.CardAdapter
import ru.itis.fragmenthw.CardFragment.Companion.bundle
import ru.itis.fragmenthw.CardRepository

class JobFragment : Fragment(R.layout.fragment_job) {

    private var binding: FragmentJobBinding? = null

    private var adapter: CardAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentJobBinding.bind(view)

        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        binding?.run {
            adapter = CardAdapter(
                list = CardRepository.cards,
                glide = Glide.with(this@JobFragment),
                onClick = { card ->
                    val bundle = Bundle().apply {
                        putInt("card_id", card.id)
                    }
                    findNavController().navigate(
                        R.id.action_jobFragment_to_detailFragment,
                        bundle
                    )
                }
            )

            rvCard.adapter = adapter
            rvCard.layoutManager = LinearLayoutManager(requireContext())
        }
    }

}