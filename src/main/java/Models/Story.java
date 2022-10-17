package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class    Story {
    private long id;
    private String title;
    private boolean audio;
    private String categoryName;
    private String imageURL;
    private String thumbnailURL;
    private String language;
    private String length;

    @JsonProperty("id")
    public long getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(long value) {
        this.id = value;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String value) {
        this.title = value;
    }

    @JsonProperty("audio")
    public boolean getAudio() {
        return audio;
    }

    @JsonProperty("audio")
    public void setAudio(boolean value) {
        this.audio = value;
    }

    @JsonProperty("categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    @JsonProperty("categoryName")
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    @JsonProperty("imageURL")
    public String getImageURL() {
        return imageURL;
    }

    @JsonProperty("imageURL")
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    @JsonProperty("thumbnailURL")
    public String getThumbnailURL() {
        return thumbnailURL;
    }

    @JsonProperty("thumbnailURL")
    public void setThumbnailURL(String value) {
        this.thumbnailURL = value;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String value) {
        this.language = value;
    }

    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(String value) {
        this.length = value;
    }
}
