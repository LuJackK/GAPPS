package playground;

public class SoilData {
    private double pH;
    private double nitrogen; // Total nitrogen content
    private double clay; // %
    private double sand; // %
    private double silt; // %
    private double organicCarbon;
    private double cec; // CEC (Cation Exchange Capacity) is a measure of how well soil can hold and exchange positively charged nutrients like: Potassium, Magnesium, Calcium
    private double bulkDensity;

    public SoilData(){

    }

    public SoilData(double bdod, double cec, double clay, double nitrogen, double ph, double sand, double silt) {
        this.bulkDensity = bdod;
        this.cec = cec;
        this.clay = clay;
        this.nitrogen = nitrogen;
        this.pH = ph;
        this.sand = sand;
        this.silt = silt;
    }

    public double getpH() {
        return pH;
    }
    public void setpH(double pH) {
        this.pH = pH;
    }
    public double getNitrogen() {
        return nitrogen;
    }
    public void setNitrogen(double nitrogen) {
        this.nitrogen = nitrogen;
    }
    public double getClay() {
        return clay;
    }
    public void setClay(double clay) {
        this.clay = clay;
    }
    public double getSand() {
        return sand;
    }
    public void setSand(double sand) {
        this.sand = sand;
    }
    public double getSilt() {
        return silt;
    }
    public void setSilt(double silt) {
        this.silt = silt;
    }
    public double getOrganicCarbon() {
        return organicCarbon;
    }
    public void setOrganicCarbon(double organicCarbon) {
        this.organicCarbon = organicCarbon;
    }
    public double getCec() {
        return cec;
    }
    public void setCec(double cec) {
        this.cec = cec;
    }
    public double getBulkDensity() {
        return bulkDensity;
    }
    public void setBulkDensity(double bulkDensity) {
        this.bulkDensity = bulkDensity;
    }

    public String getSoilTextureType() {
        if (clay > 400) return "Clay";
        if (sand > 700) return "Sandy";
        if (silt > 600 && clay < 200) return "Silt loam";
        if (sand > 400 && clay > 200) return "Loam";
        return "Unknown";
    }

    @Override
    public String toString(){
        return "SoilData{" +
                ", bulkDensity=" + bulkDensity +
                ", cec=" + cec +
                ", clay=" + clay +
                ", nitrogen=" + nitrogen +
                ", pH=" + pH +
                ", sand=" + sand +
                ", silt=" + silt +
                '}';
    }
}
