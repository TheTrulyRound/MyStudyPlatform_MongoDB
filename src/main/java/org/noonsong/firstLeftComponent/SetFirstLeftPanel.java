package org.noonsong.firstLeftComponent;

import org.noonsong.Background;
import org.noonsong.Mypage;
import org.noonsong.Mypage;
import org.noonsong.Explore;
import org.noonsong.MakeStudy;
import org.noonsong.StudyRoom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.noonsong.Background.*;

public class SetFirstLeftPanel implements ActionListener{

    //firstLeftPanel의 큰 틀. 코드 작성 필요없음.

    public static JPanel firstLeftPanel = new JPanel();
    public static JButton myBtn = new JButton();
    public static JButton group = new JButton();
    public static JButton plusBtn = new JButton();
    public static JButton exploreBtn = new JButton();
    public static JPanel groupPanel = new JPanel();


    public SetFirstLeftPanel(){
        firstLeftPanel.setBackground(new Color(230, 235, 244));
        firstLeftPanel.setMinimumSize(new Dimension(72, 600));
        firstLeftPanel.setName(""); // NOI18N
        firstLeftPanel.setPreferredSize(new Dimension(72, 600));

        //버튼
        setBtn(myBtn);
        setBtn(plusBtn);
        setBtn(exploreBtn);
        //TODO  groupName string 로 데이터에 따라 추가필요
        setGroupBtn(group,"자바");
        setGroupsBtn(groupPanel);

        myBtn.addActionListener(this);
        plusBtn.addActionListener(this);
        exploreBtn.addActionListener(this);
        group.addActionListener(this);

        // firstLeftPanel 레이아웃, 코드 추가 필요없음
        GroupLayout firstLeftPanelLayout = new GroupLayout(firstLeftPanel);
        firstLeftPanel.setLayout(firstLeftPanelLayout);
        firstLeftPanelLayout.setHorizontalGroup(
                firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                .addGroup(firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(myBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(groupPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(plusBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(exploreBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        firstLeftPanelLayout.setVerticalGroup(
                firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(myBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(groupPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(plusBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(exploreBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    public static int ecount;
    public static int pcount;
    public static int scount;
    public static int bcount;

    public void setBtn(JButton btn){
        btn.setBackground(new Color(253, 253, 248));
        btn.setForeground(new Color(253, 253, 248));
        btn.setIcon(new javax.swing.ImageIcon("/img/my.png")); // NOI18N
        btn.setBorder(null);
        btn.setMargin(new Insets(2, 11, 2, 11));
        btn.setMaximumSize(new Dimension(50, 50));
        btn.setMinimumSize(new Dimension(50, 50));
        btn.setPreferredSize(new Dimension(50, 50));

    }
    public void setGroupBtn(JButton btn, String groupName){
        btn.setBackground(new Color(253, 253, 248));
        btn.setForeground(new Color(0, 0, 0));
        btn.setFont(new Font("돋움", 1, 20));
        btn.setText(groupName);
        btn.setBorder(null);
        btn.setMargin(new Insets(2, 11, 2, 11));
        btn.setMaximumSize(new Dimension(50, 50));
        btn.setMinimumSize(new Dimension(50, 50));
        btn.setPreferredSize(new Dimension(50, 50));

    }
    public void setGroupsBtn(JPanel UserGroups){
        // TODO get array from login info - for loop 돌리자
        String[] joinedGroupId = {"생성해"};

        UserGroups.setBackground(new Color(230, 235, 244));
        UserGroups.setMinimumSize(new Dimension(50, 250));
        UserGroups.setPreferredSize(new Dimension(50, 250));

        GroupLayout UserGroupsLayout = new GroupLayout(UserGroups);
        UserGroups.setLayout(UserGroupsLayout);
        UserGroupsLayout.setHorizontalGroup(
                UserGroupsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(UserGroupsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                //TODO 그룹 데이터 받아와서 .addComponent 밑에 추가 필요
                                .addGroup(UserGroupsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(group, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        UserGroupsLayout.setVerticalGroup(
                UserGroupsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(UserGroupsLayout.createSequentialGroup()
                                .addComponent(group, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
        );
    }
    public static int tracker = 4;
    public static Explore explorePanel = new Explore();
    public static MakeStudy makeStudyPanel = new MakeStudy();
    public static Mypage myPagePanel = new Mypage();

    public void actionPerformed(ActionEvent evt) {
        Component component = (Component) evt.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(component);
        frame.remove(rightPanel); // 현재 프레임 삭제

        if(evt.getSource() == exploreBtn) {
//TODO 찾기 아직 패널화 안함
            Background.allLayout(explorePanel);
            ecount += 1;
            System.out.println("if 문 안의 exploreBtn 실행: " + ecount);
            System.out.println("tracker: : "+ tracker);
            switch (tracker){
                case 1:
                    explorePanel.setVisible(true);
                    System.out.println("탐색 페이지 보이게해라 ");
                    break;
                case 2:
                    makeStudyPanel.setVisible(false);
                    System.out.println("스터디 생성 페이지 안보이게해라 ");
                    break;
                case 3:
                    System.out.println("스터디룸 안보이게해라 ");
                    break;
                case 4:
                    myPagePanel.setVisible(false);
                    System.out.println("마이 페이지 안보이게해라 ");
                    break;
            } tracker = 1;
        }else if(evt.getSource() == plusBtn) {
            //패널화함
            // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
            Background.allLayout(makeStudyPanel);
            pcount += 1;
            System.out.println("if문 안의 plusBtn 실행: " + pcount );
            System.out.println("tracker: : "+ tracker);
            switch (tracker){
                case 1:
                    explorePanel.setVisible(false);
//                    mainFrame.remove(explorePanel);
                    System.out.println("탐색 페이지 안보이게해라 ");
                    break;
                case 2:
                    makeStudyPanel.setVisible(true);
                    System.out.println("스터디 생성 페이지 보이게해라 ");
                    break;
                case 3:
                    System.out.println("스터디룸 안보이게해라 ");
                    break;
                case 4:
                    myPagePanel.setVisible(false);
                    System.out.println("마이 페이지 안보이게해라 ");
                    break;
            }tracker=2;
        }else if(evt.getSource() == group){
            //ToDO 스터디룸 패널화 안함
            new StudyRoom();                // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
            scount += 1;
            System.out.println("if 문 안의 group 버튼 실행: " + scount);
            System.out.println("tracker: : "+ tracker);
            switch (tracker){
                case 1:
                    explorePanel.setVisible(false);
//                    mainFrame.remove(explorePanel);
                    System.out.println("탐색 페이지 안보이게해라 ");
                    break;
                case 2:
                    makeStudyPanel.setVisible(false);
//                    mainFrame.remove(makeStudyPanel);
                    System.out.println("스터디 생성 페이지 안보이게해라 ");
                    break;
                case 3:
                    System.out.println("스터디룸 보이게 해라 ");
                    break;
                case 4:
                    myPagePanel.setVisible(false);
                    System.out.println("마이 페이지 안보이게해라 ");
                    break;
            }tracker=3;
        }
        else {
            //TODO 백그라운드 패널화 안함
            // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
            bcount += 1;
            System.out.println("if 문 안의 myBtn 실행: " + bcount);
            System.out.println("tracker: : "+ tracker);
            switch (tracker){
                case 1:
                    explorePanel.setVisible(false);
//                    mainFrame.remove(explorePanel);
                    System.out.println("탐색 페이지 보이게해라 ");
                    break;
                case 2:
                    makeStudyPanel.setVisible(false);
                    System.out.println("스터디 생성 페이지 안보이게해라 ");
                    break;
                case 3:
                    System.out.println("스터디룸 안보이게해라 ");
                    break;
                case 4:
                    myPagePanel.setVisible(true);
                    System.out.println("마이 페이지 보이게해라 ");
                    break;
            }tracker=4;
        }
        rightPanel.updateUI();

    }



}
