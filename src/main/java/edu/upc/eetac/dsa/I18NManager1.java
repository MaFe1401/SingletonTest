package edu.upc.eetac.dsa;

import java.util.ResourceBundle;

public class I18NManager1 {
    private static I18NManager1 instance;
    private ResourceBundle ca, en, es, pt;

    private I18NManager1(){
        this.ca=ResourceBundle.getBundle("ca");
        this.es=ResourceBundle.getBundle("es");
        this.en=ResourceBundle.getBundle("en");
        this.pt=ResourceBundle.getBundle("pt");
    }
    public String getText(String language, String key){
        ResourceBundle rs;
        if (language.equals("es")) rs=this.es;
        else if (language.equals("ca")) rs=this.ca;
        else if (language.equals("en")) rs=this.en;
        else rs=this.pt;

        return rs.getString(key);
    }
    public static I18NManager1 getInstance(){
        if (instance==null) instance=new I18NManager1();
        return instance;
    }
    public static void main(String[] args){
        String value;
        value=I18NManager1.getInstance().getText("ca","l1");
        System.out.println(value);
        value=I18NManager1.getInstance().getText("es","l1");
        System.out.println(value);
        value=I18NManager1.getInstance().getText("en","l1");
        System.out.println(value);
        value=I18NManager1.getInstance().getText("pt","l1");
        System.out.println(value);
        value=I18NManager1.getInstance().getText("ca","l2");
        System.out.println(value);
        value=I18NManager1.getInstance().getText("es","l2");
        System.out.println(value);
        value=I18NManager1.getInstance().getText("en","l2");
        System.out.println(value);
        value=I18NManager1.getInstance().getText("pt","l2");
        System.out.println(value);

    }
}
