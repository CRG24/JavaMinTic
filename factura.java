public class factura{
    public double valortotal;
    public double IVA;
    public double descuento;
    public double propina;
    public double totalpagar;

    public factura(){
    }

    public factura(double valortotal){
      this.valortotal = valortotal;
    }

    public void imprimirfactura(){
      if (this.valortotal>=100){
            this.descuento = this.valortotal*0.15;
            System.out.println("Obtuvo un descuento del 15% por:" +this.descuento);
      }else{
        this.descuento = this.valortotal*0.02;
        System.out.println("Obtuvo un descuento del 2% por:" +this.descuento);
      }
        this.IVA = this.valortotal*0.19;
        this.propina = this.valortotal*0.1;
        this.totalpagar = this.valortotal+this.IVA+this.propina-this.descuento;
        System.out.println("valortotal = "+ this.valortotal +"\n" +"IVA = "+ this.IVA +"\n" +"Propina = "+this.propina +"\n"+"Descuento = "+this.descuento +"\n" +"Total a pagar = "+this.totalpagar +"\n");
    }
}
