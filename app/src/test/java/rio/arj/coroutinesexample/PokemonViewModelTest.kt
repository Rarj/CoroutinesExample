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

  private lateinit var expected: PokemonModel

  @Before
  fun setup() {
    MockitoAnnotations.initMocks(this)
    expected = PokemonModel(listOf(Card("imageUrl")))
  }

  @Test
  fun cardShouldNotReturnEmpty() = runBlocking {
    `when`(repo.getCards()).thenReturn(expected)
    Assert.assertEquals(expected, repo.getCards())
  }

  @Test
  fun imageUrlShouldNotBlank() = runBlocking {
    `when`(repo.getCards()).thenReturn(expected)
    Assert.assertTrue(repo.getCards().cards?.get(0)?.imageUrl.toString().isNotEmpty())
  }
}