package rio.arj.coroutinesexample.model


import com.google.gson.annotations.SerializedName

data class Card(
    @SerializedName("ability")
    var ability: Ability?,
    @SerializedName("artist")
    var artist: String?,
    @SerializedName("attacks")
    var attacks: List<Attack>?,
    @SerializedName("convertedRetreatCost")
    var convertedRetreatCost: Int?,
    @SerializedName("evolvesFrom")
    var evolvesFrom: String?,
    @SerializedName("hp")
    var hp: String?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("imageUrl")
    var imageUrl: String?,
    @SerializedName("imageUrlHiRes")
    var imageUrlHiRes: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("nationalPokedexNumber")
    var nationalPokedexNumber: Int?,
    @SerializedName("number")
    var number: String?,
    @SerializedName("rarity")
    var rarity: String?,
    @SerializedName("resistances")
    var resistances: List<Resistance>?,
    @SerializedName("retreatCost")
    var retreatCost: List<String>?,
    @SerializedName("series")
    var series: String?,
    @SerializedName("set")
    var `set`: String?,
    @SerializedName("setCode")
    var setCode: String?,
    @SerializedName("subtype")
    var subtype: String?,
    @SerializedName("supertype")
    var supertype: String?,
    @SerializedName("text")
    var text: List<String>?,
    @SerializedName("types")
    var types: List<String>?,
    @SerializedName("weaknesses")
    var weaknesses: List<Weaknesse>?
)