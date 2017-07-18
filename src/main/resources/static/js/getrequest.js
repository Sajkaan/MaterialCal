$( document ).ready(function() {

	var url = window.location;

	// GET REQUEST
	$("#getBtn").click(function(event){
		event.preventDefault();
		ajaxGet();
	});

	// DO GET
	function ajaxGet(){
		$.ajax({
			type : "GET",
			url : url + "/getAllParts",
			success: function(result){
				if(result.status == "Done"){
					console.log("Success: ", result);
				}else{
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				console.log("ERROR: ", e);
			}
		});
	}
})