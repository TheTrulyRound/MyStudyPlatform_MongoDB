package org.noonsong.rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetMemberList{
    public static JList<String> memberNoList = new JList<>();
    public static JList<String> memberYesList = new JList<>();

    public SetMemberList(){
        //스터디 제출 멤버 리스트 레이아웃
        // memberList로 하나 세팅 해놔서 yes,no에 다 적용시키고 싶음...리팩토링 필요
        memberYesList.setBackground(new Color(238, 241, 244));
        memberYesList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memberYesList.setFont(new Font("돋움", 1, 20)); // NOI18N
        memberYesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        memberYesList.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        memberYesList.setEnabled(false);
        memberYesList.setFocusable(false);
        memberNoList.setBackground(new Color(238, 241, 244));
        memberNoList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memberNoList.setFont(new Font("돋움", 1, 20)); //
        memberNoList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        memberNoList.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        memberNoList.setEnabled(false);
        memberNoList.setFocusable(false);

        //TODO String string - 데이터베이스와 연결 필요
        memberYesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "김스터디", "이스터디", "강스터디", "최스터디" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        memberNoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "김민지", "김남희" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

    }

}
