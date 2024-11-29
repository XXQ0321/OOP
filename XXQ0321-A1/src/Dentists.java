public class Dentists extends HealthProfessional{
    private String dentalLicenseNumber; 

    public Dentists(){}

    public Dentists(int id, String name, int age, String dentalLicenseNumber) {
        super(id, name, age);
        this.dentalLicenseNumber = dentalLicenseNumber;
    }

    public String getDentalLicenseNumber() {
        return dentalLicenseNumber;
    }

    public void setDentalLicenseNumber(String dentalLicenseNumber) {
        this.dentalLicenseNumber = dentalLicenseNumber;
    }

    
