package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void myNameIsShieldedCliffs() throws Exception {
        assertThat(queryProcessor.process("name?"), containsString("shielded-cliffs"));
    }
//
//    @Test
//    public void largestNum() throws Exception {
//        assertThat(queryProcessor.process("59f13aa0: which of the following numbers is the largest: 20000, 4000000, 7000, 1"), is("4000000"));
//    }
//
//    @Test
//    public void multiplier() throws Exception {
//        assertThat(queryProcessor.process("aaed8930: what is 3 multiplied by 17"), is("4000000"));
//    }

}
