import javax.swing.*;

public class Consumo {
    Double consumo;

    public Consumo(Double consumo){
        this.consumo = consumo;
    }

    //Cálculos

    void iniciarCalculos(){

        double fornecimento = fornecimento();
        double icms = icms(fornecimento);
        double cofins = cofins(fornecimento);
        double pisPasep = pisPasep(fornecimento);
        double icmsCofins = icmsCofins(fornecimento);
        double icmsPisPasep = icmsPisPasep(fornecimento);

        double fatura = fornecimento + icms + cofins + pisPasep + icmsCofins + icmsPisPasep;

        JOptionPane.showMessageDialog(null, "Fornecimento: "+ fornecimento +
                                        "\nICMS: "+icms+
                                        "\nCOFINS: "+cofins+
                                        "\nPIS/PASEP: "+pisPasep+
                                        "\nICMS sobre COFINS: "+icmsCofins+
                                        "\nICMS sobre PIS/PASEP: "+icmsPisPasep+
                                        "\nFATURA: "+fatura);
    }

    double fornecimento(){
        return consumo * 0.28172;
    }

    double icms(double fornecimento){
        if(consumo <= 200){
            return fornecimento * 0.136363;
        }else{
            return fornecimento * 0.333333;
        }
    }

    double cofins(double fornecimento){
        if(consumo <= 200){
            return fornecimento * 0.0614722;
        }else{
            return fornecimento * 0.0730751;
        }
    }

    double pisPasep(double fornecimento){
        if(consumo <= 200){
            return fornecimento * 0.013346;
        }else{
            return fornecimento * 0.0158651;
        }
    }

    double icmsCofins(double fornecimento){
        if(consumo <= 200){
            return 0.0614722 * 0.136363 * fornecimento;
        }else{
            return 0.0730751 * 0.333333 * fornecimento;
        }
    }

    double icmsPisPasep(double fornecimento){

        if(consumo <= 200){
           return 0.013346 * 0.136363 * fornecimento;
        }else{
           return 0.0158651 * 0.333333 * fornecimento;
        }
    }


}
