$(Document).ready(function () {
   // alert('hello');
});
function addRow() {
    var class_dict={0:"table-info",1:"table-success",2:"table-danger",3:"table-warning",4:"table-active",5:""};
    var bookTable=document.getElementById('bookTable');
    var rows=bookTable.rows.length;
    var new_Tr=bookTable.insertRow(rows);
    var pos = getRandom() % 6;
    new_Tr.className=class_dict[pos]+" trs";
    var cell0=new_Tr.insertCell(0);
    var cell1=new_Tr.insertCell(1);
    cell0.innerHTML="new cell1";
    cell1.innerHTML="new cell2";
}
function getRandom() {
    return Math.floor(Math.random()*10);
}