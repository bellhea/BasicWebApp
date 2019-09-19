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

    @Test
    public void largestNum() throws Exception {
        assertThat(queryProcessor.process("20which%20of%20the%20following%20numbers%20is%20the%20the%20largest:%20742,%209322"), is("209322"));
    }

}
