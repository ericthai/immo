(function($){
  
	//alert('APP.JS');
	$(document).ready(function(){
		var owl = $("#owl-demo");
		owl.owlCarousel({
			items: 1,
			autoplay : false,
			autoHeight: false,
			loop:true,
			autoplayTimeout : 1000,	
			navigation:true,
			responsive : {
				768 : {
					items : 6
				},
				500 : {
					items : 3
				}
			}
		});


	  // Custom Navigation Events
	  $(".next").click(function(){
		//alert('dfgsdgs');
		owl.trigger('next.owl.carousel');
	  });
	  $(".prev").click(function(){
		owl.trigger('prev.owl.carousel', [300]);
	  });
 
 
 
 
		$('.bxslider').bxSlider({
		  buildPager: function(slideIndex){
			switch(slideIndex){
			  case 0:
				return '<img src="photo/large_5f167486-77b4.jpg" width="70" height="70">';
			  case 1:
				return '<img src="photo/large_IMG-0588.JPG" width="70" height="70">';
			  case 2:
				return '<img src="photo/large_image-33-.jpeg" width="70" height="70">';
			}
		  }
		  
		}); 
 
 
 
 
 
 
 
	});

  
})(jQuery);
