package org.noonsong.rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetStudyRoom {

    public static JPanel rightPanel = new JPanel();
    public static SetBodyHeader hbody = new SetBodyHeader("1주차 과제함");
    public static SetFooter foot = new SetFooter("과제 작성 하기");

    // setStudyResult , 스터디 결과 작성페이지, 스터디 결과 상세보기 페이지 생성자로 만들어 연결
    // TODO setBody를 이벤트에 맞게 변경시켜주면 됨.
    public static SetStudyResult resultPre = new SetStudyResult();
    public static JPanel content = resultPre.studyResultPanel;
    public static SetBody contentBody = new SetBody(content);

    public static SetMemberPanel participants = new SetMemberPanel();

    //그룹 화면 레이아웃. 변경할 필요없음
    public SetStudyRoom(){

        rightPanel.setBackground(new Color(255, 255, 255));
        rightPanel.setMinimumSize(new Dimension(716, 600));
        rightPanel.setPreferredSize(new Dimension(716, 600));

        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(contentBody.bodyPanel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hbody.bodyHeader, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(foot.footer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 0, 0)
                                                .addComponent(participants.memberPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(hbody.bodyHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(participants.memberPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contentBody.bodyPanel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(foot.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        );
    }
}
