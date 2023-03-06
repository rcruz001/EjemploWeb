<!DOCTYPE html>
<html>
	<head>
		<title> Formulario | Registro </title>
    <link rel="stylesheet" type="text/css" href="cc/estilo.css">
	</head>
	<body style="

	 margin-left: 8px;
      font-size: 12px;
      padding: 5px;
      display:block;
      width: 100%;
      font-family: sans-serif;	
	
	background-image: linear-gradient(-90deg,#6ABBF7, #BD7CFA);


	  background-color: white;
	  margin:10px;
	  margin:0 auto;
	  border-radius:19px;
	  width: 40%;
	  
	  /* SECUENCIA: para centrar formulario */
	  position: absolute;
	  top: 50%; 
	  left: 50%;
	  transform: translate(-50%, -50%);


	
	">
	<!-- ENVIA A LA BASE DE DATOS -->
		<form action="registro.php" method="POST">
      <div id="formulario"> 
        <h1 style="
        
          font-family: sans-serif;
		  background: #14376d;
		  color: white;
		  padding: 5px;
		  text-align: center;
		  border-top-left-radius: 19px;
		  border-top-right-radius: 19px;
		  border-bottom: 5px solid #205ab4;
		  margin-bottom:5px; 
        "> FORMULARIO </h1>
      </div>
      
			<div id="tabla-formulario">
        
        <label for="cedula">Nombre(*)</label>
				<input style ="
				  margin-bottom:10px; 
			      width: 95%;
			      padding: 2%;
			      margin-left: 10px;
			      -webkit-box-sizing: border-box;
			      -moz-box-sizing: border-box;
			      box-sizing: border-box;
			      border: 1px solid #ccc;
			      font-style: italic; 
						
			
			"placeholder="Nombre del evento" name="eventonombre" type="text" id="tabla">
			</div>
		
           <label for="fecha">Fecha(*) </label>
				<input style ="
				  margin-bottom:10px; 
			      width: 95%;
			      padding: 2%;
			      margin-left: 10px;
			      -webkit-box-sizing: border-box;
			      -moz-box-sizing: border-box;
			      box-sizing: border-box;
			      border: 1px solid #ccc;
			      font-style: italic; 
						
			
			"placeholder="DD/MM/AA" name="eventofecha" type="text" id="tabla">
        <label for="nombre">Asunto(*)</label>
				<input style ="
				  margin-bottom:10px; 
			      width: 95%;
			      padding: 2%;
			      margin-left: 10px;
			      -webkit-box-sizing: border-box;
			      -moz-box-sizing: border-box;
			      box-sizing: border-box;
			      border: 1px solid #ccc;
			      font-style: italic; 
						
			
			"
				placeholder="Asunto del Evento" name="eventoasunto" type="text"     id="tabla">
        
       </div>
			<label for="nombre2">Lugar(*)</label>
				<input style ="
				  margin-bottom:10px; 
			      width: 95%;
			      padding: 2%;
			      margin-left: 10px;
			      -webkit-box-sizing: border-box;
			      -moz-box-sizing: border-box;
			      box-sizing: border-box;
			      border: 1px solid #ccc;
			      font-style: italic; 
						
			
			"placeholder="Lugar" name="eventolugar" type="text" id="tabla">
			</div>
			
	

</div>
			



     
			
			
		
			
			
			
  					  <button style="width: 94%;
        font-family: sans-serif;
        font-size:15px;
        font-weight: bolder;
        background-color: #205ab4;
        color: #fff;
        cursor: pointer;
        margin-bottom:15px;
        margin-left:10px;
        border: none;
        padding: 3%;
        border-radius: 20px 10px 20px 10px;
    SOMBRA BOTON: darle sommbre al boton "resgistrarse"
        -webkit-box-shadow: 4px 9px 8px -4px rgba(0,0,0,0.75);
        -moz-box-shadow: 4px 9px 8px -4px rgba(0,0,0,0.75);
         box-shadow: 4px 9px 8px -4px rgba(0,0,0,0.75);      
}
#button:hover{
  background-color: #7FACDE;"
  name="registro" type="submit" id="button"> ¡Registrarse! </button>
		</form>
	</body>
</html>