   var partArray = [];
   var netoSum = 0;
   var brutoSum = 0;

  $( document ).ready(function() {

  	var url = window.location;


    $("#trailerSubmit").submit (function (event){
        event.preventDefault();
        ajaxTrailerPost();
    });

    function ajaxTrailerPost() {
        //PREP DATA FOR TRAILER

        var trailerFormData = {
            name: $("#name").val(),
            orderTag : $("#orderTag").val(),
            partList : partArray,
            netoWeight : netoSum

        }

        console.log(netoSum);
    }


  	// SUBMIT FORM FOR PARTS
      $("#elementsInput").submit (function (event){
          event.preventDefault();
          ajaxPost();
          });

      function ajaxPost(){

          // PREP FORM PART DATA
          var formData = {
              partName : $("#partName").val(),
              material : $("#material").val(),
              weightNeto : $("#weightNeto").val(),
              quantity : $("#quantity").val(),
              weightNetoTotal : ($("#weightNeto").val() / 1000) * $("#quantity").val(),
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
        netoSum += formData.weightNetoTotal;
        brutoSum += formData.weightBrutoTotal;
        writeSumPart("TOTAL NETO: ", netoSum, "TOTAL BRUTO", brutoSum);

        }

      	// Reset FormData after Posting
      	resetData();

      }

      function writeSumPart(text, sum, text2, sum2) {
        document.getElementById("totalNeto").innerHTML = text + sum + " KG";
        document.getElementById("totalBruto").innerHTML = text2 + sum2 + " KG";
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
                    cell1.innerHTML = formData.weightNetoTotal.toFixed(2);
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
              $("#weightNetoTotal").val(""),
              $("#height").val(""),
              $("#leng").val(""),
              $("#thickness").val(""),
              $("#weightBruto").val(""),
              $("#weightBrutoTotal").val("")
      }
  })