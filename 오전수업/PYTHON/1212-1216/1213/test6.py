""""
딕셔너리 - 사전
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
