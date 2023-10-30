package datetime;

import javax.management.BadAttributeValueExpException;
import java.util.Date;

public class Time {
    private int _hour;

    private int _minute;
    private double _second;

    public Time(int hour, int minute, double second) throws BadAttributeValueExpException {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return _hour;
    }

    public void setHour(int hour) throws BadAttributeValueExpException {
        if (hour <= 0 ) {
            throw new BadAttributeValueExpException("Час не может быть меньше 0!");
        }
        _hour = hour;
    }

    public int getMinute() {
        return _minute;
    }

    public void setMinute(int minute) throws BadAttributeValueExpException {
        if (minute <= 0 || minute > 59) {
            throw new BadAttributeValueExpException("Минута не может быть меньше 0 или больше 60!");
        }
        _minute = minute;
    }

    public double getSecond() {
        return _second;
    }

    public void setSecond(double second) throws BadAttributeValueExpException {
        if (second <= 0 || second > 59) {
            throw new BadAttributeValueExpException("Секунда не может быть меньше 0 или больше 60!");
        }
        _second = second;
    }

    public void changeTime(int hour, int minute, double second) throws BadAttributeValueExpException {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
//        return new Time(hour, minute, second);
    }

    public Time changeTime() throws BadAttributeValueExpException {
        return new Time(getHour(), getMinute(), getSecond());
    }
    public Time changeTime(long hour) throws BadAttributeValueExpException {
//        setHour((int) (hour += getHour()));
        return new Time((int) hour, getMinute(), getSecond());
    }
    public Time changeTime(int minute) throws BadAttributeValueExpException {
//        setMinute(minute += getMinute());
        return new Time(getHour(), minute, getSecond());
    }
    public Time changeTime(double second) throws BadAttributeValueExpException {
//        setSecond(second += getSecond());
        return new Time(getHour(), getMinute(), second);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + _hour +
                ", minute=" + _minute +
                ", second=" + _second +
                '}';
    }
}
