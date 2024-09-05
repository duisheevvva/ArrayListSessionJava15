package peaksoft.dao.daoImpl;

import peaksoft.dao.MedicineDao;
import peaksoft.database.Database;
import peaksoft.model.Medicine;
import peaksoft.model.Pharmacy;

import java.util.List;

public class MedicineDaoImpl implements MedicineDao {
    @Override
    public String saveMedicine(Long pharmacy, Medicine medicine) {
        for (Pharmacy pharmacy1 : Database.pharmacies) {
            if (pharmacy1.getId().equals(pharmacy)) {
                pharmacy1.getMedicines().add(medicine);
                return "success";
            }
        }
        return "Pharmacy with id" + pharmacy + "not found!";
    }

    @Override
    public List<Medicine> getAllMedicineByPharmacyId(Long pharmacyId) {
        for (Pharmacy pharmacy:Database.pharmacies) {
            if(pharmacy.getId().equals(pharmacyId)){
                return pharmacy.getMedicines();
            }
        }
        return null;
    }

    @Override
    public Medicine getById(Long medicineId) {
        for (Pharmacy pharmacy:Database.pharmacies) {
            for (Medicine medicine:pharmacy.getMedicines()) {
                if (medicine.getId().equals(medicineId)){
                    return medicine;
                }
            }
        }
        return null;
    }

    @Override
    public String updateMedicine(Long medicineId, Medicine newMedicine) {
        return null;
    }

    @Override
    public String deleteMedicine(Long medicineId) {
        return null;
    }
}
