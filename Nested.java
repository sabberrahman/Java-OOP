package nestedclass;

public class NestedClass {

    private String priString = "private String";
    protected String proString = "Protected String";

    public static void main(String[] args) {
        NestedClass nested = new NestedClass();
        NestedClass.MemberClass memberClass = nested.new MemberClass();
        memberClass.runMemberClass();
    

    /// --> Must:  nested. new MemberClass(); )
    }

   
    
    class MemberClass {

        void runMemberClass() {
            System.out.println("outerClass variable is : " + priString + proString);
        }
    }
}

class Anonyous implements Person {

    public static void main(String[] args) {
        // no name obj
        Anonyous Anonmoy = new Anonyous() {
            @Override
            public void personHobby() {
                System.out.println("sleeping");
            }
        };

        Anonmoy.personHobby();
    }

    @Override
    public void personHobby() {
    }

}

interface Person {

    void personHobby();
}


class Calculator{
private int result = 0;

class Add{void add(int add){result +=add;}}
class Minus{void minus(int minus){result-=minus;}}

    public int getResult() {
        return result;
    }


    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        Calculator.Add add= calculate.new Add();
        Calculator.Minus minus= calculate.new Minus();
        add.add(2000);
        add.add(200);
        minus.minus(240);
        calculate.getResult();
    }

}
class OuterClass {
    private String outerString = "Outer String";

    class InnerClass {
        void runInnerClass() {
            System.out.println("outerString is : " + outerString);
        }
    }
}

class StaticNestedClass {

    private static String staticString = "Static String";

    static class InnerClass {

        void runInnerClass() {
            System.out.println("staticString is : " + staticString);
        }
    }
}