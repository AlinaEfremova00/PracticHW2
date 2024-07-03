package ru.itis.fragmenthw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import ru.itis.fragmenthw.databinding.FragmentDetailBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private var binding: FragmentDetailBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)

        val cardId = arguments?.getInt("card_id") ?: return
        val card = CardRepository.cards.find { it.id == cardId } ?: return

        binding?.run {
            Glide.with(this@DetailFragment)
                .load(card.url)
                .into(detailImageView)
            detailTitleTextView.text = card.name
            detailModelTextView.text = card.model
            detailUrlTextView.text = card.url

            backButton.setOnClickListener {
                requireActivity().onBackPressed()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
