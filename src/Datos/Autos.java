package Datos;

public class Autos {

   
    int VIN;
    String Model, Color;
   

   public Autos(){
        super();
    }

    public void SetModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void SetColor(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void SetVIN(int VIN) {
        this.VIN = VIN;
    }

    public int getVIN() {
        return VIN;
    }


}
