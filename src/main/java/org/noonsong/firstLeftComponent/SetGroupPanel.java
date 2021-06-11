package org.noonsong.firstLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetGroupPanel {
    public static JPanel groupPanel = new JPanel();
    public static SetGroup groups = new SetGroup();
    //TODO 그룹버튼 데이터에 맞게 생성 필요

    public SetGroupPanel(){
        //그룹 패널 레이아웃
        groupPanel.setBackground(new Color(230, 235, 244));
        groupPanel.setMinimumSize(new Dimension(50, 250));
        groupPanel.setPreferredSize(new Dimension(50, 250));

        GroupLayout groupPanelLayout = new GroupLayout(groupPanel);

        groupPanel.setLayout(groupPanelLayout);
        groupPanelLayout.setHorizontalGroup(
                groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                //TODO 그룹 데이터 받아와서 .addComponent 밑에 추가 필요
                                .addGroup(groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(groups.group, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        groupPanelLayout.setVerticalGroup(
                groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupPanelLayout.createSequentialGroup()
                                .addComponent(groups.group, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
        );
    }
}
