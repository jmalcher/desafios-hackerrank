import java.util.Collections;
import java.util.List;

//        Competitive Gaming A group of friends are playing a video game together.
//        During the game, each player earns a number of points.
//        At the end of a round, players who achieve at least a certain rank get to "level up" their characters
//        to gain increased abilities.
//        Given the scores of the players at the end of a round,
//        how many players will be able to level up?
//        Note: Players with equal scores will have equal ranks,
//        but the player with the next lower score will be ranked based on the position within the list of all players' scores.

public class CompetitiveGamming {

    public static int numPlayers(int k, List<Integer> score) {
        if(k <= 0) return 0;
        Collections.sort(score, Collections.reverseOrder());
        int rank = 1;
        int res = 0;
        for(int i = 0; i < score.size(); i++) {
            if(i == 0) {
                rank = 1;
            } else if(score.get(i) != score.get(i - 1)) {
                rank = i + 1;
            }
            if(rank <= k && score.get(i) > 0) res++;
            else break;
        }
        return res;
    }

}
