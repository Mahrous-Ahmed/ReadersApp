package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HomeModel {
    private long totalCollectionCount;
    private boolean hasError;
    private Object errorCode;
    private List<Datum> data;

    @JsonProperty("totalCollectionCount")
    public long getTotalCollectionCount() {
        return totalCollectionCount;
    }

    @JsonProperty("totalCollectionCount")
    public void setTotalCollectionCount(long value) {
        this.totalCollectionCount = value;
    }

    @JsonProperty("hasError")
    public boolean getHasError() {
        return hasError;
    }

    @JsonProperty("hasError")
    public void setHasError(boolean value) {
        this.hasError = value;
    }

    @JsonProperty("errorCode")
    public Object getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(Object value) {
        this.errorCode = value;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> value) {
        this.data = value;
    }
}


