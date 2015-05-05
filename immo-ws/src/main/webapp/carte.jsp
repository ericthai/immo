
<!DOCTYPE html>
<html>
<head>
	<title>Localisation de votre adresse</title>
	<meta charset="utf-8" />

	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="stylesheet" href="http://cdn.leafletjs.com/leaflet-0.7.3/leaflet.css" />
	<!-- 
	<link rel="stylesheet" href="../dist/leaflet.css" />
	-->
</head>
<body>
	<h1>CARTE</h1>
	<div id="map" style="width: 600px; height: 400px"></div>

	<script src="http://cdn.leafletjs.com/leaflet-0.7.3/leaflet.js"></script>
	<!-- 
	<script src="../dist/leaflet.js"></script>
	-->
	

	<script>
		//var map = L.map('map').setView([51.505, -0.09], 13);
		<%
		String lattitudeStr = (String) request.getSession().getAttribute("lattitude");
		String longitudeStr = (String) request.getSession().getAttribute("longitude");		
		%>
		
		var map = L.map('map').setView([<%= lattitudeStr %>,<%= longitudeStr %>], 15);

		
		L.tileLayer('https://{s}.tiles.mapbox.com/v3/{id}/{z}/{x}/{y}.png', {
			maxZoom: 18,
			attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, ' +
				'<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, ' +
				'Imagery © <a href="http://mapbox.com">Mapbox</a>',
			id: 'examples.map-i86knfo3'
		}).addTo(map);
		

		
		L.marker([<%= lattitudeStr %>, <%= longitudeStr %>]).addTo(map)
			.bindPopup("<b>votre Adresse</b><br />Ici.").openPopup();

		/*
		L.circle([51.508, -0.11], 500, {
			color: 'red',
			fillColor: '#f03',
			fillOpacity: 0.5
		}).addTo(map).bindPopup("I am a circle.");
		*/

	/*
		L.polygon([
			[51.509, -0.08],
			[51.503, -0.06],
			[51.51, -0.047]
		]).addTo(map).bindPopup("I am a polygon.");
*/

		var popup = L.popup();

		function onMapClick(e) {
			popup
				.setLatLng(e.latlng)
				.setContent("You clicked the map at " + e.latlng.toString())
				.openOn(map);
		}

		map.on('click', onMapClick);
	</script>
	
</body>
</html>
