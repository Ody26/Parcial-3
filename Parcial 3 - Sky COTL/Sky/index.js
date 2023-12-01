let baseUrl = "http://localhost:8080";
let temp = [];
let com = [];
let guia = [];
let ava = [];
let recur = [];
let razon = [];
let ed = [];
let nav = [];
let ban = [];

function CargarPagina() {
    ObtenerNav();
    ObtenerBanner();
    ObtenerTemporadas();
    ObtenerComunidad();
    ObtenerGuia();
    ObtenerAvatar();
    ObtenerRecursos();
    ObtenerRazones();
    ObtenerEden();
}

function ObtenerTemporadas() {
    fetch(baseUrl + '/temporadas')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            temp = json;
            ImprimirTemporadas();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirTemporadas() {
    let contenedor = document.getElementById("temp");
    contenedor.innerHTML = "";
    temp.forEach(t => {
        contenedor.innerHTML += MapearTemporadas(t);
    });
}
function MapearTemporadas(t) {
    return `<div class="articulos-t">
        <img src="${t.img_t}"/>
        <div class="descripcion">
            <p>
                ${t.titulo}
            </p>
            <br>
            <a href="#">Ver más</a>
        </div>
    </div>`;
}

function ObtenerComunidad() {
    fetch(baseUrl + '/comunidad')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            com = json;
            ImprimirComunidad();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirComunidad() {
    let contenedor2 = document.getElementById("comunidad");
    contenedor2.innerHTML = "";
    com.forEach(c => {
        contenedor2.innerHTML += MapearComunidad(c);
    });
}
function MapearComunidad(c) {
    return `<img id="fondo-secomun" src="${c.img_fondoComun}"/>
        <div class="descrip-comunidad">
            <h3>"${c.title_Comun}"</h3>
            <p>"${c.descripC}</p>
            <button>Leer más</button>
        </div>
        <div class="img-comun">
            <img id="img-unete" src="${c.img_secComun}"/>
        </div>`;
}

function ObtenerGuia() {
    fetch(baseUrl + '/guia')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            guia = json;
            ImprimirGuia();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirGuia() {
    let contenedor3 = document.getElementById("sguia");
    contenedor3.innerHTML = "";
    guia.forEach(g => {
        contenedor3.innerHTML += MapearGuia(g);
    });
}
function MapearGuia(g) {
    return `<img id="fondo-secguia" src="${g.img_fondo}"/>
        <div class="descrip-guia">
            <h3>${g.title_guia}</h3>
            <p>${g.descrip_guia}</p>
            <button>Ver introducción</button>
        </div>
        <img id="img-guia" src="${g.img_guia}"/>`;
}
function ObtenerAvatar() {
    fetch(baseUrl + '/avatar')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            ava = json;
            ImprimirAvatar();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirAvatar() {
    let contenedor4 = document.getElementById("avatar");
    contenedor4.innerHTML = "";
    ava.forEach(a => {
        contenedor4.innerHTML += MapearAvatar(a);
    });
}
function MapearAvatar(a) {
    return `<div class="Avatar">
                <p>${a.descrip_av}</p>
                <img src="${a.img_av}"/>
                <h4>${a.nombre_av}</h4>
            </div>`;
}
function ObtenerRecursos() {
    fetch(baseUrl + '/recursos')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            recur = json;
            ImprimirRecursos();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirRecursos() {
    let contenedor5 = document.getElementById("recursos");
    contenedor5.innerHTML = "";
    recur.forEach(rr => {
        contenedor5.innerHTML += MapearRecursos(rr);
    });
}
function MapearRecursos(rr) {
    return `<img id="nube-razones" src="${rr.img_nube}"/>
            <img id="Sky-img" src="${rr.img_r1}"/>
            <img id="Sky-img0" src="${rr.img_r2}"/>
            <div id="circulo-naranja"></div>`;
}

function ObtenerRazones() {
    fetch(baseUrl + '/razones')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            razon = json;
            ImprimirRazones();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirRazones() {
    let contenedor6 = document.getElementById("lista_r");
    contenedor6.innerHTML = "";
    razon.forEach(r => {
        contenedor6.innerHTML += MapearRazones(r);
    });
}
function MapearRazones(r) {
    return `<li>${r.razon}</li>`;
}


function ObtenerEden() {
    fetch(baseUrl + '/eden')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            ed = json;
            ImprimirEden();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirEden() {
    let contenedor7 = document.getElementById("oe");
    contenedor7.innerHTML = "";
    ed.forEach(e => {
        contenedor7.innerHTML += MapearEden(e);
    });
}
function MapearEden(e) {
    return `<div class="texto-eden">
                <h3>${e.title_eden}</h3>
                <p>${e.descrip_eden}</p>
                <button>Más información</button>
            </div>
            <div class="div-img-eden">
                <img class="imagen-eden" src="${e.img_eden}" alt="Ojo de Edén"/>
            </div>`;
}

function ObtenerNav() {
    fetch(baseUrl + '/nav')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            nav = json;
            ImprimirNav();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirNav() {
    let contenedor8 = document.getElementById("n");
    contenedor8.innerHTML = "";
    nav.forEach(n => {
        contenedor8.innerHTML += MapearNav(n);
    });
}
function MapearNav(n) {
    return `<div class="clouds">
                <img src="${n.nube}">
            </div>
        <div class="logo-Sky">
            <img src="${n.logo}">
        </div>
        <div class="menu">
            <a href="#"><img src="${n.icono_munu}" />
        </div>`;
}
function ObtenerBanner() {
    fetch(baseUrl + '/banner')
        .then(res => {
            return res.json();
        })
        .then(json => {
            console.log('Datos recibidos del servidor:', json);
            ban = json;
            ImprimirBanner();
        })
        .catch(error => console.error('Error al obtener las temporadas:', error));
}
function ImprimirBanner() {
    let contenedor9 = document.getElementById("Banner");
    contenedor9.innerHTML = "";
    ban.forEach(b => {
        contenedor9.innerHTML += MapearBanner(b);
    });
}
function MapearBanner(b) {
    return `<div class="fondo-banner">
                <img src="${b.fondo}" alt="fondo" />
            </div>
            <div class="logo-banner">
                <img src="${b.logo}" alt="logo" />
            </div>
            <div class="titulo">
                <h1>${b.title}</h1>
            </div>
            <button>Jugar ahora</button>
            <div class="n-blanca-banner"> <!-- div que contiene una imagen de nube para darle un diseño de cielo -->
                <img id="nube-blanca" src="${b.nube}" alt="">
            </div>`;
}
function GuardarUsuarios() {
    let data = {
    nombre: document.getElementById("nombre").value,
    email: document.getElementById("correo").value,
    mensaje: document.getElementById("mensaje").value
    };

    fetch(baseUrl + "/usuarios", {
        method: "POST",
        body: JSON.stringify(data),
        headers: {
            "Content-type": 'application/json; charset=UTF-8'
        }
    });
}

document.body.onload = CargarPagina;
