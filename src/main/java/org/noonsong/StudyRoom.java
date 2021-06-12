package org.noonsong;

import org.noonsong.firstLeftComponent.*;
import org.noonsong.rightComponent.SetStudyRoom;
import org.noonsong.secondLeftComponent.*;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout;


public class StudyRoom extends JPanel {
    public static SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
    public static JPanel secondLeftPanel = new JPanel();
    //    public static SetSecondLeftPanel secondLeft = new SetSecondLeftPanel();
//    public static SetStudyRoom right = new SetStudyRoom();
    public static JScrollPane announcePanel = new javax.swing.JScrollPane();
    public static JList announceList = new javax.swing.JList<>();
    public static JLabel announceLabel = new javax.swing.JLabel();
    public static JLabel hwLabel = new javax.swing.JLabel();
    public static JScrollPane hwPanel = new javax.swing.JScrollPane();
    public static JList hwList = new javax.swing.JList<>();
    public static JLabel talkChannelLabel = new javax.swing.JLabel();
    public static JScrollPane talkChannelPanel = new javax.swing.JScrollPane();
    public static JList talkChannelList = new javax.swing.JList<>();
    public static JPanel rightPanel = new javax.swing.JPanel();
    public static JPanel bodyHeader = new javax.swing.JPanel();
    public static JLabel bodyHeaderFixIcon = new javax.swing.JLabel();
    public static JLabel bodyHeaderLabel = new javax.swing.JLabel();
    public static JPanel memberPanel = new javax.swing.JPanel();
    public static JScrollPane memberYesPanel = new javax.swing.JScrollPane();
    public static JList memberYesList = new javax.swing.JList<>();
    public static JLabel memberFixedLabel = new javax.swing.JLabel();
    public static JLabel memberPerLabel = new javax.swing.JLabel();
    public static JLabel memberYesLabel = new javax.swing.JLabel();
    public static JScrollPane memberNoPanel = new javax.swing.JScrollPane();
    public static JList memberNoList = new javax.swing.JList<>();
    public static JLabel memberNoLabel = new javax.swing.JLabel();

    public static JPanel footer = new javax.swing.JPanel();
    public static JButton uploadStudyResult = new javax.swing.JButton();
    public static JScrollPane bodyPanel = new javax.swing.JScrollPane();
    public static JPanel body = new javax.swing.JPanel();
    public static JPanel StudyResultPanel = new javax.swing.JPanel();
    public static JLabel studyResultTitle = new javax.swing.JLabel();
    public static JLabel studyResultDate = new javax.swing.JLabel();
    public static JButton studyResultMoreBtn = new javax.swing.JButton();
    public static JPanel StudyResultPanel1 = new javax.swing.JPanel();
    public static JLabel studyResultTitle1 = new javax.swing.JLabel();
    public static JLabel studyResultDate1= new javax.swing.JLabel();
    public static JButton studyResultMoreBtn1= new javax.swing.JButton();

    //TODO 그룹 스터디 네임 변수명과 연결
    public SetHeaderFirst hRoom = new SetHeaderFirst("스터디룸");

    public StudyRoom(String groupName) {
        setMinimumSize(new Dimension(1030, 600));
        initComponents();
        setVisible(true);
        Background.mainFrame.pack();
    }

    public void initComponents() {

        secondLeftPanel.setBackground(new java.awt.Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new java.awt.Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new java.awt.Dimension(242, 600));

        announceLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        announceLabel.setText("공지");

        hwLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        hwLabel.setText("과제함");

        talkChannelLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        talkChannelLabel.setText("대화");

// TODO DB연결해야하는 요소1 - announceList
        announceList.setBackground(new java.awt.Color(238, 241, 244));
        announceList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        announceList.setFont(new java.awt.Font("돋움", 0, 20)); // NOI18N
        announceList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "# 주간알림" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        announceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        announceList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        announcePanel.setViewportView(announceList);

// TODO DB연결해야하는 요소2 - hwList
        hwList.setBackground(new java.awt.Color(238, 241, 244));
        hwList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hwList.setFont(new java.awt.Font("돋움", 0, 20)); // NOI18N
        hwList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "# 1주차 과제함", "# 2주차 과제함", "# 3주차 과제함" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        hwList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        hwList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hwPanel.setViewportView(hwList);


// TODO DB연결해야하는 요소3 - announceList
        talkChannelList.setBackground(new java.awt.Color(238, 241, 244));
        talkChannelList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        talkChannelList.setFont(new java.awt.Font("돋움", 0, 20)); // NOI18N
        talkChannelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "# 질문과 답변", "# 잡담" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        talkChannelList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        talkChannelList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        talkChannelPanel.setViewportView(talkChannelList);

        javax.swing.GroupLayout secondLeftPanelLayout = new javax.swing.GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hRoom.headerFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hRoom.headerLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(secondLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(announcePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(announceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hwPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hwLabel)
                                        .addComponent(talkChannelLabel)
                                        .addComponent(talkChannelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(hRoom.headerFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hRoom.headerLine, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(announceLabel)
                                .addGap(10, 10, 10)
                                .addComponent(announcePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(hwLabel)
                                .addGap(10, 10, 10)
                                .addComponent(hwPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(talkChannelLabel)
                                .addGap(10, 10, 10)
                                .addComponent(talkChannelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(123, Short.MAX_VALUE))
        );
// TODO rightPanel 상속
        this.setBackground(new java.awt.Color(255, 255, 255));
        this.setMinimumSize(new java.awt.Dimension(716, 600));
        this.setPreferredSize(new java.awt.Dimension(716, 600));

        bodyHeader.setBackground(new java.awt.Color(255, 255, 255));
        bodyHeader.setPreferredSize(new java.awt.Dimension(716, 81));

        bodyHeaderFixIcon.setFont(new java.awt.Font("돋움", 1, 30)); // NOI18N
        bodyHeaderFixIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bodyHeaderFixIcon.setText("#");

        bodyHeaderLabel.setFont(new java.awt.Font("돋움", 1, 30)); // NOI18N
        bodyHeaderLabel.setText("1주차 과제함");

        javax.swing.GroupLayout bodyHeaderLayout = new javax.swing.GroupLayout(bodyHeader);
        bodyHeader.setLayout(bodyHeaderLayout);
        bodyHeaderLayout.setHorizontalGroup(
                bodyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyHeaderLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(bodyHeaderFixIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bodyHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyHeaderLayout.setVerticalGroup(
                bodyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyHeaderLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(bodyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bodyHeaderFixIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                        .addComponent(bodyHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        memberPanel.setBackground(new java.awt.Color(238, 241, 244));

        memberYesList.setBackground(new java.awt.Color(238, 241, 244));
        memberYesList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memberYesList.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        memberYesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "김스터디", "이스터디", "강스터디", "최스터디" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        memberYesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        memberYesList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        memberYesList.setEnabled(false);
        memberYesList.setFocusable(false);
        memberYesPanel.setViewportView(memberYesList);

        memberFixedLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        memberFixedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberFixedLabel.setText("제출현황");

        memberPerLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        memberPerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberPerLabel.setText("50%");

        memberYesLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        memberYesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberYesLabel.setText("제출");

        memberNoList.setBackground(new java.awt.Color(238, 241, 244));
        memberNoList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memberNoList.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        memberNoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "김민지", "김남희" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        memberNoList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        memberNoList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        memberNoList.setEnabled(false);
        memberNoList.setFocusable(false);
        memberNoPanel.setViewportView(memberNoList);

        memberNoLabel.setFont(new java.awt.Font("돋움", 1, 20)); // NOI18N
        memberNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberNoLabel.setText("미제출");

        javax.swing.GroupLayout memberPanelLayout = new javax.swing.GroupLayout(memberPanel);
        memberPanel.setLayout(memberPanelLayout);
        memberPanelLayout.setHorizontalGroup(
                memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(memberPanelLayout.createSequentialGroup()
                                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(memberYesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberFixedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberPerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberYesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberNoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(memberNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 43, Short.MAX_VALUE))
        );
        memberPanelLayout.setVerticalGroup(
                memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(memberPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(memberFixedLabel)
                                .addGap(10, 10, 10)
                                .addComponent(memberPerLabel)
                                .addGap(56, 56, 56)
                                .addComponent(memberYesLabel)
                                .addGap(10, 10, 10)
                                .addComponent(memberYesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberNoLabel)
                                .addGap(10, 10, 10)
                                .addComponent(memberNoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );

        footer.setBackground(new java.awt.Color(255, 255, 255));

        uploadStudyResult.setBackground(new java.awt.Color(238, 241, 244));
        uploadStudyResult.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        uploadStudyResult.setText("과제 작성 하기");
        uploadStudyResult.setBorder(null);
        uploadStudyResult.setMaximumSize(new java.awt.Dimension(350, 50));
        uploadStudyResult.setMinimumSize(new java.awt.Dimension(350, 50));
        uploadStudyResult.setPreferredSize(new java.awt.Dimension(350, 50));
        uploadStudyResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadStudyResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
                footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(footerLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(uploadStudyResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
                footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(uploadStudyResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );

        bodyPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        bodyPanel.setMaximumSize(new java.awt.Dimension(523, 754));
        bodyPanel.setMinimumSize(new java.awt.Dimension(523, 754));
        bodyPanel.setName(""); // NOI18N

        body.setBackground(new java.awt.Color(255, 255, 255));

        StudyResultPanel.setBackground(new java.awt.Color(255, 255, 255));
        StudyResultPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        studyResultTitle.setFont(new java.awt.Font("돋움", 1, 18)); // NOI18N
        studyResultTitle.setText("김스터디 1주차 과제입니다. ");

        studyResultDate.setFont(new java.awt.Font("돋움", 0, 10)); // NOI18N
        studyResultDate.setText("2021-05-05  22:55");

        studyResultMoreBtn.setBackground(new java.awt.Color(238, 241, 244));
        studyResultMoreBtn.setFont(new java.awt.Font("돋움", 1, 11)); // NOI18N
        studyResultMoreBtn.setText("더보기");
        studyResultMoreBtn.setBorder(null);
        studyResultMoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyResultMoreBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudyResultPanelLayout = new javax.swing.GroupLayout(StudyResultPanel);
        StudyResultPanel.setLayout(StudyResultPanelLayout);
        StudyResultPanelLayout.setHorizontalGroup(
                StudyResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudyResultPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(StudyResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(studyResultTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyResultDate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(studyResultMoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );
        StudyResultPanelLayout.setVerticalGroup(
                StudyResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudyResultPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(studyResultTitle)
                                .addGap(17, 17, 17)
                                .addComponent(studyResultDate)
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudyResultPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studyResultMoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );

        StudyResultPanel1.setBackground(new java.awt.Color(255, 255, 255));
        StudyResultPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        studyResultTitle1.setFont(new java.awt.Font("돋움", 1, 18)); // NOI18N
        studyResultTitle1.setText("최스터디 1주차 과제입니다. ");

        studyResultDate1.setFont(new java.awt.Font("돋움", 0, 10)); // NOI18N
        studyResultDate1.setText("2021-05-05  22:55");


        javax.swing.GroupLayout StudyResultPanel1Layout = new javax.swing.GroupLayout(StudyResultPanel1);
        StudyResultPanel1.setLayout(StudyResultPanel1Layout);
        StudyResultPanel1Layout.setHorizontalGroup(
                StudyResultPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudyResultPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(StudyResultPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(studyResultTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyResultDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(studyResultMoreBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );
        StudyResultPanel1Layout.setVerticalGroup(
                StudyResultPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudyResultPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(studyResultTitle1)
                                .addGap(17, 17, 17)
                                .addComponent(studyResultDate1)
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudyResultPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studyResultMoreBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );



        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
                bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(StudyResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(StudyResultPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                )
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
                bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(StudyResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(StudyResultPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32).addGap(32, 32, 32)
                                .addContainerGap(256, Short.MAX_VALUE))
        );
        bodyPanel.setViewportView(body);

//TODO rightPanel 상속 받기 JPanel
        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(this);
        this.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bodyHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 0, 0)
                                                .addComponent(memberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(bodyHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(memberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

    }

    private void uploadStudyResultActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void studyResultMoreBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


}