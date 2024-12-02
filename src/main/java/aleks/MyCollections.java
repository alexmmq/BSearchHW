package aleks;

import java.util.Comparator;
import java.util.List;

public class MyCollections {
    private MyCollections(){}

    // 1
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            //подставляет в левую позицию 0, по факту выполняя деление на 2
            //можем получить overflow при больших числах если просто делить на 2
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            //итерируемся пока не найдем необходимое значение
            if (cmp < 0){
                low = mid + 1;
            } else if (cmp > 0){
                high = mid - 1;
            } else return mid;
        }

        //возвращает отрицательное значение в случае неудачи
        return -(low + 1);
    }

    // 2
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> comparator){
        if(comparator == null){
            return binarySearch((List<? extends Comparable<? super T>>) list, key);
        } else{
            int low = 0;
            int high = list.size() - 1;

            while (low <= high){
                int mid = (low + high) >>> 1;
                //подставляет в левую позицию 0, по факту выполняя деление на 2
                //можем получить overflow при больших числах если просто делить на 2
                T midVal = list.get(mid);
                int cmp = comparator.compare(midVal, key);

                //итерируемся пока не найдем необходимое значение
                if (cmp < 0){
                    low = mid + 1;
                } else if (cmp > 0){
                    high = mid - 1;
                } else return mid;
            }

            //возвращает отрицательное значение в случае неудачи
            return -(low + 1);
        }
    }
}

