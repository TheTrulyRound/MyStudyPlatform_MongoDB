package org.noonsong;

import org.noonsong.firstLeftComponent.SetFirstLeftPanel;
import org.noonsong.rightComponent.SetFooter;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO 요소들 분리하기
public class MyPage extends JPanel {

    public static SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
    public static JPanel secondLeftPanel = new JPanel();
    public static JPanel rightPanel = new JPanel();

    public static JLayeredPane studyPreview = new JLayeredPane();
    public static JPanel studyIntro = new JPanel();
    public static JLabel studyName = new JLabel();
    public static JTextPane studyIntroW = new JTextPane();

    public static JLabel homeMessage = new JLabel();

    public static SetHeaderFirst hFirst = new SetHeaderFirst("마이 페이지");
    public static int count;

    public MyPage() {
        initComponents();
        setMinimumSize(new Dimension(716, 600));
//        setMinimumSize(new Dimension(1030, 600));
        setVisible(true);
    }

    public void initComponents() {
        count += 1;
        System.out.println("MakeStudy 이니셜라이저 실행: " + count);

//        MakeStudy testMakeStudy = new MakeStudy();
        JButton studyHwMore = new JButton();
        JLabel studyImg = new JLabel();
        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setMinimumSize(new java.awt.Dimension(716, 600));
        rightPanel.setPreferredSize(new java.awt.Dimension(716, 600));

        homeMessage.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        homeMessage.setText("스터디 과제 제출 기한이 얼마 남지 않았습니다.");
        homeMessage.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        homeMessage.setMaximumSize(new java.awt.Dimension(568, 38));
        homeMessage.setMinimumSize(new java.awt.Dimension(568, 38));
        homeMessage.setPreferredSize(new java.awt.Dimension(568, 38));

        studyPreview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        studyPreview.setMinimumSize(new java.awt.Dimension(330, 270));

        studyIntro.setBackground(new java.awt.Color(255, 255, 255));
        studyIntro.setMinimumSize(new java.awt.Dimension(330, 145));

        studyName.setFont(new java.awt.Font("돋움", 0, 14)); // NOI18N
        studyName.setText("2021-자바 개발 스터디");
        studyName.setPreferredSize(new java.awt.Dimension(180, 20));

        studyIntroW.setEditable(false);
        studyIntroW.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        studyIntroW.setText("3주차 과제");

        studyHwMore.setBackground(new java.awt.Color(238, 241, 244));
        studyHwMore.setText("제출하기");
        studyHwMore.setBorder(null);
        studyHwMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyHwMoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studyIntroLayout = new javax.swing.GroupLayout(studyIntro);
        studyIntro.setLayout(studyIntroLayout);
        studyIntroLayout.setHorizontalGroup(
                studyIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studyIntroLayout.createSequentialGroup()
                                .addGroup(studyIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(studyIntroLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(studyHwMore, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(studyIntroLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(studyIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(studyIntroLayout.createSequentialGroup()
                                                                .addComponent(studyName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(studyIntroW, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                .addGap(15, 15, 15))
        );
        studyIntroLayout.setVerticalGroup(
                studyIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studyIntroLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(studyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studyIntroW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(studyHwMore, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studyImg.setIcon(new javax.swing.ImageIcon(("/target/classes/org/noonsong/img/dev_group.jpg"))); // NOI18N
        studyImg.setText("과제제출 이미지 대체텍스트");
        studyImg.setIconTextGap(0);
        studyImg.setMinimumSize(new java.awt.Dimension(330, 125));
        studyImg.setPreferredSize(new java.awt.Dimension(330, 125));

        studyPreview.setLayer(studyIntro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        studyPreview.setLayer(studyImg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout studyPreviewLayout = new javax.swing.GroupLayout(studyPreview);
        studyPreview.setLayout(studyPreviewLayout);
        studyPreviewLayout.setHorizontalGroup(
                studyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studyIntro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studyImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studyPreviewLayout.setVerticalGroup(
                studyPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studyPreviewLayout.createSequentialGroup()
                                .addComponent(studyImg, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(studyIntro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );



        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(studyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                //TODO 스터디 과제 미리보기 추가할 수 있게 이벤트 작성해야함... 도대체 이건 어떻게 해야하는거지?
                                .addComponent(studyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                        .addContainerGap(45, Short.MAX_VALUE)
                                        .addComponent(homeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(103, Short.MAX_VALUE)))
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(studyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        //TODO 스터디 과제 미리보기 추가할 수 있게 이벤트 작성해야함... 도대체 이건 어떻게 해야하는거지?
                                        // 같은거 두번 써도 왜 화면에서는 컴포넌트 두개가 안나타나는것일까?
                                        .addComponent(studyPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(265, Short.MAX_VALUE))
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                        .addContainerGap(20, Short.MAX_VALUE)
                                        .addComponent(homeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(542, Short.MAX_VALUE)))
        );


        //TODO MakeStudy, StudyRoom, Explore 의 rightPanel을 각각 전환시킬 수 있도록 만들기
//        GroupLayout layout = new GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addComponent(firstLeft.firstLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addGap(0, 0, 0)
//                                .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addGap(0, 0, 0)
//                                .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addGap(0, 0, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addComponent(firstLeft.firstLeftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                .addGap(0, 0, Short.MAX_VALUE))
//        );


    }

    private void studyHwMoreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    //    private static void printDatabases(MongoClient mongoClient) {
//        //방법 1
//        List<Document> dbDocuments = mongoClient.listDatabases().into(new ArrayList<>());
//        dbDocuments.forEach(document -> System.out.println(document.toJson()));
//        //방법 2
//        List<String> databases = mongoClient.listDatabaseNames().into(new ArrayList<>());
//        System.out.println(databases);
//    }
}