package org.noonsong.rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetBodyHeader {
    public static JPanel bodyHeader = new JPanel();
    public static JLabel bodyHeaderFixIcon = new JLabel();
    public static JLabel bodyHeaderLabel = new JLabel();

    //String msg로 각 rightPanel = body 헤더 텍스트 변경가능 - 오버라이딩
    public SetBodyHeader(String msg){
        bodyHeader.setBackground(new Color(255, 255, 255));
        bodyHeader.setPreferredSize(new Dimension(716, 81));

        bodyHeaderFixIcon.setFont(new Font("돋움", 1, 30));
        bodyHeaderFixIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bodyHeaderFixIcon.setText("#");

        bodyHeaderLabel.setFont(new Font("돋움", 1, 30));
        bodyHeaderLabel.setText(msg);

        GroupLayout bodyHeaderLayout = new GroupLayout(bodyHeader);
        bodyHeader.setLayout(bodyHeaderLayout);
        bodyHeaderLayout.setHorizontalGroup(
                bodyHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyHeaderLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(bodyHeaderFixIcon, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bodyHeaderLabel, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyHeaderLayout.setVerticalGroup(
                bodyHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyHeaderLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(bodyHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bodyHeaderFixIcon, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                        .addComponent(bodyHeaderLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
    }
}