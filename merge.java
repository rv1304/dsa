public void merge(int arr[],int l,int mid,int r) {
    int len1 = mid - l + 1;
    int len2 = r - mid;
    
    int arr1[] = new int [len1] ;
    int arr2[] = new int [len2];
    
    for (int i=0;i<len1;i++) arr1[i] = arr[l+ i]; // cAN MAKE MISTAKE HERE
    for (int i=0;i<len2;i++) arr2[i] = arr[mid + i+1];
    int i=0;int j=0;
    int k=l; // careful
    while (i < len1 && j < len2) {
        if (arr1[i] <= arr2[j]) arr[k++] = arr1[i++];
        else arr[k++] = arr2[j++];
    }
    
    while (i < len1) {
        arr[k++] = arr1[i++];
    }
    while (j < len2) {
        arr[k++] = arr2[j++];
    }
    
}

public void mergeSort(int arr[],int l, int r) {
    if (l < r) { // not while
        int mid = l + (r - l) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr, l, mid, r);

    }
} 
