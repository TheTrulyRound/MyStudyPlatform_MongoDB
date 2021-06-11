package org.noonsong.firstLeftComponent;

import org.noonsong.Background;
import org.noonsong.Explore;
import org.noonsong.MakeStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetExploreBtn {
    public static JButton exploreBtn = new JButton();

    public SetExploreBtn(){
        //그룹 탐색 버튼 레이이웃. 밑의 버튼 이벤트 코드 작성 필요.
        exploreBtn.setBackground(new Color(253, 253, 248));
        exploreBtn.setForeground(new Color(253, 253, 248));
        exploreBtn.setIcon(new ImageIcon("src/img/explore_simple.png")); // NOI18N
        exploreBtn.setBorder(null);
        exploreBtn.setMargin(new Insets(2, 11, 2, 11));
        exploreBtn.setMaximumSize(new Dimension(50, 50));
        exploreBtn.setMinimumSize(new Dimension(50, 50));
        exploreBtn.setPreferredSize(new Dimension(50, 50));
//        exploreBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                exploreBtnActionPerformed(evt);
//            }
//        });
    }

//    private void exploreBtnActionPerformed(ActionEvent evt) {
//        // TODO add your handling code here:
//        if (evt.getSource() == exploreBtn) {
//            Component component = (Component) evt.getSource();
//            JFrame frame = (JFrame) SwingUtilities.getRoot(component);
//            frame.dispose();
//           //new Explore();   // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
//        }
//    }
}
