public class CarteirinhaConvenio {
public static void main(String[] args){

int codigoDeSaida=9;

for(int codigo=1;codigo<=10;codigo++) {

if(codigo==codigoDeSaida){

System.out.println("Saindo...");
break;
}

if(codigo==3 || codigo==7 || codigo==10){
  
System.out.println("Aceito");
continue;
}
System.out.println("Não aceito");

        }


    } 

}
