class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

class Father {
    int fAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father age cannot be negative");
        }
        fAge = age;
        System.out.println("Father age: " + fAge);
    }
}

class Son extends Father {
    int sAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son age must be less than Father age");
        }
        sAge = sonAge;
        System.out.println("Son age: " + sAge);
    }
}

public class Age {
    public static void main(String[] args) {
        try {
            Son s = new Son(12, 25);
        }
        catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try {
            Son s = new Son(0, 25);
        }
        catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
