package lesson28;

public class OuterAndInnerClass {
    private String field = "field";

    private void printText() {
        System.out.println("private method print text.");
    }

    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();
    }

    class InnerClass {
        private  String getField() {
            return field;
        }

        private void innerPrintText() {
            printText();
        }
    }
}
