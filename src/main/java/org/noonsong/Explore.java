package org.noonsong;

import org.noonsong.firstLeftComponent.SetFirstLeftPanel;
import org.noonsong.secondLeftComponent.ExploreMenu;
import org.noonsong.secondLeftComponent.SetHeaderFirst;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Explore extends JFrame{
    public static SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
    public static JPanel secondLeftPanel = new JPanel();
    public static JPanel rightPanel = new JPanel();
    SetHeaderFirst hSearch = new SetHeaderFirst("찾기");
    ExploreMenu searchMenu = new ExploreMenu();

    JPanel banner,searchPanel,exploreView,studyIntro;
    JLabel bannerImg,categoryVar,studyName,studyImg;
    JTextField searchTextFiled;
    JScrollPane explorePane;
    JLayeredPane bannerLayer,studyPreview;
    JTextPane studyIntroW;
    JButton studyMore;


    public Explore() {
        setTitle("눈송보드 > 그룹 찾기 ");
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1030, 600));
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

    public void initComponents() {

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
                                .addGap(0,0,0)
                                .addComponent(hSearch.headerFirst,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
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
        bannerImg.setIcon(new ImageIcon("../img/SB_DeepBlue.png")); // NOI18N
        bannerImg.setText("배너이미지 대체 텍스트");
        bannerImg.setIconTextGap(0);
        bannerImg.setMaximumSize(new Dimension(690, 215));
        bannerImg.setMinimumSize(new Dimension(690, 215));
        bannerImg.setPreferredSize(new Dimension(690, 215));

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

        searchTextFiled.setBackground(new Color(64, 80, 255));
        searchTextFiled.setFont(new Font("굴림", 1, 14)); // NOI18N
        searchTextFiled.setForeground(new Color(255, 255, 255));
        searchTextFiled.setHorizontalAlignment(JTextField.CENTER);
        searchTextFiled.setText("원하는 스터디 그룹을 찾아보세요.");
        searchTextFiled.setBorder(null);
        searchTextFiled.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchTextFiledActionPerformed(evt);
            }
        });

        GroupLayout searchPanelLayout = new GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 240, Short.MAX_VALUE)
                        .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(searchTextFiled, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(searchTextFiled, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
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
        explorePane.setBackground(new Color(255, 255, 255));
        explorePane.setBorder(null);
        explorePane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        explorePane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        explorePane.setMinimumSize(new Dimension(716, 300));
        explorePane.setPreferredSize(new Dimension(716, 300));

        exploreView.setBackground(new Color(255, 255, 255));
        exploreView.setMinimumSize(new Dimension(716, 700));
        exploreView.setPreferredSize(new Dimension(716, 700));

        categoryVar.setFont(new Font("돋움", 1, 20)); // NOI18N

        //TODO 카테고리 버튼 누르는 값에 따라 값 변화 필요
        categoryVar.setText("ALL");

        categoryVar.setToolTipText("");
        categoryVar.setHorizontalTextPosition(SwingConstants.RIGHT);
        categoryVar.setInheritsPopupMenu(false);
        categoryVar.setMaximumSize(new Dimension(170, 57));
        categoryVar.setMinimumSize(new Dimension(170, 57));
        categoryVar.setPreferredSize(new Dimension(170, 57));




        //스터디 그룹 미리보기 패널
        studyPreview.setBorder(BorderFactory.createEtchedBorder());
        studyPreview.setMinimumSize(new Dimension(330, 270));

        studyIntro.setBackground(new Color(255, 255, 255));
        studyIntro.setMinimumSize(new Dimension(330, 145));
        studyIntro.setPreferredSize(new Dimension(330, 145));

        //TODO 데이터 값에 따라 아래 StudyName.setText값 변경 필요.
        //스터디그룹 미리보기 패널 - 스터디 이름
        studyName.setFont(new Font("돋움", 0, 14)); // NOI18N
        studyName.setText("2021-자바 개발 스터디");
        studyName.setPreferredSize(new Dimension(180, 20));

        //TODO 데이터 값에 따라 아래 StudyIntroW.setText값 변경 필요.
        //스터디그룹 미리보기 패널 - 스터디 소개 간략
        studyIntroW.setEditable(false);
        studyIntroW.setText("세 달 동안 Java를 사용해서 함께 앱 개발 스터디 하실 분 모집합니다. 매주 금요일마다 스터디 결과를 제출하도록 할 예정입니다.");


        //TODO 데이터 값에 따라 아래 StudyMore 버튼누르면 해당 스터디 상세보기 패널로 이동
        //스터디그룹 미리보기 패널 - 스터디 소개 간략
        studyMore.setBackground(new Color(238, 241, 244));
        studyMore.setText("더보기");
        studyMore.setBorder(null);
        studyMore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                studyMoreActionPerformed(evt);
            }
        });

        //스터디 미리보기 전체 패널에 각 요소 붙여넣는 레이아웃
        GroupLayout studyIntroLayout = new GroupLayout(studyIntro);
        studyIntro.setLayout(studyIntroLayout);
        studyIntroLayout.setHorizontalGroup(
                studyIntroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, studyIntroLayout.createSequentialGroup()
                                .addGroup(studyIntroLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(studyIntroLayout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(studyMore, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(studyIntroLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(studyIntroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(studyIntroLayout.createSequentialGroup()
                                                                .addComponent(studyName, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(studyIntroW, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                .addGap(15, 15, 15))
        );
        studyIntroLayout.setVerticalGroup(
                studyIntroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyIntroLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(studyName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studyIntroW, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(studyMore, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        studyImg.setIcon(new ImageIcon("../img/dev_group.jpg")); // NOI18N
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


        GroupLayout exploreViewLayout = new GroupLayout(exploreView);
        exploreView.setLayout(exploreViewLayout);
        exploreViewLayout.setHorizontalGroup(
                exploreViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(exploreViewLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(exploreViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(exploreViewLayout.createSequentialGroup()
                                                .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(categoryVar, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(exploreViewLayout.createSequentialGroup()
                                                .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, Short.MAX_VALUE))
        );
        exploreViewLayout.setVerticalGroup(
                exploreViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(exploreViewLayout.createSequentialGroup()
                                .addComponent(categoryVar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(exploreViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(exploreViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        explorePane.setViewportView(exploreView);

        rightPanel.setBackground(new Color(255, 255, 255));
        rightPanel.setMinimumSize(new Dimension(716, 600));
        rightPanel.setPreferredSize(new Dimension(716, 600));
        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);

        rightPanel.setLayout(rightPanelLayout);
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

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(firstLeft.firstLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(firstLeft.firstLeftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );


    }

    private void studyMoreActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void footerBtnDialogActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchTextFiledActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }


}