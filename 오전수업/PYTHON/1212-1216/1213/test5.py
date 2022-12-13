import random
"""
set
- 그룹을 표현할 때 사용하는 자료형
- 리스트와 달리 순서없이, 중복없이 사용
- 순서가 없다라는 말은 입력한 순서대로 저장되어있지 않다.
- 중복제거가 필요한 경우에 사용
- 그룹 구성할 떄 사용(집합)
- 데이터를 변경할 수 없지만 데이터를 제거하고 새 데이터를 추가 할 수 있다.
- set 은 {  } 로 작성된다.
- set 은 인덱스를 사용하여 set 데이터 접근 불가능
"""
"""
# set 생성

set1 = {"사과", "배", "참외", "배", "배 "}
print(set1)
# 입력한 순서대로 저장되어있지 않음!
# 중복없이 나옴
set2 = set("member")
print(set2)

set3 = set("장영죽이가 죽을 먹었다. 근데 장영죽이가 죽을 먹다가 체했다.")
print(set3)

set4 = set(("장영실이", "수도원옷을", "입었다"))
print(set4)

# print(set4[0])

for s in set4:
    print(s)  # for 문을 이용하면 하나씩 데이터를 가져올 수 있다.
print("장영주가" in set4)
# set 내부에 지정데이터가 있는지 확인

# set 데이터 추가
set4.add("김지연은")
print(set4)

set5 = {"안경을 쓰고 있다.", "그래서", "겨울에는 장님이 된다."}
set4.update(set5)
# 다른 set에 있는 데이터를 가져올 수 있다.
print(set4)
# list, 튜플, 딕셔너리의 데이터도 가능!
list1 = ["장영주는", "화가 많다."]
set4.update(list1)
print(set4)

# set 데이터 삭제하기
set4.remove("그래서")
print(set4)
# remove로 삭제할 경우 : 삭제 데이터가 없으면 오류 발생

set4.discard("장영주는")
print(set4)
# discard 로 삭제할 경우 : 삭제 데이터가 없으면 오류가 나지않는다.

a = set4.pop()
# 마지막 데이터 추출 삭제, 마지막 데이터를 추출하여 밖으로 빼고 set 에서는 삭제!
print(set4)
print(a)

# set 안 의 데이터를 완전히 비움!
set4.clear()

# set 을 삭제
del set4

# 집합
장영주팀 = {"김기원", "김민서", "김민정", "최윤도", "정다현", "임성민", "이지현", "이종빈"}
김지연팀 = {"윤재영", "이정수", "윤종찬", "변수정", "최윤도", "이지현", "전계림", "현상원"}

# 차집합
a = 장영주팀-김지연팀
print(a)

# 합집합
b = 장영주팀 | 김지연팀
print(b)

# 교집합
c = 김지연팀 & 장영주팀
print(c)

& :  and 연산자

# 합집합에서 교집합 빼기
d = 김지연팀 ^ 장영주팀
print(d)

^ : xor 연산자

# 차집합
a = 장영주팀.difference(김지연팀)
# 장영주팀.difference_update(김지연팀)
# 차집합 - 장영주팀의 데이터가 변경됨.

# 교집합
# 장영주팀.intersection(김지연팀)
# 교집합 - 장영주팀의 데이터가 변경됨
b = 장영주팀.intersection(김지연팀)

# 합집합
# 장영주팀.symmetric_difference(김지연팀)
# 합집합 - 장영주팀의 데이터가 변경됨
c = 장영주팀.symmetric_difference(김지연팀)

"""

이정수팀장 = {"김기원", "최윤도", "장영주", "이종빈", "정다현", "김유신", "한석봉", "윤재영"}
이지현팀장 = {"김지연", "윤재영", "윤종찬", "변수정", "김유신", "한석봉", "이순신"}

# 이정수 팀원들 중에 스파이 색출하기

스파이 = 이정수팀장.intersection(이지현팀장)

print("스파이 : {0}".format((스파이)))

# 순수 이정수팀장에게 충성하는 인물
충신 = 이정수팀장 - 이지현팀장
# 이정수팀장.difference(이지현팀장)

print("이정수에게 충성을 맹세한 자 : {0}".format((충신)))

전계림추종자 = {"장영주", "윤재영", "김지연", "이종빈"}

# 이지현팀장만을 바라보는 사람들
이바사 = 이지현팀장-이정수팀장
이바사 = 이바사 - 전계림추종자
print("완전한 이지현 사람들 : {0}, 총 {1}명".format(이바사, len((이바사))))

"""
문제.
today question 1.
Extract 10 data without duplication in the following random range(1-50)
랜덤함수에서 중복없이 10개의 데이터를 가져와라
"""

num = {random.randint(1, 50)}
while 10 != len(num):
    num.add(random.randint(1, 50))
print(num)


"""
문제.
회원가입을 하는데 이름이 중복되지않게 회원가입이 될 수 있도록 만들기
힌트 : b= [1,2,3,4,5,4,3] a = set(b)
"""

member = [["김춘추", "01012345687", "남"], ["김지연", "01033841256", "여"], ["이순신", "01052419687", "남"],
          ["하지원", "01087820284", "여"], ["전계림", "01087453216", "남"], [
              "전지현", "01085963214", "여"],
          ["윤재순", "01096321458", "여"], ["이지현", "01085213654", "여"], ["이요원", "01074123022", "여"]]


names = []
for x in member:
    names.append(x[0])  # member 이름만 가져오기

tempSet = set(names)

print("=============== 회원가입 =================")
name = input("이름 : ")
# a = len(set)
# set.add(name)
# if a !=len(set): # 같으면 중복, 아니면 중복이 아니다.

setName = {name}
while setName.issubset(tempSet):
    # issubset() - 지정한 set 안에 값이 포함되어있는가?
    # issuperset() - a.issupterset(b) b가 a에 모두 있는가?
    # A.issubset(B) or B.issubset(A)
    print("이름 중복입니다. 다시 입력하세요.")
    name = input("이름 : ")


tel = input("연락처 : ")
gender = input("성별 : ")

member.append([name, tel, gender])
print(member)

""""
내가 푼 것....ㅠㅠ
for i in member:
    if name in member[0]:
        name = set(member[0])
        print(name+"은 중복이름입니다.")
"""
