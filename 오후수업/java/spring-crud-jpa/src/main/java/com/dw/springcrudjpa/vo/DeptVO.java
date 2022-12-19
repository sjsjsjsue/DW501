package com.dw.springcrudjpa.vo;

@Setter // import 해야함
@Getter // import 해야 함
public class DeptVO {
  private int num; // 과정번호
  private String class_name; // 과정명
  private String class; // 호실
  private String start_date; // 시작날짜
  private String end_date; // 끝나는 날짜
  private String teacher; // 선생님
  
}
