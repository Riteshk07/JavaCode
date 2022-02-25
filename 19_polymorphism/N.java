class Human {
    public void thinking(){System.out.println("Humans possess the Cognitive Abilities to learn");}
    public void smartness (){System.out.println("Humans are Smart");}
}

interface Smart {
    void smartness();
}

interface Intelligent {
    void thinking();
}

class Indian extends Human implements Smart, Intelligent {
    public static void main (String[]args){
        Smart s =new Indian();
        s.smartness();

        Intelligent A = new Indian();
        A.thinking();
    }
}