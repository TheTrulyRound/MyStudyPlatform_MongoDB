package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetAnnounceList {

    public static JList<String> announceList = new JList<>();

    public SetAnnounceList(){
        // 리스트 레이아웃
        announceList.setBackground(new Color(238, 241, 244));
        announceList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        announceList.setFont(new Font("돋움", 0, 20));

        //TODO 데이터베이스와 연결 필요
        announceList.setModel(new javax.swing.AbstractListModel<String>() {
            //strings 변수명 재설정 필요
            String[] strings = { "# 주간알림" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        announceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        announceList.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}