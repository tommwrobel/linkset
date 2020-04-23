 $(document).ready(function() {
	var max_fields      = 10; //maximum input boxes allowed
	var wrapper   		= $(".input_fields_wrap"); //Fields wrapper
	var add_button      = $(".add_field_button"); //Add button ID
	var elementToAppend = $(".input_fields_wrap > div:first-child");

	var x = 1; //initlal text box count
	$(wrapper).on("click",".add_field_button", function(e){ //on add input button click
		e.preventDefault();
		if(x < max_fields){ //max input box allowed
			x++; //text box increment

            $(wrapper).append($(elementToAppend).wrap("<p>").parent().html()); //add input box
            $(elementToAppend).unwrap();

            $(".input_fields_wrap > .form-row .button-column a").remove();
            $(".input_fields_wrap > .form-row:not(:last-child) .button-column").append('<a class="remove_field_button btn btn-danger text-white"><i class="fa fa-minus-circle"></i></a>');
            $(".input_fields_wrap > .form-row:last-child .button-column").append('<a class="add_field_button btn btn-success text-white"><i class="fa fa-plus-circle"></i></a>');
        }
	});

	$(wrapper).on("click",".remove_field_button", function(e){ //user click on remove text
		e.preventDefault(); $(this).parent('div').parent('div').remove(); x--;
	})
});