package especial.examples;

public class Smartphones {

    private String serialNumber;
    private String brand;

    public Smartphones(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // Reflexixo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) ==true
    // Consistente: x.equals(x) sem retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (this.getClass() != object.getClass()) return false;
        Smartphones smartphones = (Smartphones) object; // -> Feito o Cast do objeto para smartphone
        //Sempre verificar a regra de negócios
        return serialNumber != null && serialNumber.equals(smartphones.serialNumber);
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
