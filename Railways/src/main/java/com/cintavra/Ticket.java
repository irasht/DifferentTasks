package com.cintavra;

import java.time.LocalDateTime;
import java.util.List;

public class Ticket {
    private String clientName;
    private int trainId;
    private int coachId;
    private int placeId;
    //    private LocalDateTime date;
    // private boolean status;
    private List<Station> clientRoute;

    public Ticket(String clientName, int trainId, int coachId, int placeId, List<Station> clientRoute) {
        this.clientName = clientName;
        this.trainId = trainId;
        this.coachId = coachId;
        this.placeId = placeId;
        this.clientRoute = clientRoute;
    }

    public String getClientName() {
        return clientName;
    }

    public int getTrainId() {
        return trainId;
    }

    public int getCoachId() {
        return coachId;
    }

    public int getPlaceId() {
        return placeId;
    }

    public List<Station> getClientRoute() {
        return clientRoute;
    }

    private boolean isFree() {
        return true;
    }

    private void printTicket() {
        System.out.println("Ticket info:" + "\nclientName='" + clientName + '\'' +
                ", \ntrainId=" + trainId + ", \ncoachId=" + coachId +
                ", \nplaceId=" + placeId + ", \nclientRoute=" + clientRoute + '.');
    }
}
