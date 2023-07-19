package com.btc.hair.user.services.reservation;

import com.btc.hair.user.services.reservation.services.impl.IHairReservationDeleteConfirm;
import com.btc.hair.user.services.reservation.services.impl.IHairReservationRegistConfirm;
import com.btc.hair.user.services.reservation.services.impl.IHairReservationSearchConfirm;

public class HairReservationService implements IHairReservationService{
    @Override
    public int IHairReservationRegistConfirm(IHairReservationRegistConfirm hairReservationRegistConfirm) {
        return 0;
    }

    @Override
    public HairReservationDto IHairReservationSearchConfirm(IHairReservationSearchConfirm hairReservationSearchConfirm) {
        return null;
    }

    @Override
    public int IHairReservationDeleteConfirm(IHairReservationDeleteConfirm hairReservationDeleteConfirm) {
        return 0;
    }
}
