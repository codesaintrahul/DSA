class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0;
        int total_cost=0;
        int start=0;
        int cg=0;
        for(int i=0;i<gas.length;i++){
            total_gas= total_gas+gas[i];
            total_cost= total_cost+cost[i];
            
            cg=cg+gas[i]-cost[i];
            if(cg<0){
                start=i+1;
                cg=0;
            }
            

        }
        
        
        if( total_gas >= total_cost){
            return start;
            
    
            
        }else{
            return -1;

        }
        
    }
}