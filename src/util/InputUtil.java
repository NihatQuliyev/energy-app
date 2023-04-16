package util;

import java.util.Scanner;

public class InputUtil {
    public static byte byteInput(String title){
        Scanner scanner =new Scanner(System.in);
        System.out.print(title);
        return scanner.nextByte();

    }
}
