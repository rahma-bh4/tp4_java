public class main
{

    public static void main (String [] args)
    {
     Dictionnaire d1=new Dictionnaire(6,"titre1");
     Mot_dict m1=new Mot_dict();
     m1.setMot("mot1");
     m1.setDefinition("aaaaa");
     Mot_dict m2=new Mot_dict();
     m2.setMot("mot2");
     m2.setDefinition("bbbbb");
     Mot_dict m3=new Mot_dict();
     m3.setMot("mot3");
     m3.setDefinition("cccccc");
    d1.Ajouter_Mot(m1);
    d1.Ajouter_Mot(m2);
    d1.Ajouter_Mot(m3);
    d1.lister_dictionnaire();
    d1.trier();
    d1.lister_dictionnaire();
    System.out.println(d1.Recherche_dicho("mot3"));
    }
}