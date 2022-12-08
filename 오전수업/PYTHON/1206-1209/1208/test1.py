import random

# print("asd")
# 1번
# v = float(input("속력"))
# r = float(input("반지름"))

# dist = r*2*3.14

# time = dist/v*60

# print("완주시간 {0:.1f}분".format(time))


# soju = int(input("소주잔"))

# life = soju * 2 * 365 * 20

# print("단축수명 : {0}".format(life))
# print("단축수명 : {0}".format(int(life/60)))
# print("단축수명 : {0}".format(int(life/60/24)))


# x,y,z = "김지연","장영주","변수정"

# favorite = ["목발","선인장","19남친"]

# a,b,c = favorite
# print(a)
# print(b)
# print(c)

# num = 19
# num1 = 27

# if num1 > num :
#   print("누난 내 여자니까!")
# else:
#   print("누나 늙었어")
#   print("이건 그냥 출력")

# age = 22

# if age > num :
#   print("ㅎㅇ")
# elif num > age :
#   print("ㅂㅇ")
# else :
#   print("둘다 ㅂㅇ")

# name = "김지연"

# print("미안합니다.. 그만할게요") if name == "김지연" else print("농일세") if num1 != 27 else print("뻥인데 계속할건데")


# 지연 = int(input("지연점수 : "))
# 기원 = int(input("기원점수 : "))

# if 지연 > 기원 :
#   print("지연 승")
# elif 지연 == 기원 :
#   지연 = random.randrange(1, 1001)
#   기원 = random.randrange(1, 1001)
#   if 지연 > 기원 :
#     print("지연 승 " + str(지연) + "점")
#   elif 기원 > 지연 :
#     print("기원 승 " + str(기원) + "점")
#   else :
#     print("무승부")
# else :
#   print("기원 승")


# 영주 = random.randrange(1, 101)
# 지연 = random.randrange(1, 101)
# 수정 = random.randrange(1, 101)

# avg = (영주 + 지연 + 수정) / 3
# print("영주 점수 : " + str(영주) + "점" + " 지연 점수 : " + str(지연)+ "점"  + " 수정 점수 : " + str(수정)+ "점" )
# if avg > 90 :
#   print("A")
# elif avg > 80 :
#   print("B")
# elif avg > 70 :
#   print("C")
# else :
#   print("쯧쯧...")


# i = 4
# k = 1
# while k <= 9:
#   print(str(i) + " * " + str(k) + " = " + str(i*k))
#   k += 1


# i =1

# while i<5:
#   print(i)
#   i+=1
# else :
#   print("5보다 크면 반복문 종료")

# i=1
# while True:
#   print(i)
#   if i==100: break
#   i+=1

# BUS_PAY = 1200
# money =  10000
# count = 0

# while money >= BUS_PAY :
#   money -= BUS_PAY
#   count += 1

# print("탑승 횟수 : " + str(count) + "회 남은잔액 : " + str(money) + "원")

# num = 8
# for i in range(2,10):
#   for j in range(1,10):
#     print(str(i) + " * " + str(j) + " = " + str(j*i))
# print("")

# for i in range(1,10):
#   print("{0} * {1} = {2}".format(num,i,num*i))


# for i in range(45,110):
#   print(i)


""" # 1부터 100까지 출력하는데 3의 배수에서는 윤재영 출력. 5의 배수에서는 바보 출력
for i in range(1, 101):
    if i % 3 == 0:
        print("윤재영", end="")
    if i % 5 == 0:
        print("바보")
    # else :
    #   print(i)

name = ["장영주바보", "김지연 똥깨", "윤재영 멍충이"]
print(name)

# 리스트에는 문자열, 숫자열, 불링형, 소수점까지 사용가능
data1 = ["김기원장", 100, 3.14, True]
print(data1)

data2 = list(("최윤도서관", "변수정과", 100))
print(data2)

# 인덱스 사용방법
# 인덱스 -(마이너스)를 사용하면 거꾸로 가라
print(data2[0])  # 최윤도서관
print(data2[-1])  # 100

# 범위 지정
data3 = ["이종빈티지", "윤종찬양하라", "이지현미밥맛있어", "장영주모"]
# 1번 인덱스부터 3번 인덱스 전까지 : 1,2번인덱스만 나옴
print(data3[1:3])
# 0번 인덱스부터 3번 인덱스 전까지 : 0,1,2 번 인덱스만 나옴
print(data3[:3])
# 2번 인덱스부터 마지막 인덱스까지 : 2,3번 인덱스만 나옴
print(data3[2:])

# 데이터 추가하는 방법
data3.append("김지연기하네")
data3.append("윤재영영사랑해")
print(data3)

# 데이터 지우는 법 1 (내가 원하는 데이터 삭제)
data3.remove("장영주모")
print(data3)

# 데이터 지우는 법 2(마지막 데이터만 지워짐)
data3.pop()
print(data3)

# 데이터 지우는 법 3 (인덱스 번호를 통해 지우기)
del data3[2]
print(data3)

# 데이터 지우는법 4 (리스트 완전 삭제)
data3.clear()
print(data3) 
"""

memo = ["나 ", "김지연", "은", "19세 남친을", "원한다"]
for me in memo:
    print(me, end="")
memo[3] = "대머리 남친을"
print()
for me in memo:
    print(me, end="")

memo[1:4] = ["장영주", "는", "목발을"]
print()
for me in memo:
    print(me, end="")

memo.insert(3, "드러운 어그와 ")

print(memo)

memo1 = ["이종빈", "윤재영", "변수정"]
memo2 = ["장영주부", "김지연세많음", "이지현왕언니"]
# extend : memo1 + memo2
memo1.extend(memo2)
print(memo1)

print(len(memo1))


info501 = ["장영주는 폭력적이다.", "김지연은 연하만좋아한다.", "윤재영은 옆반쌤좋아한다.", "최윤도는 영주불행이 행복이다.",
           "수정이는 생일이라 코딩이싫데...", "종빈이는 지금 게임한다."]
""""
문제1.
501호 딸기반 학생이름을 input 으로 입력받기
info501에 해당 학생이름이 있다면 학생의 정보를 출력하시오
"""
stra = input("501호 딸기반 학생이름을 입력하세요  ")
for i in info501:
    if stra in i:
        print(i)
""""
문제2. 
info501 에서 "좋아한다" 문구가 있는 정보들 모두 출력
"""
for info in info501:
    if "좋아한다" in info:
        print("좋아한다 문구가 있는 정보는 " + info+" 입니다")

num= [x for x in range(10)]
print(num)