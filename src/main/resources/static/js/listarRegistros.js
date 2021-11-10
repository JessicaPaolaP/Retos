
function displayMessage() {
    console.log('mensaje desde el boton');
    alert('Mensaje se pulso el boton ');
    document.getElementById("txtNombre").value = 12345687;
    var varNombre = document.getElementById("txtNombre").value;
}

function getAll() {
    $.ajax({
        url: 'https://g2c7d8c8e491995-db202109201320.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/client/client',
        //data : miJson,//{ id : 123 },
        type: 'GET',
        dataType: 'json',
        success: function (resultado) {
            console.log(resultado.items);
            cargarTabla(resultado);
        },
        error: function (xhr, status) {
            alert('ha sucedido un problema');
        }

    });

    function cargarTabla(registros) {
        var tabla = `<table border="1">
                  <tr>
                    <th>Nombre</th>
                   <th>Apellido</th>
                   <th>Accion</th>
                  </tr>`;

        for (var i = 0; registros.length; i++) {
            tabla += `<tr>
                        <th>${registros[i].nombre}</th>
                        <th>${registros[i].apellido}</th>
                       <th> <input type="button" value="Delete" name="tbnBorrar" onclick="borrarRegistro(${registros[i].id})"; > </th>
                    </tr>`;
        }
        tabla+=`</table>`;
        
        $("#tbl").html(tabla);
    }

    /*  let datos={
     nombre:$("#txtNombre").val(),
     apellidos:$("#txtApellido").val(),
     } 
     
     let miJson = JSON.stringify(datos)
     */
    
    $("#id").val("");

}

