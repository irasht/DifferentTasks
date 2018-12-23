package com.cintavra;

import java.util.List;

public class Service {
    private Train train;
    private Ticket ticket;

    private boolean findRoute() {
        boolean result = false;
        for (Station station : train.getTrainRoute()) {
            if (station.equals(train.getStart()) && station.equals(train.getEnd())) {
                result = true;
            }
        }
        return result;
    }

    private void searchAppropriateTrain() {
//        if (findRoute()) {
//            for (Station station : train.getTrainRoute()) {
//                if (station.indexOf(0) <= stationName.indexOf(station.getBeginStation())
//
//                        && stationName.indexOf(route.getStationNames().length - 1) >= stationName.indexOf(station.getEndStation())) {
//                    ourRout.add(stationName);
//                }
//            }
//
//        }
    }

    private void viewScheduke() {

    }

    private void bookTicket() {

    }

    private void cancelTicket() {

    }

    private void modifyTicketInfo() {

    }
}
