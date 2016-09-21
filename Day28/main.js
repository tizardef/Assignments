// if (nbr.value > 8) {
// 	$("#nbr").addClass("colorRed"
// 		);

// } else { $("#nbr").removeClass("colorRed");

// 	}

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

	//console.log("checking")
	//if(nbr > 8) {
	//	$("#number").addClass("colorRed");
	//} else {
	//	$("#number").removeClass("colorRed");
	//}
	//console.log("done")

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
	 	$("#number").val(nbr);
	 	}	);
});
/*

function modify_nbr(val) {
    var nbr = document.getElementById('nbr').value;
    var new_nbr = parseInt(nbr,10) + val;

    if (nbr.value > 8) {
	$("#nbr").addClass("colorRed"
		);

} else { $("#nbr").removeClass("colorRed");

	}
    
    
    document.getElementById('nbr').value = new_nbr;
    return new_nbr;
}

function reset_nbr(val) {
	document.getElementById('nbr').value = 0;
	
	if (nbr.value > 8) {
	$("#nbr").addClass("colorRed"
		);

} else { $("#nbr").removeClass("colorRed");

	}

}

*/









