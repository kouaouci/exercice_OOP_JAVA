package exercice_singleton;

public class Singleton {
    public static void main(String[] args) {
        Singleton classSingleton1 = Singleton.getInstance();

        System.out.println(classSingleton1.getInfo()); //Initial class info


    }
        /** Constructeur privé */
     private Singleton ()
        {
        }
        /** Instance unique pré-initialisée */
        private static Singleton INSTANCE =new Singleton ();

        private String info = "intial info class";
        private String info1= "initial2 info1 class";

        /** Point d'accès pour l'instance unique du singleton */
        public static Singleton getInstance ()
        {
            return INSTANCE;
        }public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }





    }

