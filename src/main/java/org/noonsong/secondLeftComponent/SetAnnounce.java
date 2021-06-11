package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

//공지 패널 레이아웃. 건들일 필요없음.
public class SetAnnounce {
    public static JScrollPane announcePanel = new JScrollPane();
    public static  JLabel announceLabel = new JLabel();
    public SetAnnounce(){
        SetAnnounceList notiList = new SetAnnounceList();
        announcePanel.setViewportView(notiList.announceList);
        announceLabel.setFont(new Font("돋움", 1, 20)); // NOI18N
        announceLabel.setText("공지");
    }
}
