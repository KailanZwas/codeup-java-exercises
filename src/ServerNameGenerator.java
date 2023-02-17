public class ServerNameGenerator {

    private static String[] nouns = {
            "way" ,
                    "expression",
                    "director" ,
                    "climate" ,
                    "resource" ,
                    "hearing" ,
                    "area" ,
                    "disaster",
                    "performance",
                    "message"
    };
   private static String[] adjective = {
            "evanescent",
            "ambitious",
            "blue-eyed",
            "polite",
            "overrated",
            "laughable",
            "deeply",
            "erratic",
           "bumpy",
            "ambiguous"
    };
    public static String returnRandomElement(String[] strs){
        int randomIndex =(int)(Math.random() * strs.length);
        return strs[randomIndex];
    }


    public static void main(String[] args) {
        String randomNoun = returnRandomElement(nouns);
        String randomAdjective = returnRandomElement(adjective).toLowerCase();
        System.out.printf("Here is your servers name: %s-%s", randomAdjective, randomNoun);

    }

}
