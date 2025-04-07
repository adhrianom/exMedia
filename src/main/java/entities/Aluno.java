
package entities;

public class Aluno {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public Aluno(){
       
    }
    
    public Aluno(String name, double nota1, double nota2, double nota3){
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public double getNota1(){
        return nota1;
    }
    
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    
    public double getNota2(){
        return nota2;
    }
    
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    
    public double getNota3(){
        return nota3;
    }
    
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getMedia(){
        return (getNota1() + getNota2() + getNota3()) / 3.0;
    }
}
