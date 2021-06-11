package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetHwList {
    //TODO 데이터베이스와 과제함 목록 연결 필요

    public static JList<String> hwList = new JList<>();
    public SetHwList(){
        hwList.setBackground(new Color(238, 241, 244));
        hwList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hwList.setFont(new Font("돋움", 0, 20)); // NOI18N
        hwList.setModel(new javax.swing.AbstractListModel<String>() {
            // 변경되어야할 데이터값
            String[] strings = { "# 1주차 과제함", "# 2주차 과제함", "# 3주차 과제함" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        hwList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        hwList.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}