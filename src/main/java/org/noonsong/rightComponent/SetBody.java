package org.noonsong.rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetBody {
    public static JPanel body = new JPanel();
    public static JScrollPane bodyPanel = new JScrollPane();

    // JPanel content 인자로 body 변경 가능

    public SetBody(JPanel content){
        bodyPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        body.setBackground(new Color(255, 255, 255));

        //바디 레이아웃
        GroupLayout bodyLayout = new GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(content, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(content, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addContainerGap(256, Short.MAX_VALUE))
        );

        bodyPanel.setViewportView(body);
    }
}