import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsForCats {

    String id;
    String text;
    String type;
    String user;
    String upvotes;

    public FactsForCats(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;

    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "FactsForCats \n{\n" +
                " id = '" + id + '\'' + ",\n " +
                "text = '" + text + '\'' + ",\n " +
                "type = '" + type + '\'' + ",\n " +
                "user = '" + user + '\'' + ",\n " +
                "upvotes = " + upvotes +
                "\n}\n";
    }

}
