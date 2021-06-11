package org.noonsong.firstLeftComponent;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetGroup {
    //Group 버튼 레이아웃. 버튼 이벤트 코드 작성 필요.
    // TODO get array from login info - for loop 돌리자
    String[] joinedGroupId = {"생성해"};

    public static JButton group = new JButton();
    public SetGroup(){
        group.setBackground(new Color(253, 253, 248));
        group.setFont(new Font("돋움", 1, 20)); // NOI18N
        group.setText("자바");
        //TODO  public SetGroup(variable){ .. setText(variable); ..};로 데이터에 따라 추가필요.
        group.setBorder(null);
        group.setMargin(new Insets(2, 11, 2, 11));
        group.setMaximumSize(new Dimension(50, 50));
        group.setMinimumSize(new Dimension(50, 50));
        group.setPreferredSize(new Dimension(50, 50));

//        group.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                groupActionPerformed(evt);
//            }
//        });
    }
//    private void groupActionPerformed(ActionEvent evt) {
//        // TODO add your handling code here: 클릭하면 해당 스터디 그룹으로 가게 됨
//        //
//    }
}
