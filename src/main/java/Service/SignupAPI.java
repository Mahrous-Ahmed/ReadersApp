package Service;

import Models.SignInModel;
import Models.SignUpModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class SignupAPI {
    public static SignUpModel signUpAPI(String FirstName , String secondName , String email , String language) throws JsonProcessingException {
        SignUpModel signUpModel = new SignUpModel();
        String getToken = TokenAPI.getAccessToken();
        RestAssured.baseURI = "https://beta-nagwa-readers-users-api.nagwa.com/SignUp";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("accept", "*/*");
        httpRequest.header("Api-Version", "1.0");
        httpRequest.header("Authorization", getToken);
        httpRequest.header("Content-Type", "application/json");
        JSONObject requestParams = new JSONObject();
        requestParams.put("firstName", FirstName);
        requestParams.put("lastName", secondName);
        requestParams.put("language", language);
        requestParams.put("email", email);
        httpRequest.body(requestParams.toString());
        Response response = httpRequest.post();
        if (response.statusCode() == 200) {
            //System.out.println(response.print());
            signUpModel = new ObjectMapper().readValue(response.getBody().asString(), SignUpModel.class);
        } else
            System.out.println("An error happens in Sign in API");

        return signUpModel;
    }

    public static void main(String[] args) throws JsonProcessingException {
       System.out.println(signUpAPI("7ours","","mahrous@gmail.com","").getData().getEmail());
    }
}
