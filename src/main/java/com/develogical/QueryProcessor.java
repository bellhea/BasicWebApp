package com.develogical;


public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("name")) {
            return "shielded-cliffs";
        }
        if (query.toLowerCase().contains("number")) {
            query = query.replace(" ", "");
            String[] string_split = query.split(":");
            String third = string_split[string_split.length-1];
            String[] comma = third.split(",");
            int max = 0;
            for (int i = 0; i < comma.length; i++) {
                if (Integer.parseInt(comma[i]) > max) max = Integer.parseInt(comma[i]);
            }
            // first = first.replace(",", "");
            return "" + max;
        }
        return "";
    }
}
