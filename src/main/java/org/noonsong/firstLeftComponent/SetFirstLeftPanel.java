package org.noonsong.firstLeftComponent;

import org.noonsong.Background;
import org.noonsong.Explore;
import org.noonsong.LoginWindow;
import org.noonsong.MakeStudy;
import org.noonsong.StudyRoom;
import org.noonsong.MyPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import static org.noonsong.Background.*;

public class SetFirstLeftPanel implements ActionListener {

    //firstLeftPanel의 큰 틀. 코드 작성 필요없음.

    public static JPanel firstLeftPanel = new JPanel();
    public static JButton myBtn = new JButton();
    public static JButton[] groupBtn = new JButton[4];
    public static JButton plusBtn = new JButton();
    public static JButton exploreBtn = new JButton();
    public static JPanel groupPanel = new JPanel();

    public SetFirstLeftPanel() {
        firstLeftPanel.setBackground(new Color(230, 235, 244));
        firstLeftPanel.setMinimumSize(new Dimension(72, 600));
        firstLeftPanel.setName(""); // NOI18N
        firstLeftPanel.setPreferredSize(new Dimension(72, 600));

        //버튼
        setBtn(myBtn, "src/img/my.png");
        setBtn(plusBtn, "src/img/plus.png");
        setBtn(exploreBtn, "src/img/explore.png");
        System.out.println("로그인 상태: " + LoginWindow.loginSuccess);

        //TODO  groupName string 로 데이터에 따라 추가필요
        if (LoginWindow.loginSuccess != null && LoginWindow.loginSuccess.equals(true)) {
            Object doc = LoginWindow.userDoc.get("joinedGroup");        // 현재 조인된 그룹의 오브젝트 가져오기
            ArrayList<String> joinedGroup = (ArrayList<String>) doc;    // 오브젝트 타입 변환
            System.out.println("JoinedGroup: " + joinedGroup);
            for (int i = 0; i < 4; i++) {
                try {
                    groupBtn[i] = new JButton();
                    groupBtn[i].addActionListener(this);
                    setGroupBtn(groupBtn[i], joinedGroup.get(i));
                } catch (Exception ex) {
                    groupBtn[i] = new JButton();
                    setGroupBtn(groupBtn[i], "");   // 작동 안되는 버튼들
                }
            }
        }
        setGroupsBtn(groupPanel);

        myBtn.addActionListener(this);
        plusBtn.addActionListener(this);
        exploreBtn.addActionListener(this);
        //group.addActionListener(this);

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

    public void setBtn(JButton btn, String imagePath) {
        btn.setBackground(new Color(253, 253, 248));
        btn.setForeground(new Color(253, 253, 248));
        btn.setIcon(new javax.swing.ImageIcon(imagePath)); // NOI18N
        btn.setBorder(null);
        btn.setMargin(new Insets(2, 11, 2, 11));
        btn.setMaximumSize(new Dimension(50, 50));
        btn.setMinimumSize(new Dimension(50, 50));
        btn.setPreferredSize(new Dimension(50, 50));

    }

    public void setGroupBtn(JButton btn, String groupName) {
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

    public void setGroupsBtn(JPanel UserGroups) {
        // TODO get array from login info - for loop 돌리자
        UserGroups.setBackground(new Color(230, 235, 244));
        UserGroups.setMinimumSize(new Dimension(50, 250));
        UserGroups.setPreferredSize(new Dimension(50, 250));

        GroupLayout UserGroupsLayout = new GroupLayout(UserGroups);
        UserGroups.setLayout(UserGroupsLayout);

        if (groupBtn[3] != null) {
            UserGroupsLayout.setHorizontalGroup(
                    UserGroupsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(UserGroupsLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    //TODO 그룹 데이터 받아와서 .addComponent 밑에 추가 필요
                                    .addGroup(UserGroupsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(groupBtn[0], GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(groupBtn[1], GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(groupBtn[2], GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(groupBtn[3], GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
            );
            UserGroupsLayout.setVerticalGroup(
                    UserGroupsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(UserGroupsLayout.createSequentialGroup()
                                    .addComponent(groupBtn[0], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(groupBtn[1], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(groupBtn[2], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(groupBtn[3], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
            );
        }
    }

    public void actionPerformed(ActionEvent evt) {
        Object doc = LoginWindow.userDoc.get("joinedGroup");        // 현재 조인된 그룹의 오브젝트 가져오기
        ArrayList<String> joinedGroup = (ArrayList<String>) doc;    // 오브젝트 타입 변환

        if(evt.getSource() == groupBtn[0]){
            //ToDO 스터디룸 패널화 안함
            try {
                new StudyRoom(joinedGroup.get(0));
            } catch (Exception ex) {}
            scount += 1;
            System.out.println("if 문 안의 group 버튼 실행: " + scount);
        }
        else if(evt.getSource() == groupBtn[1]){
            //ToDO 스터디룸 패널화 안함
            try {
                new StudyRoom(joinedGroup.get(1));
            } catch (Exception ex) {}
            scount += 1;
            System.out.println("if 문 안의 group 버튼 실행: " + scount);
        }
        else if(evt.getSource() == groupBtn[2]){
            //ToDO 스터디룸 패널화 안함
            try {
                new StudyRoom(joinedGroup.get(2));
            } catch (Exception ex) {}
            scount += 1;
            System.out.println("if 문 안의 group 버튼 실행: " + scount);
        }
        else if(evt.getSource() == groupBtn[3]){
            //ToDO 스터디룸 패널화 안함
            try {
                new StudyRoom(joinedGroup.get(3));
            } catch (Exception ex) {}
            scount += 1;
            System.out.println("if 문 안의 group 버튼 실행: " + scount);
        }
        else if (evt.getSource() == exploreBtn) {
            //TODO 찾기 아직 패널화 안함
            Background.allLayout(LoginWindow.explorePanel, LoginWindow.explorePanel.secondLeftPanel);
            ecount += 1;
            System.out.println("if 문 안의 exploreBtn 실행: " + ecount);
            System.out.println("tracker: : " + LoginWindow.tracker);
            switch (LoginWindow.tracker) {
                case 1:
                    LoginWindow.explorePanel.setVisible(true);
                    LoginWindow.explorePanel.secondLeftPanel.setVisible(true);
                    System.out.println("탐색 페이지 보이게해라 ");
                    break;
                case 2:
                    LoginWindow.makeStudyPanel.setVisible(false);
                    LoginWindow.makeStudyPanel.secondLeftPanel.setVisible(false);

                    System.out.println("스터디 생성 페이지 안보이게해라 ");
                    break;
                case 3:
                    LoginWindow.roomPanel.setVisible(false);
                    LoginWindow.roomPanel.secondLeftPanel.setVisible(false);
                    System.out.println("스터디룸 안보이게해라 ");
                    break;
                case 4:
                    LoginWindow.myPagePanel.setVisible(false);
                    LoginWindow.myPagePanel.secondLeftPanel.setVisible(false);
                    System.out.println("마이 페이지 안보이게해라 ");
                    break;
            }
            LoginWindow.tracker = 1;
        } else if (evt.getSource() == plusBtn) {
            //패널화함
            // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
            Background.allLayout(LoginWindow.makeStudyPanel, LoginWindow.makeStudyPanel.secondLeftPanel);
            pcount += 1;
            System.out.println("if문 안의 plusBtn 실행: " + pcount);
            System.out.println("tracker: : " + LoginWindow.tracker);
            switch (LoginWindow.tracker) {
                case 1:
                    LoginWindow.explorePanel.setVisible(false);
                    LoginWindow.explorePanel.secondLeftPanel.setVisible(false);
                    System.out.println("탐색 페이지 안보이게해라 ");
                    break;
                case 2:
                    LoginWindow.makeStudyPanel.setVisible(true);
                    LoginWindow.makeStudyPanel.secondLeftPanel.setVisible(true);
                    System.out.println("스터디 생성 페이지 보이게해라 ");
                    break;
                case 3:
                    LoginWindow.roomPanel.setVisible(false);
                    LoginWindow.roomPanel.secondLeftPanel.setVisible(false);
                    System.out.println("스터디룸 안보이게해라 ");
                    break;
                case 4:
                    LoginWindow.myPagePanel.setVisible(false);
                    LoginWindow.myPagePanel.secondLeftPanel.setVisible(false);
                    System.out.println("마이 페이지 안보이게해라 ");
                    break;
            }
            LoginWindow.tracker = 2;
        } else if (evt.getSource() == groupBtn) {
            Background.allLayout(LoginWindow.roomPanel, LoginWindow.roomPanel.secondLeftPanel);                // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
            scount += 1;
            System.out.println("if 문 안의 group 버튼 실행: " + scount);
            System.out.println("tracker: : " + LoginWindow.tracker);
            switch (LoginWindow.tracker) {
                case 1:
                    LoginWindow.explorePanel.setVisible(false);
                    LoginWindow.explorePanel.secondLeftPanel.setVisible(false);
//                    mainFrame.remove(explorePanel);
                    System.out.println("탐색 페이지 안보이게해라 ");
                    break;
                case 2:
                    LoginWindow.makeStudyPanel.setVisible(false);
                    LoginWindow.makeStudyPanel.secondLeftPanel.setVisible(false);
//                    mainFrame.remove(makeStudyPanel);
                    System.out.println("스터디 생성 페이지 안보이게해라 ");
                    break;
                case 3:
                    LoginWindow.roomPanel.setVisible(true);
                    LoginWindow.roomPanel.secondLeftPanel.setVisible(true);
                    System.out.println("스터디룸 보이게 해라 ");
                    break;
                case 4:
                    LoginWindow.myPagePanel.setVisible(false);
                    LoginWindow.myPagePanel.secondLeftPanel.setVisible(false);
                    System.out.println("마이 페이지 안보이게해라 ");
                    break;
            }
            LoginWindow.tracker = 3;
        } else {
            // 스터디 생성 페이지가 열린 새로운 프레임 띄우기
            Background.allLayout(LoginWindow.myPagePanel, LoginWindow.myPagePanel.secondLeftPanel);
            bcount += 1;
            System.out.println("if 문 안의 myBtn 실행: " + bcount);
            System.out.println("tracker: : " + LoginWindow.tracker);
            switch (LoginWindow.tracker) {
                case 1:
                    LoginWindow.explorePanel.setVisible(false);
                    LoginWindow.explorePanel.secondLeftPanel.setVisible(false);
//                    mainFrame.remove(explorePanel);
                    System.out.println("탐색 페이지 보이게해라 ");
                    break;
                case 2:
                    LoginWindow.makeStudyPanel.setVisible(false);
                    LoginWindow.makeStudyPanel.secondLeftPanel.setVisible(false);
                    System.out.println("스터디 생성 페이지 안보이게해라 ");
                    break;
                case 3:
                    LoginWindow.roomPanel.setVisible(false);
                    LoginWindow.roomPanel.secondLeftPanel.setVisible(false);
                    System.out.println("스터디룸 안보이게해라 ");
                    break;
                case 4:
                    LoginWindow.myPagePanel.setVisible(true);
                    LoginWindow.myPagePanel.secondLeftPanel.setVisible(true);
                    System.out.println("마이 페이지 보이게해라 ");
                    break;
            }
            LoginWindow.tracker = 4;
        }

        rightPanel.updateUI();



    }
}