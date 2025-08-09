package Capitulo_03;

public class HealthProfile {

    private String name;
    private String lastname;
    private String sexo;
    private Date date;
    private double alturaMetros;
    private double pesoKg;

    HeartRates heartRates;

    public HealthProfile(String name, String lastname, String sexo, Date date, double alturaMetros, double pesoKg) {
        this.name = name;
        this.lastname = lastname;
        this.sexo = sexo;
        this.date = date;
        this.alturaMetros = alturaMetros;
        this.pesoKg = pesoKg;
        this.heartRates = new HeartRates(name, lastname, date);

    }

    public int getIdade(){
       return date.ageInYear(date.getAno());
    }

    public void getHeartRates(){
        heartRates.heartRateMax();
        heartRates.heartRateTarget();
    }

    public double getImc(){
        return pesoKg / Math.pow(alturaMetros, 2);
    }

    public void healthProfileDisplay(){
        heartRates.heartsToDisplay();
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura em metros: " + alturaMetros +"m");
        System.out.println("Peso em kg: " + pesoKg + "kg");
        System.out.println(getImc());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAlturaMetros() {
        return alturaMetros;
    }

    public void setAlturaMetros(double alturaMetros) {
        this.alturaMetros = alturaMetros;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
}
