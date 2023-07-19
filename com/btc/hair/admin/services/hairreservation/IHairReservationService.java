package com.btc.hair.admin.services.hairreservation;

import com.btc.hair.admin.services.hairreservation.services.impl.IHairReservationAllSearchConfirm;
import com.btc.hair.admin.services.hairreservation.services.impl.IHairReservationSearchConfirm;
import com.btc.hair.user.services.reservation.HairReservationDto;

import java.util.List;

public interface IHairReservationService {
    public HairReservationDto searchReservation(IHairReservationSearchConfirm hairReservationSearchConfirm);
    public List<HairReservationDto> allSearchReservation(IHairReservationAllSearchConfirm hairReservationAllSearchConfirm);
}
