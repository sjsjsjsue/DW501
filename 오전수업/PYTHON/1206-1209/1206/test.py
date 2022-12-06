x = 9
print("output :"+str(x))
#  숫자열을 문자열로 바꿔주는 "str(_)"이 필요함
print("output :{0}".format(x))

a = 3.14
print("float :{0}".format(a))
# 소수점 자리를 알 수 있다.
print("float :{0:.1f}".format(a))

#  타입을 알 수 있다.
print(type(a))

name = "김잔디"
# 이름을 나타내는 법
print("이름 : {0:s}".format(name))
print("이름 : " + name)

memo = "가 정수를 때렸다."
result = name + memo
print(result)
# 문자열 길이 알아내는 법
res_len = len(result)
print(res_len)

temp1 = result.split()
print(temp1)
temp2 = result.split(" ", 1)
#  "" 기준으로 몇번 나눌거닝..?
print(temp2)

print(" {0}".format(",".join(temp1)))
# join : 문자 배열을 합치기 "%".join(배열) 하면 각 배열의 요소 사이사이에 %가 붙은 상태로 합쳐진다.
#  파이썬에서 주석은 # or """ """ 이다.

num = int(input("숫자를 입력하세요. : "))
# input 입력함수! 결과는 문자열(str)
# int () 안에 넣었다면 결과는 숫자(int)
#  실수타입 변환 : float()
print(type(num))


# 문제 1. 국어, 수학, 영어 세 과목 점수 입력 받아서 평균을 구하여 출력하시오.
kor = int(input("국어점수를 입력하세요! "))

mat = int(input("수학점수를 입력하세요!"))

eng = int(input("영어점수를 입력하세요!"))

sum = kor + mat + eng
print("총점 : {0}".format(sum))

avg = sum / 3
print("평균 : {0}".format(avg))
