public class Funcionario{
  protected String nome; 
  protected double salarioBruto; 
  protected double imposto;
  
  public double salarioLiquido(){
    return salarioBruto - imposto;
  }  

  public void aumentarSalario(double porcentagem){
    salarioBruto += salarioBruto * (porcentagem / 100.0);
  }

  public String toString() {
    return nome + ", R$ " + String.format("%.2f", salarioLiquido());
  }
}