package rio.arj.coroutinesexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import rio.arj.coroutinesexample.model.PokemonModel
import rio.arj.coroutinesexample.repository.PokemonRepository

class PokemonViewModel : ViewModel() {

  val listPokemon = MutableLiveData<PokemonModel>()

  fun getCards() = liveData(Dispatchers.IO) {
    emit(Resource.loading(data = null))
    try {
      emit(Resource.success(data = PokemonRepository.getCards()))
    } catch (exception: Exception) {
      emit(Resource.error(data = null, message = exception.message))
    }
  }

}