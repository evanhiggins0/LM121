//**********************//
//* Name: Evan Higgins *//
//*   ID: 19282508     *//
//**********************//
public class DLLDriver {
    public static void main(String[] args) {

        DLL friends = new DLL();

        Contact evan = new Contact("Evan Higgins", "061 222222", "evanhiggins0@fakeemail.com");

        friends.addLast(new Contact("Donald Knuth","001 241 721890","knuth@stanford.com",
                "","",""));

        friends.addFirst(new Contact("Gerry O'Neill","001 123 7654321","GON@genius.ie",
                "@CSGenius","@Prolog","@NotOnTwitter"));

        friends.addLast(new Contact("Diego Maradona","+771 0896 651299452","TheHandOfGod@1986.WorldCup",
                "@TheAllTimeGreatestArgentinianFootballLegend","","@Maradona"));

        friends.addFirst(new Contact("Josephine Bloggs","086 45216789","","","","@Bloggology"));

        friends.add(2,new Contact("Edsger Dijkstra","151 698 213459","EWD@uniTexas.com",
                "","",""));

        friends.add(0,new Contact("Nik Wirth","080 810 2468312","nik@zurichETH.swiss",
                "","",""));

        friends.addLast(evan);

        friends.display();

        System.out.println(friends.contains(evan));

        System.out.println(friends.findByName("Nik Wirth"));

        System.out.println(friends.get(1));

        System.out.println(friends.size());

    }
}
