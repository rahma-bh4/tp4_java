public class Dictionnaire 
{
    private int nb_mots;
    private Mot_dict[] Dict;
    private String nom;
    private int taille;
    public Dictionnaire(int n,String ch)
    {
        
        taille=n;
        Dict=new Mot_dict[taille];
        nom=ch;
    }
    public Dictionnaire(int n)
    {
        taille=n;
        Dict=new Mot_dict[taille];
    }
    public void Ajouter_Mot(Mot_dict m)
    {
        
      if(taille==nb_mots)
      {
        System.out.println("toute les cases du tableau sont rempli !!");
      }
     else {
        int i=nb_mots-1;
        while(i>=0 && Dict[i].getMot().compareTo(m.getMot())>0)
        {
            Dict[i+1]=Dict[i];
            i--;
        }
        Dict[i+1]=m;
        nb_mots++;
      }
    }
    public void trier()
    {
         Mot_dict temp=new Mot_dict();
        
        for (int i = 0; i < nb_mots - 1; i++) {
            
            for (int j = 0; j < nb_mots - i - 1; j++) {
               
                if (Dict[j].getMot().compareTo(Dict[j + 1].getMot()) > 0) {
                    
                    temp = Dict[j];
                    Dict[j] = Dict[j + 1];
                    Dict[j + 1] = temp;
                }
            }
        }
    }
    public void Supprimer_Mot(Mot_dict m)
    {
        int n=0;
        while(n<nb_mots && !Dict[n].getMot().equals(m.getMot()))
        {
            n++;
        }
        if(n==nb_mots)
        {
            System.out.println("le mot n'existe pas ");

        }
        else{
            for(int i=n;i<nb_mots-1;i++)
            {
                Dict[i]=Dict[i-1];
            }
        }
    }
   public String Recherche_dicho(String m)
    {
         int gauche = 0;
        int droite = nb_mots - 1;
        boolean trouvée = false;
        String ch="n'est pas trouvée";

        while (gauche <= droite) {
            int milieu = gauche + (droite - gauche) / 2;

          
            int resultatComparaison = Dict[milieu].getMot().compareTo(m);

            if (resultatComparaison == 0) {
                
                trouvée = true;
                ch="trouvée";
              
            }

            
            if (resultatComparaison < 0) {
                gauche = milieu + 1;
            }
    
            else {
                droite = milieu - 1;
            }
        }

        if (!trouvée) {
            ch="n'est pas trouvée!!";
        
           
        }
        return ch;
    }
    public void lister_dictionnaire()
    {
        System.out.println("la liste de mots de tableau :");
        for(int i=0;i<nb_mots;i++)
        {
            System.out.println(Dict[i].getMot());
        }
    }
    public int Nombre_synonyme(Mot_dict m)
    {
        int nb=0;
        for(int i=0;i<nb_mots;i++)
        {
            if(m.synonyme(Dict[i]))
            {
                nb++;
            }
        }
        return nb;
    }
}