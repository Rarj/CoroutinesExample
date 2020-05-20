package rio.arj.coroutinesexample.repository

import rio.arj.coroutinesexample.network.RetrofitBuilder

object PokemonRepository {
  suspend fun getCards() = RetrofitBuilder.getService().getCards()
}