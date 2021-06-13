package cl.francorvalant.pokedexlist.api;

import cl.francorvalant.pokedexlist.models.PokemonRespuesta;
import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Query;

public interface ApiService {

     @GET("pokemon")
     Call<PokemonRespuesta> obtenerListaPokemon(@Query("offset") int offset, @Query("limit") int limit);


}
