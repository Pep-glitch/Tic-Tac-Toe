package game;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class Display extends Frame
{
    MenuBar line_bar;
    Menu start_menu;
    MenuItem player_item,game_item;
    Controller cl = new Controller(this);
    Display()
    {
        super();
        setLayout(null);
        setBounds(0,0,800,590);
        line_bar = new MenuBar();
        start_menu = new Menu("START");
        player_item = new MenuItem("PLAYERS");
        game_item = new MenuItem("PLAY");



        start_menu.add(player_item);
        start_menu.add(game_item);
        line_bar.add(start_menu);
        setMenuBar(line_bar);

        start_menu.addActionListener(cl);
        player_item.addActionListener(cl);
        game_item.addActionListener(cl);
        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
    }
    public static void main(String ss[])
    {
        Display dp = new Display();
        dp.setVisible(true);
    }
}