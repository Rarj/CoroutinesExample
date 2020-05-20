package rio.arj.coroutinesexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import rio.arj.coroutinesexample.databinding.ItemPokemonBinding
import rio.arj.coroutinesexample.model.Card
import rio.arj.coroutinesexample.model.PokemonModel

class PokemonAdapter(
  private val listPokemon: PokemonModel?
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemPokemonBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return listPokemon?.cards?.size ?: 0
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(listPokemon?.cards?.get(position))
  }

  class ViewHolder(private val viewDataBinding: ItemPokemonBinding) :
    RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(model: Card?) {
      viewDataBinding.setVariable(BR.imageUrl, model?.imageUrl)
      viewDataBinding.executePendingBindings()
    }
  }
}

