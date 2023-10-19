package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    String expected = """
                 1
                212
               32123
              4321234
             543212345
            65432123456
            """;

    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            StringBuilder s = new StringBuilder();
            // add placeholder
            s.append(" ".repeat(cathetusLength - row));
            int width;
            // from left to middle
            for (width = row; width > 0; width--) {
                s.append(width);
            }
            // to right
            for (width += 2; width <= row; width++) {
                s.append(width);
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
