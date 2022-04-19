import java.io.IOException;

public class Zad1Song {

    public static void main(String[] args) throws IOException {



        System.out.println("Yo, listen up here's a story");
        System.out.println("About a little guy");
        System.out.println("That lives in a blue world");
        System.out.println("And all day and all night");
        System.out.println("And everything he sees is just blue");
        System.out.println("Like him inside and outside");

        System.out.println("Blue his house");
        System.out.println("With a blue little window");
        System.out.println("And a blue corvette");
        System.out.println("And everything is blue for him");
        System.out.println("And himself and everybody around");
        System.out.println("Cause he ain't got nobody to listen to");

        daBaDiDaBaDA();
        daBaDiDaBaDA();

        vtoraItretaChast();
        daBaDiDaBaDA();
        daBaDiDaBaDA();
        vtoraItretaChast();
        daBaDiDaBaDA();
        daBaDiDaBaDA();

        Runtime rt = Runtime.getRuntime();
        String url = "https://www.youtube.com/watch?v=68ugkg9RePc";
        rt.exec("rundll32 url.dll,FileProtocolHandler " + url);

    }

    private static void vtoraItretaChast() {
        System.out.println("I have a blue house");
        System.out.println("With a blue window");
        System.out.println("Blue is the colour of all that I wear");
        System.out.println("Blue are the streets");
        System.out.println("And all the trees are too");
        System.out.println("I have a girlfriend and she is so blue");

        System.out.println("Blue are the people here");
        System.out.println("That walk around");
        System.out.println("Blue like my corvette, its in and outside");
        System.out.println("Blue are the words I say");
        System.out.println("And what I think");
        System.out.println("Blue are the feelings");
        System.out.println("That live inside me");
    }

    private static void daBaDiDaBaDA() {
        System.out.println("I'm blue");
        System.out.println("Da ba dee da ba di");
        System.out.println("Da ba dee da ba di");
        System.out.println("Da ba dee da ba di");
        System.out.println("Da ba dee da ba di");
        System.out.println("Da ba dee da ba di");
        System.out.println("Da ba dee da ba di");
        System.out.println("Da ba dee da ba di");

    }
}

