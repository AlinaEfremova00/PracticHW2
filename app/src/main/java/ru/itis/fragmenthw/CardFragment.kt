package ru.itis.fragmenthw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.itis.fragmenthw.databinding.FragmentCardBinding

class CardFragment : Fragment(R.layout.fragment_card) {

    private var binding: FragmentCardBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCardBinding.bind(view)

        val promo = arguments?.getString(PROMO) ?: "ERROR"

        binding?.run {
            promoscreen.text = "${promoscreen.text} : \n $promo"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val PROMO = "PROMO"

        fun bundle(promo: String): Bundle = Bundle().apply {
            putString(PROMO, promo)
        }
    }

}