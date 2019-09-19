package com.develogical;


import java.lang.reflect.Array;

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
        if (query.toLowerCase().contains("multiplied")) {
            String[] query_split = query.split("multiplied by");
            String last_num = query_split[query_split.length-1].replace(" ", "");
            String[] second_split  = query_split[0].split("is");
            String first_num = second_split[1].replace(" ", "");
//            query = query.replaceAll("\\D+"," ");
//
//            String third = string_split[string_split.length-1];
//
//            String[] new_q = third.split(" ");
            Integer result = Integer.parseInt(first_num) * Integer.parseInt(last_num);
            return "" + result;
        }
        if (query.toLowerCase().contains("banana")) {
            return "yellow";
        }
        return "";
    }
}
