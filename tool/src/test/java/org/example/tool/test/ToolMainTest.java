package org.example.tool.test;

import org.example.tool.ToolMain;
import org.junit.Assert;
import org.junit.Test;

public class ToolMainTest {

    @Test
    public void test() {
        final ToolMain t = new ToolMain();

        Assert.assertEquals("Error", t.doSomething(2), 7);
    }

}
