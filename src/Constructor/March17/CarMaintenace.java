package Constructor.March17;

public class CarMaintenace {
    private String carNAme;
    private int odometerCurrent;
    private int odometerNextOilChange;
    private boolean airFilterStatus;
    private boolean cabinFilterStatus;
    private boolean oilFilterStatus;

    public CarMaintenace(String carNAme, int odometerCurrent, int odometerNextOilChange, boolean airFilterStatus, boolean cabinFilterStatus, boolean oilFilterStatus) {
        this.carNAme = carNAme;
        this.odometerCurrent = odometerCurrent;
        this.odometerNextOilChange = odometerNextOilChange;
        this.airFilterStatus = airFilterStatus;
        this.cabinFilterStatus = cabinFilterStatus;
        this.oilFilterStatus = oilFilterStatus;
    }

    public String getCarNAme() {
        return carNAme;
    }

    public void setCarNAme(String carNAme) {
        this.carNAme = carNAme;
    }

    public int getOdometerCurrent() {
        return odometerCurrent;
    }

    public void setOdometerCurrent(int odometerCurrent) {
        this.odometerCurrent = odometerCurrent;
    }

    public int getOdometerNextOilChange() {
        return odometerNextOilChange;
    }

    public void setOdometerNextOilChange(int odometerNextOilChange) {
        this.odometerNextOilChange = odometerNextOilChange;
    }

    public boolean isAirFilterStatus() {
        return airFilterStatus;
    }

    public void setAirFilterStatus(boolean airFilterStatus) {
        this.airFilterStatus = airFilterStatus;
    }

    public boolean isCabinFilterStatus() {
        return cabinFilterStatus;
    }

    public void setCabinFilterStatus(boolean cabinFilterStatus) {
        this.cabinFilterStatus = cabinFilterStatus;
    }

    public boolean isOilFilterStatus() {
        return oilFilterStatus;
    }

    public void setOilFilterStatus(boolean oilFilterStatus) {
        this.oilFilterStatus = oilFilterStatus;
    }

    public void doOilChange(){
        this.cabinFilterStatus=true;
        this.airFilterStatus=true;
        this.oilFilterStatus=true;
        this.odometerNextOilChange+=odometerCurrent+5000;
    }
    public void displayFilterStatus(){
        if(odometerNextOilChange>odometerCurrent){
            System.out.println("All filter is in good condition");
        }
        else{
            System.out.println("Please replace filters");
        }

    }

    @Override
    public String toString() {
        return "CarMaintenace{" +
                "carNAme='" + carNAme + '\'' +
                ", odometerCurrent=" + odometerCurrent +
                ", odometerNextOilChange=" + odometerNextOilChange +
                ", airFilterStatus=" + airFilterStatus +
                ", cabinFilterStatus=" + cabinFilterStatus +
                ", oilFilterStatus=" + oilFilterStatus +
                '}';
    }
}
