package org.noonsong;

import org.noonsong.firstLeftComponent.SetFirstLeftPanel;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Background extends JFrame {
    public static JFrame mainFrame = new JFrame();
    public static SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
    public static JPanel secondLeftPanel = new JPanel();
    public static JPanel rightPanel = new JPanel();
    public static SetHeaderFirst hFirst = new SetHeaderFirst("마이 페이지");
    public static int count;
    public static JSeparator hLine = new JSeparator();

    public Background() {
        mainFrame.setTitle("눈송보드");
        initComponents();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setMinimumSize(new Dimension(1030, 600));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.pack();
    }

    public void initComponents() {
        count += 1;
        System.out.println("BackGround 이니셜라이저 실행: " + count);


        //두번째 패널 레이아웃 건들필요없음.
//        SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
        secondLeftPanel.setBackground(new Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new Dimension(242, 600));

        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(hFirst.headerFirst, GroupLayout.PREFERRED_SIZE, 232, Short.MAX_VALUE)
                                        .addComponent(hFirst.headerLine, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                                .addGap(0, 6, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(hFirst.headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hFirst.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addContainerGap(450, Short.MAX_VALUE))
        );
        allLayout(rightPanel);
        //TODO myPage 노출된 상태에서 setFirstLeft클래스에서 패널 지워지고 변경가능하게 만들기
        //  allLayout(Mypage.rightPanel);

    }
    public static void allLayout(JPanel rightPanel){

        GroupLayout layout = new GroupLayout(mainFrame.getContentPane());
        mainFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(firstLeft.firstLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(secondLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
//                                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(firstLeft.firstLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(secondLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
    }

//    public static void secondLeftLayout(JPanel hPanel){
//        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
//        secondLeftPanel.setLayout(secondLeftPanelLayout);
//        secondLeftPanelLayout.setHorizontalGroup(
//                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
//                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addComponent(hPanel, GroupLayout.PREFERRED_SIZE, 232, Short.MAX_VALUE)
//                                        .addComponent(hFirst.headerLine, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
//                                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
//                                                .addGap(0, 6, Short.MAX_VALUE)))
//                                .addContainerGap())
//        );
//        secondLeftPanelLayout.setVerticalGroup(
//                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
//                                .addGap(0, 0, 0)
//                                .addComponent(hPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(hFirst.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                                .addContainerGap(450, Short.MAX_VALUE))
//        );
//    }
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
    public static void main(String args[]) {
        new Background();
    }

}