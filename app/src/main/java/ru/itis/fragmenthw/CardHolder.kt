package ru.itis.fragmenthw

import androidx.appcompat.view.menu.MenuView
import ru.itis.fragmenthw.databinding.ItemCardBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.Request

class CardHolder(
    private val binding: ItemCardBinding,
    private val glide: RequestManager,
    private val onClick: (Card) -> Unit,
) : ViewHolder(binding.root){

    fun onBind(card: Card){
        binding.run {
            tvCard.text = card.name
            tvModel.text = card.model

            glide
                .load(card.url)
                .into(ivImage)

            root.setOnClickListener{
                onClick.invoke(card)
            }
        }
    }
}

