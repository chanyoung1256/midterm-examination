package Arr;

public class Array_Ex_3 {
    public static void main(String[] args)
    {
        int arr[][] = new int[3][];
        int cnt = 1;

        arr[0] = new int[3];
        arr[1] = new int[10];
        arr[2] = new int[2];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = cnt++;
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}