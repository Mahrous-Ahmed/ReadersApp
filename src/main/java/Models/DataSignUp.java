package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class DataSignUp {
    private String confirmationEmailExpirationDate;
    private boolean hasPassword;
    private boolean isVerified;
    private String firstName;
    private String lastName;
    private String email;
    private String language;
    private String userType;



    @JsonProperty("confirmationEmailExpirationDate")
    public String getConfirmationEmailExpirationDate() { return confirmationEmailExpirationDate; }
    @JsonProperty("confirmationEmailExpirationDate")
    public void setConfirmationEmailExpirationDate(String value) { this.confirmationEmailExpirationDate = value; }



    @JsonProperty("hasPassword")
    public boolean getHasPassword() { return hasPassword; }
    @JsonProperty("hasPassword")
    public void setHasPassword(boolean value) { this.hasPassword = value; }



    @JsonProperty("isVerified")
    public boolean getIsVerified() { return isVerified; }
    @JsonProperty("isVerified")
    public void setIsVerified(boolean value) { this.isVerified = value; }



    @JsonProperty("firstName")
    public String getFirstName() { return firstName; }
    @JsonProperty("firstName")
    public void setFirstName(String value) { this.firstName = value; }



    @JsonProperty("lastName")
    public String getLastName() { return lastName; }
    @JsonProperty("lastName")
    public void setLastName(String value) { this.lastName = value; }



    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }



    @JsonProperty("language")
    public String getLanguage() { return language; }
    @JsonProperty("language")
    public void setLanguage(String value) { this.language = value; }



    @JsonProperty("userType")
    public String getUserType() { return userType; }
    @JsonProperty("userType")
    public void setUserType(String value) { this.userType = value; }

}
