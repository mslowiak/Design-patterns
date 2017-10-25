package Builder;

public class ColorFactory implements Factory {
    @Override
    public String getColor(String color) {
        String outColor = "#FFFFFF";
        if(color.equals("r")){
            outColor = "#FF0000";
        }else if(color.equals("g")){
            outColor = "#008000";
        }else if(color.equals("b")){
            outColor = "#0000FF";
        }
        return outColor;
    }
}
