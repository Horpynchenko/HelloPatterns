package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dmytro on 22.03.2016.
 */
public class RunnerTest {
    @Test
    public void test(){
        //given
        InMemoryStrategy strategy = new InMemoryStrategy();
        Runner runner = new Runner(strategy);

        //when
        runner.run();

        //then
        assertEquals("[Hello World!]", strategy.getMessages().toString());
    }
}
