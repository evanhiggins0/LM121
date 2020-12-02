// Evan Higgins
// 19282508

public class TestMyToolBox {

    public static void main(String[] args) {

        int i;

        for(i = 1; i <= 5; i++) {

            System.out.print(MyToolBox.repeat(" ",9)+i);

        }

        System.out.println();

        System.out.println(MyToolBox.repeat("1234567890",5));

        System.out.println(MyToolBox.centre("Edsger W. Dijkstra",40)+"<");

        System.out.println(MyToolBox.centre("Edsger Dijkstra",40)+"<");
        
        System.out.println(MyToolBox.expand("Edsger W. Dijkstra",40)+"<");

        System.out.println(MyToolBox.trim("Edsger W. Dijkstra",6)+"<");

        System.out.println(MyToolBox.noTrailingSpaces("Edsger W. Dijkstra    ")+"<");
    }
}