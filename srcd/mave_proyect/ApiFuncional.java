package mave_proyect;

	import java.io.*;
	import com.google.gson.*;
	
	import okhttp3.*;
	//Siempre funciona
	public class ApiFuncional {

		  public static ExchangeRateResponse obtenerTipoDeCambio( String codigoIsoDependiente, String codigoIsoIndependiente, Double cantidad) throws IOException {

		    OkHttpClient client = new OkHttpClient().newBuilder().build();
		    String url = "https://api.apilayer.com/exchangerates_data/convert?to=" + codigoIsoIndependiente + "&from=" + codigoIsoDependiente + "&amount=" + cantidad;
		    //String url = "https://api.apilayer.com/exchangerates_data/convert?to=USD&from=COP&amount=5";
		    Request request = new Request.Builder()
		      .url(url)
		      .addHeader("apikey", "22iwqngKja35q9xw8RuSOXkSHCuWCys0")
		      .method("GET", null)
		      .build();
		    Response response = client.newCall(request).execute();
		    Gson gson = new Gson();
		    String responseBody = response.body().string();
		    ExchangeRateResponse exchangeRateResponse = gson.fromJson(responseBody, ExchangeRateResponse.class);
		    return exchangeRateResponse;
		  }
		}