package hello;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class Rehber extends MIDlet implements CommandListener{
    List list;
    public void startApp() {
        list=new List("Test Listesi",List.IMPLICIT);
        list.append("Ekle",null);
        list.append("Sil",null);
        list.append("Duzelt",null);
        list.setCommandListener(this);
        Display.getDisplay(this).setCurrent(list);
    }
    public void pauseApp() {
    }
    public void destroyApp(boolean unconditional) {
    }
    public void commandAction(Command c,Displayable d){
        if(c==List.SELECT_COMMAND){  /* command secildi ise*/
            int index=list.getSelectedIndex();
            String choice=list.getString(index);
            if(choice=="Ekle"){
               
                /*Ekle ve diger java class lari*/
                /*Ekledeki 2 text box dan alinabilir ve digerleride buna benzer duzenlenebilir*/
            }            
        }
    }
}