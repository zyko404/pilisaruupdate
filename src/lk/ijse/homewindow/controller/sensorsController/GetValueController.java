package lk.ijse.homewindow.controller.sensorsController;

import lk.ijse.homewindow.controller.PileInterfaceController;
import lk.ijse.homewindow.controller.SensorCalss;

public class GetValueController {
    public static void main(String[] args) {
        SensorCalss sensorCalss = new SensorCalss();
        sensorCalss.setArduino();
    }

    public static void getValue(String numRead) {
        System.out.println(numRead);
    }
}
