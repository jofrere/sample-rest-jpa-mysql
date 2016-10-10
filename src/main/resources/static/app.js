$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/customers/",
        success: function(customers) {
        	 $.each(customers, function(entryIndex, customer){
        		$('#customersTable').append('<tr><td>' 
        					+ customer.id 
        					+ '</td><td>' 
        					+ customer.firstName 
        					+ '</td><td>' 
        					+ customer.lastName 
        					+ '</td></tr>');
        	 }); 
        }
    });
});
