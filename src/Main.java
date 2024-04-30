class exerciseTask1and3 {
    public static void main(String[] args) {
        int[] numbers = {1, 38, 7, 8, 3, 9, 5, 0, 15, 10};
        int difference = calculateDifference(numbers);
        System.out.println("The difference between the largest and smallest values in array " + difference);
    }
    public static int calculateDifference(int[] arr) {
        if (arr.length < 1) {
            System.out.println("Array must have at least 1 element.");
            return -1;
            }
    int min = arr[0];
    int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
        System.out.println("min = " + min);
    }
    if (arr[i] > max) {
        max = arr[i];
        System.out.println("The maximum value is " + max);
    }
}
       int value = max - min;
      return value - min;}
    {
    }
}











class ExerciseTask3 {
    public static void main(String[] args) {
        int x = 3; //x=3
        double y = 4.5; //y = 4,5
        double result = calculateExpression(x, y);
        System.out.println("The result of the expression is: " + result);
    }
    public static double calculateExpression(int x, double y) {
        return (Math.pow(x , 2)+Math.pow((((4 * y)/5 )-x),2));}
    //return (3 * x) + (4 * y);}
    }



