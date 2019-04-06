package pl.wszib.zadanie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.wszib.zadanie.domain.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewController {

    @GetMapping("iterat")
    public String iteration(Model model){
        List<Car> list = generateList();
        model.addAttribute("list", list);
        return "carTemplate";

    }

    @GetMapping ("pojedynczy")
    public String pojedynczy (Model model){

        Car car0 = new Car();
        car0.setMarka("Pojedynczy");
        car0.setRodzaj("YWR");
        car0.setCena(1000.8468);
        car0.setPrzebiegKilometry(1988968);
        car0.setRocznik("1996");

        return "pojedynczy";
    }


    private List<Car> generateList(){
        List<Car> list = new ArrayList<>();

        Car car = new Car();
        car.setMarka("Fiat");
        car.setRodzaj("Punto");
        car.setCena(1000.8468);
        car.setPrzebiegKilometry(1988968);
        car.setRocznik("1996");
        list.add(car);

        Car car1 = new Car();
        car1.setMarka("Ford");
        car1.setRodzaj("Scorpio");
        car1.setCena(2100.8468);
        car1.setPrzebiegKilometry(3288968);
        car1.setRocznik("2015");
        list.add(car1);

        Car car2 = new Car();
        car2.setMarka("Ford");
        car2.setRodzaj("Focus");
        car2.setCena(9600.8468);
        car2.setPrzebiegKilometry(201968);
        car2.setRocznik("2012");
        list.add(car2);

        Car car3 = new Car();
        car3.setMarka("Fiat");
        car3.setRodzaj("Brava");
        car3.setCena(3000.8468);
        car3.setPrzebiegKilometry(2348968);
        car3.setRocznik("1996");
        list.add(car3);

        Car car4 = new Car();
        car4.setMarka("Fiat");
        car4.setRodzaj("Bravo");
        car4.setCena(2100.8468);
        car4.setPrzebiegKilometry(1988968);
        car4.setRocznik("1987");
        list.add(car4);

        Car car5 = new Car();
        car5.setMarka("BMW");
        car5.setRodzaj("Punto");
        car5.setCena(1324.8468);
        car5.setPrzebiegKilometry(312456);
        car5.setRocznik("1945");
        list.add(car5);

        Car car6 = new Car();
        car6.setMarka("BMW");
        car6.setRodzaj("ABC");
        car6.setCena(1400.8468);
        car6.setPrzebiegKilometry(128968);
        car6.setRocznik("2001");
        list.add(car6);

        Car car7 = new Car();
        car7.setMarka("BMW");
        car7.setRodzaj("x4");
        car7.setCena(9995.8468);
        car7.setPrzebiegKilometry(120154);
        car7.setRocznik("2015");
        list.add(car7);

        Car car8 = new Car();
        car8.setMarka("Mercedes");
        car8.setRodzaj("E class");
        car8.setCena(5460.8468);
        car8.setPrzebiegKilometry(456968);
        car8.setRocznik("2001");
        list.add(car8);

        Car car9 = new Car();
        car9.setMarka("Fiat");
        car9.setRodzaj("Alfa");
        car9.setCena(1352.8468);
        car9.setPrzebiegKilometry(564968);
        car9.setRocznik("1998");
        list.add(car9);



        return list;
    }
}