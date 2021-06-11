package org.noonsong.firstLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetFirstLeftPanel {
    //firstLeftPanel의 큰 틀. 코드 작성 필요없음.
    public static JPanel firstLeftPanel = new JPanel();
    public SetFirstLeftPanel(){
        firstLeftPanel.setBackground(new Color(230, 235, 244));
        firstLeftPanel.setMinimumSize(new Dimension(72, 600));
        firstLeftPanel.setName(""); // NOI18N
        firstLeftPanel.setPreferredSize(new Dimension(72, 600));

        SetMyBtn my = new SetMyBtn();
        SetPlusBtn plus = new SetPlusBtn();
        SetExploreBtn expl = new SetExploreBtn();
        SetGroupPanel studygroup = new SetGroupPanel();

        // firstLeftPanel 레이아웃, 코드 추가 필요없음
        GroupLayout firstLeftPanelLayout = new GroupLayout(firstLeftPanel);
        firstLeftPanel.setLayout(firstLeftPanelLayout);
        firstLeftPanelLayout.setHorizontalGroup(
                firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                .addGroup(firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(my.myBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(studygroup.groupPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(plus.plusBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(expl.exploreBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        firstLeftPanelLayout.setVerticalGroup(
                firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(my.myBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(studygroup.groupPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(plus.plusBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(expl.exploreBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
}
