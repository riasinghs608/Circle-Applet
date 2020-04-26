
package CircleApplet;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


class circle
{
    int x,y,w,h;
    
    void get(int x,int y,int w, int h)
    {
        this.h=h;
        this.w=w;
        this.x=x;
        this.y=y;
    }
}

/*<applet code="Calculator" width=700 height=700>
</applet>
*/

public class Circleapplet extends Applet implements ActionListener {
    
    Label l;
    Button b1,b2,b3,b4;
    circle c=new circle();
    
    public void paint(Graphics g)
    {
        g.drawOval(c.x, c.y, c.w, c.h);
    }
    
    public void init()
    {
        l=new Label("CIRCLE");
        b1=new Button("GROW");
        b2=new Button("SHRINK");
        b3=new Button("MOVE LEFT");
        b4=new Button("MOVE RIGHT");
        add(l);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        c.get(200, 200, 50, 50);
        repaint();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String s=e.getActionCommand();
        
        if(s.equals("GROW"))
        {
            c.h=c.h+400;
            c.w=c.w+400;
            repaint();
        }
        
        if(s.equals("SHRINK"))
        {
            c.h=c.h-300;
            c.w=c.w-300;
            repaint();
        }
        
        if(s.equals("MOVE RIGHT"))
        {
            c.x=c.x+300;
            repaint();
        }
        
        if(s.equals("MOVE LEFT"))
        {
            c.x=c.x-150;
            repaint();
        }
        
    }
    
    
    
    
    
}
