// overloaded constructors

public class Time2{
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// no args
	public Time2(){
		this(0, 0, 0); // invokes 3 args
	}

	public Time2(int hour){
		this(hour, 0, 0); // invoke 3 args
	}

	public Time2(int hour, int minute){
		this(hour, minute, 0); // invoke 3 args
	}

	public Time2(int hour, int minute, int second){
		// check values
		validate_time(hour, minute, second);

		// set values
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	} // end 3 args constructor

	public Time2(Time2 time){ // constructor for adding another time object
		// invoke 3-args
		this(time.getHour(), time.getMinute(), time.getSecond());
	} // end obj-constructor

    // tick method for incrementing the seconds
    public void tick(){
        if (this.second == 59){
            this.second = 0;
            this.minute++;
        }
        else
            this.second++;
    }

    public void incrementMinute(){
        if (this.minute == 59){
            this.minute = 0;
            this.hour++;
        }
        else
            this.minute++;
    }

    public void incrementHour(){
        if (this.hour == 23){
            this.hour = 0;
        }
        else
            this.hour++;
    }

	// set time using universal time
	public void setTime(int hour, int minute, int second){
		validate_time(hour, minute, second);
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	} // end setTime

	public void setHour(int hour){
		validate_time(hour, 0, 0);
		this.hour = hour;
	} // end setHour

	public void setMinute(int minute){
		validate_time(0, minute, 0);
		this.minute = minute;
	} // end setMinute

	public void setSecond(int second){
		validate_time(0, 0, second);
		this.second = minute;
	} // end setSecond

	// get hour
	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}

	// convert to universal format (HH:MM:SS)
	public String toUniversalString(){
		return String.format(
				"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	// convert to standard format (AM/PM)
	public String toString(){
		return String.format("%d:%02d:%02d %s",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(),
				getSecond(),
				(getHour() < 12 ? "AM" : "PM"));
	} // end toString

	public void validate_time(int hour, int minute, int second){
		if (hour < 0 || hour > 23){
			throw new IllegalArgumentException("Hour must be between 0 and 23.\n");
		} // end hour-if


		if (minute < 0 || minute > 59){
			throw new IllegalArgumentException("Minute must be between 0 and 59.\n");
		} // end minute-if	

		if (second < 0 || second > 59){
			throw new IllegalArgumentException("Second must be between 0 and 59.\n");
		} // end second-if
	} // end validation
} // end class Time2
