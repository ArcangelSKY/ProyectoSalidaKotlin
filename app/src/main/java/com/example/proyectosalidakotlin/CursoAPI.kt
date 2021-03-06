package values

import com.example.proyectosalidakotlin.CursoDetalle
import com.example.proyectosalidakotlin.Cursos
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface CursoAPI {
    @GET
    fun getCursos(@Url url:String):Call<Cursos>
    @GET
    fun getCursoDetalle(@Url url: String):Call<CursoDetalle>

}