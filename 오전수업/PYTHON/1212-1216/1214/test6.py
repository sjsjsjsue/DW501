""""
딕셔너리 - 사전
- 비슷 데이터베이스
- 파이션 딕셔너리 == 자바에서는 MAP
- key : value
- {  } 을 사용함
- key 로 사용 가능 : 문자열, 정수, 실수, 불(True, False)
- key 로 사용 불가 : 리스트 ,set, 딕셔너리
- value 사용 : 아무거나 다 가능!
- 딕셔너리 키 몇개 존재하는가?
"""
"""
dic = {'이름': "이순신", "나이": 24, "직업": "군인"}
print(dic)
# value  값이 나옴
print(dic['이름'])

dic = {}  # 이거는 Set아니고 딕셔너리로 인식
dic = dict()  # 딕셔너리 생성

# 데이터 추가 1
dic1 = dict(이름='김지연', 나이=27, 직업='마이쮸판매원')
print(dic1)

# 데이터 추가2
dic2 = dict([('이름', '이지현'), ('age ', '26'), ('특징', '알면서...')])
print(dic2)

# 데이터 추가 3
dic3 = dict(zip(['이름', '나이', '관심분야'], ['윤재영', 25, '컴퓨터선생님']))
print(dic3)

# 값 변경 가능
print(dic3['이름'])
dic3['관심분야'] = '지연이누나'
print(dic3)

# 데이터 추가 가능!
dic3['싫어하는 것'] = '옆반선생님'
print(dic3)

if '이름' in dic3:
    print('너의 이름은 ?{0}'.format(dic3['이름']))
else:
    print("존재하지 않는 키입니다.")

# 딕셔너리 키
print(len(dic3))


title = ["캐릭터명", "생명력", "코딩기술", "잔머리", "수학능력", "공간능력", "지능지수"]
data = []
for x in title:
    data.append(input(x+":"))
# print(data)

info = dict(zip(title, data))
print(info)

for x in info:
    print(x)  # 딕셔너리의 key 출력
for x in info:
    print(info[x])  # 딕셔너리의 value 값 출력

for i in info.values():
    print(x)  # 딕셔너리의 value 출력

for key in info.keys():
    print(key)  # 딕셔너리의 key 값 출력

for k, v in info.items():
    print(k, v)  # 딕셔너리의 key, value 값 출력
"""

"""
#  5명의 정보를 입력한다.

title = ["이름", "키", "몸무게", "관심분야"]

info = []

for i in range(5):
    data = []
    for t in title:
        data.append(input(t + ' : '))
    info.append(data)

# 문제. 이름을 키로 사용하여 딕셔너리에 5명의 정보를 저장하시오.
dic_info = dict()  # 딕셔너리 만들기

for data in info:
    dic_info[data[0]] = dict(zip(title, data))

print(dic_info)
"""

"""
문제.
이름, 번호, C언어 성적, JAVA성적, React성적, DB성적, 지적수준
10명의 성적을 딕셔너리에 저장하시오.

내가 푼 것
grade = ["이름","번호","c언어성적","JAVA성적","REACT성적","DB성적","지적수준"]
data = []

for i in grade:
    data.append(input(i+": "))
info = dict(zip(grade,data))
print(info)


keys = ["이름", "번호", "c언어성적", "JAVA성적", "REACT성적", "DB성적", "지적수준"]
values = list()  # 입력한 값을 리스트에 저장하고, 그 리스트를 저장할 리스트
for i in range(3):
    temp = list()  # 입력한 값이 저장될 리스트
    for k in keys:  # 한명에 대한 정보 입력 for 문
        temp.append(input(k))
    values.append(temp)

class501 = dict()
for v in values:
    # 딕셔너리 이름을 Key 값으로 줌, 모든 데이터는 values 로 줌
    class501[v[0]] = dict(zip(keys, v))

for k in class501:  # 딕셔너리 출력하기
    print("{0} : {1}".format(k, class501[k]))

문제
위 내용을 토대로 입력한 성적들의 평균점수(지적수준 빼고)를 구하여 
이름은 key, value는 평균점수와 지적수준을 딕셔너리에 저장

내가 푼 것
title = ["c언어성적", "JAVA성적", "REACT성적", "DB성적"]
avg = 0  # 평균점수
for i in title:
    avg = sum(class501.title())/len

print(avg)
"""
"""
# 첫번째 방법
avg = list()  # 평균값 구하기
dict_avg = dict()
for name in class501:  # name에는 key로 사용한 이름이 저장
    sum = 0
    for title in class501[name]:  # title에는 이름, 번호, 성적들이 저장.
        if title == "이름" or title == "번호" or title == "지적수준":
            continue
        sum += int(class501[name][title])  # 한 명의 성적 총합 구하기.

    dict_avg[name] = dict(평균점수=sum/4, 지적수준=class501[name]["지적수준"])

print(dict_avg)

# 두번째 방법
avg = list()
dict_avg = dict()
for name in class501:
    sum = 0
    title = list(class501[name].keys())
    for i in range(2, 6):
        sum += int(class501[name][title[i]])
    dict_avg[name] = dict(평균점수=sum/4, 지적수준=class501[name]["지적수준"])

print(dict_avg)


# 세번째 방법
avg = list()
dict_avg = dict()
for name in class501:
    sum = 0
    score = list(class501[name].values())
    for i in range(2, 6):
        sum += int(score[i])
    dict_avg[name] = dict(평균점수=sum/4, 지적수준=class501[name]["지적수준"])

print(dict_avg)


"""

"""
딕셔너리의 key 만 리스트로 변환
li = list(dic.keys())

딕셔너리의 value 만 리스트 변환
li = list(dic.value())

딕셔너리의 key, value 를 리스트로 변환 
li = list(dic.items())

key 와 value 를 한쌍으로 튜플 형태로 변환
[('k1' : 'v1'), ('k2' : 'v2'),...]
"""


""""
문의제목, 작성자, 문의내용, 작성일, 답변, 답변일
딕셔너리에 저장하는데 키는 번호를 사용. 파일에서 읽어드린 순서대로 1번부터 부여

file = []

with open("C:/test/question.txt", "r", encoding="utf-8") as f:  # 파일 가져오기
    file = f.readlines()

for i in range(len(file)):
    file[i] = file[i][:len(file[i])-1]
    file[i] = file[i].split(" ")  # ()안에 있는 기준으로 나누겠다!

key = ["문의제목", "작성자", "문의내용", "작성일", "답변", "답변일"]

qus = dict()
for i in range(len(file)):
    # i+1 을 하는 이유는 ? 0부터 시작하니 +1을 해야 1부터 시작가능
    qus[i+1] = dict(zip(key, file[i]))
"""

"""
print(qus)

문의 목록을 출력하시오(번호와 제목, 작성일만 출력)
보고싶은 문의 번호를 입력하면 같이 출력하기
출력예시)
작성자 : 윤재명
제목 : 출마선언합니다.
작성일 : 2027-03-10
문의글 : 대선 출정하고 싶습니다.도와주세요.
==================================
답변 : 1억 있어요?
답변날짜 : 2027-03-20

자바 DB에서 데이터 가져올 때 select ...
rs = pt.....
rs.getInt("num")
rs.getString("문의제목")
rs.getString("작성자")
컬럼명 입력해서 가져온다.
"""
file = []
key = ["문의제목", "작성자", "문의내용", "작성일", "답변", "답변일"]

with open("C:/test/question.txt", "r", encoding="utf-8") as f:  # 파일 가져오기
    file = f.readlines()


for i in range(len(file)):
    file[i] = file[i][:len(file[i])-1]
    file[i] = file[i].split(" ")


qus = dict()
for i in range(len(file)):
    # i+1 을 하는 이유는 ? 0부터 시작하니 +1을 해야 1부터 시작가능
    qus[i+1] = dict(zip(key, file[i]))


for num in qus:
    print("{0}.{1} {2}".format(
        num, qus[num]["문의제목"], qus[num]["작성일"]))

번호 = int(input("문의 번호 : "))

print("\n작성자 : {0}\n제목 : {1}".format(qus[번호]["작성자"],qus[번호]["문의제목"]))
print("\n작성일 : {0}\n문의글 : {1}".format(qus[번호]["작성일"],qus[번호]["문의내용"]))
print("=====================================")
print("\답변 : {0}\n답변일 : {1}".format(qus[번호]["답변"],qus[번호]["답변일"]))