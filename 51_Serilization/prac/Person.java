class Person implements java.io.Serializable{
    String name ;
    String entryT;
    String exitT;
    String MobN ;
    Person(String name, String entryT, String exitT, String MobN){
        this.name = name;
        this.entryT = entryT;
        this.exitT = exitT;
        this.MobN = MobN;
    }
}
