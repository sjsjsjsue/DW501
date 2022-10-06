var num = 1;

window.onload = function () {
  document.querySelector('#add').addEventListener('click', function () {
    var city = document.querySelector('#city').value;
    var cnt = document.querySelector('#count').value;

    var div = document.createElement('div');

    var h = document.createElement('h3');
    h.appendChild(document.createTextNode(num++));
    div.appendChild(h);
    h = document.createElement('h3');
    h.appendChild(document.createTextNode(city));
    div.appendChild(h);
    h = document.createElement('h3');
    h.appendChild(document.createTextNode(cnt + '명'));
    div.appendChild(h);

    var parent = document.querySelector('#result');
    parent.prepend(div);
  });
};
