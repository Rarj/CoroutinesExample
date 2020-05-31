package rio.arj.coroutinesexample

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import rio.arj.coroutinesexample.model.Card
import rio.arj.coroutinesexample.model.PokemonModel
import rio.arj.coroutinesexample.repository.PokemonRepository

@RunWith(JUnit4::class)
class PokemonViewModelTest {

  @Mock
  private lateinit var repo: PokemonRepository

  @Before
  fun setup() {
    MockitoAnnotations.initMocks(this)
  }

  @Test
  fun cardShouldNotReturnEmpty() = runBlocking {
    val expected = PokemonModel(listOf(Card("imageUrl")))
    `when`(repo.getCards()).thenReturn(expected)

    Assert.assertEquals(expected, repo.getCards())
  }

}