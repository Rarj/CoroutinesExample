package rio.arj.coroutinesexample.network

import retrofit2.http.GET
import rio.arj.coroutinesexample.model.PokemonModel

interface ApiInterface {
  @GET("cards?setCode=sm115")
  suspend fun getCards(): PokemonModel
}