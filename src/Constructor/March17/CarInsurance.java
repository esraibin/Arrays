package Constructor.March17;

public class CarInsurance {
    private int modelYear;
    private int numTicket;
    private int numAccident;
    private  double offer;
    final double basePrice=99.9;



    public CarInsurance(int modelYear, int numTicket,int numAccident){
    this.modelYear=modelYear;
    this.numAccident=numAccident;
    this.numTicket=numTicket;
    this.offer= 0;
  }
  public void setModelYear(int modelYear){
        this.modelYear=modelYear;
  }
  public int getModelYear(){
        return this.modelYear;
  }
  public void setNumberOfTicket(int tickets){
        this.numTicket=tickets;
  }
  public int getNumberOfTicket(){
        return this.numTicket;
  }
  public void setNumberOfAccidents(int accidents){
        this.numAccident= accidents;
  }
  public int getNumberAccident(){
        return this.numAccident;
  }
  public void setOffer(int offer){
        this.offer=offer;
  }
  public double getOffer(){
        return this.offer;
  }
  public double makeOffer(int year){
        this.offer = this.basePrice+(year-this.modelYear)*50+(30*this.numTicket)+(100*numAccident);
  return this.offer;
    }

    @Override
    public String toString() {
        return "CarInsurance{" +
                "modelYear=" + modelYear +
                ", numTicket=" + numTicket +
                ", numAccident=" + numAccident +
                ", offer=" + offer +
                ", basePrice=" + basePrice +
                '}';
    }
}
