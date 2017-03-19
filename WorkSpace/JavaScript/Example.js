  function time() {
    var date = new Date();
    var hours = date.getHours();
    var minutes = date.getMinutes();
    var seconds = date.getSeconds();
   document.getElementById("watch").innerHTML = hours + ":" + minutes + ":" + seconds;
   setTimeout("time()", 1000);}
   time();
