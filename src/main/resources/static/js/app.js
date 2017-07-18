/*
var partArray = []; // list which needs to be send to the controller

function part(partName,material,netoWeight,height, leng, thickness, brutoWeight){
	this.partName = partName;
	this.material = material;
	this.netoWeight = netoWeight/1000;
	this.height = height;
	this.leng = leng;
	this.thickness = thickness;
	this.weightBruto = weightBruto;
}

function onInput() {
	var partName = document.getElementById("partName").value;
	var material = document.getElementById("material").value;
	var weightNeto = document.getElementById("weightNeto").value;
	var height = document.getElementById("height").value;
	var leng = document.getElementById("leng").value;
	var thickness = document.getElementById("thickness").value;
}

function fillTable(newPart) {
	var table = document.getElementById("tab");
	var row = table.insertRow(1);

    for (var i = 0; i < 7; i++) {
    	var cell1 = row.insertCell(i);
	    switch(i) {
            case 0:
           		cell1.innerHTML = newPart.partName;
           		break;
           	case 1:
           		cell1.innerHTML = newPart.material;
           		break;
           	case 2:
           		cell1.innerHTML = newPart.weightNeto;
           		break;
           	case 3:
           		cell1.innerHTML = newPart.height;
           		break;
           	case 4:
         		cell1.innerHTML = newPart.leng;
           		break;
           	case 5:
           		cell1.innerHTML = newPart.thickness;
           		break;
           	case 6:
           		cell1.innerHTML = newPart.weightBruto;
           		break;
           	default:
           		cell1.innerHTML = "Error";
           		break;
    }
  }
}

function clearInput() {
	document.getElementById("partName").value = "";
	document.getElementById("material").value = "";
	document.getElementById("weightNeto").value = "";
	document.getElementById("height").value = "";
	document.getElementById("leng").value = "";
	document.getElementById("thickness").value = "";
	document.getElementById("weightBruto").value = "";
}

function validateForm(newPart) {
	if (newPart.partName == "" || newPart.material == "" || newPart.weightNeto == "") {
		clearInput();
	} else {
		fillTable(newPart);
    	partArray.push(newPart);
    	clearInput();
	}
}

function newRow() {

	var weightBruto = leng.value * height.value;
    var newPart = new part(partName.value, material.value, weightNeto.value, height.value, leng.value, thickness.value, weightBruto);

    validateForm(newPart);
}
*/
