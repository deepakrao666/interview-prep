package prep;

public class MissingElementInTwoArrays {

  static int missingElement(int arr[], int arr2[]){
      int result = 0;
      for(int i = 0; i < arr.length; i++){
          result = result^arr[i];
          if(i < arr2.length){
              result = result^arr2[i];
          }
      }
      return result;
  }
}
