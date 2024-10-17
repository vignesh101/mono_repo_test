package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(processString("Github Mono Repo"));
    }

    public static String processString(String input) {
        return "ServiceA processed: " + StringUtils.reverse(input);
    }
}
