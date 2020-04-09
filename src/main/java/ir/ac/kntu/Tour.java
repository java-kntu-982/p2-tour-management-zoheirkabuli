package ir.ac.kntu;

import java.util.ArrayList;

public class Tour {
    private int days,min,max;
    private String price;
    private Region start,end;
    private ArrayList<String> plan;
    private Date startDate;
    private boolean isFlied;
    private TourLeader leader;

    public Tour() {
    }

    public Tour(int days, int min, int max, String price, Region start, Region end, ArrayList<String> plan, boolean isFlied) {
        this.days = days;
        this.min = min;
        this.max = max;
        this.price = price;
        this.start = start;
        this.end = end;
        this.plan = plan;
        this.isFlied = isFlied;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Region getStart() {
        return start;
    }

    public void setStart(Region start) {
        this.start = start;
    }

    public Region getEnd() {
        return end;
    }

    public void setEnd(Region end) {
        this.end = end;
    }

    public ArrayList<String> getPlan() {
        return plan;
    }

    public void setPlan(ArrayList<String> plan) {
        this.plan = plan;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isFlied() {
        return isFlied;
    }

    public void setFlied(boolean flied) {
        isFlied = flied;
    }

    public TourLeader getLeader() {
        return leader;
    }

    public void setLeader(TourLeader leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return  ", start=" + start +
                ", end=" + end +
                ", days=" + days +
                ", price=" + price;
    }
}
