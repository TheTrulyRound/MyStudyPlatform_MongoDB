package org.noonsong;

import com.mongodb.client.*;
import org.bson.Document;
import org.noonsong.firstLeftComponent.SetFirstLeftPanel;
import org.noonsong.secondLeftComponent.ExploreMenu;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import static com.mongodb.client.model.Filters.eq;

public class Explore extends JPanel {
    public static SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
    public static JPanel secondLeftPanel = new JPanel();
    //    public static JPanel rightPanel = new JPanel();
    SetHeaderFirst hSearch = new SetHeaderFirst("찾기");
    ExploreMenu searchMenu = new ExploreMenu();

    JPanel banner, searchPanel, exploreView, studyIntro;
    JLabel bannerImg, categoryVar, studyName, studyImg;
    JTextField searchTextFiled;
    JScrollPane explorePane;
    JLayeredPane bannerLayer, studyPreview;
    JTextPane studyIntroW;
    JButton studyMore;

    public static String chosenGroup = "";


    public Explore() {
        initComponents();
//        setMinimumSize(new Dimension(1030, 600));
        setMinimumSize(new Dimension(716, 600));
//        setLocationRelativeTo(null);
        setVisible(true);
        Background.mainFrame.pack();
    }

    public static int count;

    public void initComponents() {
        count += 1;
        System.out.println("Explore 이니셜라이저 실행: " + count);

        bannerLayer = new JLayeredPane();
        banner = new JPanel();
        bannerImg = new JLabel();
        searchPanel = new JPanel();
        searchTextFiled = new JTextField();
        explorePane = new JScrollPane();
        exploreView = new JPanel();
        categoryVar = new JLabel();
        studyPreview = new JLayeredPane();
        studyIntro = new JPanel();
        studyName = new JLabel();
        studyIntroW = new JTextPane();
        studyMore = new JButton();
        studyImg = new JLabel();

//        StudyDetailDialog detail = new StudyDetailDialog();

        //secondLeftPanel 레이아웃
        secondLeftPanel.setBackground(new Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new Dimension(242, 600));

        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(hSearch.headerFirst, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, secondLeftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(searchMenu.exploreMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hSearch.headerLine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        ))
                                .addContainerGap())
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(hSearch.headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(hSearch.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchMenu.exploreMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(335, Short.MAX_VALUE))
        );


        bannerLayer.setBackground(new Color(64, 80, 255));
        bannerLayer.setPreferredSize(new Dimension(690, 215));

        banner.setBackground(new Color(64, 80, 255));
        banner.setPreferredSize(new Dimension(690, 215));

        //문제 : 배너이미지 생성안되면서 그 위에 붙이는 텍스트필드패널 작동안함.
        bannerImg.setIcon(new ImageIcon("src/img/SB_DeepBlue_thin.png")); // NOI18N
        bannerImg.setText("배너이미지 대체 텍스트");
        bannerImg.setIconTextGap(0);
        bannerImg.setMaximumSize(new Dimension(690, 168));
        bannerImg.setMinimumSize(new Dimension(690, 168));
        bannerImg.setPreferredSize(new Dimension(690, 168));

        GroupLayout bannerLayout = new GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
                bannerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bannerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bannerImg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        bannerLayout.setVerticalGroup(
                bannerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bannerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bannerImg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchPanel.setBackground(new Color(64, 80, 255));

        GroupLayout searchPanelLayout = new GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 240, Short.MAX_VALUE)
                        .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                //.addComponent(searchTextFiled, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        )
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                //.addComponent(searchTextFiled, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        )
        );

        bannerLayer.setLayer(banner, JLayeredPane.DEFAULT_LAYER);
        bannerLayer.setLayer(searchPanel, JLayeredPane.DEFAULT_LAYER);

        GroupLayout bannerLayerLayout = new GroupLayout(bannerLayer);
        bannerLayer.setLayout(bannerLayerLayout);
        bannerLayerLayout.setHorizontalGroup(
                bannerLayerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bannerLayerLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(banner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(bannerLayerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, bannerLayerLayout.createSequentialGroup()
                                        .addContainerGap(215, Short.MAX_VALUE)
                                        .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(245, Short.MAX_VALUE)))
        );
        bannerLayerLayout.setVerticalGroup(
                bannerLayerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bannerLayerLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(banner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(bannerLayerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, bannerLayerLayout.createSequentialGroup()
                                        .addContainerGap(142, Short.MAX_VALUE)
                                        .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(44, Short.MAX_VALUE)))
        );

        // 검색 결과 뜨는패널
        explorePane.setBackground(new Color(255, 255, 255, 000));
        explorePane.setBorder(null);
        explorePane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        explorePane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        explorePane.setMinimumSize(new Dimension(716, 300));
        explorePane.setPreferredSize(new Dimension(716, 300));

        exploreView.setBackground(new Color(255, 255, 255, 000));
        exploreView.setMinimumSize(new Dimension(716, 700));
        exploreView.setPreferredSize(new Dimension(716, 700));

//        categoryVar.setFont(new Font("돋움", 1, 20)); // NOI18N
//
//        //TODO 카테고리 버튼 누르는 값에 따라 값 변화 필요
//        categoryVar.setText("ALL");
//
//        categoryVar.setToolTipText("");
//        categoryVar.setHorizontalTextPosition(SwingConstants.RIGHT);
//        categoryVar.setInheritsPopupMenu(false);
//        categoryVar.setMaximumSize(new Dimension(170, 57));
//        categoryVar.setMinimumSize(new Dimension(170, 57));
//        categoryVar.setPreferredSize(new Dimension(170, 57));


        //스터디 그룹 미리보기 패널
        studyPreview.setBorder(BorderFactory.createEtchedBorder());
        studyPreview.setMinimumSize(new Dimension(330, 270));

        studyIntro.setBackground(new Color(255, 255, 255));
        studyIntro.setMinimumSize(new Dimension(330, 145));
        studyIntro.setPreferredSize(new Dimension(330, 145));

        studyImg.setIcon(new ImageIcon("src/img/dev_group.jpg")); // NOI18N
        studyImg.setText("그룹 대표 이미지 대체 텍스트");
        studyImg.setIconTextGap(0);
        studyImg.setMinimumSize(new Dimension(330, 125));
        studyImg.setPreferredSize(new Dimension(330, 125));

        studyPreview.setLayer(studyIntro, JLayeredPane.DEFAULT_LAYER);
        studyPreview.setLayer(studyImg, JLayeredPane.DEFAULT_LAYER);

        GroupLayout studyPreviewLayout = new GroupLayout(studyPreview);
        studyPreview.setLayout(studyPreviewLayout);
        studyPreviewLayout.setHorizontalGroup(
                studyPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(studyIntro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studyImg, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studyPreviewLayout.setVerticalGroup(
                studyPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, studyPreviewLayout.createSequentialGroup()
                                .addComponent(studyImg, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(studyIntro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        // TODO J테이블 생성
        if (LoginWindow.loginSuccess != null && LoginWindow.loginSuccess.equals(true)) {
            String connectionString = "mongodb+srv://studyplatform:studyplatform@studyplatformcluster.msr51.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
            try (MongoClient mongoClient = MongoClients.create(connectionString)) {
                MongoDatabase study_group_info = mongoClient.getDatabase("study_group_info");
                MongoCollection<Document> study_group_info_col = study_group_info.getCollection("groups");

                FindIterable<Document> iterable = study_group_info_col.find();
                MongoCursor<Document> cursor = iterable.iterator();

                ArrayList<Document> allStudies = new ArrayList<>();
                try {
                    while (cursor.hasNext()) {
                        allStudies.add(cursor.next());
                    }
                } finally {
                    cursor.close();
                }

                JTable studyTable;
                String[] columnNames = {"스터디 이름", "스터디 설명"};
                Object[][] rowData = {{"스터디 이름", "스터디 설명"}};
                DefaultTableModel defaultTableModel;

                // TODO 가져온 스터디 다큐먼트들 정보를 사용해서 테이블 생성
                defaultTableModel = new DefaultTableModel(rowData, columnNames);
                for (Document allStudy : allStudies) {
                    String title = (String) allStudy.get("title");
                    String intro = (String) allStudy.get("intro");
                    defaultTableModel.addRow(new Object[]{title, intro});
                }
                defaultTableModel.setColumnIdentifiers(columnNames);
                studyTable = new JTable(defaultTableModel);

                TableColumnModel columnModel = studyTable.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(150);
                columnModel.getColumn(1).setPreferredWidth(400);

                JButton studyDetailBtn = new JButton("상세보기");
                studyDetailBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        int rowIndex = studyTable.getSelectedRow();
                        if (rowIndex == -1) {
                            return;
                        } else {
                            // 해당 그룹에 대한 studyRoomDetail 창 띄우기
                            System.out.println("클릭잘됨: 인덱스 " + rowIndex);
                            new StudyGroupDetail((String) studyTable.getModel().getValueAt(rowIndex, 0));
                            chosenGroup = (String) studyTable.getModel().getValueAt(rowIndex, 0);
                        }
                    }
                });

                exploreView.add(studyTable);
                exploreView.add(studyDetailBtn);
            } catch (Exception ex) {
                System.out.println("Explore - JTable 생성 중 서버 접속 실패");
            }
        }

        explorePane.setViewportView(exploreView);

        this.setBackground(new Color(255, 255, 255));
        this.setMinimumSize(new Dimension(716, 600));
        this.setPreferredSize(new Dimension(716, 600));
        GroupLayout rightPanelLayout = new GroupLayout(this);

        this.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(bannerLayer, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(explorePane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bannerLayer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(explorePane, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
        );

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
}