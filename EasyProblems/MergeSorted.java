class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArr = new int[m + n];
        int nums1Counter = 0;
        int nums2Counter = 0;
        int finalArrCounter = 0;

        if ( n==0 ){
            return;
        }
        if ( m ==0 ){
            for ( int i=0; i<n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }


        while ( nums1Counter<m && nums2Counter<n ){
            if ( nums1[ nums1Counter ] < nums2[ nums2Counter ] ){
                mergedArr[finalArrCounter] = nums1[ nums1Counter ];
                finalArrCounter++;
                nums1Counter++;
            } else if ( nums1[ nums1Counter ] > nums2[ nums2Counter] ){
                mergedArr[finalArrCounter] = nums2[ nums2Counter ];
                finalArrCounter++;
                nums2Counter++;
            } else {    
                mergedArr[finalArrCounter] = nums1[ nums1Counter ];
                finalArrCounter++;
                nums1Counter++;
                mergedArr[finalArrCounter] = nums2[ nums2Counter ];
                finalArrCounter++;
                nums2Counter++;
            }
        }

        // remaining numbers in the first arr
        while ( nums1Counter<m ){
            mergedArr[finalArrCounter] = nums1[ nums1Counter ];
            finalArrCounter++;
            nums1Counter++;
        }

        // remaining numbers in the second arr
        while  ( nums2Counter<n ){
            mergedArr[finalArrCounter] = nums2[ nums2Counter ];
            finalArrCounter++;
            nums2Counter++;
        }

        for ( int i=0; i< m+n; i++ ){
            nums1[i] = mergedArr[i];
        }

    }
}