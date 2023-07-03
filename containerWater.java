public enum containerWater {
        public int maxArea(int[] height) {
            int i=0;
            int j=height.length-1;
            
            int ans=0;
            
            while(i!=j){
                
                int area=(j-i)*Math.min(height[i],height[j]);
                
                if(area>ans){
                    ans=area;
                }
                
                if(height[i]>height[j]){
                    j--;
                }else{
                    i++;
                }
            }
            return ans;
            // if(height.length == 1){
            //     return 0;
            // }
    
            // if(height.length == 2){
            //     return Math.min(height[0], height[1]);
            // }
            // Stack<Integer> s = new Stack<>();
            // s.push(height[0]);
    
            // for(int i = 1; i<height.length; i++){
            //     if(s.peek() > height[i]){
            //         s.push(i);
            //     }
            //     else if(s.peek() < height[i]){
            //         s.pop();
            //         s.push(i);
            //     }
            // }
    
            // int x = s.peek();
            // for(int i = 0; i<s.size() - 1; i++){
            //     s.pop();
            // }
            // int y = s.peek();
            // int gap = (y-x) + (y-x-1);
            
            // int less = Math.min(x,y);
    
            // int area = less*gap; 
    
    
            // for(int i = x+1; i<=y; i++){
            //     area-=height[i];
            // }
    
            // return area;
    
         
    
    
            
            
            
            // int area = 0;
            // // int arr[] = new int[height.length];
         
            // for(int i = 0; i<height.length; i++){
            //     for(int j = height.length-1; j<height.length; j--){
                    
            //         if(height[i]<=height[j]){
            //             area = (j-i)*height[i];
            //             arr.get(area);
            //         }
    
            //         else if(height[i]>height[j]){
            //             area = (i-j)*height[j];
            //             arr.get(area);
            //         }
                    
            //         return area;
            //     }
    
    
            //     // return area;
            // }
            // return area;
        }
    }