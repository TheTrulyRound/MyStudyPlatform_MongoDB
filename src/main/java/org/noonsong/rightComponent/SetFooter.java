package org.noonsong.rightComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.mongodb.client.model.Filters.eq;

public class SetFooter {

    public static JPanel footer = new JPanel();
    public static JButton footerBtn = new JButton();

    //rightPanel - footer 부분. String message로 버튼 글자 변경가능
    public SetFooter(String message){
        footer.setBackground(new Color(255, 255, 255));
        footerBtn.setBackground(new Color(238, 241, 244));
        footerBtn.setFont(new Font("굴림", 1, 20));
        footerBtn.setText(message);
        footerBtn.setBorder(null);
        footerBtn.setMaximumSize(new Dimension(350, 50));
        footerBtn.setMinimumSize(new Dimension(350, 50));
        footerBtn.setPreferredSize(new Dimension(350, 50));

        //TODO footerBtn 이벤트 작성 필요
        footerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                footerBtnActionPerformed(evt);
            }
        });

        // 푸터 레이아웃 설정 부분 . 변경 필요없음.
        GroupLayout footerLayout = new GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(footerLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );
    }
    //TODO 테스트 끝내고 관련 코드 지우기
    public static int count ;

    private void footerBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        String footerType = evt.getActionCommand();

        if (footerType.equals("저장하기")) {
            try {
                count += 1;
                System.out.println("db에 저장하는지 테스트하는 임시 코드" + count);
            }
            catch (Exception ex) { System.out.println("서버 접속 실패."); }
        }

            //Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
//            String connectionString = "mongodb+srv://studyplatform:studyplatform@studyplatformcluster.msr51.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
//            try (MongoClient mongoClient = MongoClients.create(connectionString)) {
//                MongoDatabase study_group_info = mongoClient.getDatabase("study_group_info");
//                MongoCollection<Document> groups = study_group_info.getCollection("groups");
//
//                MongoDatabase user_info = mongoClient.getDatabase("user_info");
//                MongoCollection<Document> user_info_col = user_info.getCollection("0");
//
//                // TODO 그룹인포 데이터베이스에 추가
//                Document newStudy = new Document();
//                newStudy.append("title", MakeStudy.studyNameW.getText());
//                newStudy.append("intro", MakeStudy.studyDetailW.getText());
//                newStudy.append("rules", MakeStudy.studyRulesW.getText());
//                newStudy.append("isRecruiting", true);
//                newStudy.append("maxMember", (int)MakeStudy.joinNumberSpinner.getValue());
//                newStudy.append("startingDate", MakeStudy.studyTimeW.getText());
//                newStudy.append("period", MakeStudy.studyDuration);
//                newStudy.append("leader", LoginWindow.userId);
//                newStudy.append("members", Arrays.asList(LoginWindow.userId));
//                newStudy.append("homework", Arrays.asList());
//                groups.insertOne(newStudy);
//
//                // TODO 내 멤버 정보 업데이트
//                Object doc = LoginWindow.userDoc.get("joinedGroup");
//                System.out.println("before: "+doc);
//                ArrayList<String> joinedGroup = (ArrayList<String>) doc;
//
//                joinedGroup.add(MakeStudy.studyNameW.getText());
//                System.out.println("after: "+joinedGroup);
//
//
//                // TODO 새로 생성된 페이지로 바로 가기
//            }
//            catch (Exception ex) { System.out.println("서버 접속 실패."); }
//        }
    }
}