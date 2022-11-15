package 코딩테스트_준비;

public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야하는지 궁금해졌습니다.
 * 머쓱이네 반 친구들의 키가 담긴 정수 배열 ARRAY 와 머쓱이의 키 HEIGHT 가 변수로 주어질 때,
 * 머쓱이네보다 키 큰 사람 수를 구하는 로직을 구현하시오.
 * */
		
		int[] array = {149,180,192,170};
		int height  = 167;
		int answer = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>height) {
				answer++;
			}
		}
		System.out.println("머쓱이보다 키 큰 사람의 수는 "+answer+"명 입니다.");
	}

}
