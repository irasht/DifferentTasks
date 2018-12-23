package com.cintavra;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private int trainId;
    private List<Station> trainRoute;
    private List<Coach> coachList;
    private String start;
    private String end;

    public int getTrainId() {
        return trainId;
    }

    public List<Coach> getCoachList() {
        return coachList;
    }

    public List<Station> getTrainRoute() {
        return trainRoute;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}