public class IfNotAnAthlete {
    
    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {

            boolean isAthlete = false;
            boolean isDancer = false;
            boolean isAmerican = false; 
            boolean isGerman = false;
            boolean isKrExperienced = false;
            boolean wearsWhiteJacket = false; //그러나 A는 초록색 자켓을 입는다.
            boolean knowsKimchi = true; // P6: A는 김치를 먹을 줄 안다 (확정 사실)

            //1. 독일인 무용수이다
            if(i==1) {
                isGerman = true;
                isDancer = true;
                isAthlete = false;
                isAmerican = false;
                isKrExperienced = false;
            
            //2. 미국인 운동선수이다.
            }else if(i==2) {
                isGerman = false;
                isDancer = false;
                isAthlete = true;
                isAmerican = true;
                isKrExperienced = false;

            //3. 무용수이면서 운동선수이다.
            }else if(i==3) {
                isGerman = false;
                isDancer = true;
                isAthlete = true;
                isAmerican = false;
                isKrExperienced = false;
                
            //4. 한국 생활 경험이 없는 독일인이다.
            }else if(i==4) {
                isGerman = true;
                isDancer = false;
                isAthlete = false;
                isAmerican = false;
                isKrExperienced = false; 
                
            //5. 한국 생활 경험이 있는 미국인이다.
            }else if(i==5) {
                isGerman = false;
                isDancer = false;
                isAthlete = false;
                isAmerican = true;
                isKrExperienced = true;
            }

        }

    }
}
