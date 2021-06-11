package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetHw {

    public static JScrollPane hwPanel = new JScrollPane();
    public static  JLabel hwLabel = new JLabel();
    public static SetHwList hws = new SetHwList();

    //과제함 레이아웃, 편집필요없음.
    public SetHw(){
        hwLabel.setFont(new Font("돋움", 1, 20)); // NOI18N
        hwLabel.setText("과제함");

        hwPanel.setViewportView(hws.hwList);
    }
}
