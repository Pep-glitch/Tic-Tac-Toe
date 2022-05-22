package game;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
public class Controller implements ActionListener
{
    Display dp;
    PlayerShow ps;
    GamePlay gp;
    ArrayList <String> player_one = new ArrayList<String>();
    ArrayList <String> player_two = new ArrayList<String>();
    int num;
    public String playerOne = new String(), playerTwo = new String();
    String one,two;
    Controller(Display d)
    {
        this.dp=d;
    }
    Controller(PlayerShow p)
    {
        this.ps=p;
    }
    Controller(GamePlay g)
    {
        this.gp=g;
    }
    public void actionPerformed(ActionEvent e)
    {
        num++;
      /*
       if(e.getActionCommand().equals("START"))
       {
       // dp.game_item.setEnabled(false);
        PlayerShow ps = new PlayerShow();
        ps.setVisible(false); 
       }*/
        if(e.getActionCommand().equals("PLAYERS"))
        {
            
            PlayerShow ps = new PlayerShow();
            ps.setVisible(true); 
        }
        if(e.getActionCommand().equals("SAVE"))
        {
            playerOne = ps.txtbx_one.getText();
            playerTwo = ps.txtbx_two.getText();
            try {
                FileWriter fw = new FileWriter("one.txt");
                fw.write(playerOne);
                fw.close();
                FileWriter fww = new FileWriter("two.txt");
                fww.write(playerTwo);
                fww.close();
                
            } catch (Exception er) {
                System.out.println(er);
            }
          
            this.ps.setVisible(false);
           // dp.start_menu.add(game_item);
        }

        if(e.getActionCommand().equals("PLAY"))
        {

            GamePlay gp = new GamePlay();
            gp.setVisible(true);
        
        }
        
        if(e.getActionCommand().equals("1"))
        {
           
            gp.btn_one.setEnabled(false);
            if(num%2==0)
            {
               
                gp.btn_one.setLabel("X");
                 gp.setTitle("X");
                //add to first player list
                player_one.add("1");
            }
            else
            {
                gp.btn_one.setLabel("Q");
                //add second player list
                player_two.add("1");
            }
        }
        if(e.getActionCommand().equals("2"))
        {
            gp.btn_two.setEnabled(false);
            if(num%2==0)
            {
                gp.btn_two.setLabel("X");
                //add to first player list
                player_one.add("2");
            }
            else
            {
                gp.btn_two.setLabel("Q");
                //add second player list
                player_two.add("2");
            }
        }
        if(e.getActionCommand().equals("3"))
        {
            gp.btn_three.setEnabled(false);
            if(num%2==0)
            {
                gp.btn_three.setLabel("X");
                //add to first player list
                player_one.add("3");
            }
            else
            {
                gp.btn_three.setLabel("Q");
                //add second player list
                player_two.add("3");
            }
        }
        if(e.getActionCommand().equals("4"))
        {
            gp.btn_four.setEnabled(false);
            if(num%2==0)
            {
                gp.btn_four.setLabel("X");
                //add to first player list
                player_one.add("4");
            }
            else
            {
                gp.btn_four.setLabel("Q");
                //add second player list
                player_two.add("4");
            }
        }
        if(e.getActionCommand().equals("5"))
        {
           
            gp.btn_five.setEnabled(false);
            if(num%2==0)
            {
                gp.btn_five.setLabel("X");
                //add to first player list
                player_one.add("5");
            }
            else
            {
                gp.btn_five.setLabel("Q");
                //add second player list
                player_two.add("5");
            }
        }
        if(e.getActionCommand().equals("6"))
        {
            gp.btn_six.setEnabled(false);
             if(num%2==0)
            {
                gp.btn_six.setLabel("X");
                //add to first player list
                player_one.add("6");
            }
            else
            {
                gp.btn_six.setLabel("Q");
                //add second player list
                player_two.add("6");
            }
        }
        if(e.getActionCommand().equals("7"))
        {
            gp.btn_seven.setEnabled(false);
            if(num%2==0)
            {
                gp.btn_seven.setLabel("X");
                //add to first player list
                player_one.add("7");
            }
            else
            {
                gp.btn_seven.setLabel("Q");
                //add second player list
                player_two.add("7");
            }
        }
        if(e.getActionCommand().equals("8"))
        {
           
            gp.btn_eight.setEnabled(false);
            if(num%2==0)
            {
                gp.btn_eight.setLabel("X");
                //add to first player list
                player_one.add("8");
            }
            else
            {
                gp.btn_eight.setLabel("Q");
                //add second player list
                player_two.add("8");
            }
        }
        if(e.getActionCommand().equals("9"))
        {
           
            gp.btn_nine.setEnabled(false);
            if(num%2==0)
            {
                gp.btn_nine.setLabel("X");
                //add to first player list
                player_one.add("9");
            }
            else
            {
                gp.btn_nine.setLabel("Q");
                //add second player list
                player_two.add("9");
            }
        }
        
        for(int i=0; i<num;i++)
        {
            System.out.println(playerOne);
            System.out.println(player_one);
            System.out.println(playerTwo);
            System.out.println(player_two);
            System.out.println();
            if(player_one.size()>=4 && player_two.size()>=4)
            {
                if(player_one.contains("1") && player_one.contains("2") && player_one.contains("3") 
                || player_one.contains("4") && player_one.contains("5") && player_one.contains("6")
                || player_one.contains("7") && player_one.contains("8") && player_one.contains("9")
                || player_one.contains("1") && player_one.contains("4") && player_one.contains("7")
                || player_one.contains("2") && player_one.contains("5") && player_one.contains("8")
                || player_one.contains("3") && player_one.contains("6") && player_one.contains("9")
                || player_one.contains("1") && player_one.contains("5") && player_one.contains("9")
                || player_one.contains("3") && player_one.contains("5") && player_one.contains("7")
                )
                {
                    System.out.println("winner is Player One ");
                    try {
                        char cc[] = new char[15];
                        FileReader fr1 = new FileReader("one.txt");
                        fr1.read(cc);
                        fr1.close();
                        String onne = new String(cc);
                        JOptionPane.showMessageDialog(null, onne+"  wins");
                        gp.setVisible(false);
                        break;
                    } catch (Exception ef) {
                       System.out.println(ef);
                    }
    
                }
                else if(player_two.contains("1") && player_two.contains("2") && player_two.contains("3") 
                || player_two.contains("4") && player_two.contains("5") && player_two.contains("6")
                ||player_two.contains("7") && player_two.contains("8") && player_two.contains("9")
                ||player_two.contains("1") && player_two.contains("4") && player_two.contains("7")
                || player_two.contains("2") && player_two.contains("5") && player_two.contains("8")
                || player_two.contains("3") && player_two.contains("6") && player_two.contains("9")
                ||player_two.contains("1") && player_two.contains("5") && player_two.contains("9")
                || player_two.contains("3") &&player_two.contains("5") && player_two.contains("7")
                )
                {
                    System.out.println("winner is Player Two");
                    try {
                        char ch[] = new char[20];
                        FileReader fr2 = new FileReader("two.txt");
                        fr2.read(ch);
                        fr2.close();
                        String twoo = new String(ch);
                        JOptionPane.showMessageDialog(null, twoo+"  wins");
                        gp.setVisible(false);
                        break;
                    } catch (Exception ee) {
                       System.out.println(ee);
                    }
                }
                else 
                {
                    System.out.println("DRAW");
                    JOptionPane.showMessageDialog(null, "  Draw");
                    gp.setVisible(false);
                    break;
                }
            }
           
        }
        System.out.println(playerOne);
        System.out.println(playerTwo);
    }
    
}