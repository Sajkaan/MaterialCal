var partArray = [];

function part(partName,material,netoWeight,height, leng, thickness, brutoWeight){
	this.partName = partName;
	this.material = material;
	this.netoWeight = netoWeight/1000;
	this.height = height;
	this.leng = leng;
	this.thickness = thickness;
	this.brutoWeight = brutoWeight;
}

function onInput() {
	var partName = document.getElementById("partName").value;
	var material = document.getElementById("material").value;
	var netoWeight = document.getElementById("netoWeight").value;
	var height = document.getElementById("height").value;
	var leng = document.getElementById("leng").value;
	var thickness = document.getElementById("thickness").value;
}

function clearInput() {
	document.getElementById("partName").value = '';
	document.getElementById("partName").value = '';
	document.getElementById("material").value = '';
	document.getElementById("netoWeight").value = '';
	document.getElementById("height").value = '';
	document.getElementById("leng").value = '';
	document.getElementById("thickness").value = '';
	document.getElementById("brutoWeight").value = '';
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
           		cell1.innerHTML = newPart.netoWeight;
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
           		cell1.innerHTML = newPart.brutoWeight;
           		break;
           	default:
           		cell1.innerHTML = "Error";
           		break;
    }
  }
}

function newRow() {
	var brutoWeight = leng.value * height.value;
    var newPart = new part(partName.value, material.value, netoWeight.value, height.value, leng.value, thickness.value, brutoWeight);

    fillTable(newPart);

    partArray.push(newPart);
    clearInput();
}


