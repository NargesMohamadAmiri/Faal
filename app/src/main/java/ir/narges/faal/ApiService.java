package ir.narges.faal;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/ganjoor/hafez/faal")
    Call<ResponseBody> getPoems();
}
