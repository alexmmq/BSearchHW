package aleks;

public final class MergeSort {
    private MergeSort() {}

    //int имплементация
    public static void mergeSort(int[] arr, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(arr, 0, l, 0, mid);
        for(int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            } else{
                a[k++] = r[j++];
            }
        }

        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }

    //byte имплементация
    public static void mergeSort(byte[] arr, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        byte[] l = new byte[mid];
        byte[] r = new byte[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }
    public static void merge(byte[] a, byte[] l, byte[] r, int left, int right){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            } else{
                a[k++] = r[j++];
            }
        }

        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }

    //short имплементация
    public static void mergeSort(short[] arr, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        short[] l = new short[mid];
        short[] r = new short[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    private static void merge(short[] a, short[] l, short[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            } else{
                a[k++] = r[j++];
            }
        }

        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }

    //long имплементация
    public static void mergeSort(long[] arr, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        long[] l = new long[mid];
        long[] r = new long[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    private static void merge(long[] a, long[] l, long[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            } else{
                a[k++] = r[j++];
            }
        }

        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }

    //double имплементация
    public static void mergeSort(double[] arr, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        double[] l = new double[mid];
        double[] r = new double[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    private static void merge(double[] a, double[] l, double[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            } else{
                a[k++] = r[j++];
            }
        }

        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }

    //float имплементация
    public static void mergeSort(float[] arr, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        float[] l = new float[mid];
        float[] r = new float[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    private static void merge(float[] a, float[] l, float[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            } else{
                a[k++] = r[j++];
            }
        }

        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }

    //char имплементация
    public static void mergeSort(char[] arr, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        char[] l = new char[mid];
        char[] r = new char[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    private static void merge(char[] a, char[] l, char[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j < right){
            if(l[i] <= r[j]){
                a[k++] = l[i++];
            } else{
                a[k++] = r[j++];
            }
        }

        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }
}

