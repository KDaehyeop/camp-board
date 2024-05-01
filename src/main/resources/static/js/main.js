
 $(document).ready(function(){
  var apiUrl = "http://localhost:8080/api/board";

  // API에서 데이터 가져와서 테이블에 추가
  $.get(apiUrl, function(data) {
      $.each(data, function(index, item){
          var newRow = "<tr>"
                      + "<td>" + item.id + "</td>"
                      + "<td>" + item.title + "</td>"
                      + "<td>" + item.content + "</td>"
                      + "</tr>";
          $("#dataTable tbody").append(newRow);
      });
  });
   $("#button1").click(function () {
        window.location.href = "http://localhost:8080/create-post-page"; // 페이지 1로 이동
    });

    // Button 2 클릭 시 특정 화면으로 이동
   $("#button2").click(function () {
     window.location.href = "page2.html"; //
    });
 });
