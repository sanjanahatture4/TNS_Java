package com.sanjana;

public class NewString {
    public static void main(String[] args) {
        // initialise string
        char ch[]= {'I','n','d','i','a'};
        for(char c:ch)
        {
            System.out.print(c);		}

        String s1=new String(ch);
        String s2=new String(s1);

        System.out.println(s1);
        System.out.println(s2);
        String longString="Sanjana"+"Anand"+"Hatture";
        System.out.println(longString);
    }
}
