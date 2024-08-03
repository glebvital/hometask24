package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Strings {
    public int wordcount(String s){
        int count = s.split("\\s").length;
        return count;
    }

    public String Reverse(String s){
        String reversed = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public int Q2(String s){
        s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }

    public boolean Q3(String s){
        s = s.toLowerCase().replaceAll("//s","");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public String Q4(String s){
        Set<Character> charset = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            charset.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : charset) {
            result.append(c);
        }
        return result.toString();
    }

    public String[] Q5(String s){
        String[] ar = s.split(" ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        return ar;
    }

    public String Q6(String s){//that task already was before, but i'll try it in another way ;)
        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();
        return reverse.toString();
    }

    public String Q7(String s){
        String[] ar = s.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (String word : ar){
            if(!word.isEmpty()){
                builder.append(Character.toUpperCase(word.charAt(0)));
                builder.append(word.substring(1));
                builder.append(" ");

            }
        }
        return builder.toString();
    }

    public boolean Q8(String s,String s2){

        char[] sAr = s.toCharArray();
        char[] sAr2 = s2.toCharArray();
        Arrays.sort(sAr);
        Arrays.sort(sAr2);
        return Arrays.equals(sAr,sAr2);
    }
}
