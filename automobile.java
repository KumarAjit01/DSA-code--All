public class automobile {
    private String drive() {
        return "Driveing vehicle";
    }

}

class car extends automobile {
    protected String drive() {
        return "driving car";
    }
}

public class electriccar extends car {
    @Override
    public final String drive() {
        return "driveng electric car";
    }
}

public static void main(String[] wheels) {
    final car Car = new electriccar();
    System.out.println(Car.drive());
}