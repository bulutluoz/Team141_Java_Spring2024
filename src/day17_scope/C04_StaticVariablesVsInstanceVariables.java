package day17_scope;

public class C04_StaticVariablesVsInstanceVariables {


    static String hastaneIsmi = "Yildiz Hastanesi";
    static String bashekimIsmi = "Dr Emrah";
    static String hastaneAdresi = "Cankaya";

    String persIsmi;
    String perAdresi;
    String perTel;

    public static void main(String[] args) {

        C04_StaticVariablesVsInstanceVariables pers1 = new C04_StaticVariablesVsInstanceVariables();

        System.out.println(pers1.perAdresi); // null

        pers1.persIsmi = "Ulvi";
        pers1.perAdresi = "Cankaya";
        pers1.perTel = "5552345665";


        C04_StaticVariablesVsInstanceVariables pers2 = new C04_StaticVariablesVsInstanceVariables();
        System.out.println(pers2.persIsmi); //

    }
}
