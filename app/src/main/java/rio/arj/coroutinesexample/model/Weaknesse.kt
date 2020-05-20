package rio.arj.coroutinesexample.model


import com.google.gson.annotations.SerializedName

data class Weaknesse(
    @SerializedName("type")
    var type: String?,
    @SerializedName("value")
    var value: String?
)