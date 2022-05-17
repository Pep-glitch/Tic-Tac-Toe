package game;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class PlayerShow extends Frame
{
    TextField txtbx_one,txtbx_two;
    Button btn_save;
    Controller cl = new Controller(this);
    PlayerShow()
    {
        super();
        setLayout(null);
        setBounds(0,0,400,400);
       
        txtbx_one = new TextField();
        txtbx_two = new TextField();
        btn_save = new Button("SAVE");

        txtbx_one.setBounds(100,50,150,80);
        txtbx_two.setBounds(100,140,150,80);
        btn_save.setBounds(200,220,90,60);



        add( txtbx_one );
        add( txtbx_two);
        add(btn_save);

        btn_save.addActionListener(cl);
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
    }
  
}