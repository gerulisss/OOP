package pratimas;

import java.lang.*;

class ReverseArray
{
    public static void main(String[] args)
    {
        String input = "Mokausi programuoti Java programavimo kalba";

        byte [] strAsByteArray = input.getBytes();

        byte [] result =
                new byte [strAsByteArray.length];

        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
    }
}