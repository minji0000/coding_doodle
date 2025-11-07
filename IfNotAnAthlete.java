public class IfNotAnAthlete {
    
    private static Boolean isAthlete; //운동선수 여부
    private static Boolean isDancer; //무용수 여부
    private static Boolean isAmerican; //미국인 여부
    private static Boolean isGerman; //독일인 여부
    private static Boolean isKrExperienced; //한국 생활 경험 여부
    private static Boolean wearsWhiteJacket; // 흰색 재킷 착용 여부
    private static Boolean knowsKimchi; // 김치 먹을 줄 아는 지 여부

    public static void main(String[] args) {

        for(int i=0; i<5; i++) {

            //① "독일인 무용수이다"
            if(i==1) {
                isGerman = true;
                isDancer = true;
                isAthlete = false;
                isAmerican = false;
                isKrExperienced = false;
                wearsWhiteJacket= false;
                knowsKimchi = false;
            
            }else if(i==2) {

            }else if(i==3) {
                
            }else if(i==4) {
                
            }else if(i==5) {
                
            }

        }

    }
}
