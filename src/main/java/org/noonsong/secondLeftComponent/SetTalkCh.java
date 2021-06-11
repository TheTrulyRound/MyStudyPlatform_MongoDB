package org.noonsong.secondLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetTalkCh {

    public static JScrollPane talkChannelPanel = new JScrollPane();
    public static  JLabel talkChannelLabel = new JLabel();

    //건들필요없음. 대화채널 레이아웃

    public SetTalkCh(){
        talkChannelLabel.setFont(new Font("돋움", 1, 20)); // NOI18N
        talkChannelLabel.setText("대화");
        SetTalkChList talkChs= new SetTalkChList();
        talkChannelPanel.setViewportView(talkChs.talkChannelList);
    }
}
