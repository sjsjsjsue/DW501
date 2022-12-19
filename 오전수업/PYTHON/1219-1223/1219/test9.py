"""
미니시험
문제. 문제는 하나!
문제를 모두 다 풀면 소정의 관심 나갑니다 😆

(c:/test 폴더에 member.txt) text 문서에 다음과 같이 데이터 20개 작성하기.
번호 이름 연락처 이메일 성별 주소(동,읍,면까지만 입력)

위 txt 파일 읽어오기
딕셔너리에 저장하기.(key, value 알아서)
1. 이메일의 도메인 몇개이고 무엇무엇이 있는지 출력하기 (중복없이)
도메인은 naver.com / goole.com
2. naver.com  도메인의 이메일을 사용하는 사람들이 사는 도시 이름 만 출력하기.
3. 성별이 여자인 사람 중에서 대전 중구에 사는 사람은 누구인지 모두 출력하기.

함수
1. 파일 읽기 함수 (딕셔너리에 저장.)
2. 파일 읽어서 딕셔너리에 저장하는 함수

1. 함수 - 이메일에서 도메인 불리하는 함수, 중복제거 하고 출력하는 함수
2. naver.com 인 사람 찾는 함수.
3. 성별로 찾는 함수
( 꼭 여자만 찾을 수 있으면 안됨, 남자를 찾고 싶으면 남자로 찾을 수 있어야 함. 코드 수정 없이)

"""
# 내가 한 것..ㅠㅠ


# 파일 읽기
def readFile():
    file = []

    with open("C:/test/member.txt", "r", encoding="utf-8") as f:  # 파일 가져오기
        # open("불러 올 파일 주소","r" : 읽기모드, "")
        file = f.readlines()
    for i in range(len(file)):
        file[i] = file[i][:len(file[i])-1]
        file[i] = file[i].split(" ")  # ()안에 있는 기준으로 나누겠다!
    # print(file)
    return file


file = readFile()

# 딕셔너리 저장


key = ["번호", "이름", "연락처", "이메일", "성별", "주소"]  # 딕셔너리 키!


def makeDic():

    # 파읽 읽어서 딕셔너리에 저장
    qus = dict()  # 딕셔너리 생성
    for i in range(len(file)):
        qus[i+1] = dict(zip(key, file[i]))
    return qus


qus = makeDic()

#  이메일의 도메인 몇개이고 무엇무엇이 있는지 출력하기 (중복없이)


def findEmaildomain(qus):
    for i in qus:
        print("{0}".format(qus[i]["이메일"]))


findEmaildomain(qus)


# naver.com  도메인의 이메일을 사용하는 사람들이 사는 도시 이름 만 출력하기.
def findUserNaverCity(qus):
    for i in qus:
        # print("{0}".format(qus[i]["이메일"]))  # 전체의 이메일이 나옴.
        if "naver.com" in qus[i]["이메일"]:
            print("Naver.com 을 사용하는 사람들이 사는 도시는 : {0}".format(qus[i]["주소"]))


findUserNaverCity(qus)


def findGender(qus):  # 성별로 찾는 함수
    for i in qus:
        if "여" in qus[i]["성별"]:
            print("여자는 {0} 이고, 연락처는 {1} 이고, 이메일은 {2} 이고 ,주소는 {3} 입니다.".format(
                qus[i]["이름"], qus[i]["연락처"], qus[i]["이메일"], qus[i]["주소"]))

        if "남" in qus[i]["성별"]:
            print("남자는 {0} 이고, 연락처는 {1} 이고, 이메일은 {2} 이고 ,주소는 {3} 입니다.".format(qus[i]["이름"], qus[i]
                  ["연락처"], qus[i]["이메일"], qus[i]["주소"]))


findGender(qus)

# 쌤이 한 것
