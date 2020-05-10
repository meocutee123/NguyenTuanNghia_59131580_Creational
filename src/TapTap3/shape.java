package TapTap3;

public abstract class shape {
    private String brush;
    private String paper;
    private String frame;

    protected shape(){}

    protected shape(String brush, String frame, String paper){
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
     public String getBrush(){
         return brush;
     }
     public void setBrush(){
         this.brush = brush;
     }
     public String getPaper(){
        return  paper;
    }
    public void setPaper(){
        this.paper = paper;
    }
    public String getFrame(){
        return frame;
    }
    public void setFrame(){
        this.frame = frame;
    }

    public abstract String draw();
}