
public class TennisGame1 implements TennisGame {
    
    private int player1score = 0;
    private int player2score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {                  
        if (playerName == "player1")             
            player1score += 1;
        else                
            player2score += 1;
    }

    public String getScore() {
        String[] scores = {"Love" , "Fifteen" , "Forty", "Fifty";
        
        if (isWinner()) {
            return "Win for" + getPlayerName() ;
          //return String.format(" Win for %s, getPlayerName()) ; 
        }
        if (isAdvantage()) {
              return "Advantage" + getPlayerName() ;
        }
        if (isDeuce()) {
              return "Deuce"
                  
        if (isAll()) {
              return scores[
              ] + "-All" ; 
        }
        
        return scores[player1score] + "-" + scores[Playerscore]  
            
        private boolean () {
            return xxx() [Play1swcore - Play2score >=2] ;
        }    
        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case 0:
                        score = "Love-All";
                    break;
                case 1:
                        score = "Fifteen-All";
                    break;
                case 2:
                        score = "Thirty-All";
                    break;
                default:
                        score = "Deuce";
                    break;
                
            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
        private string getPlayerName() {
        return (player1score > player2score) ? player1score : player2score ;
}
