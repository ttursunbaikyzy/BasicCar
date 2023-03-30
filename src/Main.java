public class Main {
    public static void main(String[] args) {
        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

        Engine X=new Engine();
        X.cylinders="8";
        X.size="1234cc";
        X.weight="6453k";


        Color col=new Color();
        col.colorLights="True";
        col.colorTire="false";
        col.colorWindows="True";

        Lights neon=new Lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";

    }
}