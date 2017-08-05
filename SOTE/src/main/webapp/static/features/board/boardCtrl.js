/**
 * @author Sarah Kummerfeldt
 * 
 */

app.controller('boardCtrl', function($http,$scope) {

	retrieveBoard(); 		//Retrieves json containing board information
	
	
	 document.getElementById("addSwimLane").addEventListener("click", addALane);
	 document.getElementById("boardTitle").addEventListener("blur", updateBoardTitle);
	 document.getElementById("boardDesc").addEventListener("blur", updateBoardDesc);
//	 document.getElementById("openBurnDown").addEventListener("click", openBurndownChart/*?*/);
	 document.getElementById("updateBoard").addEventListener("click",updateBoard);

	// Add click event to story titles to open modal to add stories
	function openAddStoryModal() {
		// Get the modal
		var modal = document.getElementById('myModal');

		// Get the button that opens the modal
		var btn = document.getElementById("addStory");

		// Get the <span> element that closes the modal
		var span = document.getElementsByClassName("close")[0];

		modal.style.display = "block";
		document.getElementById("submitStory").addEventListener("click",
				addAStory);

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

	// Function to add a story
	var i = 1;
	function addAStory() {

		var title = document.getElementById("storyTitle");

		var node = document.createElement("P");
		var textnode = document.createTextNode(title.value);
		var modal = document.getElementById('myModal');
		var deleteStryBtn = document.createElement("BUTTON");		
		
		
		deleteStryBtn.className += " " + "glyphicon glyphicon-remove";
		deleteStryBtn.setAttribute('title', "Delete Story");
		deleteStryBtn.id = "story" + i + "Btn";

		node.appendChild(textnode);
		node.className += " " + "row list-group-item ui-widget-content";
		node.id = "story" + i;
		node.draggable = "true";
		
		node.appendChild(deleteStryBtn);
		
		node.ondragstart = function drag(ev) {
			ev.dataTransfer.setData("text", ev.target.id);
		};
		document.getElementById("swimlane1Content").appendChild(node);
		
		//Add the function to open the view story modal here
		document.getElementById("story" + i).addEventListener("click", console.log("add story event listener"));

		
	    document.getElementById("story" + i + "Btn").addEventListener("click", function(e){
	        removeStory(e);
	    });
	    

		
		i++;

		title.value = "";
		modal.style.display = "none";
		
	}



	
	//Code to add a Lane
	var j = 1;
	function addALane(){    
	    console.log("adding a lane - " + j)
	    
	    //Give the divs attributes classes and ids
	    var containerDiv = document.createElement("DIV");
	    containerDiv.className += " " + "container-fluid span2 col-md-2 col-sm-3 col-xs-3";
	    containerDiv.id = "lane" + j;
	    
	    var panelDiv = document.createElement("DIV");
	    panelDiv.className += " " + "panel panel-default";
	    
	    
	    var panelHeaderDiv = document.createElement("DIV");
	    panelHeaderDiv.className += " " + "panel-heading";
	    panelHeaderDiv.id = "lane" + j + "heading";
	    
	    var panelHeaderP = document.createElement("P");
	    panelHeaderP.className += " " + "panel-title";
	    panelHeaderP.id = "lane" + j + "header";
	    panelHeaderP.contentEditable = "true";
	    panelHeaderP.addEventListener("blur", updateLaneHead);
	    
	    var deleteLaneBtn = document.createElement("BUTTON");
	    deleteLaneBtn.className += " " + "glyphicon glyphicon-remove";
	    deleteLaneBtn.setAttribute('title', "Delete Lane");
	    deleteLaneBtn.id = "lane" + j + "Btn";
	    
	    
	    var panelBodyDiv = document.createElement("DIV");     //append the drop function
	    panelBodyDiv.className += " " + "panel-body list-group";
	    panelBodyDiv.id = "swimlane" + j + "Content";
	    
	    //Creates Title of the Lane
	    var laneTitle = document.createTextNode("Default Title"); 
	    
	    
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
	
	
	
	//Removes a lane from a board			===   CHANGE TO DELETE
	function removeLane(e){	    
	    var target = e.target.parentNode.parentNode.parentNode;
	    
	    console.log(target.attributes.id);
	    
	    target.parentNode.removeChild(target);
	    
	    
	    j--;
	    
	}

	
	//Removes a story from the lane			===   CHANGE TO DELETE
	
	function removeStory(e){
		var target = e.target.parentNode;
		
		console.log(target.attributes.id);
		
		target.parentNode.removeChild(target);
		
		
		i--;
	}
	
	
	
//Edits a lanes header 
	function updateLaneHead() {

		// add code to submit edited title into db
		console.log("Editing Lane Header");

	}

	
	//Find endpoints for this
	//Edits a board title
	function updateBoardTitle() {

		console.log("Editing Board Title");
		
	}

	
	//updates a board description
	function updateBoardDesc() {
		console.log("Editing Board Description!");
		
		
	}

	
	
	//Below code can be used to populate page

	function retrieveBoard() {

	    $http.get("http://localhost:8085/SOTE/rest/board/1")	//Select board by id, not just hardcoded
		  .then(function(response){ 
			  console.log(response.data);
			  
			  $scope.name = response.data.name;
			  $scope.desc = response.data.description;
			  console.log($scope.name);
			  
//			  $scope.lanes = response.data.lanes;
//			  $scope.stories = response.data.story;
			 
			  
			  //This can iterate through content.  Not sure if best approach
//			  angular.forEach(response.data, function(index){
//				  //Gets data one by one
//                  console.log(index);
//                  
//              });
			  
			  
			  });
	    
	}

	// EDIT AND TEST

	function updateBoard() {
		console.log("updating board");
		
	    $http.put("http://localhost:8085/SOTE/rest/board/1")
		  .then(function(response){ 
			  console.log(response.data);
			  });
	}

});