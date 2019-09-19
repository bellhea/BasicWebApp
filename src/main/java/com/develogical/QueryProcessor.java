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
            String[] string_num = query.split("%");
            String second_last = string_num[string_num.length-2];
            second_last = second_last.replace(",", "");
            String last = string_num[string_num.length-1];
            int result = Math.max(Integer.parseInt(second_last), Integer.parseInt(last));
            return "" + result;
        }
        return "";
    }
}
