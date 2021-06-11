package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetTalkChList {

    //TODO 대화 채널 데이터 연결 필요
    public static JList<String> talkChannelList = new JList<>();

    public SetTalkChList(){
        talkChannelList.setBackground(new Color(238, 241, 244));
        talkChannelList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        talkChannelList.setFont(new Font("돋움", 0, 20)); // NOI18N
        talkChannelList.setModel(new javax.swing.AbstractListModel<String>() {
            //변경되야할 값
            String[] strings = { "# 질문과 답변", "# 잡담" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        talkChannelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        talkChannelList.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}
