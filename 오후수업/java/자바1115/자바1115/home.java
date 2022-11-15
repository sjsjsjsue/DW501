package 자바1115;

import java.util.ArrayList;
import java.util.List;

public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Emp sawon1 = new Emp("SMITH",160,"CLERK");
		Emp sawon2 = new Emp("ALLEN",1600,"SALESMAN");
		Emp sawon3 = new Emp("WARD",1250,"SALESMAN");
		Emp sawon4 = new Emp("JONES",2975,"MANAGER");
		Emp sawon5 = new Emp("MARTIN",1250,"SALESMAN");
		Emp sawon6 = new Emp("BLAKE",2850,"MANAGER");
		Emp sawon7 = new Emp("CLARK",2450,"MANAGER");
		Emp sawon8 = new Emp("SCOTT",3000,"ANALYST");
		Emp sawon9 = new Emp("KING",5000,"PRESIDENT");
		Emp sawon10 = new Emp("TURNER",1500,"SALESMAN");

		//문제1. arrayList을 생성 후 sawon1 ~ sawon10 add하기!
		
		List<Emp> sawon = new ArrayList<Emp>();
		sawon.add(sawon1);
		sawon.add(sawon2);
		sawon.add(sawon3);
		sawon.add(sawon4);
		sawon.add(sawon5);
		sawon.add(sawon6);
		sawon.add(sawon7);
		sawon.add(sawon8);
		sawon.add(sawon9);
		sawon.add(sawon10);
		//문제2. 직원 총 급여 구하기
		
		int sum = 0;
		for(Emp i :sawon) {
			sum = sum + i.sal;  
		}
		System.out.println("직원 총 급여는 "+sum+"원 입니다.");
		//문제3. 직원 평균 급여 구하기
		int avg = 0;
		for (Emp i : sawon) {
			avg++;
		}
		avg = sum / avg;
		System.out.println("직원의 평균 급여는 "+avg+"원 입니다.");
		//문제4. 직업이 MANAGER고 급여가 2500이상받는 사원 수 구하기
		int count = 0;
		for(Emp i : sawon) {
			if((i.job.equals("MANAGER")) && (i.sal >=2500)) {
				count++;
			}
		}
		System.out.println("직업이 MANAGER고 급여가 2500 이상받는 사원은 "+count+"명 입니다.");
		
		//문제5. 가장 급여를 많이 받는 사원의 이름과 직업 조회하기
		// 어려움...TT
		String maxname,maxjob; // 변수 지정
		maxname = maxjob = "";// String 에 값을 지정
		int maxsal = 0;
		for(Emp i : sawon) {
			if(i.sal>maxsal) {
				maxsal = i.sal;
				maxname = i.ename;
				maxjob = i.job;
				
			}
		}
		System.out.println("가장 급여를 많이 받는 사원의 이름은 "+maxname+"이고, 직업은 "+maxjob+"입니다.");
		
		
		
	}

}
