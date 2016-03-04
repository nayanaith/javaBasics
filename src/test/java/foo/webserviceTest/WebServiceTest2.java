package foo.webserviceTest;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

public class WebServiceTest2 {


@Test
public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
      throws ClientProtocolException, IOException{
   // Given
   String name = randomAlphabetic( 8 );
   HttpUriRequest request = new HttpGet( "https://api.github.com/users/" + name );
   
   // When
   HttpResponse httpResponse =  HttpClientBuilder.create().build().execute(request);
		   //httpClient.execute( request );
   
   // Then
   RestAssert.assertResponseCodeIs( httpResponse, 404 );
}

}
