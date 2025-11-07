public class IfNotAnAthlete {
    
    private Boolean isAthlete = false; //운동선수 여부
    private Boolean isDancer = false; //무용수 여부
    private Boolean isAmerican = false; //미국인 여부
    private Boolean isGerman = false; //독일인 여부
    private Boolean isKrExperienced = false; //한국 생활 경험 여부
    private Boolean wearsWhiteJacket = false; // 흰색 재킷 착용 여부
    private Boolean knowsKimchi = false; // 김치 먹을 줄 아는 지 여부

    public static void main(String[] args) {

        IfNotAnAthlete A = new IfNotAnAthlete(); // 

        //A가 운동선수가 아니라면 무용수이다.
        if(!A.isAthlete) {
            A.isDancer = true;
        
        }else {
            A.isDancer = false;
        }

        //모든 무용수들은 흰색 재킷을 입는다.
        if(A.isDancer) {
            A.wearsWhiteJacket = true;
        }

        //그러나 A는 초록색 재킷을 입는다. 
        A.wearsWhiteJacket = false;

        //만약 A가 운동선수라면
        if(A.isAthlete) {
            //그는 미국인이거나 독일인이다. 
            A.isAmerican = true;
            A.isGerman = true;
        }

        if(A.isGerman && !A.isKrExperienced) {
            A.knowsKimchi = false;
        }






        
    }
}
