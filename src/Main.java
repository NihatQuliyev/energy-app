import service.EnergyService;
import service.ManagementService;

public class Main {
    public static void main(String[] args) {
        EnergyService energyService =new EnergyService();
        energyService.start();
        ManagementService managementService =new ManagementService();
        managementService.manage();
    }
}