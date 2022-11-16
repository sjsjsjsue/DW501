package movie;

public class movieVo {

	private String title; // 영화제목
	private int year; // 개봉연도
	private int filmRating; // 관람등급
	
	public movieVo() {}; // 초기값 저장. 변수들 초기화
	/*
	 * 영화제목, 개봉년도, 관람등급
	 * 
	 *  생성자 메소드를 통해 데이터 저장 가능하게 만들기.
	 *  출력 메소드 (제목, 년도, 등급 출력 되어야 함) 
	 *  
	 */
	
	public movieVo(String title, int year, int filmRating) {
		this.title = title;
		this.year = year;
		this.filmRating = filmRating;
	};
	public void output() {
		System.out.println("영화제목 : "+title+ "  개봉년도 :"+year+"년도  관람등급 : "+filmRating+"세 이상 관람 가능");
	}
	
	@Override // 안적어도 되지만, 적는거를 추천 
	// @는 컴퓨터가 보는 주석처리
	public String toString() { 
		// toString() 메소드는 자바에서 일반적인 출력용 메소드이다.
		return "영화제목 : "+title+ "  개봉년도 :"+year+"년도  관람등급 : "+filmRating+"세 이상 관람 가능";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getFilmRating() {
		return filmRating;
	}
	public void setFilmRating(int filmRating) {
		this.filmRating = filmRating;
	}
	
	
	
	
}