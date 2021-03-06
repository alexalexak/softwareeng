package softwareeng;

public class Calendar {

    protected int day;
    protected int month;
    protected int year;
    protected String name;
    protected int id;
    
    public Calendar(){
        id=id++;
    }

    public void setDay(final int dayy) {
        if (dayy < 1 || dayy > 31) {
            throw new ArithmeticException();
        }
        this.day = dayy;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(final int mon) {
        if ( mon < 1 || mon > 12){
            throw new ArithmeticException();
        }
        this.month = mon;
    }

    public int getMonth(){
        return month;
    }

    public void setYear(final int ye){
        if ( ye < 1){
            throw new ArithmeticException();
        }
        this.year = ye;
        
    }

    public int getYear(){
        return year;
    }

    public void setName(final String na) {
        this.name = na;
    }

    public String getName(){
        return name;
    }

    public void setId(final int i){
        id = i + 1;
    }

    public int getId(){
        return id;
    }


}

