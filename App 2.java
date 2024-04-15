import java.util.Scanner;

public class App {


    public static void main(String[] arges){
        //intialize scanner object 
        Scanner newScan = new  Scanner(System.in);

        System.out.println("Enter the number of data points:");
        int arrayLength =  newScan.nextInt();

        //initlaize new array with given size 
        int[] arr = new int[arrayLength];


        //iterate through array to assign values dynamically 
        for(int i = 0; i<arr.length; i++){
            //prompt user for data until array is full
            System.out.println("Enter a number for position" + i);
            arr[i] = newScan.nextInt();
        }

        //call methods
        getTotal(arr);

        getAverage(arr);
        getHighest(arr);
        getLowest(arr);
    }
    public static int getTotal(int[] userArray){

        int sum = 0;

        for(int i = 0; i<userArray.length; i++){
            sum =  sum+userArray[i];

        }

        System.out.println("The total of the array is:" + sum);
        return sum;

    }
    public static int getAverage(int[] userArray){
        int sum = 0;
        int average = 0; 

        for(int i = 0; i<userArray.length;i++){

            sum = userArray[i] +sum;

        }


        average =  sum/userArray.length;
        System.out.println("The average of the array is:" + average);
        return average;
    }

    public static int getHighest(int[] userArray){

        int highest = -1000000;

        for(int i =0; i<userArray.length; i++){


            if(userArray[i]>highest){
                highest = userArray[i];	
            }


        }
        System.out.println("The highest value in the array is:" + highest);
        return highest;
    }    
    public static int getLowest(int[] userArray){


        int lowest = 100000;

        for (int i =0; i<userArray.length; i++){

            if(userArray[i]<lowest){

                lowest = userArray[i];

            }

        }
        System.out.println("The lowest value in the array is:" + lowest);
        return lowest;

    }


}
