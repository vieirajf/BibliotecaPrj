$(document).ready(function() {
	$('.menuItem a').mouseover(function() {
		$(this).css("opacity", "0.25");
		$('.subMenuItem').slideDown("slow");
	});
	$('.menuItem a').mouseleave(function() {
		$(this).css("opacity", "1");
	});
	
});
