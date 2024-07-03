package ru.itis.fragmenthw

object CardRepository {

    val cards: List<Card> = listOf(
        Card(
            id = 0,
            name = "Bad",
            model = "Policeman",
            url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpwrBzzqawR2lZS3q8txCdO5fXdZt-56tf0g&s"
        ),
        Card(
            id = 1,
            name = "Good",
            model = "Policeman",
            url = "https://s09.stc.yc.kpcdn.net/share/i/12/12740877/wr-960.webp"
        ),
        Card(
            id = 2,
            name = "Animal",
            model = "Doctor",
            url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9LMXUOpO6_XUyvzQwLH3n99Tf948Ui-JHdQ&s"
        ),
        Card(
            id = 3,
            name = "Human",
            model = "Doctor",
            url = "https://img-fotki.yandex.ru/get/9220/39067198.eb/0_7aaf2_5c8fc106_XL.jpg"
        ),
        Card(
            id = 4,
            name = "Mattresses",
            model = "Inspector",
            url = "https://rskrf.ru/upload/iblock/8e2/8e25715d7e69cdd2c60d069ee09d55ad.jpg"
        ),
        Card(
            id = 5,
            name = "Hotels",
            model = "Inspector",
            url = "https://s11.stc.yc.kpcdn.net/share/i/12/10452305/wr-960.webp"
        ),
        Card(
            id = 6,
            name = "Bat",
            model = "Man",
            url = "https://avatars.mds.yandex.net/get-kino-vod-films-gallery/1668876/931b9c7044964864a1818eabfa4882ad/380x240"
        ),
        Card(
            id = 7,
            name = "Spider",
            model = "Man",
            url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAxvWuOCX5WmzSpCBS6KoKWPeHtCy9Rk_Xdw&s"
        ),
    )
    fun getCardById(cardId: Int): Card? {
        return cards.find { it.id == cardId }
    }
}