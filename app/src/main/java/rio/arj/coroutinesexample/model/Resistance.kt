package rio.arj.coroutinesexample.model


import com.google.gson.annotations.SerializedName

data class Resistance(
    @SerializedName("type")
    var type: String?,
    @SerializedName("value")
    var value: String?
)