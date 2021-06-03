class BubbleSort 
{
    public static void sort (int[] arrayToSort)
    {
        for (int i = 0; i < arrayToSort.length; i++){
            for (int j = 1; j < arrayToSort.length - i; j++){
                if (arrayToSort[j] < arrayToSort[j-1])
                {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j - 1];
                    arrayToSort[j - 1] = temp;
                }
            }
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