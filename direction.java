public class direction {
    public static float getpath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            // char dir = path.charAt(i);
            // south
            if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'W') {
                x--;
            } else {
                x++;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getpath(path));
    }

}
