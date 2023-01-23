public abstract class Person implements Payable,Comparable<Person>{
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;
    public Person(String name,String surname) {
        setName(name);
        setSurname(surname);
        this.id=id_gen++;
    }
    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getSurname() + " earns " + GetPaymentAmount() + "tenge\n";
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public double GetPaymentAmount() {
        return 0;
    }
    @Override
    public int compareTo(Person o) {
        if (this.GetPaymentAmount() - o.GetPaymentAmount() < 0)
            return -1;
        else if (this.GetPaymentAmount() - o.GetPaymentAmount()== 0)
            return 0;
        else
            return 1;
    }

}
