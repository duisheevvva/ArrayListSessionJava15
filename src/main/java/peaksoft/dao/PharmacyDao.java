package peaksoft.dao;

import peaksoft.model.Pharmacy;

import java.util.List;

public interface PharmacyDao {
    //    CRUD
//    TODO create
    String savePharmacy(Pharmacy pharmacy);

    //    TODO read
    List<Pharmacy> getAllPharmacy();

    Pharmacy getById(Long pharmacyId);

    //   TODO update
    String updatePharmacy(Long pharmacyId, Pharmacy newPharmacy);

    //   TODO delete
    String deletePharmacy(Long pharmacyId);

}

