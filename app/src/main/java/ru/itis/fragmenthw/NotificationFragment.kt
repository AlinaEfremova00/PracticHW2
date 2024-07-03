package ru.itis.fragmenthw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.itis.fragmenthw.databinding.FragmentNotificationBinding


class NotificationFragment : Fragment(R.layout.fragment_notification) {

    private var binding: FragmentNotificationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNotificationBinding.bind(view)

        binding?.apply {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}