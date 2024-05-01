 $(document).ready(function(){
  // 취소 버튼 클릭 시 이벤트 처리
  $("#cancelBtn").click(function(){
      // 폼 내용 초기화
      $("#postForm")[0].reset();
      window.location.href = "http://localhost:8080";
  });

  // 폼 제출 시 이벤트 처리
  $("#postForm").submit(function(event){
       event.preventDefault(); // 기본 제출 동작 방지

      alert("게시물을 등록합니다.");
      var apiUrl = "http://localhost:8080/api/board";
      var title = $("#title").val();
      var content = $("#content").val();
      var requestParam  = {
         "title" : title,
         "content" : content
      };

      // API에서 데이터 가져와서 테이블에 추가
      $.post(apiUrl, requestParam, function(data){
         console.log(data);
         window.location.href = "http://localhost:8080";
      });

      // 폼 내용 초기화
      $("#postForm")[0].reset();
  });
});