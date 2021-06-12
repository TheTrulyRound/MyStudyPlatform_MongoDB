package org.noonsong;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.noonsong.rightComponent.SetFooter;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

import static com.mongodb.client.model.Filters.eq;

public class StudyGroupDetail extends JDialog {
    //TODO 팝업형식으로 띄울 준비하길, 리팩토링 필요
    JDialog StudyGroupDetailDialog;
    JPanel secondLeftPanel;
    JPanel sdNamePanel;
    JLabel sdName;

    JPanel rightPanel;
    JPanel body;
    JScrollPane bodyPanel;

    JPanel sdImagePanel,studyDetailFirst,studyDetailFirstR, studyDetailSecond;
    JLabel sdImageLabel,joinD,joinDateLabel,joinDateNum,joinDminus,
            joinNowLabel,joinNowNum,defaultProfile,leaderLabel,leaderName;
    JTextArea studyDetailSecondR;

    public StudyGroupDetail(String groupName){
        StudyGroupDetailDialog = new JDialog();
        secondLeftPanel = new JPanel();
        sdNamePanel = new JPanel();
        sdName = new JLabel();
        rightPanel = new JPanel();
        bodyPanel = new JScrollPane();
        body = new JPanel();
        studyDetailFirst = new JPanel();
        studyDetailFirstR = new JPanel();
        leaderLabel = new JLabel();
        defaultProfile = new JLabel();
        leaderName = new JLabel();
        joinNowLabel = new JLabel();
        joinNowNum = new JLabel();
        joinDateLabel = new JLabel();
        joinDateNum = new JLabel();
        joinD = new JLabel();
        joinDminus = new JLabel();
        sdImagePanel = new JPanel();
        sdImageLabel = new JLabel();
        studyDetailSecond = new JPanel();
        studyDetailSecondR = new JTextArea();
        secondLeftPanel = new JPanel();

        String intro = "";
        String leader = "";

        //Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
        String connectionString = "mongodb+srv://studyplatform:studyplatform@studyplatformcluster.msr51.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase study_group_info = mongoClient.getDatabase("study_group_info");
            MongoCollection<Document> study_group_info_col = study_group_info.getCollection("groups");

            MongoDatabase user_info = mongoClient.getDatabase("user_info");
            MongoCollection<Document> user_info_col = user_info.getCollection("0");

            // TODO 이름이 받은 그룹명인 애를 통째로 가져오기
            Document groupInfo = study_group_info_col.find(eq("title", groupName)).first();
            intro = (String) groupInfo.get("intro");
            leader = (String) groupInfo.get("leader");
            System.out.println(intro);

//            // TODO 내 멤버 정보 업데이트
//            Object doc = LoginWindow.userDoc.get("joinedGroup");        // 현재 조인된 그룹의 오브젝트 가져오기
//            ArrayList<String> joinedGroup = (ArrayList<String>) doc;    // 오브젝트 타입 변환
//            joinedGroup.add(MakeStudy.studyNameW.getText());            // 새로 만든 그룹을 리스트에 추가
//            System.out.println(joinedGroup);                            // 소속된 그룹 리스트 출력
//
//            Document new_account_info = new Document();
//            new_account_info.append("username", LoginWindow.userDoc.get("username"));
//            new_account_info.append("password", LoginWindow.userDoc.get("password"));
//            new_account_info.append("email", LoginWindow.userDoc.get("email"));
//            new_account_info.append("joinedGroup", joinedGroup);
//
//            user_info_col.replaceOne(eq("_id", LoginWindow.userDoc.get("_id")), new_account_info);
//            LoginWindow.userDoc = new_account_info;

            // TODO 새로 생성된 페이지로 바로 가기

        }
        catch (Exception ex) { System.out.println("서버 접속 실패."); }

        secondLeftPanel.setBackground(new Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new Dimension(226, 600));

        SetHeaderFirst sdhFirst = new SetHeaderFirst("상세보기");

        GroupLayout headerFirstLayout = new GroupLayout(sdhFirst.headerFirst);
        sdhFirst.headerFirst.setLayout(headerFirstLayout);
        headerFirstLayout.setHorizontalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(sdhFirst.headerFirstLabel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerFirstLayout.setVerticalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(sdhFirst.headerFirstLabel, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addContainerGap())
        );

        sdNamePanel.setBackground(new Color(238, 241, 244));
        sdNamePanel.setMinimumSize(new Dimension(226, 40));

        sdName.setFont(new Font("돋움", 1, 18)); // NOI18N
        sdName.setText(groupName);
        sdName.setMaximumSize(new Dimension(178, 40));
        sdName.setMinimumSize(new Dimension(178, 40));
        sdName.setPreferredSize(new Dimension(178, 40));

        GroupLayout sdNamePanelLayout = new GroupLayout(sdNamePanel);
        sdNamePanel.setLayout(sdNamePanelLayout);
        sdNamePanelLayout.setHorizontalGroup(
                sdNamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, sdNamePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sdName, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addContainerGap())
        );
        sdNamePanelLayout.setVerticalGroup(
                sdNamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sdNamePanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(sdName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(sdhFirst.headerFirst, GroupLayout.PREFERRED_SIZE, 236, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(sdNamePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(sdhFirst.headerLine, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(sdhFirst.headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sdhFirst.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sdNamePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(469, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new Color(255, 255, 255));
        rightPanel.setMinimumSize(new Dimension(716, 600));
        rightPanel.setPreferredSize(new Dimension(716, 600));


        SetFooter fJoin = new SetFooter("가입하기");
        fJoin.footer.setMinimumSize(new Dimension(716, 80));
        fJoin.footer.setBorder(BorderFactory.createEtchedBorder(null,Color.lightGray));
        fJoin.footer.setPreferredSize(new Dimension(716, 80));
        fJoin.footerBtn.setMaximumSize(new Dimension(350, 50));
        fJoin.footerBtn.setMinimumSize(new Dimension(350, 50));
        fJoin.footerBtn.setPreferredSize(new Dimension(350, 50));

        GroupLayout footerLayout = new GroupLayout(fJoin.footer);
        fJoin.footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(footerLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(fJoin.footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(fJoin.footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );

        bodyPanel.setBackground(new Color(255, 255, 255));
        bodyPanel.setBorder(null);
        bodyPanel.setForeground(new Color(255, 255, 255));
        bodyPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        bodyPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        bodyPanel.setHorizontalScrollBar(null);
        bodyPanel.setMinimumSize(new Dimension(716, 480));
        bodyPanel.setPreferredSize(new Dimension(716, 480));

        body.setBackground(new Color(255, 255, 255));
        body.setMinimumSize(new Dimension(716, 512));
        body.setPreferredSize(new Dimension(716, 512));

        studyDetailFirst.setBackground(new Color(255, 255, 255));
        studyDetailFirst.setMinimumSize(new Dimension(665, 100));

        studyDetailFirstR.setBackground(new Color(255, 255, 255));

        leaderLabel.setBackground(new Color(255, 255, 255));
        leaderLabel.setFont(new Font("돋움", 1, 24)); // NOI18N
        leaderLabel.setText("방장 : ");
        leaderLabel.setMaximumSize(new Dimension(257, 25));
        leaderLabel.setMinimumSize(new Dimension(257, 25));
        leaderLabel.setPreferredSize(new Dimension(257, 25));

        defaultProfile.setBackground(new Color(255, 255, 255));
//        defaultProfile.setIcon(new ImageIcon(getClass().getResource("/front/img/profile_circle.png"))); // NOI18N
        defaultProfile.setIcon(new ImageIcon("src/img/profile_circle.png")); // NOI18N
        defaultProfile.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        defaultProfile.setDoubleBuffered(true);
        defaultProfile.setMaximumSize(new Dimension(35, 35));
        defaultProfile.setMinimumSize(new Dimension(35, 35));
        defaultProfile.setPreferredSize(new Dimension(35, 35));

        leaderName.setBackground(new Color(255, 255, 255));
        leaderName.setFont(new Font("돋움", 0, 18)); // NOI18N
        leaderName.setText(leader);

        joinNowLabel.setBackground(new Color(255, 255, 255));
        joinNowLabel.setFont(new Font("돋움", 1, 24)); // NOI18N
        joinNowLabel.setText("모집현황 : ");
        joinNowLabel.setMaximumSize(new Dimension(257, 25));
        joinNowLabel.setMinimumSize(new Dimension(257, 25));
        joinNowLabel.setPreferredSize(new Dimension(257, 25));

        joinNowNum.setBackground(new Color(255, 255, 255));
        joinNowNum.setFont(new Font("돋움", 0, 18)); // NOI18N
        joinNowNum.setText("15/30");
        joinNowNum.setHorizontalTextPosition(SwingConstants.CENTER);

        joinDateLabel.setBackground(new Color(255, 255, 255));
        joinDateLabel.setFont(new Font("돋움", 1, 24)); // NOI18N
        joinDateLabel.setText("모집마감일 :");
        joinDateLabel.setMaximumSize(new Dimension(257, 25));
        joinDateLabel.setMinimumSize(new Dimension(257, 25));
        joinDateLabel.setPreferredSize(new Dimension(257, 25));

        joinDateNum.setBackground(new Color(255, 255, 255));
        joinDateNum.setFont(new Font("돋움", 10, 8)); // NOI18N
        joinDateNum.setText("5");
        joinDateNum.setHorizontalTextPosition(SwingConstants.CENTER);

        joinD.setBackground(new Color(255, 255, 255));
        joinD.setFont(new Font("돋움", 0, 18)); // NOI18N
        joinD.setText("D");
        joinD.setHorizontalTextPosition(SwingConstants.CENTER);

        joinDminus.setBackground(new Color(255, 255, 255));
        joinDminus.setFont(new Font("돋움", 0, 18)); // NOI18N
        joinDminus.setText("-");
        joinDminus.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout studyDetailFirstRLayout = new GroupLayout(studyDetailFirstR);
        studyDetailFirstR.setLayout(studyDetailFirstRLayout);
        studyDetailFirstRLayout.setHorizontalGroup(
                studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyDetailFirstRLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(studyDetailFirstRLayout.createSequentialGroup()
                                                .addComponent(leaderLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(defaultProfile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(leaderName))
                                        .addGroup(GroupLayout.Alignment.TRAILING, studyDetailFirstRLayout.createSequentialGroup()
                                                .addGroup(studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(joinNowLabel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(joinDateLabel, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(studyDetailFirstRLayout.createSequentialGroup()
                                                                .addComponent(joinD)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(joinDminus)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(joinDateNum))
                                                        .addComponent(joinNowNum))))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        studyDetailFirstRLayout.setVerticalGroup(
                studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, studyDetailFirstRLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(leaderName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(defaultProfile, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(leaderLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(joinNowNum, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(joinNowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(studyDetailFirstRLayout.createSequentialGroup()
                                                .addGroup(studyDetailFirstRLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(joinDateNum, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(joinD, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(joinDminus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(63, 63, 63))
                                        .addGroup(studyDetailFirstRLayout.createSequentialGroup()
                                                .addComponent(joinDateLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        sdImagePanel.setBackground(new Color(255, 255, 255));

//        sdImageLabel.setIcon(new ImageIcon(getClass().getResource("/front/img/dev_group.jpg"))); // NOI18N
        sdImageLabel.setIcon(new ImageIcon("src/img/dev_group.jpg")); // NOI18N
        sdImageLabel.setText("개발그룹 대표이미지 대체 텍스트");
        sdImageLabel.setMaximumSize(new Dimension(219, 80));
        sdImageLabel.setMinimumSize(new Dimension(219, 80));
        sdImageLabel.setPreferredSize(new Dimension(219, 80));

        GroupLayout sdImagePanelLayout = new GroupLayout(sdImagePanel);
        sdImagePanel.setLayout(sdImagePanelLayout);
        sdImagePanelLayout.setHorizontalGroup(
                sdImagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, sdImagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sdImageLabel, GroupLayout.PREFERRED_SIZE, 199, Short.MAX_VALUE)
                                .addContainerGap())
        );
        sdImagePanelLayout.setVerticalGroup(
                sdImagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, sdImagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sdImageLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout studyDetailFirstLayout = new GroupLayout(studyDetailFirst);
        studyDetailFirst.setLayout(studyDetailFirstLayout);
        studyDetailFirstLayout.setHorizontalGroup(
                studyDetailFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, studyDetailFirstLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(sdImagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(studyDetailFirstR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
        );
        studyDetailFirstLayout.setVerticalGroup(
                studyDetailFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, studyDetailFirstLayout.createSequentialGroup()
                                .addContainerGap(62, Short.MAX_VALUE)
                                .addGroup(studyDetailFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(studyDetailFirstR, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sdImagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
        );

        studyDetailSecond.setBackground(new Color(255, 255, 255));

        studyDetailSecondR.setEditable(false);
        studyDetailSecondR.setColumns(20);
        studyDetailSecondR.setFont(new Font("돋움", 1, 14)); // NOI18N
        studyDetailSecondR.setLineWrap(true);
        studyDetailSecondR.setRows(5);
        studyDetailSecondR.setText(intro);

        GroupLayout studyDetailSecondLayout = new GroupLayout(studyDetailSecond);
        studyDetailSecond.setLayout(studyDetailSecondLayout);
        studyDetailSecondLayout.setHorizontalGroup(
                studyDetailSecondLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, studyDetailSecondLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studyDetailSecondR, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        studyDetailSecondLayout.setVerticalGroup(
                studyDetailSecondLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, studyDetailSecondLayout.createSequentialGroup()
                                .addGap(0, 26, Short.MAX_VALUE)
                                .addComponent(studyDetailSecondR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout bodyLayout = new GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(bodyLayout.createSequentialGroup()
                                                .addComponent(studyDetailFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))
                                        .addGroup(bodyLayout.createSequentialGroup()
                                                .addComponent(studyDetailSecond, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        bodyLayout.setVerticalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(studyDetailFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studyDetailSecond, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(126, Short.MAX_VALUE))
        );

        bodyPanel.setViewportView(body);

        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(fJoin.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(bodyPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bodyPanel, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fJoin.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout StudyGroupDetailDialogLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(StudyGroupDetailDialogLayout);
        StudyGroupDetailDialogLayout.setHorizontalGroup(
                StudyGroupDetailDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 992, Short.MAX_VALUE)
                        .addGroup(StudyGroupDetailDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(StudyGroupDetailDialogLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        StudyGroupDetailDialogLayout.setVerticalGroup(
                StudyGroupDetailDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 641, Short.MAX_VALUE)
                        .addGroup(StudyGroupDetailDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(StudyGroupDetailDialogLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(StudyGroupDetailDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setBackground(new Color(255, 255, 255));
        setBounds(new Rectangle(0, 0, 0, 0));
        setMinimumSize(new Dimension(958, 600));
        setName("GroupForm"); // NOI8N
        setSize(new Dimension(958, 600));
        setVisible(true);
        pack();

    }
}
