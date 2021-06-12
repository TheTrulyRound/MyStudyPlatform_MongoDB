package org.noonsong;

import org.noonsong.firstLeftComponent.SetFirstLeftPanel;
import org.noonsong.rightComponent.SetFooter;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO 요소들 분리하기
public class MakeStudy extends JPanel {

    public static SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
    public static JPanel secondLeftPanel = new JPanel();
    //    public static JPanel rightPanel = new JPanel();
    JPanel loadTxtPanel, body, studyName, studyRule, studyTime, joinNumber, studyDetail;
    JLabel loaderTxt, studyNameIs, studyRulesAre, studyTimeIs,
            studyTimeLabel, studyDurationLabel, joinNumberIs, joinNumberLabel, studyDetailIs;
    Label loadingEmoji;
    public static JSpinner joinNumberSpinner;
    public static JTextField studyNameW, studyTimeW;
    public static JTextArea studyRulesW, studyDetailW;
    JScrollPane bodyPanel, studyRulesWPanel, studyDetailWPanel;
    JRadioButton duration_4, duration_6, duration_8;
    ButtonGroup durationGroup;

    public static int count;

    public MakeStudy() {
        initComponents();
//        setMinimumSize(new Dimension(1030, 600));
        setMinimumSize(new Dimension(716, 600));
        setVisible(true);
//        setTitle("눈송보드 > 그룹 만들기");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        pack();
    }

    public void initComponents() {
        count += 1;
        System.out.println("MakeStudy 이니셜라이저 실행: " + count);

        loadTxtPanel = new JPanel();
        loaderTxt = new JLabel();
        loadingEmoji = new Label();
        bodyPanel = new JScrollPane();
        body = new JPanel();
        studyName = new JPanel();
        studyNameIs = new JLabel();
        studyNameW = new JTextField();
        studyRule = new JPanel();
        studyRulesAre = new JLabel();
        studyRulesWPanel = new JScrollPane();
        studyRulesW = new JTextArea();
        studyTime = new JPanel();
        studyTimeIs = new JLabel();
        studyTimeW = new JTextField();
        studyTimeLabel = new JLabel();
        studyDurationLabel = new JLabel();
        duration_4 = new JRadioButton();
        duration_6 = new JRadioButton();
        duration_8 = new JRadioButton();
        joinNumber = new JPanel();
        joinNumberIs = new JLabel();
        joinNumberLabel = new JLabel();
        joinNumberSpinner = new JSpinner();
        studyDetail = new JPanel();
        studyDetailIs = new JLabel();
        studyDetailWPanel = new JScrollPane();
        studyDetailW = new JTextArea();
        durationGroup = new ButtonGroup();

        SetHeaderFirst hMake = new SetHeaderFirst("그룹 만들기");

        loadTxtPanel.setBackground(new Color(238, 241, 244));
        loadTxtPanel.setMinimumSize(new Dimension(226, 40));
        loadTxtPanel.setPreferredSize(new Dimension(226, 40));

        loaderTxt.setFont(new Font("돋움", 1, 18)); // NOI18N
        loaderTxt.setText("스터디 그룹 생성 중");
        loaderTxt.setMaximumSize(new Dimension(178, 40));
        loaderTxt.setMinimumSize(new Dimension(178, 40));
        loaderTxt.setPreferredSize(new Dimension(178, 40));

        loadingEmoji.setAlignment(Label.CENTER);
        loadingEmoji.setFont(new Font("돋움", 1, 18)); // NOI18N
        loadingEmoji.setPreferredSize(new Dimension(32, 32));
        loadingEmoji.setText("...");

        GroupLayout loadTxtPanelLayout = new GroupLayout(loadTxtPanel);
        loadTxtPanel.setLayout(loadTxtPanelLayout);
        loadTxtPanelLayout.setHorizontalGroup(
                loadTxtPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(loadTxtPanelLayout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(loadingEmoji, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(loaderTxt, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        loadTxtPanelLayout.setVerticalGroup(
                loadTxtPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(loadTxtPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(loadTxtPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(loadTxtPanelLayout.createSequentialGroup()
                                                .addComponent(loadingEmoji, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(loaderTxt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(hMake.headerFirst, GroupLayout.PREFERRED_SIZE, 232, Short.MAX_VALUE)
                                        .addComponent(hMake.headerLine, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)
                                                .addComponent(loadTxtPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(hMake.headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hMake.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loadTxtPanel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(450, Short.MAX_VALUE))
        );


        SetFooter fSave = new SetFooter("저장하기");
        fSave.footer.setMinimumSize(new Dimension(716, 80));
        fSave.footer.setBorder(BorderFactory.createEtchedBorder(null, Color.lightGray));
        fSave.footer.setPreferredSize(new Dimension(716, 80));
        fSave.footerBtn.setMaximumSize(new Dimension(350, 50));
        fSave.footerBtn.setMinimumSize(new Dimension(350, 50));
        fSave.footerBtn.setPreferredSize(new Dimension(350, 50));


        GroupLayout footerLayout = new GroupLayout(fSave.footer);
        fSave.footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(footerLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(fSave.footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(183, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(fSave.footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );


        bodyPanel.setBackground(new Color(255, 255, 255));
        bodyPanel.setBorder(null);
        bodyPanel.setForeground(new Color(255, 255, 255));
        bodyPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        bodyPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        bodyPanel.setHorizontalScrollBar(null);
        bodyPanel.setMinimumSize(new Dimension(716, 520));
        bodyPanel.setPreferredSize(new Dimension(716, 520));

        body.setBackground(new Color(255, 255, 255));
        body.setMinimumSize(new Dimension(716, 900));
        body.setPreferredSize(new Dimension(716, 900));

        studyName.setBackground(new Color(255, 255, 255));
        studyName.setMinimumSize(new Dimension(665, 100));
        studyName.setPreferredSize(new Dimension(665, 100));

        studyNameIs.setFont(new Font("돋움", 1, 24)); // NOI18N
        studyNameIs.setText("1. 스터디 그룹 이름을 입력해주세요.");
        studyNameIs.setMaximumSize(new Dimension(257, 25));
        studyNameIs.setMinimumSize(new Dimension(257, 25));
        studyNameIs.setPreferredSize(new Dimension(257, 25));

        studyNameW.setFont(new Font("돋움", 0, 14)); // NOI18N
        studyNameW.setText("예) 자바 한달 토이 프로젝트 팀");


        GroupLayout studyNameLayout = new GroupLayout(studyName);
        studyName.setLayout(studyNameLayout);
        studyNameLayout.setHorizontalGroup(
                studyNameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyNameLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(studyNameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(studyNameIs, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyNameW, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(116, Short.MAX_VALUE))
        );
        studyNameLayout.setVerticalGroup(
                studyNameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyNameLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(studyNameIs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(studyNameW, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
        );

        studyRule.setBackground(new Color(255, 255, 255));
        studyRule.setMinimumSize(new Dimension(665, 100));

        studyRulesAre.setFont(new Font("돋움", 1, 24)); // NOI18N
        studyRulesAre.setText("2. 스터디 그룹 규칙을 입력해주세요.");
        studyRulesAre.setMaximumSize(new Dimension(257, 25));
        studyRulesAre.setMinimumSize(new Dimension(257, 25));
        studyRulesAre.setPreferredSize(new Dimension(257, 25));

        studyRulesW.setColumns(20);
        studyRulesW.setRows(5);
        studyRulesW.setPreferredSize(new Dimension(203, 74));
        studyRulesWPanel.setViewportView(studyRulesW);

        GroupLayout studyRuleLayout = new GroupLayout(studyRule);
        studyRule.setLayout(studyRuleLayout);
        studyRuleLayout.setHorizontalGroup(
                studyRuleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyRuleLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(studyRuleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(studyRulesAre, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyRulesWPanel, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(175, Short.MAX_VALUE))
        );
        studyRuleLayout.setVerticalGroup(
                studyRuleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyRuleLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(studyRulesAre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studyRulesWPanel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        studyTime.setBackground(new Color(255, 255, 255));
        studyTime.setMinimumSize(new Dimension(665, 100));

        studyTimeIs.setFont(new Font("돋움", 1, 24)); // NOI18N
        studyTimeIs.setText("3. 스터디 기간을 입력해주세요.");
        studyTimeIs.setMaximumSize(new Dimension(257, 25));
        studyTimeIs.setMinimumSize(new Dimension(257, 25));
        studyTimeIs.setPreferredSize(new Dimension(257, 25));

        studyTimeW.setFont(new Font("돋움", 0, 11)); // NOI18N
        studyTimeW.setText("예 ) 2021.06.21");   //


        studyTimeLabel.setFont(new Font("돋움", 1, 14)); // NOI18N
        studyTimeLabel.setText("스터디 시작일");

        studyDurationLabel.setFont(new Font("돋움", 1, 14)); // NOI18N
        studyDurationLabel.setText("스터디 기간");

        //TODO 스터디 기간 선택 라디오 버튼 모듈화하기 . 하나만 선택되도록 설정 필요 - 해결
        duration_4.setBackground(new Color(255, 255, 255));
        duration_4.setFont(new Font("돋움", 0, 11)); // NOI18N
        duration_4.setText("4주");
        duration_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                durationRadioActionPerformed(evt);
            }
        });
        durationGroup.add(duration_4);

        duration_6.setBackground(new Color(255, 255, 255));
        duration_6.setFont(new Font("돋움", 0, 11)); // NOI18N
        duration_6.setText("6주");
        duration_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                durationRadioActionPerformed(evt);
            }
        });
        durationGroup.add(duration_6);

        duration_8.setBackground(new Color(255, 255, 255));
        duration_8.setFont(new Font("돋움", 0, 11)); // NOI18N
        duration_8.setText("8주");
        duration_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                durationRadioActionPerformed(evt);
            }
        });
        durationGroup.add(duration_8);

        GroupLayout studyTimeLayout = new GroupLayout(studyTime);
        studyTime.setLayout(studyTimeLayout);
        studyTimeLayout.setHorizontalGroup(
                studyTimeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyTimeLayout.createSequentialGroup()
                                .addGroup(studyTimeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(studyTimeLayout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(studyTimeIs, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(studyTimeLayout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addGroup(studyTimeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(studyTimeLabel)
                                                        .addComponent(studyDurationLabel))
                                                .addGap(40, 40, 40)
                                                .addGroup(studyTimeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(studyTimeW, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(studyTimeLayout.createSequentialGroup()
                                                                .addComponent(duration_4, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(duration_6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(duration_8, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(127, Short.MAX_VALUE))
        );
        studyTimeLayout.setVerticalGroup(
                studyTimeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyTimeLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(studyTimeIs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(studyTimeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(studyTimeW, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyTimeLabel))
                                .addGap(18, 18, 18)
                                .addGroup(studyTimeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(studyDurationLabel)
                                        .addComponent(duration_4)
                                        .addComponent(duration_6)
                                        .addComponent(duration_8))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        joinNumber.setBackground(new Color(255, 255, 255));
        joinNumber.setMinimumSize(new Dimension(716, 100));

        joinNumberIs.setFont(new Font("돋움", 1, 24)); // NOI18N
        joinNumberIs.setText("4. 스터디 그룹 모집 인원을 입력해주세요.");
        joinNumberIs.setMaximumSize(new Dimension(257, 25));
        joinNumberIs.setMinimumSize(new Dimension(257, 25));
        joinNumberIs.setPreferredSize(new Dimension(257, 25));

        joinNumberLabel.setFont(new Font("돋움", 1, 14)); // NOI18N
        joinNumberLabel.setText("모집 인원 수");

        GroupLayout joinNumberLayout = new GroupLayout(joinNumber);
        joinNumber.setLayout(joinNumberLayout);
        joinNumberLayout.setHorizontalGroup(
                joinNumberLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(joinNumberLayout.createSequentialGroup()
                                .addGroup(joinNumberLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(joinNumberLayout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(joinNumberLabel)
                                                .addGap(56, 56, 56)
                                                .addComponent(joinNumberSpinner, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(joinNumberLayout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(joinNumberIs, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(127, Short.MAX_VALUE))
        );
        joinNumberLayout.setVerticalGroup(
                joinNumberLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(joinNumberLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(joinNumberIs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(joinNumberLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(joinNumberLabel)
                                        .addComponent(joinNumberSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        studyDetail.setBackground(new Color(255, 255, 255));
        studyDetail.setMinimumSize(new Dimension(716, 100));

        studyDetailIs.setFont(new Font("돋움", 1, 24)); // NOI18N
        studyDetailIs.setText("5. 스터디 그룹 소개글을 입력해주세요.");
        studyDetailIs.setMaximumSize(new Dimension(257, 25));
        studyDetailIs.setMinimumSize(new Dimension(257, 25));
        studyDetailIs.setPreferredSize(new Dimension(257, 25));

        studyDetailW.setColumns(20);
        studyDetailW.setRows(5);
        studyDetailW.setPreferredSize(new Dimension(203, 74));
        studyDetailWPanel.setViewportView(studyDetailW);

        GroupLayout studyDetailLayout = new GroupLayout(studyDetail);
        studyDetail.setLayout(studyDetailLayout);
        studyDetailLayout.setHorizontalGroup(
                studyDetailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyDetailLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(studyDetailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(studyDetailIs, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyDetailWPanel, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(127, Short.MAX_VALUE))
        );
        studyDetailLayout.setVerticalGroup(
                studyDetailLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyDetailLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(studyDetailIs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studyDetailWPanel, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        GroupLayout bodyLayout = new GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(studyName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyRule, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(joinNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyDetail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        );
        bodyLayout.setVerticalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(studyName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(studyRule, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(studyTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(joinNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studyDetail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        bodyPanel.setViewportView(body);

        GroupLayout rightPanelLayout = new GroupLayout(this);
        this.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 716, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(bodyPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(fSave.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                )
                                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(bodyPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(fSave.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );


//        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
//        rightPanel.setLayout(rightPanelLayout);
//        rightPanelLayout.setHorizontalGroup(
//                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGap(0, 716, Short.MAX_VALUE)
//                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
//                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
//                                        .addComponent(bodyPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                        .addGroup(rightPanelLayout.createSequentialGroup()
//                                                .addGap(0, 0, Short.MAX_VALUE)
//                                                .addComponent(fSave.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                                )
//                                .addContainerGap())
//        );
//        rightPanelLayout.setVerticalGroup(
//                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGap(0, 600, Short.MAX_VALUE)
//                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
//                                .addGap(0, 0, 0)
//                                .addComponent(bodyPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addGap(0, 0, 0)
//                                .addComponent(fSave.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addGap(0, 0, 0))
//        );

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

    public static int studyDuration;

    private void durationRadioActionPerformed(ActionEvent evt) {
        // TODO add your handling code here: 필요없음
        String duration = evt.getActionCommand();

        if (duration.equals("4주")) {
            studyDuration = 4;
        } else if (duration.equals("6주")) {
            studyDuration = 6;
        } else if (duration.equals("8주")) {
            studyDuration = 8;
        }
    }
}