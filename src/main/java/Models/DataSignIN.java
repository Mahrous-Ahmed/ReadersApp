package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSignIN {
    private long userIdentifier;
    private String firstName;
    private String lastName;
    private String email;
    private String language;
    private String userType;

    @JsonProperty("userIdentifier")
    public long getUserIdentifier() {
        return userIdentifier;
    }

    @JsonProperty("userIdentifier")
    public void setUserIdentifier(long value) {
        this.userIdentifier = value;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String value) {
        this.firstName = value;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String value) {
        this.lastName = value;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String value) {
        this.email = value;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String value) {
        this.language = value;
    }

    @JsonProperty("userType")
    public String getUserType() {
        return userType;
    }

    @JsonProperty("userType")
    public void setUserType(String value) {
        this.userType = value;
    }
}

