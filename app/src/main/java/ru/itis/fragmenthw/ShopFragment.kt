package ru.itis.fragmenthw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import ru.itis.fragmenthw.databinding.FragmentShopBinding

class ShopFragment : Fragment(R.layout.fragment_shop) {

    private var binding: FragmentShopBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentShopBinding.bind(view)

        binding?.apply {
            sendTextBtn.setOnClickListener {
                val inputText = promo.text.toString().trim()
                if (inputText.isEmpty()) {
                    Snackbar.make(view, "Введите номер товара в поле.", Snackbar.LENGTH_SHORT).show()
                } else {
                    findNavController().navigate(
                        resId = R.id.action_mainFragment_to_cardFragment,
                        args = CardFragment.bundle(
                            promo = inputText
                        )
                    )
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}