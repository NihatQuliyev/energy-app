package service;

import exception.InvalidErrorException;
import exception.NotFoundException;

import java.util.InputMismatchException;

import static util.MenuUtil.entry;

public class ManagementService {
    public void manage() throws InvalidErrorException , InputMismatchException {
        EnergyService energyService = new EnergyService();
        while (true) {
            try {
                byte option = entry();
                switch (option) {
                    case 1 -> energyService.incrementEnergyByMeet();
                    case 2 -> energyService.incrementEnergyByMilk();
                    case 3 -> energyService.showEnergy();
                    default -> throw new NotFoundException();
                }
            } catch (InvalidErrorException | NotFoundException | InputMismatchException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
