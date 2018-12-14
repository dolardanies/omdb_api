function obtenerMovie(title, year) {
    axios.get('/movie/' + title + '/' + year).then(function (response) {
        document.getElementById("Tabla").innerHTML = "";
        document.getElementById("Data").innerHTML = "";
        
        var data = response.data;
        var info = JSON.stringify(data);
       
        var dataMark = document.getElementById("Data");
        dataMark.setAttribute("class", "d-flex justify-content-center row alert alert-info")
        dataMark.innerHTML = info;
 
        //Crear tabla <table> https://getbootstrap.com/docs/4.0/content/tables/
        var table = document.createElement("TABLE");
        table.setAttribute("class", "table");

        //Crear encabezado
        var thead = document.createElement("THEAD");
        thead.setAttribute("class", "thead-light");

        //Crear fila
        var tr = document.createElement("TR");

        //Crear columnas encabezados
        var encabezados = ["Titulo", "Duracion","Género", "Language"];
        for (e in encabezados) {
            var th = document.createElement("TH");
            th.setAttribute("scope", "col");
            th.innerHTML = encabezados[e];
            tr.appendChild(th);
        }

        thead.appendChild(tr);
        table.appendChild(thead);
        var tbody = document.createElement("TBODY");
        table.appendChild(tbody);
        document.getElementById("Tabla").appendChild(table);

    }).catch(function (error) {
        console.log(error);
        alert("Movie and year no existen!");
    });
}