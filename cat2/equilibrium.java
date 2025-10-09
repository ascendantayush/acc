int total = 0;
for(int num : arr) total += num;

int left_sum = 0;
for(int i = 0; i < arr.length; i++){
    if(left_sum == total - left_sum - arr[i]){
        System.out.println(i); // equilibrium index
        return;
    }
    left_sum += arr[i];
}

System.out.println("No equilibrium index found");
