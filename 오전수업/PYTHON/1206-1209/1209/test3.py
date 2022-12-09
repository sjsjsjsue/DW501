import random

name = ["김유신", "이순신", "어영담", "이성계", "장영실", "홍길동", "김지연", "김춘추"]
job = ["군인", "국회의원", "과학자", "도둑", "건설업자", "밸리댄서", "변호사"]
age = [24, 35, 37, 21, 54, 41, 29, 35, 42]
info = []

for i in range(10):
    info.append([random.choice(name), random.choice(job), random.choice(age)])

"""
문제. info 리스트로 작업하기
직업이 "군인"인 사람은 누구인지 이름 출력
직업이 과학자인 사람들의 평균나이 출력
나이가 20대인 사람들의 직업은 무엇인지 출력하기
"""

""""
avg = 0  # 평균구하기
sum = 0

for i in info:
    if(random.choice(job) == "군인"):
        print("군인은"+random.choice(name))
    # if(random.choice(job) == "과학자"):
    #     sum += random.choice(age)

    #     print("과학자인 사람들의 평균 나이는 "+sum + "입니다.")
    # if(random.choice(age) > 19 and random.choice(age) < 30):
    #   print("20대의 사람들의 직업은")
print(info)
"""
age = 0
cnt = 0
for people in info:
    if "군인" in people:
        print("군인은"+people[0])
for people in info:
    if "과학자" in people:
        age += people[2]
        cnt += 1
for people in info:
    if int(int(people[2])/10) == 2:
        print("20대의 직업군 "+people[1])

if cnt != 0:
    print("과학자의 평균나이 " + str(age/cnt))
else:
    print("과학자가 없다.")
print(info)


# 랜덤 사용방법
# random.randint(1,40) : 1~40 중에서 랜덤

a = []  # 랜덤범위 1~30
b = []  # 랜덤범위 10~50
c = []  # 랜덤범위 1~100

num = []
# a,b,c 리스트에 각각 15개씩 랜덤 범위에 맞춰서 저장하기
# a,b,c 리스트의 값 중에서 중복인 값만 찾아서 num 리스트에 저장하기
# 중복값이 하나도 없다면 중복 없다고 출력
for i in range(15):
    a.append(random.randint(1, 30))
    b.append(random.randint(10, 50))
    c.append(random.randint(1, 100))

print(a)
print(b)
print(c)

for x in a:  # a 리스트의 값을 하나씩 x 변수에 저장
    if x in b:  # x 변수의 값이 리스트 b에 있나?
        if x in c:  # x 변수의 값이 리스트 b 에는 있는데 리스트 c에도 잇는가?
            num.append(x)
if len(num) != 0:  # len(num) : num 리스트의 크기값 0 이라면 없다. not num : num 이 비었다면 false!
    print(num)
else:
    print("중복이 없어욥 ><")

"""
문제 
eng 리스트의 알파벳을 무작위 조합해서 word 리스트 단어 중 1개 이상 나오는 경우
몇번째 조합에서 나오는지 출력
"""
word = ["boy", "table", "book", "girl", "interest", "limit", "endless", "mission",
        "hopi", "tigerprint"]
eng = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
       "r", "s", "t", "u", "v", "w", "x", "y", "z"]

