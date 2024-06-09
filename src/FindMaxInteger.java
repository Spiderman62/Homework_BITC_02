public class FindMaxInteger {
    public int returnMaxInt(int[] max){
        int maxNumber = max[0];
        for(int i = 0;i<max.length;i++){
            if(max[i] > maxNumber){
                maxNumber = max[i];
            }
        }
        return maxNumber;
    }
}
