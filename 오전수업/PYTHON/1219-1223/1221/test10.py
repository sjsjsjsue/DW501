
"""
HTTP : hyper text 문서를 전송하기위한 프로토콜
프로토콜이란 ? 약속, 규약 
URL : 흔히 알고 있는 인터넷 주소. http://www.naver.com
URI : URL에 사용자 정보와 스키마를 포함한 값

스크래핑 : 
- 웹 페이지에서 자동으로 데이터를 추출하는 것. 
- 웹 페이지의 소유자의 허락없이 무단으로 끌어오는 행위
- 스크래핑은 특정 웹사이트에서 데이터 추출

크롤링 : 
- 웹페이지에서 자동으로 데이터 추출
- 크롤링은 웹사이트의 링크를 통해서 정보를 찾아서 추출하는 방식

스크래핑,  크롤링 둘 다 '데이터 추출한다.' 라는 것이 동일하기에 흔히 크롤링이라고 한다.
프론트 엔드쪽에서만 데이터를 추출! 백엔드쪽은 데이터 추출 못함

파싱 : 원하는 데이터만을 추출하는 것
\n : 줄바꿈 == enter
\t : tab
"""

from urllib.request import urlopen
# import 를 하지 않으면 ~.~.~.풀로 적어야 함.
import bs4


"""
url = "http://www.naver.com"  # 변수 만듦
html = urlopen(url)

print(html.read())
"""
"""
test_html = "<html><head></head><body><div>hahaha</div>"
test_html += "<p>kjy babo</p></body></html>"

bodj = bs4.BeautifulSoup(test_html, "html.parser")

print(test_html)
print(bodj)

print(test_html.find("div"))  # 문자열을 찾음
print(bodj.find("div"))  # div 태그 찾기

print(bodj.find("p"))
"""

"""
html = 
<html>
  <body>
    <div>
      <ul class="kjy">
        <li>babo</li>
        <li>19</li>
      </ul>
      <ul class="ljh">
        <li>old mai...</li>
        <li>old...</li>
      </ul>
    </div>
  </body>
</html>



bsp = bs4.BeautifulSoup(html, "html.parser")

# 태그의 속성을 통해서 가져오는 방법
ul = bsp.find("ul", {"class:ljh"})  # 딕셔너리 방법 , {"class:ljh"}
print(ul["class"])  # ???? ['class']

bsp = bs4.BeautifulSoup(html, "html.parser")
li = bsp.findAll("li")
print(li[1])
# 파일은 list 로 가져왔음. 인덱스를 사용하자
for i in li:
    print(i.text)  # li 안에 있는 텍스트를 가져옴
"""

url = "http://www.naver.com"
html = urlopen(url)
html = html.read()

bsp = bs4.BeautifulSoup(html, "html.parser")
temp = bsp.findAll("strong", {"class", "current"})
print(temp[0].text)
for t in temp:
  if "현재기온" in t:
    print(t.text)
