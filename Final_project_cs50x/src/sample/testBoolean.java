package sample;

public class testBoolean {
    private int input1;
    private int input2;
    private boolean result;

    public testBoolean(int input1, int input2){
        this.input1 = input1;
        this.input2 = input2;
    }

    public static boolean resTest(int input1, int input2){
        int res = input1 + input2;
        if(res == 0)
            return true;
        else
            return false;
    }
}
