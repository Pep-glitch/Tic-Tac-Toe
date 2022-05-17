package game;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class GamePlay extends Frame
{
    Button btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine;
    Controller cl = new Controller(this);
    GamePlay()
    {
        super();
        setLayout(new GridLayout(3,3));
        setBounds(0,0,400,400);
        
         btn_one = new Button("1");
         btn_two = new Button("2");
         btn_three = new Button("3");
         btn_four = new Button("4");
         btn_five = new Button("5");
         btn_six = new Button("6");
         btn_seven = new Button("7");
         btn_eight = new Button("8");
         btn_nine = new Button("9");
       
        add(btn_one);
        add(btn_two);
        add(btn_three);
        add(btn_four);
        add(btn_five);
        add(btn_six);
        add(btn_seven);
        add(btn_eight);
        add(btn_nine);

        btn_one.addActionListener(cl);
        btn_two.addActionListener(cl);
        btn_three.addActionListener(cl);
        btn_four.addActionListener(cl);
        btn_five.addActionListener(cl);
        btn_six.addActionListener(cl);
        btn_seven.addActionListener(cl);
        btn_eight.addActionListener(cl);
        btn_nine.addActionListener(cl);
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
    }
  
}