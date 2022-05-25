package seoultech.se.tetris.component.setting;

import seoultech.se.tetris.component.Setting;
import seoultech.se.tetris.component.model.DataManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1KeySetting extends JFrame {
    private JPanel backButtonPanel;
    private KeySettingPanel menuPanel;
    private JButton backButton;
    private int keyArr[] = new int[6];
    private int leftCode, rightCode, downCode, rotateCode, hardDropCode, pauseCode;

    public P1KeySetting(int x, int y) {
        this.setSize(500, 600);
        this.setLocation(x, y);
        this.setLayout(new BorderLayout(25, 25));
        getKeyCode();
        menuPanel = new KeySettingPanel(keyArr);

        setbackButtonPanel();

        this.add(backButtonPanel, BorderLayout.NORTH);
        this.add(new JPanel(), BorderLayout.WEST);
        this.add(menuPanel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }


    private void getKeyCode() {
        keyArr[0] = DataManager.getInstance().getLeft();
        keyArr[1] = DataManager.getInstance().getRight();
        keyArr[2] = DataManager.getInstance().getDown();
        keyArr[3] = DataManager.getInstance().getRotate();
        keyArr[4] = DataManager.getInstance().getHarddrop();
        keyArr[5] = DataManager.getInstance().getPause();
    }

    private void setbackButtonPanel(){
        backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButton = new JButton("back");
        backButton.addActionListener(listner);
        backButtonPanel.add(backButton);
    }

    private boolean errorCheck(){
        for(int i = 0; i<keyArr.length; i++){
            for(int j = i +1; j<keyArr.length; j++){
                if(keyArr[i] == keyArr[j]) return false;
            }
        }
        return true;
    }

    private void go_back() {
        if(errorCheck()) {
            DataManager.getInstance().setKey(keyArr[0], keyArr[1], keyArr[2], keyArr[3], keyArr[4], keyArr[5]);
            new Setting(getThis().getLocation().x, getThis().getLocation().y);
            getThis().dispose();
        }
        else {
            JOptionPane errorPane = new JOptionPane();
            errorPane.setLocation(this.getLocation().x, this.getLocation().y);
            errorPane.showMessageDialog(null, "중복된 키가 존재합니다.","KEY_ERROR", JOptionPane.WARNING_MESSAGE);

        }
    }

    ActionListener listner = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (backButton.equals(e.getSource())) {
                go_back();
            }
            else {

            }
        }
    };



    private JFrame getThis() {return this;}

}
