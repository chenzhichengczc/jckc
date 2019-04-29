$(function () {
    "use strict"
     //animation scroll js

 $('nav a').on('click', function () {
  if (location.pathname.replace(/^\//, '') === this.pathname.replace(/^\//, '') && location.hostname === this.hostname) {
      var target = $(this.hash);
      target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
      if (target.length) {
          $('html, body').animate({
              scrollTop: target.offset().top - 50
          }, 1000);
          return false;
      }
  }
});


    // banner slider part js
    $('.full_slider').slick({
        infinite: true,
        slidesToShow: 1,
        slidesToScroll: 1,
        arrows: true,
        prevArrow: '<i class="fa fa-angle-left left_arrow"></i>',
        nextArrow: '<i class="fa fa-angle-right  right_arrow"></i>',
        dots: false,
        autoplay: false,
        autoplaySpeed: 3000,
        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1,
                    infinite: true,
                    dots: true
                }
    },
            {
                breakpoint: 600,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    },
            {
                breakpoint: 480,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    }

  ]

    });
    
    
   

    //About part slider
   

    $('.slider_about').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        autoplaySpeed: 2000,
        speed: 1000,
        slidesToShow: 1,
        slidesToScroll: 1,

        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1,
                    infinite: true,
                    dots: true
                }
    },
            {
                breakpoint: 600,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    },
            {
                breakpoint: 480,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    }

  ]

    });


    // counter js

    $('.counter').counterUp({
        delay: 10,
        time: 2000
    });


    ////our course slider js

    $('.course-slider').slick({
        infinite: true,
        prevArrow: '<i class="fa fa-angle-left course-left_arrow"></i>',
        nextArrow: '<i class="fa fa-angle-right course-right_arrow"></i>',
        slidesToShow: 3,
        centerMode: false,
        centerPadding: false,
        slidesToScroll: 1,
        autoplay: false,
        autoplaySpeed: 2000,
        speed: 1000,

        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 2,
                    slidesToScroll: 1,
                    infinite: true,
                    dots: true
                }
    },
            {
                breakpoint: 800,
                settings: {
                    slidesToShow: 2,
                    slidesToScroll: 1,
                
                }
    },
            {
                breakpoint: 600,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    },
            {
                breakpoint: 480,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    }

  ]

    });


    /// event slider js

    $('.test_full_slider').slick({
        arrows: true,
        dots: false,
        autoplay: false,
        autoplaySpeed: 2000,
        prevArrow: '<i class="fa fa-angle-left test-left_arrow"></i>',
        nextArrow: '<i class="fa fa-angle-right test-right_arrow"></i>',
        speed: 1000,
        slidesToShow: 1,
        slidesToScroll: 1,
        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1,
                    infinite: true,
                    dots: true
                }
    },
            {
                breakpoint: 600,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    },
            {
                breakpoint: 480,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    }

  ]

    });

    // teacher part slider js
    $('.teacher-slide').slick({
        arrows: false,
        dots: false,
        autoplay: false,
        autoplaySpeed: 2000,
        prevArrow: '<i class="fa fa-angle-left test-left_arrow"></i>',
        nextArrow: '<i class="fa fa-angle-right test-right_arrow"></i>',
        speed: 1000,
        slidesToShow: 4,
        slidesToScroll: 1,
        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 3,
                    slidesToScroll: 1,
                    infinite: true,
                    dots: true
                }
    },
            {
                breakpoint: 800,
                settings: {
                    slidesToShow: 2,
                    slidesToScroll: 1
                }
    },  
              
            
            {
                breakpoint: 600,
                settings: {
                    slidesToShow:2,
                    slidesToScroll: 1
                }
    },
            
            {
                breakpoint: 481,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    }

  ]

    });



    // footer slider

    $('.footer_slider').slick({
        arrows: false,
        dots: false,
        autoplay: false,
        autoplaySpeed: 2000,
        speed: 1000,
        slidesToShow: 6,
        slidesToScroll: 1,
        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 3,
                    slidesToScroll: 1,
                    infinite: true,
                    dots: true
                }
    },
            {
                breakpoint: 800,
                settings: {
                    slidesToShow: 2,
                    slidesToScroll: 1
                }
    },
            
            {
                breakpoint: 600,
                settings: {
                    slidesToShow: 2,
                    slidesToScroll: 1
                }
    },
            {
                breakpoint: 480,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    },
            
             {
                breakpoint: 320,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
    },

  ]

    });
    
    /// back to top
    var bTtop=$(".back_to_top");
    $(window).on('scroll', function(){
         var baktop = $(window).scrollTop();
        
        if(baktop >200){
            bTtop.fadeIn(1000);
            
        }
        else{
           bTtop.fadeOut(500); 
        }
        
    });
    
    bTtop.on('click', function(){
        $('html, body').animate({
            scrollTop:0,
        }, 2000)
        
    });
    
    // stciky menu
	var nav=$(".navbar");
    $(window).scroll(function(){
        
        var fixmenu = $(this).scrollTop();
        
        if(fixmenu > 185){
            nav.addClass("menu_fix");
        }
        else{
            nav.removeClass("menu_fix");
        }  
        
    });
    
    
    //calender js
     

	var current_yyyymm_ = moment().format("YYYYMM");

	$("#pb-calendar").pb_calendar({
		schedule_list : function(callback_, yyyymm_){
			var temp_schedule_list_ = {};

			temp_schedule_list_[current_yyyymm_+"05"] = [
				{'ID' : 1, style : "red"}
			];

			temp_schedule_list_[current_yyyymm_+"15"] = [
				{'ID' : 2, style : "red"},
			];

			temp_schedule_list_[current_yyyymm_+"20"] = [
				{'ID' : 5, style : "green"},
			];
			temp_schedule_list_[current_yyyymm_+"22"] = [
				{'ID' : 5, style : "green"},
			];
			callback_(temp_schedule_list_);
		},
		schedule_dot_item_render : function(dot_item_el_, schedule_data_){
			dot_item_el_.addClass(schedule_data_['style'], true);
			return dot_item_el_;
		}
	});


    
    /// =============about part page js start here ==========
    
    // venobox video js
    
    $('.venobox').venobox({
        framewidth: '650px',        
        frameheight: '400px',
        paddingTop:'500px'
    }); 
    

 
    

});
