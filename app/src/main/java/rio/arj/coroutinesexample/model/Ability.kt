package rio.arj.coroutinesexample.model


import com.google.gson.annotations.SerializedName

data class Ability(
    @SerializedName("name")
    var name: String?,
    @SerializedName("text")
    var text: String?,
    @SerializedName("type")
    var type: String?
)