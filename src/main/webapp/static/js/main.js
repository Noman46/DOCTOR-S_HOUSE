
const navbtn = document.querySelector('.navbar__btn');
const navlink = document.querySelector('.navbar_link');

navbtn.addEventListener('click', function () {
    let value = navlink.classList.contains('navbar__collapse');


    if (value) {
        navlink.classList.remove('navbar__collapse');
        navbtn.classList.remove('change');
    } else {
        navlink.classList.add('navbar__collapse');
        navbtn.classList.add('change');
    }
});