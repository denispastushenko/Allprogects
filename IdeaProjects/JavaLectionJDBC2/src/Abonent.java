
public class Abonent extends Entity {
    private int phone;
    private String lastname;

    @Override
    public String toString() {
        return "Abonent{" +
                "phone=" + phone +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public Abonent(int id, String lastname, int phone) {
        super(id);
        this.lastname = lastname;
        this.phone = phone;
    }
}
