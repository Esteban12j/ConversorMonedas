import java.io.*;
import okhttp3.*;

public class PruebaApi {
  public static void main(String []args) throws IOException{
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    Request request = new Request.Builder()
      .url("https://api.apilayer.com/exchangerates_data/convert?to=cop&from=eur&amount=5")
      .addHeader("apikey", "22iwqngKja35q9xw8RuSOXkSHCuWCys0")
      .method("GET", null)
      .build();
    Response response = client.newCall(request).execute();
    System.out.println(response.body().string());
  }
}