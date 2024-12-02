package aleks;

import java.text.DecimalFormat;

public final class ArrayCreator {
    private ArrayCreator() {}

    //for int
    public static int[] createArray(int length, int mP) {
        int[] array;
        if(length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            array = new int[length];
            for(int i = 0; i < length; i++) {
                array[i] = (int)(Math.random() * mP);
            }
        }
        return array;
    }

    //for long
    public static long[] createArray(int length, long mP) {
        long[] array;
        if(length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            array = new long[length];
            for(int i = 0; i < length; i++) {
                array[i] = (long)(Math.random() * mP);
            }
        }
        return array;
    }
    //for byte
    public static byte[] createArray(int length, byte mP) {
        byte[] array;
        if(length <= 0 || mP > 100) {
            throw new IllegalArgumentException("Length must be greater than 0 or mP less or equal to 100");
        } else {
            array = new byte[length];
            for(int i = 0; i < length; i++) {
                array[i] = (byte)(Math.random() * mP);
            }
        }
        return array;
    }

    //for short
    public static short[] createArray(int length, short mP) {
        short[] array;
        if(length <= 0 || mP > 100) {
            throw new IllegalArgumentException("Length must be greater than 0 or mP less or equal to 100");
        } else {
            array = new short[length];
            for(int i = 0; i < length; i++) {
                array[i] = (short)(Math.random() * mP);
            }
        }
        return array;
    }

    //for char
    public static char[] createArray(int length, char mP) {
        char[] array;
        if(length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            array = new char[length];
            for(int i = 0; i < length; i++) {
                int rnd = (int) (Math.random() * 52); // or use Random or whatever
                char base = (rnd < 26) ? 'A' : 'a';
                array[i] = (char) (base + rnd % 26);
            }
        }
        return array;
    }

    //for float
    public static float[] createArray(int length, float mP) {
        float[] array;
        if(length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            array = new float[length];
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            for(int i = 0; i < length; i++) {
                array[i] = Float.parseFloat(decimalFormat.format((double) Math.random() * mP));
            }
        }
        return array;
    }

    //for double
    public static double[] createArray(int length, double mP) {
        double[] array;
        if(length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            array = new double[length];
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            for(int i = 0; i < length; i++) {
                array[i] = Double.parseDouble(decimalFormat.format((double) Math.random() * mP));
            }
        }
        return array;
    }
}

