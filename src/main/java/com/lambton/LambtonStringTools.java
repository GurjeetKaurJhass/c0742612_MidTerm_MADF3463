package com.lambton;

public class LambtonStringTools {


    String reverse(String str) {
        char ch[]=str.toCharArray();
        String rev=" ";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev+=ch[i];
        }
        return rev;
    }




    public static String printInitials(String s)
    {
        int len = s.length();
        String t = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                t = t + ch;
            } else {
                System.out.print(Character.toUpperCase(t.charAt(0)) + ". ");
                t = "";
            }
        }

        String temp = "";
        for (int j = 0; j < t.length(); j++) {
            if (j == 0)
                temp = temp + Character.toUpperCase(t.charAt(0));
            else
                temp = temp + Character.toLowerCase(t.charAt(j));
        }
        //System.out.println(temp);
        return temp;
    }




    int binaryToDecimal(String s) {

        int bin = Integer.parseInt(s);
        int decimal = 0;
        int n = 0;
        while (true) {
            if (bin == 0) {
                break;
            } else {
                int temp = bin % 10;
                decimal += temp * Math.pow(2, n);
                bin = bin / 10;
                n++;
            }
        }
        return decimal;
    }


    char mostFrequent(String s) {
        int characterCount = 0;
        int maxChar = 0;
        char maxCharacterCh = '.';

        char[] chArray = s.toCharArray();

           for (int i = 0; i < chArray.length; i++) {
            int charASCII = (int) chArray[i];
             characterCount = 0;


               for (int x = 0; x < chArray.length; x++) {
                if (charASCII == (int) chArray[x]) {
                    characterCount++;

                    if (characterCount > maxChar) {
                        maxChar = characterCount;
                        maxCharacterCh = chArray[i];
                    }
                }
            }
        }
        return maxCharacterCh;
    }


        public String replaceSubString(String s1, String s2, String s3)
        {

            String output = "";
            String [] strArr = s1.split(" ");
            int len = strArr.length;

            for(int i = 0; i < strArr.length; i++)
            {
                if (strArr[i].equals(s2))
                {
                    strArr[i]=s3;
                }
                output += strArr[i] + " ";
            }
            return output;
        }

    }









