package Service;

import Models.SignInModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class SignInAPI {

    static String  endPoint = "/SignIn";
    public static SignInModel getUserData() throws JsonProcessingException {
        SignInModel signInModel = new SignInModel();
        String getToken = TokenAPI.getAccessToken();
        RestAssured.baseURI = "https://beta-nagwa-readers-users-api.nagwa.com/SignIn";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("accept","*/*");
        httpRequest.header("Api-Version","1.0");
        httpRequest.header("Authorization",getToken);
        httpRequest.header("Content-Type","application/json");
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "mahrous.ahmed@nagwa.com");
        requestParams.put("password", "hVckWLelJ0sChfyjlTlnfQ==");
        httpRequest.body(requestParams.toString());
        Response response = httpRequest.post();
        if(response.statusCode() == 200){
            signInModel =  new ObjectMapper().readValue(response.getBody().asString() , SignInModel.class);
        }
        else
            System.out.println("An error happens in Sign up API");

       return signInModel;
    }

    public static void main(String[] args) throws JsonProcessingException {
       System.out.println(getUserData().getData().getEmail());
    }
}
