
public class review1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int courseAmt = input.nextInt();
        int courseCredit = 0;
        String courseName;
        int[] credithour = new int[courseAmt];
        String[] coursename = new String[courseAmt];
        int[] coursescore = new int[courseAmt];
        for (int i = 1; i > courseAmt; i++) {
            courseName = input.nextLine();
            courseCredit = Integer.parseInt(String.valueOf(input.nextInt()));

        }
    }
}
