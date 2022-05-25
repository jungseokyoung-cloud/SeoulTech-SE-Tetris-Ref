package seoultech.se.tetris.component.setting;

import seoultech.se.tetris.component.model.DataManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeySettingPanel extends JPanel {
    private JButton right, left, rotate, hardDrop, pause,down;
    private JLabel currLeft,currDown,currRight,currRotate,currHarddrop,currPause;
    private int mode;
    private int [] keyArr;

    public KeySettingPanel(int keyArr[]) {
        this.keyArr = keyArr;
        this.mode = mode;
        this.setLayout(new GridLayout(6,1,5,0));

        setMenu();


    }


    public void setMenu(){
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        left = new JButton("Move Left");
        left.setPreferredSize(new Dimension(180, 60));
        left.addActionListener(listner);

        currLeft = new JLabel(KeyEvent.getKeyText(keyArr[0]));
        currLeft.setPreferredSize(new Dimension(180,60));
        currLeft.setHorizontalAlignment(JLabel.CENTER);
        leftPanel.add(left);
        leftPanel.add(currLeft);

        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        right = new JButton("Move Right");
        right.setPreferredSize(new Dimension(180, 60));
        right.addActionListener(listner);
        currRight = new JLabel(KeyEvent.getKeyText(keyArr[1]));
        currRight.setPreferredSize(new Dimension(180,60));
        currRight.setHorizontalAlignment(JLabel.CENTER);

        rightPanel.add(right);
        rightPanel.add(currRight);

        JPanel downPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        down = new JButton("Move Down");
        down.setPreferredSize(new Dimension(180, 60));
        down.addActionListener(listner);
        currDown = new JLabel(KeyEvent.getKeyText(keyArr[2]));
        currDown.setPreferredSize(new Dimension(180,60));
        currDown.setHorizontalAlignment(JLabel.CENTER);
        downPanel.add(down);
        downPanel.add(currDown);

        JPanel rotatePanel  = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rotate = new JButton("Rotate");
        rotate.setPreferredSize(new Dimension(180, 60));
        rotate.addActionListener(listner);
        currRotate = new JLabel(KeyEvent.getKeyText(keyArr[3]));
        currRotate.setPreferredSize(new Dimension(180,60));
        currRotate.setHorizontalAlignment(JLabel.CENTER);
        rotatePanel.add(rotate);
        rotatePanel.add(currRotate);

        JPanel hardDropPanel  = new JPanel(new FlowLayout(FlowLayout.CENTER));
        hardDrop = new JButton("HardDrop");
        hardDrop.setPreferredSize(new Dimension(180, 60));
        hardDrop.addActionListener(listner);
        currHarddrop = new JLabel(KeyEvent.getKeyText(keyArr[4]));
        currHarddrop.setPreferredSize(new Dimension(180,60));
        currHarddrop.setHorizontalAlignment(JLabel.CENTER);
        hardDropPanel.add(hardDrop);
        hardDropPanel.add(currHarddrop);

        JPanel pausePanel  = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pause = new JButton("Pause");
        pause.setPreferredSize(new Dimension(180, 60));
        pause.addActionListener(listner);
        currPause = new JLabel(KeyEvent.getKeyText(keyArr[5]));
        currPause.setPreferredSize(new Dimension(180,60));
        currPause.setHorizontalAlignment(JLabel.CENTER);
        pausePanel.add(pause);
        pausePanel.add(currPause);

        this.add(leftPanel);
        this.add(rightPanel);
        this.add(downPanel);
        this.add(rotatePanel);
        this.add(hardDropPanel);
        this.add(pausePanel);
    }

    public class MyKeyListner implements KeyListener {
        private JLabel label;
        public MyKeyListner(JLabel label){
            this.label = label;
        }
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            label.setText(KeyEvent.getKeyText(e.getKeyCode()));

            if(label == currLeft) keyArr[0] = e.getKeyCode();
            else if(label == currRight) keyArr[1] = e.getKeyCode();
            else if(label == currDown) keyArr[2] = e.getKeyCode();
            else if(label == currHarddrop) keyArr[3] = e.getKeyCode();
            else if(label == currPause) keyArr[4] = e.getKeyCode();
            else keyArr[5] = e.getKeyCode();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
    ActionListener listner = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (left.equals(e.getSource())) { // left pressed
                MyKeyListner listner = new MyKeyListner(currLeft);
                left.addKeyListener(listner);

            }
            else if (right.equals(e.getSource())) { // right pressed
                MyKeyListner listner = new MyKeyListner(currRight);
                right.addKeyListener(listner);
            }
            else if (down.equals(e.getSource())) { // down pressed
                MyKeyListner listner = new MyKeyListner(currDown);
                down.addKeyListener(listner);

            }
            else if (rotate.equals(e.getSource())) { // rotate pressed
                MyKeyListner listner = new MyKeyListner(currRotate);
                rotate.addKeyListener(listner);
            }
            else if (hardDrop.equals(e.getSource())) { // hardDrop pressed
                MyKeyListner listner = new MyKeyListner(currHarddrop);
                hardDrop.addKeyListener(listner);
            }
            else if (pause.equals(e.getSource())) { // pause pressed
                MyKeyListner listner = new MyKeyListner(currPause);
                pause.addKeyListener(listner);
            }
            else { // restartButton pressed
            }
        }
    };

}
