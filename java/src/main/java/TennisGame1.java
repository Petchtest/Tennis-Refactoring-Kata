
public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;                  // private int player1score = 0;
    private int m_score2 = 0;                  // private int player2score = 0;    
    priv                                    ate String player1Name;
    p   rivate String player2Name;

        public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;             
        this.player2Name = player2Name;
    }

        public void wonPoint(String playerName) {
        if (playerName == "player1")           // if (playerName.equal(thsi.playername1")
            m_score1 += 1;                     //     player1score ++ ;     
        else                                   // else 
            m_score2 += 1;                     //     player2score ++ ;    
    }

    public String getScore() {
        String score = "";                      
        int tempScore=0;
        if (m_score1==m_score2)                // if Isdeuce()  {
        {                                      //    score = "deuce"; 
            switch (m_score1)                  // }
            {                                  // if (playerscore1 == playerscore2)
                case 0:                        //    string[] scores = {"love", "fifteen", "thirty" , Fifty"} 
                        score = "Love-All";    //    score = scores[playerscore1] + "-All"
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
        else if (m_score1>=4 || m_score2>=4)                      //  If (Player1score >=4 || Player2score>=4) 
        {                                                             {
            int minusResult = m_score1-m_score2;                  //     int minusResult = playerscore1 - playerscore2 ; 
            if (minusResult==1) score ="Advantage player1";       //*advantage
            else if (minusResult ==-1) score ="Advantage player2";//*if (minusResult==1)  score ="Advantage player1";  
            else if (minusResult>=2) score = "Win for player1";   //*if (minusResult==1)  score ="Advantage " + (player1score > player2score) ? player1score : player2score ;
            else score ="Win for player2";                        // if (minusResult==1)  score ="Advantage " + getPlayerName() ;
        }                                                         // if (minusResult==-1) score ="Advantage " + getPlayerName() ;
        else                                                      //*Winner
        {                                                         // if (minusResult>=2)  score ="Win For " + getPlayerName() ;
            for (int i=1; i<3; i++)                               // else                 score ="Win For " + getPlayerName() ;
            {                                                                  
                if (i==1) tempScore = m_score1;                   // private string getPlayerName() {
                else { score+="-"; tempScore = m_score2;}         //    return (player1score > player2score) ? player1score : player2score ;
                switch(tempScore)                                 // }
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
}
