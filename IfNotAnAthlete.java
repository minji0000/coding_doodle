/*
 * 2025.11.13
 * 문해력 테스트
 */
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

            /** 전체 조건 검증 
             * 7가지 전제 조건 모두를 동시에 만족시켜 논리적 모순을 일으키지 않는 유일한 가정 찾기
            */ 
            
            //A가 운동선수가 아니라면 무용수이다.
            //p1
            if(!isAthlete) {
                isDancer = true;
            }

            //그런데 모든 무용수는 흰색 재킷을 입는다.
            boolean p2 = (!isDancer || wearsWhiteJacket);

            //만일 A가 운동선수라면, 그는 미국인이거나 독일인이다.
            boolean p3 = (!isAthlete || (isAmerican || isGerman));

            //그런데 어떤 독일인도 한국 생활 경험이 없다면 김치를 먹을 줄 모른다.
            boolean p4 = (!(isGerman && !isKrExperienced) || !knowsKimchi);

            //그리고 한국 생활을 경험한 운동선수들은 모두 흰 색 재킷을 입는다.
            boolean p5 = (!(isKrExperienced && isAthlete) || wearsWhiteJacket);

            boolean trueYn = p2&&p3&&p4&&p5;

            if(trueYn) {
                System.out.print("정답은" + i + "번!");
                break;
            }
            
        }
    }
}
