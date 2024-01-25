package com.ssafy.day9.b_gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel lNum1, lNum2, lCorrectCnt, lWrongCnt;
    private JTextField tfAns;
    private int answer;

    public static void main(String[] args) {
        LayoutTest lt = new LayoutTest();
        lt.launchUi();
    }

    private void launchUi() {
        this.add(new JLabel("구구단을 외자!"), BorderLayout.NORTH);

        makeProblemPanel();
        makeResultPanel();
        // Frame 기본 설정
        this.setTitle("layout test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void makeProblem() {
        Random rand = new Random();
        int num1 = rand.nextInt(9) + 1;
        int num2 = rand.nextInt(9) + 1;
        this.answer = num1 * num2;
        lNum1.setText(num1 + ""); // 문자열로 치환해주기 위해서
        lNum2.setText(num2 + "");
        tfAns.setText("");
    }

    private void makeResultPanel() {
        // TODO: 결과를 보여줄 panel을 구성하시오.

    	JPanel panel = new JPanel();
    	panel.add(new JLabel("정답개수 : "));
    	lCorrectCnt = new JLabel("0");
    	panel.add(lCorrectCnt);
    	panel.add(new JLabel("오답개수 : "));
    	lWrongCnt = new JLabel("0");
    	panel.add(lWrongCnt);
    	this.add(panel, "South");
        // END
    }

    private void makeProblemPanel() {
        // TODO: 문제를 출제할 패널을 구성하시오.
    	JPanel panel = new JPanel();
    	
    	lNum1 = new JLabel();
    	panel.add(lNum1);
    	panel.add(new JLabel("*"));
    	lNum2 = new JLabel();
    	panel.add(lNum2);
    	panel.add(new JLabel("="));
    	tfAns = new JTextField(10); // 10글자를 받을 수 있는 너비
    	panel.add(tfAns);
    	
    	tfAns.addKeyListener(new KeyAdapter() {
    		@Override
    		public void keyReleased(KeyEvent e) {
    			// TODO Auto-generated method stub
    			super.keyReleased(e);
    			System.out.println("키보드 눌렀다가 땜!");
    			if(e.getKeyCode() == 10 ) {
    				//입력값 얻어오기
    				int val = Integer.parseInt(tfAns.getText());
    				if(answer == val) {
    					//정답 일 때
    					lCorrectCnt.setText(Integer.parseInt(lCorrectCnt.getText())+1+"");
    				} else {
    					//오답 일 때
    					lWrongCnt.setText(Integer.parseInt(lWrongCnt.getText())+1+"");
    				}
    		    	makeProblem();
    			}
    		}
    	});
    	
    	makeProblem();
    	
//    	this.add(panel, BorderLayout.CENTER);
    	this.add(panel, "Center");
        // END
    }

}
