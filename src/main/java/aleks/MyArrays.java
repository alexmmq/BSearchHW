package aleks;

import java.util.Comparator;

public final class MyArrays {
    private MyArrays() {
    }

    //общий метод - проверка передаваемых параметров
    public static void rangeValidation(int length, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("Индекс начала поискового диапазона должен быть больше индекса " +
                    " конца поискового диапазона");
        }
        if (fromIndex < 0) {
            throw new IllegalArgumentException("Индекс начала поискового диапазона должен быть больше 0 ");
        }
        if (toIndex > length) {
            throw new IllegalArgumentException("Индекс конца поискового диапазона должен быть меньше длины" +
                    " массива");
        }
    }

    //1
    public static int binarySearch(byte[] a, byte key){
        return binarySearchLogic(a, 0, a.length, key);
    }

    //2
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key){
        rangeValidation(a.length, fromIndex, toIndex);
        return binarySearchLogic(a, fromIndex, toIndex, key);
    }

    //1+2 общий метод для вызова по параметру типа byte в массиве типа byte
    private static int binarySearchLogic(byte[] a, int fromIndex, int toIndex, byte key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            byte midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            if (midVal < key){
                low = mid + 1;
            } else if (midVal > key){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //3
    public static int binarySearch(char[] a, char key){
        return binarySearchLogic(a, 0, a.length, key);
    }

    //4
    static int binarySearch(char[] a, int fromIndex, int toIndex, char key){
        rangeValidation(a.length, fromIndex, toIndex);
        return binarySearchLogic(a, fromIndex, toIndex, key);
    }

    //3+4 общий метод для вызова по параметру типа char в массиве типа char
    private static int binarySearchLogic(char[] a, int fromIndex, int toIndex, char key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            char midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            if (midVal < key){
                low = mid + 1;
            } else if (midVal > key){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //5
    public static int binarySearch(double[] a, double key){
        return binarySearchLogic(a, 0, a.length, key);
    }

    //6
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key){
        rangeValidation(a.length, fromIndex, toIndex);
        return binarySearchLogic(a, fromIndex, toIndex, key);
    }

    //5+6 общий метод для вызова по параметру типа double в массиве типа double
    private static int binarySearchLogic(double[] a, int fromIndex, int toIndex, double key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            double midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            if (midVal < key){
                low = mid + 1;
            } else if (midVal > key){
                high = mid - 1;
            } else {
                //обработка случаев NaN - плата за мантиссу
                long midBits = Double.doubleToLongBits(midVal);
                long keyBits = Double.doubleToLongBits(key);
                if(midBits == keyBits){
                    return mid;
                } else if(midBits < keyBits){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //7
    public static int binarySearch(float[] a, float key){
        return binarySearchLogic(a, 0, a.length, key);
    }

    //8
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key){
        rangeValidation(a.length, fromIndex, toIndex);
        return binarySearchLogic(a, fromIndex, toIndex, key);
    }

    //7+8 общий метод для вызова по параметру типа float в массиве типа float
    private static int binarySearchLogic(float[] a, int fromIndex, int toIndex, float key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            float midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            if (midVal < key){
                low = mid + 1;
            } else if (midVal > key){
                high = mid - 1;
            } else {
                //обработка случаев NaN - плата за мантиссу
                long midBits = Double.doubleToLongBits(midVal);
                long keyBits = Double.doubleToLongBits(key);
                if(midBits == keyBits){
                    return mid;
                } else if(midBits < keyBits){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //9
    public static int binarySearch(int[] a, int key){
        return binarySearchLogic(a, 0, a.length, key);
    }

    //10
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key){
        rangeValidation(a.length, fromIndex, toIndex);
        return 0;
    }

    //9+10 общий метод для вызова по параметру типа int в массиве типа int
    private static int binarySearchLogic(int[] a, int fromIndex, int toIndex, int key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            int midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            if (midVal < key){
                low = mid + 1;
            } else if (midVal > key){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //11
    public static int binarySearch(long[] a, long key){
        return binarySearchLogic(a, 0, a.length, key);
    }

    //12
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key){
        rangeValidation(a.length, fromIndex, toIndex);
        return binarySearchLogic(a, fromIndex, toIndex, key);
    }

    //9+10 общий метод для вызова по параметру типа long в массиве типа long
    private static int binarySearchLogic(long[] a, int fromIndex, int toIndex, long key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            long midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            if (midVal < key){
                low = mid + 1;
            } else if (midVal > key){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //13
    public static int binarySearch(short[] a, short key){
        return binarySearchLogic(a, 0, a.length, key);
    }

    //14
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key){
        rangeValidation(a.length, fromIndex, toIndex);
        return binarySearchLogic(a, fromIndex, toIndex, key);
    }

    //13+14 общий метод для вызова по параметру типа short в массиве типа short
    private static int binarySearchLogic(short[] a, int fromIndex, int toIndex, short key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            short midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            if (midVal < key){
                low = mid + 1;
            } else if (midVal > key){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }
    //15
    public static <T> int binarySearch(T[] a, T key, Comparator <? super T> c){
        return binarySearchLogic(a, 0, a.length, key, c);
    }
    //16
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator <? super T> c){
        return binarySearchLogic(a, fromIndex, toIndex, key, c);
    }

    private static <T> int binarySearchLogic(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c){

        if(c == null) {
            return binarySearchLogic(a, fromIndex, toIndex, key);
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            T midVal = a[mid];

            //итерируемся пока не найдем необходимое значение
            int cmp = c.compare(midVal, key);
            if (cmp < 0){
                low = mid + 1;
            } else if (cmp > 0){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //общий случай при передаче объекта в качестве параметра
    private static int binarySearchLogic(Object[] a, int fromIndex, int toIndex, Object key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2

            Comparable midVal = (Comparable) a[mid];

            //итерируемся пока не найдем необходимое значение
            int cmp = midVal.compareTo(key);

            if (cmp < 0){
                low = mid + 1;
            } else if (cmp > 0){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    //поскольку мы заинтересованы в скорости проводимых операций, определим сортировку через MergedSort,
    //определяем только непараметризированную сортировку, весь массив по умолчанию
    //int
    public static void sortAscendingOrder(int[] a){
        MergeSort.mergeSort(a, a.length);
    }

    //char
    public static void sortAscendingOrder(char[] a){
        MergeSort.mergeSort(a, a.length);
    }

    //byte
    public static void sortAscendingOrder(byte[] a){
        MergeSort.mergeSort(a, a.length);
    }

    //short
    public static void sortAscendingOrder(short[] a){
        MergeSort.mergeSort(a, a.length);
    }

    //long
    public static void sortAscendingOrder(long[] a){
        MergeSort.mergeSort(a, a.length);
    }

    //double
    public static void sortAscendingOrder(double[] a){
        MergeSort.mergeSort(a, a.length);
    }

    //float
    public static void sortAscendingOrder(float[] a){
        MergeSort.mergeSort(a, a.length);
    }
}

