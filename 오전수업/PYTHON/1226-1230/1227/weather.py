import requests
import bs4
import urllib
from urllib.request import urlopen

url = "https://weather.naver.com/today/07140102?cpName=KMA"

weather_list = []
html = urlopen(url)

bsp = bs4.BeautifulSoup(html, "html.parser")

# 시간별 온도, 습도, 맑음인지 찾으시오.

weather_div = bsp.findAll(
    "div", {"class", "weather_table_wrap"})  # table 위에 있는 div가 나옴
for i in weather_div:
    weather_tr = weather_div.find("#tr")
    th = i.select_one("th").text
    td = i.select_one("td").text


print(weather_div)
