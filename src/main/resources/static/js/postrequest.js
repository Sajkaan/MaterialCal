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
            partName : $("partName").val(),
            material : $("material").val(),
            netoWeight : $("netoWeight").val() / 1000,
            height : $("height").val(),
            leng : $("leng").val(),
            thickness : $("thickness").val()
            brutoWeight : height * leng;
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
            $("partName").val(""),
            $("material").val(""),
            $("netoWeight").val(""),
            $("height").val(""),
            $("leng").val(""),
            $("thickness").val("")
    }
})