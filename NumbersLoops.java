public class NumbersLoops{
    // public NumbersLoops(){
    //   int index = 0;
    //   while(index<11){
    //     System.out.println(index);
    //     index++;
    //   }
    //   System.out.println("What is index now: " + index);

    //   int index2 = 0; 
    //   for(; index2 < 11; ){
    //     System.out.println(index2);
    //   }
    //   System.out.println("What is index2 now: " + index2);

    // }
  
    public int digitSum(int num){
      int index = 0;
      int sum = 0; 
      while (index <= num){
        sum = sum + index;
        index++;
      }
      return sum;
      
    }
  
    public int reverseNum(int num){
      int newNum = 0;
      int modNum = 0;

      while (num != 0){
        modNum = num % 10;
        num = num / 10;
        newNum = newNum * 10 + modNum; 
      }
      return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int count = 0;
      for (int i = start; i <= finish; i++){
        if (i == reverseNum(i)){
          count ++;
      }
      }
      
      return count;
    }
  
  
  }
