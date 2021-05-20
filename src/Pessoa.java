public class Pessoa {
    String nome;
    int idade;
    Pessoa proximo;

    Pessoa(String name, int i){
        nome=name;
        idade=i;
    }

   public void mostrar(){
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idade);
    }
}
