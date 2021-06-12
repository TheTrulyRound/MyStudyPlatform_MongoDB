package org.noonsong;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.*;
import org.bson.Document;

public class LoginWindow extends JFrame implements ActionListener {

    // 로그인에 관한 객체들 선언
    static JPanel loginP, loginInputP, loginButtonP, loginResultP;
    static JLabel usernameL, passwordL, loginResultL;
    static JTextField loginUsernameTF;
    static JPasswordField loginPasswordTF;
    static JButton loginB, signInB, findPasswordB;
    public static Boolean loginSuccess;
    public static String userId;    // 로그인된 유저의 다큐먼트 아이디
    public static Document userDoc; // 로그인된 유저의 정보가 담긴 다큐먼트

    // 회원가입에 관한 객체들 선언
    static JPanel signInP, signInInputP, signInButtonP;
    static JLabel signInUsernameL, signInPasswordL_1, signInPasswordL_2, signInEmailL;
    static JTextField signInUsernameTF, signInEmailTF;
    static JPasswordField signInPasswordTF_1, signInPasswordTF_2;
    static JButton completeSignInB, checkForSameUsernameB, checkForSamePasswordB;
    static Boolean usernameChecked, passwordChecked, emailChecked;

    // 아이디/비밀번호 힌트 받기

    public LoginWindow() {
        // region 0) 로그인 패널의 기본 설정 ------------------------------------------------------------------------------
        //setLayout(new BorderLayout());
        loginInputP = new JPanel(new GridBagLayout());
        loginResultP = new JPanel();
        loginButtonP = new JPanel();
        loginP = new JPanel();
        loginP.setLayout(new BoxLayout(loginP, BoxLayout.Y_AXIS));
        // endregion

        // region 1) 로그인 부분 ----------------------------------------------------------------------------------------
        loginSuccess = false;
        loginResultL = new JLabel("\t", SwingConstants.CENTER);
        loginResultP.add(loginResultL);

        usernameL = new JLabel("아이디" );
        passwordL = new JLabel("비밀번호");
        loginUsernameTF = new JTextField(10);
        loginPasswordTF = new JPasswordField(10);
        loginPasswordTF.setEchoChar('*');

        loginB = new JButton("로그인");
        signInB = new JButton("회원가입하기");
        findPasswordB = new JButton("아이디/비밀번호를 잊으셨나요?");
        loginB.addActionListener(this);
        signInB.addActionListener(this);
        findPasswordB.addActionListener(this);

        signInB.setOpaque(false);
        signInB.setContentAreaFilled(false);
        signInB.setBorderPainted(false);
        findPasswordB.setOpaque(false);
        findPasswordB.setContentAreaFilled(false);
        findPasswordB.setBorderPainted(false);
        loginButtonP.add(signInB);
        loginButtonP.add(findPasswordB);

        GridBagConstraints c0 = new GridBagConstraints();
        c0.fill = GridBagConstraints.HORIZONTAL;
        c0.gridx = 0; c0.gridy = 0;
        loginInputP.add(usernameL, c0);
        c0.gridx = 1; c0.gridy = 0;
        loginInputP.add(Box.createRigidArea(new Dimension(10, 0)), c0);
        c0.gridx = 2; c0.gridy = 0;
        loginInputP.add(loginUsernameTF, c0);

        c0.fill = GridBagConstraints.HORIZONTAL;
        c0.gridx = 0; c0.gridy = 1;
        loginInputP.add(passwordL, c0);
        c0.gridx = 1; c0.gridy = 1;
        loginInputP.add(Box.createRigidArea(new Dimension(10, 0)), c0);
        c0.gridx = 2; c0.gridy = 1;
        loginInputP.add(loginPasswordTF, c0);

        loginP.add(Box.createRigidArea(new Dimension(0, 120)));
        loginP.add(loginInputP);
        loginP.add(Box.createRigidArea(new Dimension(0, 20)));
        loginP.add(loginB);
        loginP.add(Box.createRigidArea(new Dimension(0, 1)));
        loginP.add(loginResultP);
        loginP.add(Box.createRigidArea(new Dimension(0, 10)));
        loginP.add(loginButtonP);
        add(loginP);
        // endregion-

        // region 2) 회원가입 부분 ---------------------------------------------------------------------------------------
        signInP = new JPanel();
        signInP.setLayout(new BoxLayout(signInP, BoxLayout.Y_AXIS));
        signInInputP = new JPanel(new GridBagLayout());
        signInButtonP = new JPanel();

        usernameChecked = false;
        passwordChecked = false;
        emailChecked = false;

        signInUsernameL = new JLabel("아이디 입력");
        signInPasswordL_1 = new JLabel("비밀번호 입력");
        signInPasswordL_2 = new JLabel("비밀번호 다시 입력");
        signInEmailL = new JLabel("이메일 입력");

        signInUsernameTF = new JTextField(10);
        signInPasswordTF_1 = new JPasswordField(10);
        signInPasswordTF_2 = new JPasswordField(10);
        signInEmailTF = new JTextField();

        completeSignInB = new JButton("회원가입 완료하기");
        checkForSameUsernameB = new JButton("중복 아이디 여부 확인하기");
        checkForSamePasswordB = new JButton("비밀번호 동일한지 확인하기");
        checkForSameUsernameB.setForeground(Color.blue);
        checkForSamePasswordB.setForeground(Color.blue);

        checkForSameUsernameB.setOpaque(false);
        checkForSameUsernameB.setContentAreaFilled(false);
        checkForSameUsernameB.setBorderPainted(false);
        checkForSamePasswordB.setOpaque(false);
        checkForSamePasswordB.setContentAreaFilled(false);
        checkForSamePasswordB.setBorderPainted(false);

        completeSignInB.addActionListener(this);
        checkForSameUsernameB.addActionListener(this);
        checkForSamePasswordB.addActionListener(this);

        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx = 0; c1.gridy = 0;
        signInInputP.add(signInUsernameL, c1);
        c1.gridx = 1; c1.gridy = 0;
        signInInputP.add(signInUsernameTF, c1);
        c1.gridx = 2; c1.gridy = 0;
        signInInputP.add(checkForSameUsernameB, c1);

        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx = 0; c1.gridy = 1;
        signInInputP.add(signInPasswordL_1, c1);
        c1.gridx = 1; c1.gridy = 1;
        signInInputP.add(signInPasswordTF_1, c1);

        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx = 0; c1.gridy = 2;
        signInInputP.add(signInPasswordL_2, c1);
        c1.gridx = 1; c1.gridy = 2;
        signInInputP.add(signInPasswordTF_2, c1);
        c1.gridx = 2; c1.gridy = 2;
        signInInputP.add(checkForSamePasswordB, c1);

        c1.fill = GridBagConstraints.HORIZONTAL;
        c1.gridx = 0; c1.gridy = 3;
        signInInputP.add(signInEmailL, c1);
        c1.gridx = 1; c1.gridy = 3;
        signInInputP.add(signInEmailTF, c1);

        signInP.add(signInInputP);
        signInP.add(completeSignInB);
        // endregion

        setTitle("로그인");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 500));
        setLocationRelativeTo(null);    // 화면 중심에 뜨게 하기
        setVisible(true);
    }

    // 로그인 버튼(loginB)에 대한 액션 - complete
    private static void loginAction(MongoClient mongoClient) {
        //MongoDatabase user_info = mongoClient.getDatabase("user_info");
        MongoCollection<Document> user_info_col = mongoClient.getDatabase("user_info").getCollection("0");

        String inputUsername = loginUsernameTF.getText();
        String inputPassword = String.valueOf(loginPasswordTF.getPassword());
        // ID 중복 확인

        Document realUsername = user_info_col.find(eq("username", inputUsername)).first();
        Document realPassword = user_info_col.find(eq("password", inputPassword)).first();

        if (realUsername != null && realPassword != null) {
            if (realUsername.get("_id").toString().equals(realPassword.get("_id").toString())) {
                userId = realUsername.get("username").toString();
                userDoc = user_info_col.find(eq("username", inputUsername)).first();

                loginResultL.setText("로그인 성공: "+userId);
                loginResultL.setForeground(Color.green);
                loginSuccess = true;
                System.out.println("doc: "+LoginWindow.userDoc);
            }
        } else {
            loginResultL.setText("로그인 실패. 유저네임 또는 비밀번호가 틀렸습니다.");
            loginResultL.setForeground(Color.red);
        }
    }

    // 회원가입 버튼(signInB)에 대한 액션 - incomplete
    private static void signInAction(MongoClient mongoClient) {
        MongoDatabase user_info = mongoClient.getDatabase("user_info");
        MongoCollection<Document> user_info_col = user_info.getCollection("0");

        // 회원가입 란에서 입력받은 아이디, 비밀번호, 비밀번호 확인, 이메일
        String inputUsername = signInUsernameTF.getText();
        String inputPassword_1 = String.valueOf(signInPasswordTF_1.getPassword());
        String inputEmail = signInEmailTF.getText();

        Document account_info = new Document();
        account_info.append("username", inputUsername);
        account_info.append("password", inputPassword_1);
        account_info.append("email", inputEmail);
        account_info.append("joinedGroup", Arrays.asList());

        user_info.getCollection("0").insertOne(account_info);

        // 서버에 저장될 시간 기다려주기
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {}

        //Document userInfo = user_info_col.find(eq("_id", LoginWindow.userId)).first();

        userId = inputUsername;
        signInUsernameTF.setText(userId);
    }

    // 동일한 아이디가 존재하는지 확인하는 메소드
    private static String checkForSameUsername(MongoClient mongoClient) {
        String checkResult;
        String inputUsername = signInUsernameTF.getText();

        MongoDatabase user_info = mongoClient.getDatabase("user_info");
        MongoCollection<Document> user_info_col = user_info.getCollection("0");

        Document username = user_info_col.find(eq("username", inputUsername)).first();
        if (username == null) {
            checkResult = "아이디를 사용할 수 있습니다";
        }
        else {
            checkResult = "아이디를 사용할 수 없습니다";
        }
        return checkResult;
    }

    // 다시 입력한 비밀번호가 일치하는지 확인하는 메소드
    private static String checkIfIdenticalPW() {
        String inputPassword_1 = String.valueOf(signInPasswordTF_1.getPassword());
        String inputPassword_2 = String.valueOf(signInPasswordTF_2.getPassword());
        String resultString;

        // 첫 번째 비밀번호와 두 번째 비밀번호를 비교하고 일치하는지 확인
        if ( inputPassword_1.equals(inputPassword_2)) {
            resultString = "비밀번호가 일치합니다";
        }
        else {
            resultString = "비밀번호가 불일치합니다";
        }
        return resultString;
    }

    // 페이지 트래커 + 로그인 성공과 함께 생성해줄 패널들
    public static int tracker = -1;
    public static Explore explorePanel;
    public static MakeStudy makeStudyPanel;
    public static MyPage myPagePanel;
    public static StudyRoom roomPanel0;
    public static StudyRoom roomPanel1;
    public static StudyRoom roomPanel2;
    public static StudyRoom roomPanel3;

    public void actionPerformed(ActionEvent e) {
        // TODO 로그인 하기
        if (e.getSource() == loginB) {
            //Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
            String connectionString = "mongodb+srv://studyplatform:studyplatform@studyplatformcluster.msr51.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
            try (MongoClient mongoClient = MongoClients.create(connectionString)) {
                loginAction(mongoClient);
            }
            catch (Exception ex) { System.out.println("서버 접속 실패."); }

            if (loginSuccess) {
                dispose();  // 로그인창만 닫기
                tracker = 1;
                new Background();
                explorePanel = new Explore();
                makeStudyPanel = new MakeStudy();
                myPagePanel = new MyPage();
                explorePanel.setVisible(true);
                makeStudyPanel.setVisible(false);
                myPagePanel.setVisible(false);

                Background.allLayout(explorePanel, explorePanel.secondLeftPanel);
                Background.secondLeftPanel.updateUI();
                Background.rightPanel.updateUI();

                Object doc = userDoc.get("joinedGroup");        // 현재 조인된 그룹의 오브젝트 가져오기
                ArrayList<String> joinedGroup = (ArrayList<String>) doc;    // 오브젝트 타입 변환

                try {
                    roomPanel0 = new StudyRoom(joinedGroup.get(0));
                    roomPanel0.setVisible(false);
                    roomPanel1 = new StudyRoom(joinedGroup.get(1));
                    roomPanel1.setVisible(false);
                    roomPanel2 = new StudyRoom(joinedGroup.get(2));
                    roomPanel2.setVisible(false);
                    roomPanel3 = new StudyRoom(joinedGroup.get(3));
                    roomPanel3.setVisible(false);
                } catch (Exception ex) {
                    System.out.println("You have less than 4 groups joined");
                }

                System.out.println("User ID: "+ LoginWindow.userId);  // 로그인 되면 유저 아이디 출력
            }
        }

        // TODO 회원가입 하러가기
        if(e.getSource() == signInB) {
            loginP.setVisible(false);
            add(signInP);
        }

        // TODO 아이디 중복검사
        if(e.getSource() == checkForSameUsernameB) {
            //Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
            String connectionString = "mongodb+srv://studyplatform:studyplatform@studyplatformcluster.msr51.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
            try (MongoClient mongoClient = MongoClients.create(connectionString)) {
                checkForSameUsernameB.setText(checkForSameUsername(mongoClient));
            }
            catch (Exception ex) { System.out.println("서버 접속 실패."); }
        }

        // TODO 비밀번호 동일검사
        if(e.getSource() == checkForSamePasswordB) {
            checkForSamePasswordB.setText(checkIfIdenticalPW());
        }

        // TODO 회원가입 완료
        if (e.getSource() == completeSignInB) {
            //Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
            String connectionString = "mongodb+srv://studyplatform:studyplatform@studyplatformcluster.msr51.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
            try (MongoClient mongoClient = MongoClients.create(connectionString)) {
                signInAction(mongoClient);
            }
            catch (Exception ex) { System.out.println("서버 접속 실패."); }

            signInP.setVisible(false);
            loginP.setVisible(true);
        }
    }
}