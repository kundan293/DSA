package Array;

public class TrappingWatter {
    public static int TpWatter(int height[]) {
     //   int n=height.length ;
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        int RightMax[] = new int[height.length];
        RightMax[height.length-1] = height[height.length-1];
        for(int i=2; i>=0; i--){
        RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
        int trappedWater = 0;
        for(int i=0; i< height.length; i++){
         int    waterLevel = Math.min(leftmax[i], RightMax[i]);
        trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args){
        int height[] = { 4,2,6,3,2,5};
        System.out.println(TpWatter( height));
    }
}
