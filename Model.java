package simpleInterest;

public class Model {
    int principle;
    float time, rate, interest;
    Model(int principle, float rate, float time){
        this.principle = principle;
        this.rate = rate;
        this.time = time;
    }

    public int getPrinciple(){
        return principle;
    }
    public void setPrinciple(int p){
        principle = p;
    }

    public float getTime(){
        return time;
    }
    public void setTime(float t){
        time = t;
    }

    public float getRate(){
        return rate;
    }
    public void setRate(float r){
        rate = r;
    }

    public float getInterest(int p, float r, float t){
        principle = p;
        rate = r;
        time = t;
        interest = (principle * rate * time) / 100;
        return interest;
    }
}
