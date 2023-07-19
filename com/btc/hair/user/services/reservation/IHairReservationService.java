package com.btc.hair.user.services.reservation;

import com.btc.hair.user.services.reservation.services.impl.IHairReservationDeleteConfirm;
import com.btc.hair.user.services.reservation.services.impl.IHairReservationRegistConfirm;
import com.btc.hair.user.services.reservation.services.impl.IHairReservationSearchConfirm;

public interface IHairReservationService {

    public int IHairReservationRegistConfirm(IHairReservationRegistConfirm hairReservationRegistConfirm);
    public HairReservationDto IHairReservationSearchConfirm(IHairReservationSearchConfirm hairReservationSearchConfirm);
    public int IHairReservationDeleteConfirm(IHairReservationDeleteConfirm hairReservationDeleteConfirm);

}
