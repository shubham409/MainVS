import java.awt.*;  
class Gui
{
    public static void main(String[] args) {
        Frame f= new Frame("Label Example");  
        Label l1,l2;  
        l1=new Label("First Label.");  
        l1.setBounds(50,100, 100,30);  
        l2=new Label("Second Label.");  
        l2.setBounds(50,150, 100,30);  
        f.add(l1); f.add(l2);  

        TextField tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        Button b=new Button("Click Here");  
        b.setBounds(200,250,200,250);  
        f.add(b);  
        f.add(tf);

        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 

    }
}