app.controller("homepageCtrl", function($scope, $rootScope, $location){
	//validation
	if(!$rootScope.user){ $location.path("/logout"); }
	
	console.log("valid homepage loading");
	
	
	//Code to add a Lane
	var j = 1;
	function addABoard(board){    
	    console.log("adding a board - " + j)
	    
	    //Give the divs attributes classes and ids
	    var containerDiv = document.createElement("DIV");
	    containerDiv.className += " " + "container-fluid span2 col-md-2 col-sm-3 col-xs-3";
	    containerDiv.id = "board" + j;
	    
	    var panelDiv = document.createElement("DIV");
	    panelDiv.className += " " + "panel panel-default";
	    
	    var deleteLaneBtn = document.createElement("BUTTON");
	    deleteLaneBtn.className += " " + "glyphicon glyphicon-remove";
	    deleteLaneBtn.setAttribute('title', "Delete Lane");
	    deleteLaneBtn.id = "lane" + j + "Btn";
	    
	    
	    var panelBodyDiv = document.createElement("DIV");     //append the drop function
	    panelBodyDiv.className += " " + "panel-body list-group";
	    panelBodyDiv.id = "swimlane" + j + "Content";
	    
	    
	    
	    //Creates Title of the Lane
	    if(lane.laneId){
	    	var laneTitle = document.createTextNode(lane.laneName); 
	    	
	    	console.log("blah blah blah");
	    	console.log(lane.laneId);
	    } else{
	    	var laneTitle = document.createTextNode("Default Title"); 
	    }

	    
	    
	    //Add divs to the page
	    containerDiv.appendChild(panelDiv);
	    panelDiv.appendChild(panelHeaderDiv);
	    panelHeaderDiv.appendChild(panelHeaderP);
	    panelHeaderP.appendChild(laneTitle);
	    
	    if(j == 1){
	    	var addStoryBtn = document.createElement("BUTTON");
	    	addStoryBtn.className += " " + "glyphicon glyphicon-book";
	    	addStoryBtn.setAttribute('title', "Add Story");
	    	addStoryBtn.id = "addStory";
	    	panelHeaderDiv.appendChild(addStoryBtn);
	    	
	    }
	    
	    panelHeaderDiv.appendChild(deleteLaneBtn);
	    
	    panelDiv.appendChild(panelBodyDiv);
	    
	    
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
	    
	    document.getElementById("lane" + j + "Btn").addEventListener("click", function(e){
	        removeLane(e);
	    });
	    
	 	document.getElementById("addStory").addEventListener("click", openAddStoryModal);
	 	
	    
	    j++;
	}
})