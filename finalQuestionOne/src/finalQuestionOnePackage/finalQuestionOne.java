package finalQuestionOnePackage;

class Main {
    public static int main(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        System.out.print(result);
        return result;
    }
}