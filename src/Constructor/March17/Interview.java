package Constructor.March17;

public class Interview {
    private String candidateName;
    private int score;
     private String decision;
     private int javaPoint;
     private int SQLPoint;
     private int softSkillPoint;

     public Interview(String candidateName,int javaPoint, int SQLPoint, int softSkillPoint){
         this.candidateName=candidateName;
         this.score=0;
         this.decision=null;
         this.javaPoint=javaPoint;
         this.SQLPoint=SQLPoint;
         this.softSkillPoint=softSkillPoint;

     }
     public int calculateScore(int javaPoint, int SQLPoint, int softSkillPoint){
         return this.score = this.javaPoint+this.SQLPoint+this.softSkillPoint;

     }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public int getJavaPoint() {
        return javaPoint;
    }

    public void setJavaPoint(int javaPoint) {
        this.javaPoint = javaPoint;
    }

    public int getSQLPoint() {
        return SQLPoint;
    }

    public void setSQLPoint(int SQLPoint) {
        this.SQLPoint = SQLPoint;
    }

    public int getSoftSkillPoint() {
        return softSkillPoint;
    }

    public void setSoftSkillPoint(int softSkillPoint) {
        softSkillPoint = softSkillPoint;
    }

    public String  decideResult(){
         if(this.score>180){
             this.decision="We would like to work with you";
         }
         else if(this.score>150){
             this.decision="Please wait a call from us";
         }
         else{
             this.decision="Sorry position is fulled. We will keep your resume for future.";
         }
         return  this.decision;

     }

    @Override
    public String toString() {
        return "Interview{" +
                "candidateName='" + candidateName + '\'' +
                ", score=" + score +
                ", decision='" + decision + '\'' +
                ", javaPoint=" + javaPoint +
                ", SQLPoint=" + SQLPoint +
                ", SoftSkillPoint=" + softSkillPoint +
                '}';
    }
}


