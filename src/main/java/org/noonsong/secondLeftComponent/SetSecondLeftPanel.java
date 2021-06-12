package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetSecondLeftPanel {
    public static JPanel secondLeftPanel = new JPanel();

    public SetSecondLeftPanel(){
        secondLeftPanel.setBackground(new Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new Dimension(242, 600));

        //TODO 버튼에 맞게 헤더 부분이 변화필요
        SetHeaderFirst hFirst = new SetHeaderFirst("헤더라벨적기");

        //공지, 과제, 대화 채널의 구조는 같음 - 리팩토링 필요함
        SetAnnounce noti = new SetAnnounce();
        SetHw hw = new SetHw();
        SetTalkCh talk = new SetTalkCh();

        //레이아웃/.건들필요없음
        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(hFirst.headerFirst, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hFirst.headerLine, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(noti.announcePanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(noti.announceLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hw.hwPanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hw.hwLabel)
                                        .addComponent(talk.talkChannelLabel)
                                        .addComponent(talk.talkChannelPanel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(hFirst.headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hFirst.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(noti.announceLabel)
                                .addGap(10, 10, 10)
                                .addComponent(noti.announcePanel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(hw.hwLabel)
                                .addGap(10, 10, 10)
                                .addComponent(hw.hwPanel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(talk.talkChannelLabel)
                                .addGap(10, 10, 10)
                                .addComponent(talk.talkChannelPanel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(123, Short.MAX_VALUE))
        );
    }
}