package com.fundementals.labs;

public class EnumExercise {

    public void favoriteGenre(MoviesEnum genre) {
        switch (genre){
            case ACTION:
                System.out.println("Action movies are good popcorn flicks to turn your brain off,and enjoy every dollar that went into the fight scenes and CGI.");
                break;
            case COMEDY:
                System.out.println("Comedy movies are good to just sit down with some friends (and maybe some beer)" +
                        "to just laugh for a couple of hours");
                break;
            case DRAMA:
                System.out.println("Drama movies are good if you want to raise your BP by watching people that exist only in fiction");
                break;
            case HORROR:
                System.out.println("Horror movies are excellent if you want to be afraid of your own shadow on the way out of the theater" +
                        ",or on the way to bed");
                break;
            case ROMANCE:
                System.out.println(" Romance movies are usually chick flicks that can be deceptively entertaining especially if the romance ends up in tragedy");
                break;
            case SCI_Fi:
                System.out.print("SciFi movies can be like action movies or cautionary tales containing an action movie." +
                        " They could even be wholly dramatic tragedies all of which take place in a futuristic setting.");
                break;
            case ANIMATION:
                System.out.println("Animation is the perfect film medium to show and tell the stories you can't in live action through beautiful or " +
                        "sometimes grimy and disgusting visuals that keep your attention from start to finish");
                break;
            case FANTASY:
                System.out.println("Fantasy movies can serve the same purpose as a SciFI movie except its told through a fantasy medium. ");
                break;
            case DOCUMENTARY:
                System.out.println("A documentary serves the purpose of taking history whether it's be a persons or peoples history or " +
                        "something like world history and condenses it in a easy to digest movie format.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumExercise myMovies = new EnumExercise();
        myMovies.favoriteGenre(MoviesEnum.SCI_Fi);
    }


}
