

$(document).ready(function() {

	console.log("We got here!");

	var nbr = 0;

	$("#increment").click(function() {
		nbr++;
		$("#number").val(nbr);
		console.log("number is now", nbr)

		if(nbr > 8) {
		$("#number").addClass("colorRed");
	} else {
		$("#number").removeClass("colorRed");
	}
	});

	

	$("#decrement").click(function() {
		nbr--;
		$("#number").val(nbr);

		if(nbr > 8) {
		$("#number").addClass("colorRed");
	} else {
		$("#number").removeClass("colorRed");
	}
	});

	$("#reset").click(function() {
	 	nbr=0;
	 	$("#number").removeClass("colorRed");
	 	$("#number").val(nbr);
	 	}	);
});











