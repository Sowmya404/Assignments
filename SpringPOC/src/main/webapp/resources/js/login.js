$(document).ready(function() {
	//var form=$('#submitForm');
	$('#login').click(function() {
		$.ajax({
			type : 'POST',
			url : './submitForm',
			data : $('#submitForm').serialize(),
			success : function(data) {
				$('#info').html();
			}
		});
	});
});