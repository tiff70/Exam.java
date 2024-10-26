public class Coursework {
    private int courseworkMarks;

    public Coursework(int courseworkMarks) {
        this.courseworkMarks = courseworkMarks;
    }

    public void checkResult() {
        if (courseworkMarks >= 15) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Coursework coursework = new Coursework(16); // Change this value to test
        coursework.checkResult(); // This will print "Passed"
    }
}