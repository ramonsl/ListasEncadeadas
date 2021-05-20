public class Main {
    public static void main(String[] args) {


        Lista list = new Lista();
        list.exibir();
        Pessoa p= new Pessoa("Terceiro", 30);
        list.add(p);
        Pessoa p1= new Pessoa("Segundo", 30);
        list.add(p1);
        Pessoa p2= new Pessoa("Primeiro", 30);
        list.add(p2);
        Pessoa p3= new Pessoa("ULTIMO", 30);
        list.addFim(p3);
        list.exibir();
        Pessoa p4= new Pessoa("Zumira", 31);
        list.add(1,p4);
        list.exibir();
        list.delFim();
        list.exibir();
    }
}
