import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FDemo extends JFrame{
   JPDemo jp1;
    FDemo(){
        super.setTitle("Snake and Ladder");
        jp1=new JPDemo();
        add(jp1);
        setResizable(false);
    }
}
class JPDemo extends JPanel implements ActionListener {
   ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9;
   Image board,start,p1,p2,pl1,pl2,dice,droll,finish;
   JButton b1,b2,b3;
   JTextField tx1,tx2,tx3;
   int px1=30,py1=580,px2=100,py2=580,c1,c2,chance;
    JPDemo(){
       setBackground(Color.black);
       img1=new ImageIcon("board.jpg");
       board= img1.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        img2=new ImageIcon("start-sign-clipart-4.png");
        start= img2.getImage().getScaledInstance(120,90,Image.SCALE_DEFAULT);
        img3=new ImageIcon("Pl1.png");
        p1= img3.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        img4=new ImageIcon("Pl2.png");
        p2= img4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        img5=new ImageIcon("Pl1.png");
        pl1= img5.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        img6=new ImageIcon("Pl2.png");
        pl2= img6.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        img8=new ImageIcon("droll.gif");
        droll= img8.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        setLayout(null);
        img7=new ImageIcon("dice.png");
        dice= img7.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        img9=new ImageIcon("finish.png");
        finish= img9.getImage().getScaledInstance(130,90,Image.SCALE_DEFAULT); b1=new JButton("About");
        Font f=new Font("Cursive",Font.BOLD,20);
        b1.setFont(f);
        b1.setBounds(20,80,100,50);
        b1.setBackground(Color.black);
        b1.setForeground(Color.red);
        add(b1);
        b1.addActionListener(this);
        b2=new JButton("Reset");
        b2.setFont(f);
        b2.setBounds(20,150,100,50);
        b2.setBackground(Color.yellow);
        add(b2);
        b2.addActionListener(this);
        Font f1=new Font("",Font.ITALIC,20);
        tx1=new JTextField("Start Game");
        tx1.setBounds(20,230,120,35);
        tx1.setFont(f1);
        tx1.setBackground(Color.black);
        tx1.setForeground(Color.green);
        add(tx1);
        tx2=new JTextField("Player 1");
        tx2.setBounds(25,280,120,35);
        tx2.setFont(f1);
        tx2.setBackground(Color.black);
        tx2.setForeground(Color.green);
        add(tx2);
        tx3=new JTextField("Player 2");
        tx3.setBounds(25,320,120,35);
        tx3.setFont(f1);
        tx3.setBackground(Color.black);
        tx3.setForeground(Color.green);
        add(tx3);
        b3=new JButton("Roll");
        b3.setFont(f);
        b3.setBounds(20,470,100,30);
        b3.setBackground(Color.LIGHT_GRAY);
        add(b3);
        b3.addActionListener(this);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(18,10,200));
        g.fillRect(0,0,780,700);
        g.drawImage(board,150,10,this);
        g.drawImage(start,30,540,this);
        g.drawImage(p1,px1,py1,this);
        g.drawImage(p2,px2,py2,this);
        g.drawImage(pl1,0,280,this);
        g.drawImage(pl2,0,320,this);
        g.drawImage(dice,20,390,this);
        g.drawImage(droll,70,390,this);
        g.drawImage(finish,0,0,this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b3)
        {
            int random=(int)Math.round(Math.random()*5+1);
            System.out.println(random);
             chance++;
           if(chance%2==1){
               switch (random)
            {
                case 1:  img7=new ImageIcon("dice.png");
                          c1+=1;
                          break;
                case 2:  img7=new ImageIcon("D2.png");
                    c1+=2;
                          break;
                case 3:  img7=new ImageIcon("D3.png");
                    c1+=3;
                          break;
                case 4:  img7=new ImageIcon("D4.png");
                    c1+=4;break;
                case 5:  img7=new ImageIcon("D5.png");
                    c1+=5; break;
                case 6:  img7=new ImageIcon("D6.png");
                    c1+=6;break;

            }
            if(c1==1)
               c1=38;
            if(c1==4)
                c1=14;
            if(c1==9)
                   c1=31;
            if(c1==21)
                   c1=42;
               if(c1==28)
                   c1=84;
               if(c1==51)
                   c1=67;
               if(c1==80)
                   c1=100;
               if(c1==71)
                   c1=91;
               if(c1==17)
                   c1=7;
               if(c1==54)
                   c1=34;
               if(c1==62)
                   c1=19;
               if(c1==64)
                   c1=60;
               if(c1==87)
                   c1=24;
               if(c1==93)
                   c1=73;
               if(c1==95)
                   c1=75;
               if(c1==98)
                   c1=79;
            if(((c1/10)%2==0&&c1!=20&&c1!=40&&c1!=60&&c1!=100))
           {
                py1=550-(c1/10)*60;
                px1=90+(c1%10)*60;
            }
            else if(((c1/10)%2==1&&c1!=10&&c1!=30&&c1!=50&&c1!=70&&c1!=90))
            {
                py1=550-(c1/10)*60;
               px1=760-(c1%10)*60;
            }
            else{
                py1=550-(c1-1)/10*60;
                if((c1/2)%2==0)
                    px1=150;
                else
                    px1=690;
}
            dice= img7.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
            repaint();
        }
           else{
               switch (random)
               {
                   case 1:  img7=new ImageIcon("dice.png");
                            c2+=1;
                            break;
                   case 2:  img7=new ImageIcon("D2.png");
                           c2+=2;
                            break;
                   case 3:  img7=new ImageIcon("D3.png");
                            c2+=3;
                            break;
                   case 4:  img7=new ImageIcon("D4.png");
                             c2+=4;
                             break;
                   case 5:  img7=new ImageIcon("D5.png");
                             c2+=5;
                             break;
                   case 6:  img7=new ImageIcon("D6.png");
                             c2+=6;
                             break;

               }
               if(c2==1)
                   c2=38;
               if(c2==4)
                   c2=14;
               if(c2==9)
                   c2=31;
               if(c2==21)
                   c2=42;
               if(c2==28)
                   c2=84;
               if(c2==51)
                   c2=67;
               if(c2==80)
                   c2=100;
               if(c2==71)
                   c2=91;
               if(c2==17)
                   c2=7;
               if(c2==54)
                   c2=34;
               if(c2==62)
                   c2=19;
               if(c2==64)
                   c2=60;
               if(c2==87)
                   c2=24;
               if(c2==93)
                   c2=73;
               if(c2==95)
                   c2=75;
               if(c2==98)
                   c2=79;
               if(((c2/10)%2==0&&c2!=20&&c2!=40&&c2!=60&&c2!=100))
               {
                   py2=550-(c2/10)*60;
                   px2=100+(c2%10)*60;
               }
               else if(((c2/10)%2==1&&c2!=10&&c2!=30&&c2!=50&&c2!=70&&c2!=90))
               {
                   py2=550-(c2/10)*60;
                   px2=770-(c2%10)*60;
               }
               else{
                   py2=550-(c2-1)/10*60;
                   if((c2/10)%2==0)
                       px2=150;
                   else
                       px2=690;
               }
               dice= img7.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
               repaint();
               if(c1>100){
                   JFrame frame=new JFrame();
                   JOptionPane.showMessageDialog(frame,"Player 1 Wins","Snake and Ladder",JOptionPane.INFORMATION_MESSAGE);
               }
               if(c2>100){
                   JFrame frame=new JFrame();
                   JOptionPane.showMessageDialog(frame,"Player 2 Wins","Snake and Ladder",JOptionPane.INFORMATION_MESSAGE);
               }
           }
        }
        if(e.getSource()==b2)
        {
            c1=0;c2=0;chance=0;
            px1=30;py1=580;px2=120;py2=580;
        }
if(e.getSource()==b1){
    JFrame frame=new JFrame();
    JOptionPane.showMessageDialog(frame,"It is a board game for 2 players.The objective of this game is to navigate one's game piece,according to die rolls,from from the start to the finish helped by climbing ladders but hindered by falling down snakes.","Snake and Ladder",JOptionPane.INFORMATION_MESSAGE);
}
}}
class Main {
    public static void main(String[] args) {
       FDemo f=new FDemo();
       f.setVisible(true);
       f.setLocation(200,100);
       f.setSize(780,700);
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
