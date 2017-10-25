package Builder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BuilderGUI implements Builder {

    private String[][] table;
    private int[][] levels;

    public BuilderGUI() {
        table = new String[11][11];
        for (int i = 0; i < 11; ++i){
            for (int j = 0; j < 11; ++j ){
                table[i][j] = " ";
            }
        }
        levels = new int[3][3];
    }

    @Override
    public void addColor(Tile tile) {
        int startX = (tile.getX()-1) * 3;
        int startY = (tile.getY()-1) * 3;

        if(tile.getX() == 2){
            startX++;
        }else if(tile.getX() == 3){
            startX += 2;
        }

        if(tile.getY() == 2){
            startY++;
        }else if(tile.getY() == 3){
            startY += 2;
        }

        if(levels[tile.getX()-1][tile.getY()-1] < tile.getLevel()){
            levels[tile.getY()-1][tile.getY()-1] = tile.getLevel();

            for (int i = 0; i < 3; ++i){
                table[startX][startY] = tile.getColor();
                table[startX][startY+1] = tile.getColor();
                table[startX][startY+2] = tile.getColor();
                startX++;
            }
        }
        String colors = "rgb";
        for(int i = 0; i < 11; ++i){
            table[i][3] = colors.replace(table[i][2], "").replace(table[i][4], "").charAt(0) + "";
            table[i][7] = colors.replace(table[i][6], "").replace(table[i][8], "").charAt(0) + "";;
            table[3][i] = colors.replace(table[2][i], "").replace(table[4][i], "").charAt(0) + "";;
            table[7][i] = colors.replace(table[6][i], "").replace(table[8][i], "").charAt(0) + "";;
        }




    }

    @Override
    public void createOutput() {
        ColorFactory colorFactory = new ColorFactory();
        for (int i = 0; i < 11; ++i){
            for(int j = 0; j < 11; ++j){
                table[i][j] = colorFactory.getColor(table[i][j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<table>\n");

        for(int i = 0; i < 11; ++i){
            sb.append("\t<tr>\n");
            for(int j = 0; j < 11; ++j){
                sb.append("\t\t<td>\n");
                sb.append("\t\t\t<div style=\"width: 50px; height: 50px; background-color: " + table[i][j] +";\">");
                sb.append("</div>\n");
                sb.append("\t\t</td>\n");
            }
            sb.append("\t</tr>\n");
        }
        sb.append("</table>\n");
        sb.append("</body>\n");
        sb.append("</html>");

        try {
            PrintWriter pw = new PrintWriter("plansza.html");
            pw.print(sb);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Strona HTML zostala wygenerowana do pliku plansza.html");
    }
}
