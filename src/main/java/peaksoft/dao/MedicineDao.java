package peaksoft.dao;

import peaksoft.model.Medicine;

import java.util.List;

public interface MedicineDao {

    String saveMedicine(Long pharmacy, Medicine medicine);
    List<Medicine> getAllMedicineByPharmacyId(Long pharmacyId);
    Medicine getById(Long medicineId);
    String updateMedicine(Long medicineId,Medicine newMedicine);
    String deleteMedicine(Long medicineId);

}
