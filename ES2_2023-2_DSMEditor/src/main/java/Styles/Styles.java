package Styles;

import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class Styles {
    private static boolean isDarkMode = false;
    // Colors
    private static String lightModePrimColor = "white";
    private static String lightModeSecColor = "white";
    private static String lightModeTercColor = "white";

    private static String lightModeFontColor = "white";

    private static String darkModePrimColor = "#282828";
    private static String darkModeSecColor = "#121212";
    private static String darkModeTercColor = "#8b8b8b";
    private static String darkModeFontColor = "#FAF9F6";

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
    public static String getCurrentTercColor(){
        if (!isDarkMode())
            return lightModeTercColor;
        else
            return darkModeTercColor;
    }
    public static String getCurrentFontColor(){
        if (!isDarkMode())
            return lightModeFontColor;
        else
            return darkModeFontColor;
    }

    public static String getButtonStyle(){
        String style = getAppFontStyle() + ";" + getAppSecStyle() + ";";
        return style;
    }

    public static String getAppPrimStyle(){
        if (!isDarkMode())
            return "-fx-background-color: " + lightModePrimColor;
        else
            return "-fx-background-color: " + darkModePrimColor;
    }

    public static String getAppSecStyle(){
        if (!isDarkMode())
            return "";
            //return "-fx-background-color: " + lightModeSecColor;
        else
            return "-fx-background-color: " +  darkModeSecColor;
    }

    public static String getAppTercStyle(){
        if (!isDarkMode())
            return "-fx-background-color: " + lightModeTercColor;
        else
            return "-fx-background-color: " +  darkModeTercColor;
    }
    public static String getAppFontStyle(){
        if (!isDarkMode())
            return "";
            //return "-fx-text-fill: " + lightModeFontColor;
        else
            return "-fx-text-fill: " + darkModeFontColor;
    }
}
