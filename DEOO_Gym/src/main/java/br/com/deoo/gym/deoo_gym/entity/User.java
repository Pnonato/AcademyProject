public class User{
    private int id;
    private String name;
    private PhysicalCharacteristics characteristic;



    public User(int id, String name, PhysicalCharacteristic characteristic) {
        setId(id);
        setName(name);
        setCharacteristic(characteristic);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhysicalCharacteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(PhysicalCharacteristic characteristic) {
        this.characteristic = characteristic;
    }
}