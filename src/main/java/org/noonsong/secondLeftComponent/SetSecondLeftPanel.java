package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetSecondLeftPanel {

    public static JPanel secondLeftPanel = new JPanel();
    public static JScrollPane announcePanel = new javax.swing.JScrollPane();
    public static JList announceList = new javax.swing.JList<>();
    public static JLabel announceLabel = new javax.swing.JLabel();
    public static JLabel hwLabel = new javax.swing.JLabel();
    public static JScrollPane hwPanel = new javax.swing.JScrollPane();
    public static JList hwList = new javax.swing.JList<>();
    public static JLabel talkChannelLabel = new javax.swing.JLabel();
    public static JScrollPane talkChannelPanel = new javax.swing.JScrollPane();
    public static JList talkChannelList = new javax.swing.JList<>();
    //TODO 버튼에 맞게 헤더 부분이 변화필요
    public static SetHeaderFirst hRoom = new SetHeaderFirst("헤더라벨적기");

    public SetSecondLeftPanel(SetHeaderFirst hRoom){

        secondLeftPanel.setBackground(new Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new Dimension(242, 600));


        announceLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        announceLabel.setText("공지");
        announceList.setBackground(new java.awt.Color(238, 241, 244));
        announceList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        announceList.setFont(new java.awt.Font("돋움", 0, 20)); // NOI18N
        announceList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "# 주간알림" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        announceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        announceList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        announcePanel.setViewportView(announceList);

        hwLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        hwLabel.setText("과제함");
        hwList.setBackground(new java.awt.Color(238, 241, 244));
        hwList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hwList.setFont(new java.awt.Font("돋움", 0, 20)); // NOI18N
        hwList.setModel(new javax.swing.AbstractListModel<String>() {
        String[] strings = { "# 1주차 과제함", "# 2주차 과제함", "# 3주차 과제함" };
        public int getSize() { return strings.length; }
        public String getElementAt(int i) { return strings[i]; }
    });
        hwList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        hwList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hwPanel.setViewportView(hwList);


        talkChannelLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        talkChannelLabel.setText("대화");
        talkChannelList.setBackground(new java.awt.Color(238, 241, 244));
        talkChannelList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        talkChannelList.setFont(new java.awt.Font("돋움", 0, 20)); // NOI18N
        talkChannelList.setModel(new javax.swing.AbstractListModel<String>() {
        String[] strings = { "# 질문과 답변", "# 잡담" };
        public int getSize() { return strings.length; }
        public String getElementAt(int i) { return strings[i]; }
    });
        talkChannelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        talkChannelList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        talkChannelPanel.setViewportView(talkChannelList);


        //레이아웃/.건들필요없음
        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(hRoom.headerFirst, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hRoom.headerLine, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(announcePanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(announceLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hwPanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hwLabel)
                                        .addComponent(talkChannelLabel)
                                        .addComponent(talkChannelPanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(hRoom.headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hRoom.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(announceLabel)
                                .addGap(10, 10, 10)
                                .addComponent(announcePanel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(hwLabel)
                                .addGap(10, 10, 10)
                                .addComponent(hwPanel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(talkChannelLabel)
                                .addGap(10, 10, 10)
                                .addComponent(talkChannelPanel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(123, Short.MAX_VALUE))
        );
    }
}