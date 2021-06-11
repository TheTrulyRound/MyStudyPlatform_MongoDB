package org.noonsong.rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetMemberPanel {
    public static JPanel memberPanel = new JPanel();
    public static JLabel memberFixedLabel = new JLabel();
    public static JLabel memberNoLabel = new JLabel();
    public static JLabel memberYesLabel = new JLabel();
    public static JScrollPane memberYesPanel = new JScrollPane();
    public static JScrollPane memberNoPanel = new JScrollPane();

    // 참여자 목록 생성자로 불러오고
    public static JList<String> memYesList = new SetMemberList().memberYesList;
    public static JList<String> memNoList = new SetMemberList().memberNoList;
    // TODO 리스트에 있는 값에 따라 바뀌도록 이벤트 설정해야함
    public static SetMemPercent memPercent = new SetMemPercent();


    // 참여자 목록 패널 레이아웃. 건들필요없음.
    public SetMemberPanel(){
        memberPanel.setBackground(new Color(238, 241, 244));

        //리팩토링 필요함 한개로 활용 가능하게 memberFixedLabel,memberYesLabel, memberNoLabel
        memberFixedLabel.setFont(new Font("돋움", 1, 20));
        memberFixedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberFixedLabel.setText("제출현황");

        memberYesLabel.setFont(new Font("돋움", 1, 20));
        memberYesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberYesLabel.setText("제출");
        memberYesPanel.setViewportView(memYesList);
        memberNoLabel.setFont(new Font("돋움", 1, 20));
        memberNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberNoLabel.setText("미제출");
        memberNoPanel.setViewportView(memNoList);

        GroupLayout memberPanelLayout = new GroupLayout(memberPanel);
        memberPanel.setLayout(memberPanelLayout);
        memberPanelLayout.setHorizontalGroup(
                memberPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(memberPanelLayout.createSequentialGroup()
                                .addGroup(memberPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(memberYesPanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberFixedLabel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memPercent.memberPerLabel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberYesLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberNoPanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberNoLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 43, Short.MAX_VALUE))
        );
        memberPanelLayout.setVerticalGroup(
                memberPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(memberPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(memberFixedLabel)
                                .addGap(10, 10, 10)
                                .addComponent(memPercent.memberPerLabel)
                                .addGap(56, 56, 56)
                                .addComponent(memberYesLabel)
                                .addGap(10, 10, 10)
                                .addComponent(memberYesPanel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberNoLabel)
                                .addGap(10, 10, 10)
                                .addComponent(memberNoPanel, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );
    }
}