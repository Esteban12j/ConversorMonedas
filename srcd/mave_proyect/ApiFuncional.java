package mave_proyect;

	import java.io.*;
	import okhttp3.*;
	//Siempre funciona
	public class ApiFuncional {
	  public static void main(String []args) throws IOException{
	    OkHttpClient client = new OkHttpClient().newBuilder().build();

	    //String url = "https://api.apilayer.com/exchangerates_data/convert?to=" + monedaDestino.getCodigoISO() + "&from=" + monedaOrigen.getCodigoISO() + "&amount=" + cantidad;
	    String url = "https://api.apilayer.com/exchangerates_data/convert?to=USD&from=COP&amount=5";
	    Request request = new Request.Builder()
	      .url(url)
	      .addHeader("apikey", "22iwqngKja35q9xw8RuSOXkSHCuWCys0")
	      .method("GET", null)
	      .build();
	    Response response = client.newCall(request).execute();
	    System.out.println(response.body().string());
	  }
	}