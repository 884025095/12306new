package cn.edu.guet;

public class Ticket {
        private String trainNumber;
        private String startStation;
        private String endStation;
        private String departureTime;
        private String arrvialTime;
        private String duration;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrvialTime() {
        return arrvialTime;
    }

    public void setArrvialTime(String arrvialTime) {
        this.arrvialTime = arrvialTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
