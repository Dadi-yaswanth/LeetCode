public static int[] solution(int[] arr, int target){

HashMap<Integer,Integer> map = new Hashmap<>();

for(int i  = 0; i < arr.length; i++){

int diff = target - arr[i];

if(map.containsKey(diff)){return new int[]{i,map.get(diff)};}
else{ map.put(num[i],i)}

}

}
