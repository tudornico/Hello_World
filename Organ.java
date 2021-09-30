package Pacient_details;

public class Organ {
    private String name;
    private String Medical_condition;


    public String getName() {
        return name;
    }
    public Organ(String organ_name,String organ_medical_condition)
    {
        this.name=organ_name;
        this.Medical_condition=organ_medical_condition;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMedical_condition() {
        return Medical_condition;
    }

    public void setMedical_condition(String medical_condition) {
        Medical_condition = medical_condition;
    }

    public void printer(){
        System.out.println("Name :"+this.getName());
        System.out.println("Medical Condition"+this.getMedical_condition());
    }
}
