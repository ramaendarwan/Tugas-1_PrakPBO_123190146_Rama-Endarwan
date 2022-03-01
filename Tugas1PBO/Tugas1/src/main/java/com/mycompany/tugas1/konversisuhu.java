/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas1;

/**
 *
 * @author NITRO 5
 */
public class konversisuhu {
    public double celcius, reamur, kelvin,fahrenheit;
    
    public konversisuhu(double Celcius){//construct
        this.celcius = Celcius;
    }
    public void inputCelcius(double Celcius){//untuk merubah nilai celcius
        this.celcius = Celcius; 
    }
    public double convertReamur(){//mengubah celcius ke reamur
        this.reamur = (4*this.celcius)/5;
        return reamur;
    }
    public double convertKelvin(){//mengubah celcius ke kelvin
         this.kelvin = (this.celcius+273.15); 
         return this.kelvin;
    }
    public double convertFahrenheit(){//mengubah celcius ke fahrenheit
        this.fahrenheit = ((9*this.celcius)/5)+32;
        return this.fahrenheit;
    }
    
    public String kondisiAir(){//kondisi air dalam suhu celcius
        if(this.celcius<=0){
            return "Kondisi Air Beku.";
        }else if(this.celcius>=100){
            return "Kondisi Air Mendidih.";
        }else{
            return "Kondisi Air Normal.";
        }
    }
}
