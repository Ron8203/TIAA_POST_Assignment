// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = { 99, 12, -8, 12, 34, 110, 0, 121, 66, -110 };
        for(int i = 0; i<arr.length; i++)
        {
            for (int j =i+1 ; j<arr.length; j++)
            {
                int temp = 0;
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0 ; k<arr.length; k++)
        {
            System.out.print(arr[k]);
            System.out.print(" ");
        }

        }
    }
