package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String stars = "";
    for (int i = 1; i < height; i++){
        for (int j = 1; j <= i; j++){
            stars+="*";
        }
        stars+="\n";
    }
    for (int i = 1; i <= height; i++){
        stars+="*";
    }
    return stars;
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String stars = "";
    for (int i = height; i > 1; i--){
        for (int j = 1; j <= i; j++){
            stars+="*";
        }
        stars+="\n";
    }
    stars+="*";
    return stars;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        String stars = "";
        if (width <= 1 || height <= 1){
            return "";
        }
        for (int i = 1; i <= width; i++){
            stars+="*";
            if (i == width){
                stars+="\n";
            }
        }
        
        for (int i = 1; i <=(height-2); i++){
            stars+="*";
            for (int j = 1; j <= (width-2); j++){
                stars+=" ";
            }
            stars+="*\n";
        }
        for (int i = 1; i <= width; i++){
            stars+="*";
        }
        return stars;
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String modWord = word;
        if (word.length()==1){
            for (int i = 1; i < rows; i++){
                modWord+="\n"+word;
            }
        } else {
        for (int i = 1; i < rows; i++){
            String newWord = word.substring(i)+word.substring(0,i);
            modWord+="\n"+newWord;
        }
    }
        return modWord;
    }

}