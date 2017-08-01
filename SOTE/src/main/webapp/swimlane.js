/**
 * 	swimlane.js
 */


window.onload = function(){
	document.getElementById("addStory").addEventListener("click", addAStory);
}




var i = 1;
function addAStory(){

	
	var node = document.createElement("LI");                 // Create a <li> node
	var textnode = document.createTextNode("New Content");         // Create a text node
	node.appendChild(textnode);                              // Append the text to <li>
	node.className += " " + "list-group-item draggable ui-widget-content";
	node.id = i;
	document.getElementById("swimlane1Content").appendChild(node);
	i++;
	
	$( function() {
	    $( ".draggable" ).draggable();
	  } );
}

