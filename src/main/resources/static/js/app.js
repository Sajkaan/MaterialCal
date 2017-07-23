
function onInput(){
if($("#quantity").val() != "" && $("#weightNeto").val() != "") {
    var a = $("#quantity").val() * ($("#weightNeto").val() /1000);
    document.getElementById("weightNetoTotal").innerHTML = a.toFixed(2);
    }

if( $("#height").val() != "" && $("#leng").val() != "" && $("#thickness").val() != "") {
    var b = brutoCalculation() * $("#quantity").val();
    document.getElementById("weightBrutoTotal").innerHTML = b.toFixed(2);
    }
}


function brutoCalculation(){
  return ($("#thickness").val() /1000) * ($("#height").val()/1000) *  ($("#leng").val()/1000 ) * 7850
}