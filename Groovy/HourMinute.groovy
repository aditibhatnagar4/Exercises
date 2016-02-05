class HourMinute
{
    int hour, minute;
    
    HourMinute plus(HourMinute time)
    {
        new HourMinute(hour : this.hour + time.hour, minute : this.minute + time.minute);
    }
    
    HourMinute minus(HourMinute time)
    {
        new HourMinute(hour : this.hour - time.hour, minute : this.minute - time.minute);
    }
    
    public String toString()
    {
        return "$hour : $minute";
    }
    
}

HourMinute X = new HourMinute([hour : 4, minute : 50]);
HourMinute Y = new HourMinute([hour : 2, minute : 20]);
HourMinute Z = new HourMinute([hour : 1, minute : 10]);


HourMinute curTime = X + Y
println "X + Y = $curTime"

curTime = Y - Z
println "Y - Z = $curTime"