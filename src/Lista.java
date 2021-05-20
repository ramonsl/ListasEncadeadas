public class Lista {

    Pessoa first;
    Pessoa last;
    int size;


    public boolean add(Pessoa p){
        if (first==null){
            first =p;
            last =p;
            size++;
            return true;
        }else{
            p.proximo = this.first;
            this.first=p;
            size++;
            return true;
        }
    }
    public boolean addFim(Pessoa p){
        if(first==null){
          return   add(p);
        }else{
            this.last.proximo=p;
            this.last=p;
            size++;
            return true;
        }
    }
    public void exibir(){
        Pessoa aux= this.first;
        if(aux==null){
            System.out.println("Lista vazia");
        }else{
            while (aux!=null){
aux.mostrar();
aux= aux.proximo;
            }
        }
        System.out.println("-------------------");
    }
    public void add(int position, Pessoa p){
        if(first==null){
            System.out.println("Posição invalida, adicionado no inicio da lista");
            add(p);
        }else{
            if(position>=size){
                addFim(p);
            }else {
                if (position==0){
                    add(p);
                }else {
                    Pessoa aux= first;
                    int pos=0;
                    while (pos<position-1){
                        aux=aux.proximo;
                        pos++;
                    }
                        p.proximo=aux.proximo;
                        aux.proximo=p;
                        size++;
                }
            }
        }

    }

    public void del(){
        if(first!=null){
            if(size==1){
               last=null;
               first=null;
               size=0;
            }else{
            Pessoa aux= first;
            first= aux.proximo;
            size--;
            }
        }else{
            System.out.println("Lista vazia");
        }
    }
    public void delFim(){
        if(last==null){
            System.out.println("Lista Vazia");
        }else{
            Pessoa ant=first;
            Pessoa ultimo=first;
            while (ultimo!=last){
                ant=ultimo;
                ultimo=ultimo.proximo;
            }
            ant.proximo=null;
            last=ant;
            size--;
        }
    }
}
