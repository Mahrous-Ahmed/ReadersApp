package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignUpModel {
    private DataSignUp data;



    @JsonProperty("data")
    public DataSignUp getData() { return data; }
    @JsonProperty("data")
    public void setData(DataSignUp value) { this.data = value; }
}
