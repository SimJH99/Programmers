class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int cap_att = 5;
        int army_att = 3;
        int ant_att = 1;
        
        answer += hp / cap_att;
        
        int hp_cap_att = hp % cap_att;
        
        answer += hp_cap_att / army_att;
        
        int hp_army_att = hp_cap_att % army_att;
        
        answer += hp_army_att / ant_att;
        
        return answer;
    }
}