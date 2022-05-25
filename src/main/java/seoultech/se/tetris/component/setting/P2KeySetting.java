//package seoultech.se.tetris.component.setting;
//
//import seoultech.se.tetris.component.model.DataManager;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//public class P2KeySetting extends JFrame {
//    private JPanel p1Panel, p2Panel;
//    private JPanel backButtonPanel;
//    private JButton backButton;
//    private JButton p1Right, p1Left, p1Rotate, p1HardDrop, p1Pause,p1Down;
//    private JLabel currLeft,currDown,currRight,currRotate,currHardDrop,currPause;
//    private int p1LeftCode, p1RightCode, p1DownCode, p1RotateCode, p1HardDropCode, p1PauseCode;
//
//   private JButton p2Right, p2Left, p2Rotate, p2HardDrop, p2Pause, p2Down;
//    private int p2LeftCode, p2RightCode, p2DownCode, p2RotateCode, p2HardDropCode, p2PauseCode;
//
//    public P2KeySetting(int x, int y) {
//
//        setbackButtonPanel();
//
//        this.add(backButtonPanel, BorderLayout.NORTH);
//
//        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setVisible(true);
//        this.setSize(700, 600);
//        this.setLocation(x, y);
//        this.setLayout(new BorderLayout(25, 25));
//    }
//
//    private void getKeyCode() {
//        p1LeftCode = DataManager.getInstance().getLeft();
//        p1RightCode = DataManager.getInstance().getRight();
//        p1DownCode = DataManager.getInstance().getDown();
//        p1RotateCode = DataManager.getInstance().getRotate();
//        p1HardDropCode = DataManager.getInstance().getHarddrop();
//        p1PauseCode = DataManager.getInstance().getPause();
//    }
//
//
//    private void setbackButtonPanel(){
//        backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        backButton = new JButton("back");
////        backButton.addActionListener(listner);
//        backButtonPanel.add(backButton);
//    }
//
//    private void setP1Panel(){
//        menuPanel = new JPanel(new GridLayout(6,1,5,0));
//
//        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        left = new JButton("Move Left");
//        left.setPreferredSize(new Dimension(180, 60));
//        left.addActionListener(listner);
//
//        currLeft = new JLabel(KeyEvent.getKeyText(DataManager.getInstance().getLeft()));
//        currLeft.setPreferredSize(new Dimension(180,60));
//        currLeft.setHorizontalAlignment(JLabel.CENTER);
//        leftPanel.add(left);
//        leftPanel.add(currLeft);
//
//        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        right = new JButton("Move Right");
//        right.setPreferredSize(new Dimension(180, 60));
//        right.addActionListener(listner);
//        currRight = new JLabel(KeyEvent.getKeyText(DataManager.getInstance().getRight()));
//        currRight.setPreferredSize(new Dimension(180,60));
//        currRight.setHorizontalAlignment(JLabel.CENTER);
//
//        rightPanel.add(right);
//        rightPanel.add(currRight);
//
//        JPanel downPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        down = new JButton("Move Down");
//        down.setPreferredSize(new Dimension(180, 60));
//        down.addActionListener(listner);
//        currDown = new JLabel(KeyEvent.getKeyText(DataManager.getInstance().getDown()));
//        currDown.setPreferredSize(new Dimension(180,60));
//        currDown.setHorizontalAlignment(JLabel.CENTER);
//        downPanel.add(down);
//        downPanel.add(currDown);
//
//        JPanel rotatePanel  = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        rotate = new JButton("Rotate");
//        rotate.setPreferredSize(new Dimension(180, 60));
//        rotate.addActionListener(listner);
//        currRotate = new JLabel(KeyEvent.getKeyText(DataManager.getInstance().getRotate()));
//        currRotate.setPreferredSize(new Dimension(180,60));
//        currRotate.setHorizontalAlignment(JLabel.CENTER);
//        rotatePanel.add(rotate);
//        rotatePanel.add(currRotate);
//
//        JPanel hardDropPanel  = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        hardDrop = new JButton("HardDrop");
//        hardDrop.setPreferredSize(new Dimension(180, 60));
//        hardDrop.addActionListener(listner);
//        currHarddrop = new JLabel(KeyEvent.getKeyText(DataManager.getInstance().getHarddrop()));
//        currHarddrop.setPreferredSize(new Dimension(180,60));
//        currHarddrop.setHorizontalAlignment(JLabel.CENTER);
//        hardDropPanel.add(hardDrop);
//        hardDropPanel.add(currHarddrop);
//
//        JPanel pausePanel  = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        pause = new JButton("Pause");
//        pause.setPreferredSize(new Dimension(180, 60));
//        pause.addActionListener(listner);
//        currPause = new JLabel(KeyEvent.getKeyText(DataManager.getInstance().getPause()));
//        currPause.setPreferredSize(new Dimension(180,60));
//        currPause.setHorizontalAlignment(JLabel.CENTER);
//        pausePanel.add(pause);
//        pausePanel.add(currPause);
//
//        menuPanel.add(leftPanel);
//        menuPanel.add(rightPanel);
//        menuPanel.add(downPanel);
//        menuPanel.add(rotatePanel);
//        menuPanel.add(hardDropPanel);
//        menuPanel.add(pausePanel);
//    }
//
//}
