/**
 * 
 */



function makeRelatedTag(component){
	if(component.tag != null)
		var tag;
		switch(component.tag){
		case "div" :
			var tag = document.createElement("div");
			break;
		case "p" :
			tag = document.createElement("p");
			break;
		case "form" :
			tag = document.createElement("form");
			break;
		case "ul" :
			tag = document.createElement("ul");
			break;
		case "li" :
			tag = document.createElement("li");
			break;
		case "a" :
			tag = document.createElement("a");
		}
		return tag;
}

function appendChildComponent(parent, child){
	var tag = makeRelatedTag(child);
	if (child.id !== null) {
		$(tag).attr("id", child.id);
	}
	if (child.content !== null) {
		$(tag).html(child.content);
	}
	if (child.cls !== null) {
		$(tag).attr("class", child.cls);
	}
	if (child.height !== null) {
		$(tag).attr("height", child.height);
	}
	if (child.width !== null) {
		$(tag).attr("width", child.width);
	}
	$(parent).append(tag);
	if (child.child != null)
		appendChildComponent(tag, child.child);
}

$.getJSON(jsonFile, function(data) {
	$("#toolbar").html(data.toolbar.content);
	$("#toolbar").attr("class", data.toolbar.cls);
	$("#toolbar").attr("height", data.toolbar.height);
	$("#toolbar").attr("width", data.toolbar.width);
	var parent = $("#toolbar");
	var child = data.toolbar.child;
	if (child != null)
		appendChildComponent(parent, child);
	$("#board").html(data.board.content);
	$("#board").attr("class", data.board.cls);
	$("#board").attr("height", data.board.height);
	$("#board").attr("width", data.board.width);
	var parent = $("#board");
	var child = data.board.child;
	if (child != null)
		appendChildComponent(parent, child);
	$("#menu").html(data.menu.content);
	$("#menu").attr("class", data.menu.cls);
	$("#menu").attr("height", data.menu.height);
	$("#menu").attr("width", data.menu.width);
	var parent = $("#menu");
	var child = data.menu.child;
	if (child != null)
		appendChildComponent(parent, child);
});
