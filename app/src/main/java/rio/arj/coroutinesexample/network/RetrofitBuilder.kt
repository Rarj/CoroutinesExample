package rio.arj.coroutinesexample.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import rio.arj.coroutinesexample.BuildConfig.BASE_URL

object RetrofitBuilder {

  fun getService(): ApiInterface {
    return Retrofit.Builder()
      .baseUrl(BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build().create(ApiInterface::class.java)
  }

}