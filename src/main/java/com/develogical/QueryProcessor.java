package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("name")) {
            return "shielded-cliffs";
        }
        return "";
    }
}
