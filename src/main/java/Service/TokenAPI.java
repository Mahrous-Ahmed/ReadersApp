package Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.RestAssured;
import io.restassured.internal.mapping.ObjectMapping;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class TokenAPI {
    public static String getAccessToken() throws JsonProcessingException {
        String Token ="";
        RestAssured.baseURI = "https://auth.nagwa.com/connect/token";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type","application/x-www-form-urlencoded");
        httpRequest.formParam("grant_type","client_credentials");
        httpRequest.formParam("scope","multimedia.tutoring");
        httpRequest.formParam("client_id","multimedia.web");
        httpRequest.formParam("client_secret","UVkrJvMKcfm5LjgXs6xCm2PG7Xv7Vt95");
        Response response = httpRequest.post();
        if(response.statusCode() == 200){
            ObjectNode jsonNode =  new ObjectMapper().readValue(response.getBody().asString() , ObjectNode.class);

            if(jsonNode.has("token_type") && jsonNode.has("access_token") )
                 Token = jsonNode.get("token_type").asText() + " " +  jsonNode.get("access_token").asText();

            else
                System.out.println("An error happens in Token API");
        }

        return Token;
    }

    public static void main(String[] args) throws JsonProcessingException {
       System.out.println(getAccessToken());
    }
}