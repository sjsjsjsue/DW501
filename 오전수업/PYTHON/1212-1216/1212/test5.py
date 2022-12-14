
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

# 합집합에서 교집합 빼기
d = 김지연팀 ^ 장영주팀
print(d)
