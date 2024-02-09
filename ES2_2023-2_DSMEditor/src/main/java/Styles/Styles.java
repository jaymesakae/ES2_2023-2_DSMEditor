package Styles;

public class Styles {
    private static boolean isDarkMode = true;
    // Colors
    private static String lightModePrimColor = "white";
    private static String lightModeSecColor = "white";

    private static String lightModeFontColor = "white";

    private static String darkModePrimColor = "#121212";
    private static String darkModeSecColor = "#282828";
    private static String darkModeFontColor = "#282828";

    public static boolean isDarkMode() {
        return isDarkMode;
    }

    public static void setDarkMode(boolean setDarkMode) {
        System.out.println("dark mode to :" + getCurrentPrimColor());
        isDarkMode = setDarkMode;
    }

    public static String getCurrentPrimColor(){
        if (!isDarkMode())
            return lightModePrimColor;
        else
            return darkModePrimColor;
    }

    public static String getCurrentSecColor(){
        if (!isDarkMode())
            return lightModeSecColor;
        else
            return darkModeSecColor;
    }

    public static String getCurrentFontColor(){
        if (!isDarkMode())
            return lightModeFontColor;
        else
            return darkModeFontColor;
    }
}
