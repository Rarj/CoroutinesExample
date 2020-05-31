package rio.arj.coroutinesexample.model


import com.google.gson.annotations.SerializedName

data class Card(
  @SerializedName("imageUrl") var imageUrl: String
)