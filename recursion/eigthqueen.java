import java.util.*;
import javax.swing.*;
import java.awt.*;

class eigthqueen extends JFrame{
JButton JB1;
JButton JB2;
JButton JB3;
JButton JB4;
JButton JB5;
JButton JB6;
JButton JB7;
JButton JB8;
JButton JB9;
JButton JB10;
JButton JB11;
JButton JB12;
JButton JB13;
JButton JB14;
JButton JB15;
JButton JB16;
JButton JB17;
JButton JB18;
JButton JB19;
JButton JB20;
JButton JB21;
JButton JB22;
JButton JB23;
JButton JB24;
JButton JB25;
JButton JB26;
JButton JB27;
JButton JB28;
JButton JB29;
JButton JB30;
JButton JB31;
JButton JB32;
JButton JB33;
JButton JB34;
JButton JB35;
JButton JB36;
JButton JB37;
JButton JB38;
JButton JB39;
JButton JB40;
JButton JB41;
JButton JB42;
JButton JB43;
JButton JB44;
JButton JB45;
JButton JB46;
JButton JB47;
JButton JB48;
JButton JB49;
JButton JB50;
JButton JB51;
JButton JB52;
JButton JB53;
JButton JB54;
JButton JB55;
JButton JB56;
JButton JB57;
JButton JB58;
JButton JB59;
JButton JB60;
JButton JB61;
JButton JB62;
JButton JB63;
JButton JB64;

JPanel pan=new JPanel();
GridBagLayout gbl=new GridBagLayout();
GridBagConstraints gc=new GridBagConstraints();

eigthqueen(){
sendUI();
givebtn();
	}

void givebtn(){
JB1=new JButton("asd");
JB2=new JButton();
JB3=new JButton();
JB4=new JButton();
JB5=new JButton();
JB6=new JButton();
JB7=new JButton();
JB8=new JButton();
JB9=new JButton();
JB10=new JButton();
JB11=new JButton();
JB12=new JButton();
JB13=new JButton();
JB14=new JButton();
JB15=new JButton();
JB16=new JButton();
JB17=new JButton();
JB18=new JButton();
JB19=new JButton();
JB20=new JButton();
JB21=new JButton();
JB22=new JButton();
JB23=new JButton();
JB24=new JButton();
JB25=new JButton();
JB26=new JButton();
JB27=new JButton();
JB28=new JButton();
JB29=new JButton();
JB30=new JButton();
JB31=new JButton();
JB32=new JButton();
JB33=new JButton();
JB34=new JButton();
JB35=new JButton();
JB36=new JButton();
JB37=new JButton();
JB38=new JButton();
JB39=new JButton();
JB40=new JButton();
JB41=new JButton();
JB42=new JButton();
JB43=new JButton();
JB44=new JButton();
JB45=new JButton();
JB46=new JButton();
JB47=new JButton();
JB48=new JButton();
JB49=new JButton();
JB50=new JButton();
JB51=new JButton();
JB52=new JButton();
JB53=new JButton();
JB54=new JButton();
JB55=new JButton();
JB56=new JButton();
JB57=new JButton();
JB58=new JButton();
JB59=new JButton();
JB60=new JButton();
JB61=new JButton();
JB62=new JButton();
JB63=new JButton();
JB64=new JButton();

gc.gridx=1;
gc.gridy=1;
gc.fill=2;
pan.add(JB1,gc);
add(JB2);
add(JB3);
add(JB4);
add(JB5);
add(JB6);
add(JB7);
add(JB8);
add(JB9);
add(JB10);

add(JB11);
add(JB12);
add(JB13);
add(JB14);
add(JB15);
add(JB16);
add(JB17);
add(JB18);
add(JB19);
add(JB20);

add(JB21);
add(JB22);
add(JB23);
add(JB24);
add(JB25);
add(JB26);
add(JB27);
add(JB28);
add(JB29);
add(JB30);
add(JB31);
add(JB32);
add(JB33);
add(JB34);
add(JB35);
add(JB36);
add(JB37);
add(JB38);
add(JB39);
add(JB40);
add(JB41);
add(JB42);
add(JB43);
add(JB44);
add(JB45);
add(JB46);
add(JB47);
add(JB48);
add(JB49);
add(JB50);
add(JB51);
add(JB52);
add(JB53);
add(JB54);
add(JB55);
add(JB56);
add(JB57);
add(JB58);
add(JB59);
add(JB60);
add(JB61);
add(JB62);
add(JB63);
add(JB64);
}

void sendUI(){
	add(pan);
	pan.setLayout(gbl);
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String [] args){
eigthqueen al=new eigthqueen();
	}
}