package org.noonsong;

import org.noonsong.firstLeftComponent.SetFirstLeftPanel;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Background extends JFrame {
    public static JFrame mainFrame = new JFrame();
    public static SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
    public static Mypage myPanel = new Mypage();
    public static JPanel secondLeftPanel = new JPanel();
    public static JPanel secondLeft = new JPanel();
    public static JPanel rightPanel = new JPanel();
    public static String hLabel;
    public static SetHeaderFirst hFirst = new SetHeaderFirst(hLabel);
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


        allLayout(rightPanel,secondLeft);

        //TODO myPage 노출된 상태에서 setFirstLeft클래스에서 패널 지워지고 변경가능하게 만들기
        //  allLayout(Mypage.rightPanel);

    }
    public static void allLayout(JPanel rightPanel,JPanel test){

        GroupLayout layout = new GroupLayout(mainFrame.getContentPane());
        mainFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(firstLeft.firstLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
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
    public static void main(String args[]) {
        new Background();
    }

}