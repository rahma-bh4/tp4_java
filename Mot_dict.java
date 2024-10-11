public class Mot_dict
{
    private String mot;
    private String def;
    public String getDefinition()
    {
        return def;
    }
   public String getMot()
    {
        return mot;
    }
    public void setDefinition(String d)
    {
        def=d;
    }
    public void setMot(String m)
    {
        mot=m;
    }
    public Boolean synonyme(String ch)
    {
        if(def.equals(ch))
        {
            return true;
        }
        else {return false ;}
    }
    public Boolean synonyme(Mot_dict m)
    {
        if(def.equals(m.def))
        {
            return true;
        }
        else {return false ;}
    }


}