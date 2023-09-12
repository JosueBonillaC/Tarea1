// @author Josue Bonilla Castro
//Programa donde se van a llamar las operaciones 
public class Conversiones {
   public double resultado; //Varible generalizada para los resultados 
    
    public void calculodolar (double colones){ //Proceso para el conversor de dolares 
        resultado= colones * 603.35; //Formula para convertir el dolar 
    }
    public void calculogrados (double centigrados){ //Proceso para el conversor de grados 
        resultado= (centigrados * 9/5)+32; //Formula para convertir los grados 
    }   
    public void calculoarea (double base, double altura){ //Proceso para el area del triangulo 
        resultado= (base*altura)/2; //Formula para calcular el area del triangulo 
    }   
    public void calculofecha (double meses, double ano){ //Proceso para el calculo de los meses 
        resultado= ((2020-ano)*12)-meses+10; //Formula para calcular los meses transcurridos 
    }     
}
