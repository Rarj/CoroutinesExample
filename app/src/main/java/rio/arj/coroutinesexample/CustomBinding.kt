package rio.arj.coroutinesexample

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object CustomBinding {

  @BindingAdapter("imageUrl")
  @JvmStatic
  fun setImageUrl(view: AppCompatImageView, imageUrl: String) {
    Glide.with(view)
      .load(imageUrl)
      .into(view)
  }

}