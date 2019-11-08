//<script src="https://cdn.bootcss.com/FileSaver.js/2014-11-29/FileSaver.js"></script>
//<input type="button" id="export" value="保存"/>
 
//<script>
// var button = document.getElementById("export");
// button.addEventListener("click", saveHandler, false);
 function saveHandler(opencount, closecount){
            let data = {
                Open_issues_count: opencount,
                Closed_issues_count: closecount
        }
            var content = JSON.stringify(data);
            var blob = new Blob([content], {type: "text/plain;charset=utf-8"});
            saveAs(blob, "Save_issues_count(demo).json");
}
 
//</script>