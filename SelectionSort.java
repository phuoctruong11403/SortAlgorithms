class SelectionSort 
{
    public static void sort (int[] arr)
    {
      for (int i = 0; i < arr.length - 1; i++)
      {
          int minIndex = i;
          for (int j = i + 1; j < arr.length; j++)
          {
            if (arr[j] < arr[i]){
                minIndex = j;
            }
          }
          int temp = arr[minIndex];
          arr[minIndex] = arr[i];
          arr[i] = temp;
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