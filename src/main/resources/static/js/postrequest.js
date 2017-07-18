  $( document ).ready(function() {

  	var url = window.location;

  	// SUBMIT FORM
      $("#elementsInput").submit (function (event){
          event.preventDefault();
          ajaxPost();
          });

      function ajaxPost(){

          // PREP FORM DATA
          var formData = {
              partName : $("#partName").val(),
              material : $("#material").val(),
              weightNeto : $("#weightNeto").val(),
              height : $("#height").val(),
              leng : $("#leng").val(),
              thickness : $("#thickness").val(),
              weightBruto :  $("#thickness").val() * $("#thickness").val()
          }

      	// DO POST
      	$.ajax({
  			type : "POST",
  			contentType : "application/json",
  			url : url + "/postParts",
  			data : JSON.stringify(formData),
  			dataType : 'json',
  			success : function(result) {
                      console.log(result);
  			},
  			error : function(e) {
  				console.log("ERROR: ", e);
  			}
  		});

      	// Reset FormData after Posting
      	resetData();

      }

      function resetData(){
              $("#partName").val(""),
              $("#material").val(""),
              $("#weightNeto").val(""),
              $("#height").val(""),
              $("#leng").val(""),
              $("#thickness").val("")
      }
  })