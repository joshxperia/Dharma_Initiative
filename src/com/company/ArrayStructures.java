package com.company;


public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize =10;
    public void generateRandomArray(){

        for(int i =0; i<arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }

    }
public void printArray(){

        System.out.println("----------");
        for(int i = 0; i< arraySize; i++){

            System.out.print("|"+i+"|");
            System.out.println(theArray[i] + "|");
        }
}

 public int getValueAtIndex(int index){

        if(index< arraySize)  return theArray[index];
        return 0;

 }
  public boolean doesArrayContainThisValue(int searchValue){
        boolean valueInArray =false;
         for(int i =0; i<arraySize; i++){
             if(theArray[i] == searchValue){
                 valueInArray = true;
             }
         }

      return valueInArray;
  }

public void deletIndex(int index){
        if(index < arraySize){
            for(int i = index; i<(arraySize-1); i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }

}
  public void insertValue(int value){
        if(arraySize<50){
            theArray[arraySize] = value;
            arraySize++;
        }

  }

  public String linearSearchForValue(int value) {

      boolean valueInArray = false;
      String indexWithValue = "";
      System.out.print("The values are shown bellow");
      for (int m = 0; m < arraySize; m++) {
          if (theArray[m] == value) {
              valueInArray = true;
              System.out.print(m + "");
              indexWithValue += m + "";

          }
      }

   if(!valueInArray){
       indexWithValue ="none";
       System.out.print(indexWithValue);
   }
       System.out.println();
   return indexWithValue;
  }
    public static void main(String[] args){

        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(4));
        System.out.print(newArray.doesArrayContainThisValue(18));
        newArray.deletIndex(2);
        newArray.printArray();
        newArray.insertValue(55);


    }
}
