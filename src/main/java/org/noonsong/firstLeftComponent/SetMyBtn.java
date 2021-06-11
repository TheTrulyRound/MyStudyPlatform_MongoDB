package org.noonsong.firstLeftComponent;

import org.noonsong.Background;
import org.noonsong.MakeStudy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetMyBtn {
    public static JButton myBtn = new JButton();

    //TODO 버튼 이벤트 코드 작성 필요

    //마이 페이지 레이아웃 버튼 레이아웃
    public SetMyBtn(){
        myBtn.setBackground(new java.awt.Color(253, 253, 248));
        myBtn.setForeground(new java.awt.Color(253, 253, 248));
        myBtn.setIcon(new javax.swing.ImageIcon("/img/my.png")); // NOI18N
        myBtn.setBorder(null);
        myBtn.setMargin(new java.awt.Insets(2, 11, 2, 11));
        myBtn.setMaximumSize(new java.awt.Dimension(50, 50));
        myBtn.setMinimumSize(new java.awt.Dimension(50, 50));
        myBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        myBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                myBtnActionPerformed(evt);
            }
        });
    }
    private void myBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == myBtn) {
            Component component = (Component) evt.getSource();
            JFrame frame = (JFrame) SwingUtilities.getRoot(component);
            frame.dispose(); // 현재 프레임 삭제
            new Background();                // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
        }
    }
}