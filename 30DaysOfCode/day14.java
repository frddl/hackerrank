    Difference (int[] a){
        this.elements = a;
    }

    public int computeDifference() {
    int max = elements[0];
    for (int i = 0; i < elements.length; i++)
        if (elements[i] > max)
            max = elements[i];
        
    int min = elements[0];
    for (int i = 0; i < elements.length; i++)
        if (elements[i] < min)
            min = elements[i];
        
    maximumDifference = max - min;
        return maximumDifference;
    }
