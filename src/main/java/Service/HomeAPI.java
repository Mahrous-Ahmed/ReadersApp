package Service;

import Models.HomeModel;
import Models.SignInModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.sql.SQLException;
import java.util.Hashtable;

public class HomeAPI {
    public static HomeModel getHome(String email) throws JsonProcessingException, SQLException {
        HomeModel homeModel = new HomeModel();
        Hashtable<String ,String> hashtable = DataBase.getUserIdentifier("'" +email +"'");
        String getToken = TokenAPI.getAccessToken();
        RestAssured.baseURI = "https://beta-nagwa-readers-api.nagwa.com/Home";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("accept","*/*");
        httpRequest.header("Api-Version","3.0");
        httpRequest.header("Authorization",getToken);
        httpRequest.header("Content-Type","application/json");

        System.out.println(hashtable.get("UserIdentifier"));
        System.out.println(hashtable.get("Language"));

        httpRequest.header("UserId",hashtable.get("UserIdentifier"));
        httpRequest.queryParam("language",hashtable.get("Language"));
        Response response = httpRequest.get();

        System.out.println(response.statusCode());
        if(response.statusCode() == 200){

           homeModel = new ObjectMapper().readValue(response.getBody().asString() , HomeModel.class);
        }
        else
            System.out.println("An error happens in Home API");

        return homeModel;
    }

    public static void main(String[] args) throws JsonProcessingException, SQLException {
        System.out.println(getHome("mahrous1@nagwa.com").getTotalCollectionCount());
    }
}
