package org.example.tool;

import org.example.library.Library;

public class ToolMain {

    public static void main(final String[] args) {
        final ToolMain tool = new ToolMain();

        System.out.println(">> " + tool.doSomething(4));
    }

    public int doSomething(final int a) {
        final Library l = new Library();

        return a + l.getValue();
    }
}