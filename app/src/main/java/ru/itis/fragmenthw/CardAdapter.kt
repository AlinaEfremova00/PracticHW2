package ru.itis.fragmenthw

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import ru.itis.fragmenthw.databinding.ItemCardBinding

class CardAdapter(
    private val list: List<Card>,
    private val glide: RequestManager,
    private val onClick: (Card) -> Unit,
): RecyclerView.Adapter<CardHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardHolder = CardHolder(
        binding = ItemCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onClick = onClick,
    )

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}