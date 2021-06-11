package org.noonsong;

import java.awt.*;

public class Main {
    public static void main( String[] args )
    {
        MakeStudy.count = 0;
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginWindow();
            }
        });
    }
}
