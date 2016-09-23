var token;
var url = "https://slack.com/api/";
var options;
var data;
var channel_input;

$(document).ready(function(){

token = getSlackToken(); 
console.log(token)

var  ajaxCall = function(apiMethod, options) {
	return $.ajax(url + apiMethod, options);
} 
	options = {method : "get"}
	ajaxCall("channels.list?token=" + token, options).done(function(result) {
		// result.channels.sort();
		console.log(result);

		for (var i=0; i < result.channels.length; i++) {
      var channelName = result.channels[i].name
     // console.log (channelName);

      var item = $("<div class = \"row\"><div class = \"col-sm-1\"><input type=\"radio\" name=\"Channel\" value= \"" + channelName + "\"/></div>");
      item.append("<div class = \"col-sm-11\">" + channelName + "</div></div>");
     // console.log(item);

      $("#ChannelList").append(item);

      $("input:radio").click(function(){

      	channel_input = $(this).val()
      	console.log("this happend", channel_input);
      })
  }
  })



ajaxCall("groups.list?token=" + token, options).done(function(result) {
		// result.channels.sort();
		console.log(result);

		for (var i=0; i < result.groups.length; i++) {
      var channelName = result.groups[i].name
     // console.log (channelName);

      var item = $("<div class = \"row\"><div class = \"col-sm-1\"><input type=\"radio\" name=\"Channel\" value= \"" + channelName + "\"/></div>");
      item.append("<div class = \"col-sm-11\">" + channelName + "</div></div>");
     // console.log(item);

      $("#ChannelList").append(item);

      $("input:radio").click(function(){

      	channel_input = $(this).val()
      	console.log("this happend", channel_input);
      })
  }
  })







$("#sendButton").click(function(){
	var message = $("#message").val();
	var channel = channel_input;
    data = {
			"token" : token,
			"channel" : channel_input,
			"text" : message,
			"username" : "tizardef" 
		}
	    options = {data : data, method  : "POST"};
		ajaxCall("chat.postMessage", options)

});



// $.ajax("https://slack.com/api/chat.postMessage", {
 
// data : data,
// token : token, 
// username: "Evan T",
//   method: "POST"
// }).then(function(result) {
//   console.log(result);

// 		});
});







// function setChannelName(channelName) {
//   var url = "https://ssa-boot-camping.slack.com/";
//   url += "?access_token=" + token;

//   var requestData = {
//     name: channelName,
    
//   }

// //   $.ajax(url, {
// //     data: JSON.stringify(requestData),
// //     method: "PATCH"
// //   })
// // }

// });

