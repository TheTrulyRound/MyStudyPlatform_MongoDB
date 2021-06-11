package org.noonsong.rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetMemPercent {
    public static JLabel memberPerLabel = new JLabel();

    public SetMemPercent(){
        memberPerLabel.setFont(new Font("돋움", 1, 20)); // NOI18N
        memberPerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberPerLabel.setText("50%");
        // TODO int variable = 참여멤버/전체멤버 . 제출여부에 따라 값이 변경가능하게 이벤트 필요.
        // public setMemPercent(int variable){memberPerLabel.setText(varible) }
    }
}
