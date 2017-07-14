
   function newRow() {
          var table = document.getElementById("tab");
          var row = table.insertRow(1);
          for (var i = 0; i < 7; i++) {
            var cell1 = row.insertCell(i);
          }
      }