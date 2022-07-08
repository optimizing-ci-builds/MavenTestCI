public class Indicator {
    public String indicator(int ph){
       String result = "";
       if (ph>7){
            result = "alkaline";
       }else if(ph<7){
            result = "acidic";
       }else{
           result = "neutral";
       }
       return result;
    }
}
