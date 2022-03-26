public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
    if( idx == arr.length){
        int [] iarr = new int[fsf];
        return iarr;
    }
    // write ur code here
    if( arr[idx] == x){
        int [] iarr = allIndices( arr,  x,  idx + 1 , fsf + 1);
        iarr[fsf] = idx;
        return iarr;

    }else{
        int [] iarr = allIndices( arr,  x,  idx + 1 , fsf);
        return iarr;
        

    }

}