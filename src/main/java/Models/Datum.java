package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Datum {
    private long collectionIdentifier;
    private String collectionName;
    private long collectionOrder;
    private List<Story> stories;

    @JsonProperty("collectionIdentifier")
    public long getCollectionIdentifier() {
        return collectionIdentifier;
    }

    @JsonProperty("collectionIdentifier")
    public void setCollectionIdentifier(long value) {
        this.collectionIdentifier = value;
    }

    @JsonProperty("collectionName")
    public String getCollectionName() {
        return collectionName;
    }

    @JsonProperty("collectionName")
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

    @JsonProperty("collectionOrder")
    public long getCollectionOrder() {
        return collectionOrder;
    }

    @JsonProperty("collectionOrder")
    public void setCollectionOrder(long value) {
        this.collectionOrder = value;
    }

    @JsonProperty("stories")
    public List<Story> getStories() {
        return stories;
    }

    @JsonProperty("stories")
    public void setStories(List<Story> value) {
        this.stories = value;
    }
}
