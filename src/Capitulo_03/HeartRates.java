package Capitulo_03;

public class HeartRates {
    private String name;
    private String lastname;
    Date date;

    public HeartRates(String name, String lastname, Date date) {
        this.name = name;
        this.lastname = lastname;
        this.date = date;
    }

    public int heartRateMax(){
        return 220 - date.ageInYear(getDate().getAno());
    }

    public String heartRateTarget(){
        double rateTargetMin = heartRateMax() * 0.5;
        double rateTargetMax = heartRateMax() * 0.85;
        return String.format("The heart rate is between : %s and %s", rateTargetMin, rateTargetMax);
    }

    public void heartsToDisplay(){
        System.out.println("\n--- INFORMAÇÕES DA PESSOA ---");
        System.out.println("Nome completo: " + name + " " + lastname);
        System.out.print("Data de nascimento: ");
        date.displayDate();
        System.out.println("\nIdade: " + date.ageInYear(date.getAno()) + " anos");
        System.out.println("Frequência cardíaca máxima: " + heartRateMax() + " bpm");
        System.out.println("Zona de frequência cardíaca alvo: " + heartRateTarget());
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
