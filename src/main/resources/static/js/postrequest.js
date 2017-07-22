  $( document ).ready(function() {

  	var url = window.location;
    var partArray = [];

    $("#elementsInput").submit (function (event){
        event.preventDefault();
        ajaxPost();
    });


  	// SUBMIT FORM FOR PARTS
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
              quantity : $("#quantity").val(),
              weightNetoTotal : $("#weightNeto").val() * $("#quantity").val(),
              height : $("#height").val(),
              length : $("#leng").val(),
              thickness : $("#thickness").val(),
              weightBruto : brutoCalculation(),
              weightBrutoTotal : brutoCalculation() * $("#quantity").val()
          }

        if(validateForm(formData) == true) {

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

        fillTable(formData);
        partArray.push(formData);
        }

      	// Reset FormData after Posting
      	resetData();

      }

      function validateForm() {
      	if ($("#partName").val() == "" || $("#material").val() == "" || $("#weightNeto").val() == ""
      	        || $("#quantity").val() == "" ) {
      		return false;
      	} else {
      	    return true;
      	}
      }

      function fillTable(formData) {
      	var table = document.getElementById("tab");
      	var row = table.insertRow(1);

          for (var i = 0; i < 10; i++) {
          	var cell1 = row.insertCell(i);
      	    switch(i) {
                  case 0:
                 	cell1.innerHTML = $("#partName").val();
                 	break;
                  case 1:
               		cell1.innerHTML = $("#material").val();
                 	break;
                  case 2:
                 	cell1.innerHTML = $("#quantity").val();
                 	break;
                  case 3:
                 	cell1.innerHTML = $("#weightNeto").val();
                 	break;
                  case 4:
                    cell1.innerHTML = formData.weightNetoTotal;
                    break;
                  case 5:
                 	cell1.innerHTML = $("#height").val();
                 	break;
                  case 6:
               		cell1.innerHTML = $("#leng").val();
                 	break;
                  case 7:
                 	cell1.innerHTML = $("#thickness").val();
                 	break;
                  case 8:
                 	cell1.innerHTML = formData.weightBruto;
                 	break;
                  case 9:
                    cell1.innerHTML = formData.weightBrutoTotal;
                    break;
                  default:
                 	cell1.innerHTML = "Error";
                 	break;
          }
        }
      }

      function brutoCalculation(){
        return ($("#thickness").val() /1000) * ($("#height").val()/1000) *  ($("#leng").val()/1000 ) * 7850
       }

      function resetData(){
              $("#partName").val(""),
              $("#material").val(""),
              $("#quantity").val(""),
              $("#weightNeto").val(""),
              $("#height").val(""),
              $("#leng").val(""),
              $("#thickness").val("")
      }
  })