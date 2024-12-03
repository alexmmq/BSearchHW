import aleks.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TestBinarySearch {

    int[] intArray;
    byte[] byteArray;
    char[] charArray;
    short[] shortArray;
    long[] longArray;
    double[] doubleArray;
    float[] floatArray;
    double[] doubleArray2;
    float[] floatArray2;
    Student[] studentArray;
    ArrayList<Student> studentArray2;

    @Before
    public void setUp() throws Exception {
        intArray = ArrayCreator.createArray(100, 10);
        byteArray = ArrayCreator.createArray(100, (byte)10);
        doubleArray = ArrayCreator.createArray(100, 10.0);
        doubleArray2 = new double[]{1.6, 1.5, 5.0, 3.5};
        floatArray = ArrayCreator.createArray(100, 10.0f);
        floatArray2 = new float[]{1.6f, 1.5f, 5.0f, 3.5f};
        charArray = ArrayCreator.createArray(100, '1');
        shortArray = ArrayCreator.createArray(100, (short)10);
        longArray = ArrayCreator.createArray(100, (long)10);
        studentArray = new Student[5];
        studentArray[0] = new Student("Aleks");
        studentArray[0].setAge(32);
        studentArray[0].setScore(85);
        studentArray[1] = new Student("Zia");
        studentArray[1].setAge(38);
        studentArray[1].setScore(90);
        studentArray[2] = new Student("Muthu");
        studentArray[2].setAge(33);
        studentArray[2].setScore(90);
        studentArray[3] = new Student("Malvin");
        studentArray[3].setAge(42);
        studentArray[3].setScore(50);
        studentArray[4] = new Student("Damian");
        studentArray[4].setAge(41);
        studentArray[4].setScore(70);
        studentArray2 = new ArrayList<>();
        studentArray2.add(new Student("Richard", 45, 75));
        studentArray2.add(new Student("Sam", 41, 85));
        studentArray2.add(new Student("Michael", 42, 90));
        studentArray2.add(new Student("David", 43, 91));
        studentArray2.add(new Student("Ali", 25, 82));

    }

    @Test
    public void testIntBinarySearch() {
        System.out.println("Int Binary Search Test");
        for(int j : intArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(intArray, 5));
        MyArrays.sortAscendingOrder(intArray);
        for(int j : intArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(intArray, 5));
        System.out.println("Int Binary Search Test END");
        System.out.println();
    }

    @Test
    public void testLongBinarySearch() {
        System.out.println("Long Binary Search Test");
        for(long j : longArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(longArray, 5));
        MyArrays.sortAscendingOrder(longArray);
        for(long j : longArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(longArray, 5));
        System.out.println("Long Binary Search Test END");
        System.out.println();
    }

    @Test
    public void testByteBinarySearch() {
        System.out.println("Byte Binary Search Test");
        for(byte j : byteArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(byteArray, (byte) 5));
        MyArrays.sortAscendingOrder(byteArray);
        for(byte j : byteArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(byteArray, (byte) 5));
        System.out.println("Byte Binary Search Test END");
        System.out.println();
    }

    @Test
    public void testShortBinarySearch() {
        System.out.println("Short Binary Search Test");
        for(short j : shortArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(shortArray, (short) 5));
        MyArrays.sortAscendingOrder(shortArray);
        for(short j : shortArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(shortArray, (short) 5));
        System.out.println("Short Binary Search Test END");
        System.out.println();
    }


    @Test
    public void testCharBinarySearch() {
        System.out.println("Char Binary Search Test");
        for(char j : charArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(charArray, 'Z'));
        MyArrays.sortAscendingOrder(charArray);
        for(char j : charArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(charArray, 'Y'));
        System.out.println("Char Binary Search Test END");
        System.out.println();
    }

    @Test
    public void testFloatBinarySearch() {
        System.out.println("Float Binary Search Test");
        for(float j : floatArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(floatArray, 5.0f));
        MyArrays.sortAscendingOrder(floatArray);
        for(float j : floatArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(floatArray, 5.0f));
        for(float j : floatArray2){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(floatArray2, 5.0f));
        System.out.println("Float Binary Search Test END");
        System.out.println();
    }

    @Test
    public void testDoubleBinarySearch() {
        System.out.println("Double Binary Search Test");
        for(double j : doubleArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(doubleArray, 5.0));
        MyArrays.sortAscendingOrder(doubleArray);
        for(double j : doubleArray){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(doubleArray, 5.0));
        for(double j : doubleArray2){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(doubleArray2, 5.0));
        System.out.println("Double Binary Search Test END");
        System.out.println();
    }

    @Test
    public void testGenericBinarySearch(){
        System.out.println("Generic Binary Search Test");
        for(Student j : studentArray){
            System.out.print(j.getName() + ", " + j.getAge() + ", " + j.getScore() + " ");
        }
        System.out.println();
        System.out.println(MyArrays.binarySearch(studentArray, new Student("Muthu"),
                null));
        System.out.println(MyArrays.binarySearch(studentArray, new Student("Aleks"),
                new StudentNameComparator()));
        System.out.println("Generic Binary Search Test END");
        System.out.println();
    }
    @Test
    public void testCollectionsBinarySearch(){
        System.out.println("Collections Binary Search Test");
        for(Student j : studentArray2){
            System.out.print(j.getName() + ", " + j.getAge() + ", " + j.getScore() + " ");
        }
        System.out.println();
        System.out.println(MyCollections.binarySearch(studentArray2, new Student("Richard"),
                null));
        System.out.println(MyCollections.binarySearch(studentArray2, new Student("Ali"),
                new StudentNameComparator()));

        // для бинарного поиска важен порядок, только при упорядоченной коллекции возможно гарантировать
        // результат поиска

        Collections.sort(studentArray2);
        for(Student j : studentArray2){
            System.out.print(j.getName() + ", " + j.getAge() + ", " + j.getScore() + " ");
        }
        System.out.println();
        System.out.println(Collections.binarySearch(studentArray2, new Student("Richard"),
                null));
        System.out.println(MyCollections.binarySearch(studentArray2, new Student("Ali"),
                new StudentNameComparator()));
        System.out.println("Collections Binary Search Test END");
        System.out.println();
    }
}
