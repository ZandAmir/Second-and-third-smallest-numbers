package com.java;

public class Main {
    static int biggestNumber;
    static int smallestNumber;
    static int secondSmallestNumber;
    static int thirdSmallestNumber;

    public static void main(String[] args) {
        int[] records = {125,180,220,105,115,200};

        System.out.println("The second smallest number is " + findSecondSmallest(records));
        System.out.println("The third smallest number is " + findThirdSmallest(records));
        }

//A method to find the biggest member in the array ---------------------------------------------------------------------
        public static int findBiggest (int[] records){
            biggestNumber = records[0];
            for (int i = 0; i < records.length; i++) {
                if (records[i] > biggestNumber){
                    biggestNumber = records [i];
                }
            }
            return biggestNumber;
        }

//A method to find the second smallest member in the array -------------------------------------------------------------
        public static int findSecondSmallest (int[] records){
            smallestNumber = findBiggest(records);
            secondSmallestNumber = findBiggest(records);
            for (int i = 0; i < records.length; i++) {
                if (records[i] < smallestNumber){
                    secondSmallestNumber = smallestNumber;
                    smallestNumber = records[i];
                }
                if (records[i] > smallestNumber && records[i] < secondSmallestNumber){
                    secondSmallestNumber = records[i];
                }
            }
            return secondSmallestNumber;
        }

//A method to find the third smallest member in the array --------------------------------------------------------------
        public static int findThirdSmallest (int[] records){
            thirdSmallestNumber = findBiggest(records);
            for (int i = 0; i < records.length; i++) {
                if (records[i] > secondSmallestNumber && records[i] < thirdSmallestNumber){
                    thirdSmallestNumber = records[i];
                }

            }
            return thirdSmallestNumber;
        }
    }
