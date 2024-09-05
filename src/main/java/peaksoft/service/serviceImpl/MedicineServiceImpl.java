package peaksoft.service.serviceImpl;

import peaksoft.dao.MedicineDao;
import peaksoft.dao.daoImpl.MedicineDaoImpl;
import peaksoft.model.Medicine;
import peaksoft.service.MedicineService;

import java.util.List;

public class MedicineServiceImpl implements MedicineService {
    MedicineDao medicineDao = new MedicineDaoImpl();
    @Override
    public String saveMedicine(Long pharmacy, Medicine medicine) {
        return medicineDao.saveMedicine(pharmacy, medicine);
    }

    @Override
    public List<Medicine> getAllMedicineByPharmacyId(Long pharmacyId) {
        return medicineDao.getAllMedicineByPharmacyId(pharmacyId);
    }

    @Override
    public Medicine getById(Long medicineId) {
        return medicineDao.getById(medicineId);
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
