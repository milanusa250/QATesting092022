package loops.breakandcontinuekws;

public class BreakContinueKws {
    public static void main(String[] args) {
        //both break and continue are used in loops
        //break keyword: break the loop in given condition
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);//0-4,
        }
        //continue keyword: break the loop when condition is satisfied then keep going
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);//0-4, 6-9
        }
    }
}
