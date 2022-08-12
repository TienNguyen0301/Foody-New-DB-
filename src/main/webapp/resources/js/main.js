/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

//function deleteCart(foodId){
//    if(confirm("Ban chac chan muon xoa mon an nay khong?") == true) {
//        fetch(`/FoodySpringMVC/api/cart/${foodId}`, {
//           method: 'delete',
//       }).then(function(res){
//           return res.json()
//       }).then(function(data) {
//           let counter = document.getElementById("cartCounter")
//           counter.innerText = data.counter
//           let amount = document.getElementById("amountCart")
//           amount.innerText = data.amount
//           location.reload()
////           let row = document.getElementById(`food${foodId}`)
////           row.style.display = "none"
//        })  
//    }
//}

//function updateCart(obj, foodId){
//    fetch("/FoodySpringMVC/api/cart", {
//        method: 'put',
//        body: JSON.stringify ({
//            "foodId": foodId,
//            "foodName": "name",
//            "price": 0,
//            "quantity": obj.value
//        }),
//        headers: {
//            "Content-Type": "application/json"
//        }
//    }).then(function(res){
//        return res.json()
//    }).then(function(data) {
//        let counter = document.getElementById("cartCounter")
//           counter.innerText = data.counter
//           let amount = document.getElementById("amountCart")
//           amount.innerText = data.amount
//    })
//    
//}

//function addToCart(id, name, price){
//    event.preventDefault()
//    
//    fetch("/FoodySpringMVC/api/cart", {
//        method: 'post',
//        body: JSON.stringify ({
//            "foodId": id,
//            "foodName": name,
//            "price": price,
//            "quantity": 1
//        }),
//        headers: {
//            "Content-Type": "application/json"
//        }
//    }).then(function(res){
//        return res.json()
//    }).then(function(data) {
//        let counter = document.getElementById("cartCounter")
//        counter.innerText = data
//    })
//}


(function ($) {
    "use strict";

    // Spinner
    var spinner = function () {
        setTimeout(function () {
            if ($('#spinner').length > 0) {
                $('#spinner').removeClass('show');
            }
        }, 1);
    };
    spinner();
    
    
    // Initiate the wowjs
    new WOW().init();


    // Fixed Navbar
    $(window).scroll(function () {
        if ($(window).width() < 992) {
            if ($(this).scrollTop() > 45) {
                $('.fixed-top').addClass('bg-white shadow');
            } else {
                $('.fixed-top').removeClass('bg-white shadow');
            }
        } else {
            if ($(this).scrollTop() > 45) {
                $('.fixed-top').addClass('bg-white shadow').css('top', -45);
            } else {
                $('.fixed-top').removeClass('bg-white shadow').css('top', 0);
            }
        }
    });
    
    
    // Back to top button
    $(window).scroll(function () {
        if ($(this).scrollTop() > 300) {
            $('.back-to-top').fadeIn('slow');
        } else {
            $('.back-to-top').fadeOut('slow');
        }
    });
    $('.back-to-top').click(function () {
        $('html, body').animate({scrollTop: 0}, 1500, 'easeInOutExpo');
        return false;
    });


    // Testimonials carousel
    $(".testimonial-carousel").owlCarousel({
        autoplay: true,
        smartSpeed: 1000,
        margin: 25,
        loop: true,
        center: true,
        dots: false,
        nav: true,
        navText : [
            '<i class="bi bi-chevron-left"></i>',
            '<i class="bi bi-chevron-right"></i>'
        ],
        responsive: {
            0:{
                items:1
            },
            768:{
                items:2
            },
            992:{
                items:3
            }
        }
    });

    
})(jQuery);

