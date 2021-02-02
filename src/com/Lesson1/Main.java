package com.Lesson1;

public class Main {

    public static void main(String[] args) {
    String[][] strings= {{"1","2","3","4"},
                         {"5","6","7","8"},
                         {"1","2","3","4"},
                         {"12","6","7","99"}};
        try {
            System.out.println(sumArray(strings));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static int sumArray(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(strings);
        int result=0;

        for (int i = 0; i <strings.length; i++) {
            for (int j = 0; j <strings.length; j++) {
                if (!strings[i][j].matches("\\d+"))
                    throw new MyArrayDataException("Cell ["+i+"]["+j+"] contain incorrect value (not integer): value in cell \""+strings[i][j]+"\"");
                else result+=Integer.parseInt(strings[i][j]);
            }
        }
        return result;
    }

    public static void checkArraySize(String[][] strings) throws MyArraySizeException {
        for (int i = 0; i < strings.length; i++) {
            if (strings.length!=4||strings[0].length!=4) {
                throw new MyArraySizeException("Incorrect String Array size (It's should be [4][4]). Your array size is:["+strings.length+"]["+strings[0].length+"]");
            }
        }
    }
}
