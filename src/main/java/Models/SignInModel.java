package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignInModel {
    private DataSignIN dataSignIN;

    @JsonProperty("data")
    public DataSignIN getData() { return dataSignIN; }
    @JsonProperty("data")
    public void setData(DataSignIN value) { this.dataSignIN = value; }
}
