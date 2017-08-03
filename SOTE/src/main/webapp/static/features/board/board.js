window.onload = function(){
	console.log(document);
//	document.getElementById("addStory").addEventListener("click", openAddStoryModal);
//	document.getElementById("addSwimLane").addEventListener("click", addALane);
//	document.getElementById("boardTitle").addEventListener("blur", updateBoardTitle);
//	document.getElementById("boardDesc").addEventListener("blur", updateBoardDesc);
//	
	//Make the header dynamic
//	document.getElementById("lane1header").addEventListener("blur", updateLaneHead);
}

//Add click event to story titles to open modal
function openAddStoryModal(){
	// Get the modal
	var modal = document.getElementById('myModal');

	// Get the button that opens the modal
	var btn = document.getElementById("addStory");

	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("close")[0];

	modal.style.display = "block";
	document.getElementById("submitStory").addEventListener("click", addAStory);


	// When the user clicks on <span> (x), close the modal
	span.onclick = function() {
	    modal.style.display = "none";
	}

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	    if (event.target == modal) {
	        modal.style.display = "none";
	    }
	}
}

//Function to add a story
var i = 1;
function addAStory(){	
	
	var title = document.getElementById("storyTitle");

	var node = document.createElement("P");                 
	var textnode = document.createTextNode(title.value); 
	var modal = document.getElementById('myModal');

	
	node.appendChild(textnode); 
	node.className += " " + "row list-group-item ui-widget-content";
	node.id = "story" + i;
	node.draggable = "true";
	node.ondragstart = function drag(ev) {
	    ev.dataTransfer.setData("text", ev.target.id);
	
	};
	
	
	document.getElementById("swimlane1Content").appendChild(node);
	i++;
	
	
	title.value = "";
    modal.style.display = "none";
	
 //Old code to drag, couldnt get drop to work
//	$( ".list-group-item" ).draggable();
}

//Old code to drop---> didnt work

//$(".drop").droppable({ accept: ".list-group-item",
//    drop: function(event, ui) {
//        console.log("drop");
//        var dropped = ui.draggable;
//        var droppedOn = $(this);
//        $(dropped).detach().css({top: 0,left: 0}).appendTo(droppedOn);      
//    }
//});

function allowDrop(ev) {
    ev.preventDefault();
    if (ev.target.getAttribute("draggable") == "true")
        ev.dataTransfer.dropEffect = "none"; // dropping is not allowed
    else
        ev.dataTransfer.dropEffect = "all"; // drop it like it's hot
};

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    
    ev.target.appendChild(document.getElementById(data));
};

j = 2;
function addALane(){	
	console.log("adding a lane")
	
	var containerDiv = document.createElement("DIV");
	containerDiv.className += " " + "container-fluid span2 col-md-2 col-xs-3 col-sm-3";
	
	var panelDiv = document.createElement("DIV");
	panelDiv.className += " " + "panel panel-default";
	
	
	var panelHeaderDiv = document.createElement("DIV");
	panelHeaderDiv.className += " " + "panel-heading";
	panelHeaderDiv.id = "lane" + j + "heading";
	
	var panelHeaderP = document.createElement("P");
	panelHeaderP.className += " " + "panel-title";
	panelHeaderP.id = "lane" + j + "header";
	panelHeaderP.contentEditable = "true";
	
	
	
	var panelBodyDiv = document.createElement("DIV");		//append the drop function
	panelBodyDiv.className += " " + "panel-body";
	
	var panelContentDiv = document.createElement("DIV");
	panelContentDiv.id = "swimlane" + j + "Content";
	panelContentDiv.className += " " + "list-group";
	
	//Creates Title of the Lane
	var laneTitle = document.createTextNode("Default Title"); 
	
	
	containerDiv.appendChild(panelDiv);
	panelDiv.appendChild(panelHeaderDiv);
	panelHeaderDiv.appendChild(panelHeaderP);
	panelHeaderP.appendChild(laneTitle);
	
	panelDiv.appendChild(panelBodyDiv);
	panelBodyDiv.appendChild(panelContentDiv);
	

	
	
	panelBodyDiv.ondrop = function drop(ev) {
	    ev.preventDefault();
	    var data = ev.dataTransfer.getData("text");
	    
	    ev.target.appendChild(document.getElementById(data));
	};
	
	panelBodyDiv.ondragover = function allowDrop(ev) {
	    ev.preventDefault();
	    if (ev.target.getAttribute("draggable") == "true")
	        ev.dataTransfer.dropEffect = "none"; // dropping is not allowed
	    else
	        ev.dataTransfer.dropEffect = "all"; // drop it like it's hot
	};

	
	document.getElementById("bodyClass").appendChild(containerDiv);
	j++;

}






//Add code to update db with new info	TEST AND EDIT

function updateLaneHead(){
	
	//add code to submit edited title into db
	console.log("Editing Lane Header");
	
	
	//This needs editing
//	var xhr = new XMLHttpRequest();
//	
//	xhr.onreadystatechange = function(){
//		if(xhr.readyState == 4 && xhr.status == 200){
//			console.log("Edit lane header info loaded")
//		}
//	}
//	xhr.open("POST",'/lane/rename', true);
//	
//	xhr.send();
	
	
}

function updateBoardTitle(){
	
	//add code to submit edited title into db
	console.log("Editing Board Title");
}

function updateBoardDesc(){
	//add code to submit edited desc into db
	console.log("Editing Board Description!")
}



//Add code to pull story and board info to db -----EDIT/TEST

function retrieveStoryInfo(){
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		j=1;
		
		if(xhr.readyState == 4 && xhr.status ==200){
			console.log(xhr.responseText);
//			var storyDTO = JSON.parse(xhr.responseText);
//			
//			//Find way to loop through stories in db and add content to page
//			
//			if(storyDTO.id != null ){
//			document.getElementById('story' + j).innerHTML = storyDTO.name;
//			j++;
//			}
		}
	}
	xhr.open("GET", "", true);
	xhr.send();
}


//EDIT AND TEST

function retrieveBoardInfo(){
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status ==200){
			console.log(xhr.responseText);
//			var boardDTO = JSON.parse(xhr.responseText);
//			document.getElementById().innerHTML = boardDTO.name;		//Correct these 
//			document.getElementById().innerHTML = boardDTO.description;
		}
	}
	xhr.open("GET", "<!-- Add mapping-->", true);
	xhr.send();
}

