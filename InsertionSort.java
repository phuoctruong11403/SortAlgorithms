class InsertionSort 
{
    public static void sort (int[] array)
    {
        for (int i = 1; i < array.length; i++){
            int j;
            int element = array[i];
            for (j = i; j > 0 && array[j-1] > element; j--)
                array[j] = array[j-1];

            array[j] = element;
        }
    }

    public static void main(String[] args)
    {
        int[] test = {100,14,7,20,12};
        for (int i : test)
            System.out.print(i + " ");
        System.out.println();
        sort(test);
        for (int i : test)
            System.out.print(i + " ");
        System.out.println();

    }
}