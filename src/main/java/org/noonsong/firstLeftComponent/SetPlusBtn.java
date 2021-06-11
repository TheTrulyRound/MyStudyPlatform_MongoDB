package org.noonsong.firstLeftComponent;

import org.noonsong.MakeStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetPlusBtn {
    public static JButton plusBtn = new JButton();

    //그룹 추가
    // TODO MakeStudy로 이어지는 이벤트 버튼 연결 필요

    public SetPlusBtn(){
        plusBtn.setBackground(new Color(253, 253, 248));
        plusBtn.setForeground(new Color(253, 253, 248));
        plusBtn.setIcon(new ImageIcon("../img/plus.png")); // NOI18N
        plusBtn.setBorder(null);
        plusBtn.setIconTextGap(0);
        plusBtn.setMargin(new Insets(2, 11, 2, 11));
        plusBtn.setMaximumSize(new Dimension(50, 50));
        plusBtn.setMinimumSize(new Dimension(50, 50));
        plusBtn.setPreferredSize(new Dimension(50, 50));
        plusBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });
    }
    private void plusBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == plusBtn) {
            Component component = (Component) evt.getSource();
            JFrame frame = (JFrame) SwingUtilities.getRoot(component);
            frame.dispose(); // 현재 프레임 삭제
            new MakeStudy();                // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
        }
    }
}
