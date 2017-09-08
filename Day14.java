	// Add your code here
    Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference(){
        int maxDiff = 0;
        for(int i = 0; i < elements.length - 1; i++){
            for(int j = i; j < elements.length; j++){
                int diff = Math.abs(elements[i] - elements[j]);
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        maximumDifference = maxDiff;
    }

