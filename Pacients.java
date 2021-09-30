package Pacient_details;

import Pacient_details.Eyes;
import Pacient_details.Hearth;
import Pacient_details.Stomach;


public class Pacients {
    private String name;
    private Hearth hearth;
    private Eyes eyes;
    private Stomach stomach;

    public Pacients(Hearth hearth,Eyes eyes,Stomach stomach,String name){
        this.name=name;
        this.hearth=hearth;
        this.eyes=eyes;
        this.stomach=stomach;
    }

    public Pacients() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hearth getHearth() {
        return hearth;
    }

    public void setHearth(Hearth hearth) {
        this.hearth = hearth;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }
}
