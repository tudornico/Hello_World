package Pacient_details;

public class Hearth extends Organ {
    public Hearth(String organ_name, String organ_medical_condition,int current_bpm) {
        super(organ_name, organ_medical_condition);
        this.bpm=current_bpm;
    }
    private int bpm;

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
    public void heart_printer(){
        this.printer();
        System.out.println("BPM : "+this.getBpm());
    }
}
