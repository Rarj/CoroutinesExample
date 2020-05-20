package rio.arj.coroutinesexample.model


import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("cards")
    var cards: List<Card>?
)