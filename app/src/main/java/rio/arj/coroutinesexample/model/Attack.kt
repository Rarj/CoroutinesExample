package rio.arj.coroutinesexample.model


import com.google.gson.annotations.SerializedName

data class Attack(
    @SerializedName("convertedEnergyCost")
    var convertedEnergyCost: Int?,
    @SerializedName("cost")
    var cost: List<String>?,
    @SerializedName("damage")
    var damage: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("text")
    var text: String?
)