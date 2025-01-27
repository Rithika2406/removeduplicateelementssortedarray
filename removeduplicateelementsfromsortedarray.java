class Main {
    public static void main(String[] args) {
        int arr[] = { 1,1,2, 2, 3};
        int newIndex = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]!=arr[i])
            {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        System.out.println("Unique elements:");
        for (int i = 0; i < newIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
