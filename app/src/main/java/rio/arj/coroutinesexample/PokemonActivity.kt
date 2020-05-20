package rio.arj.coroutinesexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import rio.arj.coroutinesexample.databinding.ActivityPokemonBinding

class PokemonActivity : AppCompatActivity() {

  private lateinit var viewModel: PokemonViewModel
  private lateinit var binding: ActivityPokemonBinding
  private val adapter: PokemonAdapter by lazy {
    PokemonAdapter(viewModel.listPokemon.value)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel = ViewModelProvider(this).get(PokemonViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_pokemon)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    viewModel.getCards().observe(this, Observer { resource ->
      if (resource.status == Status.SUCCESS) {
        viewModel.listPokemon.value = resource.data
        binding.recyclerPokemon.apply {
          layoutManager = GridLayoutManager(this@PokemonActivity, 2)
          adapter = this@PokemonActivity.adapter
          this@PokemonActivity.adapter.notifyDataSetChanged()
        }
      }
    })
  }
}
