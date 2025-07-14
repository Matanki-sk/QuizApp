package model;

public class UserSession {
    private static String username;
    private static int score = 0;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String name) {
        username = name;
    }

    public static int getScore() {
        return score;
    }

    public static void resetScore() {
        score = 0;
    }

    public static void incrementScore() {
        score++;
    }
}
