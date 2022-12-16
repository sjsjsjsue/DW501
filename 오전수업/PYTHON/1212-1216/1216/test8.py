"""
함수
자바의 메서드
반환타입 메서드 이름(매개변수){ 메서드 실행 내용;  반환 타입이 있다면 return;}
자바스크립트 함수
function 함수이름(매개변수){ 함수 실행 내용; 반환값이 있다면 return;}

파이썬 함수
def 함수이름(매개변수): 

정의된 함수 실행방법  -> 함수이름()
"""

"""
def sum(a, b):
    return a+b


res = sum(10, 20)
print(res)


def func():
    print("나 함수다")


func()


def func1(word):
    print(word+"이다")


func1("난 ㅇㅈㅇ")


def minus(num1, num2):
    print(num1 - num2)


minus(30, 15)


def whoami(name, what):
    if name == "ㅇㅈㅇ":
        print(name + "는(은) " + what + "이다")
    else:
        print(name + "는(은) " + what + "가 맞다")


whoami("ㅇㅈㅇ", "ㅇㅈㅇ")
whoami("윤재영", "윤재영")

# count 로 cnt 증강


def count(i):
    return i+1


cnt = 0
while cnt < 10:
    cnt = count(cnt)
    print(cnt)


cnt1 = 0  # 전역변수 count2 보다 먼저 생성한다


def count2():
    global cnt1  # 파이썬의 전역변수 - count2함수에서 cnt1을 사용하고자 한다면 global을 붙여서
    # 전역변수임을 알려주고 사용한다
    # 전역변수는 최소한으로만 사용 - 코드의 유지보수를 어렵게 한다
    # 전역변수를 마구 생성하여 사용하면 정신적으로 힘들게된다
    cnt1 += 1


while cnt1 < 10:
    count2()
print(cnt1)
"""
"""
문제.
그러면 여기서 간단한 문제.
간단한 문제 풀기 그 첫번째
갓난 애기도 풀 수 있을지도 모르는 문제 1.
정수 하나를 입력받아서 함수를 통해 해당 점수의 값을 100 증가 시키고 출력하기.



def add100(n):  # 100이 증가하는 함수 정의 지정된 값 100 증가해야 되니까 매개변수 필요
    print(n+100)  # 100 증가 시키고 출력하기


num = int(input("정수 입력 : "))  # 정수 입력받기
add100(num)  # 100 증가 시켜주는 함수 호출하여 입력받은 숫자를 함수에 넘겨주기
"""

"""
문제.
첫번째 할 것. 정수 두개 입력 받기(변수 두개 해서 입력받기)
두번째 할 것. 정수 입력받는 코드 위에 함수 만들기
            함수의 내용은 두 숫자를 곱해서 출력하는 내용
세번째 할 것. 정수 입력받는 코드 밑에 함수 호출하기



def multiply(m, n): # 함수 만들기
    print(m*n)


num1 = int(input("정수입력1 : "))
num2 = int(input("정수입력2 : "))

# 내가 한 것 : multiply(num1 * num2)
multiply(num1, num2)
"""

"""
문제.
첫번째. 리스트 만들기
두번째. 리스트에 1~50 까지 짝수만 저장하기
세번째. 리스트에 만들기 코드 위에 함수 만들기.
       함수 내용은 함수에 입력된 숫자에 +1 해서 출력하기
네번째. 리스트를 반복문 이용하여 함수 호출하기, 함수에 리스트값 입력

#  내가 한 것

def add1(n): # 입력된 숫자에 +1 하기
    print(n+1)


li = [] # 리스트 만들기

for i in range(1, 51): # 짝수만 저장하기
    if i % 2 == 0:
      li.append(i) 
      print(li)

for i in li: # 전체 숫자 출력
  add1(li)
"""

"""
def add1(n):
    print(n+1)


li = [i for i in range(1, 50) if i % 2 == 0]

for i in li:
    add1(i)
"""

"""
문제 
세 과목을 점수를 입력받아서 총점과 평균을 구할 것이다.

def score_input(subj):
    scr = []  # 함수 내부에서 입력한 점수를 리스트에 저장해야하기 때문에 리스트를 만든 것
    for sub in range(len(subj)):
        scr.append(int(input(subj[sub])))
        # 같은 파일안에 함수가 있어서 동작이 가능! 다른 파일에 있다면 동작이 가능하지않음.
        # 함수 파라미터값에 subj 를 넣어줘야 동작 가능!
    return scr
    # for 문으로 입력한 점수가 저장된 리스트 scr 을 돌려 보내야 한다.
    # 그래야 실 사용하고자 하는 곳에서 값을 사용하니까


def total(score):  # 총점 계산 함수
    tot = 0
    for i in score:
        tot += i  # 입력한 점수 전부 더하기
    return tot  # 함수 밖에서 사용할 수 있게 return 을 해줘야한다.


def avg(tot):  # 평균 계산 함수
    평균 = tot / 3  # 평균 점수내기
    print("총점 : {0}, 평균 :{1}".format(tot, 평균))


score = []

subj = ("국어점수", "영어점수", "물리치료")

score = score_input(subj)  # score 에 append 해줌
#  튜플로 만든 subj 를 함수에 보낸다. subj 의 주소를 보내는 것!
tot = total(score)
avg(tot)
"""
"""
문제
장영순, 김지언, 이지형 의 키를 입력하여 평균키를 구하시오.
평균키보다 작은 사람은 누구인지 출력하기
키를 입력하는 함수
평균키를 계산하는 함수
작은키 누구야? 함수

# 내가 한 것
def heig_input(people):  # 키를 입력하는 함수
    scr = []
    for i in range(len(people)):
        scr.append(int(input(people[i])))
    return scr


def avg_1(height):  # 평균키를 계산하는 함수
    sum = 0  # 합계
    avg_h = 0  # 평균
    for i in height:
        sum += i
    avg_h = sum / 3
    
    print("장영순, 김지언, 이지형의 평균 키는"+avg_h)
    return avg_h # 적지 않음

def low_h(hight):  # 가장 작은 사람 키 구하기
    # low = 0 필요가 없음 지워버려
    for i in hight:
        if low[i] < i:
            print("그 중 가장 작은 사람의 키는 :" + low)

height = []
people = ("장영순", "김지언", "이지형")

height = heig_input(people)
avg_h = avg_1(height)
low_h(height) # 함수 실행하려고 나옴


# 쌤이 한 것

def lowest(avg, tall):
    global woman  # 전역 튜플을 사용하기 위해 global 을 해준다.
    for i in range(len(tall)):
        if avg > tall[i]:
            print("평균보다 작은 사람은 {0}".format(woman[i]))


def tall_avg(tall, woman):
    sum = 0
    for i in tall:
        sum += i
    avg = sum / len(tall)  # len(tall) == 3
    print("평균 키는 : " + str(avg))
    lowest(avg, tall)  # lowest 에서 쓰려고!


def tall_input():  # 키를 입력하는 함수
    global woman  # 전역 튜플을 사용하기 위해 global 을 해준다.
    tall = []
    for i in woman:
        tall.append(int(input(i)))
    tall_avg(tall, woman)  # tall_input 보다 먼저 정의되어있어야함 실행 가능


woman = ("장영순", "김지연", "이지형")

tall_input()

"""
"""
문제
간단한 거 해보기
리스트에 1부터 50까지 저장하기
리스트에 저장되어있는 숫자들 중에서 5의 배수만 출력하기
5의 배수 찾아서 출력하는 함수 만들어서 하기

# 내가 한 것

li = []
for i in range(1, 51):  # 리스트에 1부터 50까지 저장하기
    li.append(i)


def multiples(li):
    for i in li:  # 리스트에 저장되어있는 숫자들 중에서 5의 배수만 출력하기
        if i % 5 == 0:
            print(i)

multiples(li)

# 쌤이 한 것

def output(li):
    for num in li:
        if num % 5 == 0:
            print(num)


li = [i for i in range(1, 51)]

output(li)

# print(li)
"""

"""
파이썬에서 함수 사용하는 방법


# 1


def func(a):
    print(a)


func(a="abc",)  # a 라는 매개변수를 "__" 값으로 정해줌

# 2


def func1(a, b, c):
    print(a, b, c)


func1(a="abc", b="b", c='c')

# 3


def func2(national="계림국"):
    print(national)


func2("대한민국!")
func2()  # 오류? 오류가 맞음. 기본값이 없어서. 매개변수에 기본값이 정해지면 기본값이 나옴!

# 4


def func3(**info):
    print(info["name"])
    print(info["상태"])


func3(name="장영주", 상태 ="천재, 귀여움, 아름다움")
# 오류가 남. 이유? 매개변수 앞에 ** 이 있는 것은 __["__"]으로 사용해줘야함
# 딕셔너리 형태로 해줘야함. 여러개도 가능!(print 를 여러개 만들어야 함)

"""
"""
문제 
첫번째 리스트에는 이순신, 장영실, 정도전, 이성계, 이방지 의 키를 입력
두번째 리스트에는 이순신, 장영실, 정도전, 이성계, 이방지 의 몸무게를 입력
키가 가장 작은 사람 찾는 함수 
몸무게가 가장 높은 사람 찾는 함수


# 내가 한 것


def hei_input(name):  # 키를 입력하는 함수
    hei = []
    for i in range(len(name)):
        hei.append(int(input(name[i]+"키")))
    print("{0} 의 키는 :{1}".format(name, hei))
    return hei


def wei_input(name):  # 몸무게를 입력하는 함수

    wei = []
    for i in range(len(name)):
        wei.append(int(input(name[i]+"몸무게")))
    print("{0} 는 :{1}".format(name, wei))
    return wei


def heaviest(hei1):  # 가장 몸무게가 높은 사람 찾기
    global name
    heavy = heil[0]
    for i in hei1:
        if i > heavy:
            heavy = i
    print(
        "가장 몸무게가 높은 사람은 {0} 은 이고, 몸무게는 {1} 이다.".format(name[i], heavy))


def lowest(wei):  # 키가 가장 작은 사람 찾기
    global name
    # low = 0 틀림 : 0으로 하면 0 이  가장 작으니 틀림
    low = wei[0]
    for i in wei:
        if wei[i] < i:
            low = wei[i]
    print("가장 키가 작은 사람은 {0} 이고, 키는 {1} cm 이다.".format(name[i], low))


name = ("이순신", "장영실", "정도전", "이성계", "이방지")

hei = hei_input(name)
wei = wei_input(name)
heaviest(hei)
lowest(wei)
"""

# 쌤이 한 것

import random
옛사람 = ("이순신", "장영실", "정몽주", "정도전", "이성계", "이방지")


def small_tall(tall):
    global 옛사람
    sm = tall[0]  # 0 인덱스의 키가 가장 작든 크든 아무 상관없음. 비교값이 필요하니 넣어줬음.
    for i in range(len(tall)):  # 가장 작은 키 찾기
        if sm > tall[i]:
            sm = tall[i]
    print("키가 가장 작은 사람 : {0}".format(옛사람[tall.index(sm)]))

def high_wd(wd):
    global 옛사람
    hg = wd[0]
    for i in range(len(wd)):
        if hg< wd[i]:
            hg = wd[i]
    print("몸무게가 가장 많이 나가는 사람 : {0}".format(옛사람[tall.index(wd)]))

tall = [random.randint(157, 184) for i in range(6)]
# print(tall)
wd = [random.randint(61, 87) for i in range(6)]

small_tall(tall)
