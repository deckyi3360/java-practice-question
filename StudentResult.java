public class StudentResult {
    String name;
    int[] scores = {90, 80, 75, 30, 40};
    void result(int scores){
        if (scores >= 90){
            System.out.println("\"Distinction");
        } else if (scores >= 40) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
    static void main(String[] args) {
        StudentResult result = new StudentResult();
        for (int scores: result.scores){
            result.result(scores);
        }
    }
}
