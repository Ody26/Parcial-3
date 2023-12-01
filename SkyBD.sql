
create database BDSky

Use BDSky


create table sec_temporadas(
	id_temp int identity,
	img varchar(max),
	titulo varchar(40)
)
insert into sec_temporadas
values
	  ('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/Temporada_de_conmemoracion_29.jpg?raw=true', 'Temporada de Conmemoración'),
	  ('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/SoPassage-Promo-image-wide.jpg?raw=true', 'Temporada de Ritual de Iniciación'),
	  ('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/SoMoments-Promo-image-wide.jpg?raw=true', 'Temporada de los Momentos'),
	  ('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/ProjectAviary-PV.jpg?raw=true', 'Temporada Social Proyecto Aviary')


create table sec_comunidad (
	id_comun int identity,
	img_fondo_Comun varchar(max),
	img_comunidad varchar(max),
	title_comun varchar(100),
	descrip_comun varchar(max)
)

insert into sec_comunidad
values('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/comunidad.jpeg?raw=true', 
	'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/sky.png?raw=true',
	'Únete a la encantadora comunidad de Sky',
	'Tomarse de la mano y emprender el vuelo en una aventura social inolvidable junto con sus seres queridos. Explora los siete reinos de este mundo bellamente animado con otros jugadores donde la compasión, la comunidad y el asombro te saludan en cada paso. Crea recuerdos enriquecedores mientras resuelves misterios, haces amigos y ayudas a otros en el camino.Sky es una experiencia de juego ganadora de múltiples premios creada por el estudio que creó Journey and Flower. ¡Descárgalo hoy!')


create table sec_guia(
	id_guia int identity,
	img_fondo varchar(max),
	img_guia varchar(max),
	title_guia varchar(30),
	descrip_guia varchar(max)
)

insert into sec_guia
values('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/guide-bg.jpeg?raw=true',
'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/guide.jpg?raw=true',
'Deja que la luz sea la guía','Desde temporadas de aventuras, eventos del juego hasta un mundo en constante expansión de amistades y objetos coleccionables para desbloquear, 
hay mucho que hacer en Sky. Restaura la luz caída en las constelaciones ayudando a otros. Aquí tienes una introducción para empezar en el reino.')


create table sec_avatares(
	id_av int identity,
	img_av varchar(max),
	descrip_av varchar(max),
	nombre_av varchar(20)
)

insert into sec_avatares
values('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/Ody.jpg?raw=true',
		'Niño de luz con vibes de socializar, le gusta estar de chill, vestir de rosa e interactuar.','Avatar de Odeth'),
	  ('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/Gera.jpg?raw=true', 
	  'Niño de luz con cara "háblame y te pego", poco socail, prefiere jugar solo y evitar el ruido.','Avatar de Gerardo'),
	  ('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/Freddy.jpg?raw=true', 
	  'Niño de luz con ropa cool, veterano, ignora solicitudes de amistad, tiene los mejores artículos.','Avatar de Freddy')

create table sec_Recursos_razones(
	img_nube varchar(max),
	img_r1 varchar(max),
	img_r2 varchar(max),
	title_r varchar(max)
)

create table sec_razones(
	id_r int identity,
	razon varchar(60)
)

insert into sec_Recursos_razones
values('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/cloud-primary-light--top.png?raw=true',
'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/Sky%20God.jpg?raw=true',
'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/Sky_icon.jpg?raw=true','Razones para jugar Sky')

insert into sec_razones
values('Puedes relejarte y estar de chill.'),
	  ('Puedes explorar mundos y hacer amigos.'),
	  ('Puedes personalizar tu avatar.'),
	  ('Asistir a eventos y nuevas temporadas.'),
	  ('Interactuar en tiempo real con otros jugadores'),
	  ('Especular sobre el lore.')

create table sec_Eden(
	title_eden varchar(40),
	descrip_eden varchar(max),
	img_eden varchar(max)
)

insert into sec_Eden
values('Ojo del Edén','El Ojo de Edén es la zona más peligrosa del reino de Sky. En su interior encontrarás el mayor reto al que te enfrentarás. 
		El área está plagada de Dragones Oscuros, peligros y una fuerte Tormenta empeñada en absorber tu luz y debilitarte, mientras que te esfuerzas por llevar a las estrellas perdidas 
		a su hogar. Solo los jugadores más habilidosos y fuertes obtendrán la recompensa. Completa este reino con ayuda de tus amigos y averigua si eres capaz de superar este desafío.',
		'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/Eden-removebg-preview.png?raw=true')

create table nav(
	img_logo varchar(max),
	img_nubeNav varchar(max),
	icon_menu varchar(max)
)
insert into nav
values('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/sky-logo-white.png?raw=true',
		'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/header-bg.png?raw=true',
		'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/pngegg.png?raw=true')


create table banner(
	img_fondo_banner varchar(max),
	logo_banner varchar(max),
	title_banner varchar(40),
	img_nubeBanner varchar(max)
)

insert into banner
values('https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/sky-hero.jpeg?raw=true',
'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/sky-logo-white.png?raw=true','Children of the Light', 
'https://github.com/Ody26/Parcial-2/blob/main/Parcial-2-main/Parcial-2-main/Parcial%202/img/cloud-white-hero--top.png?raw=true')

create table usuarios (
id_usua int identity
	constraint Formulario_id_pk primary key,
nombre varchar (max),
email varchar (50)
	constraint Formulario_email_ck
		check (email like '%@%'),
mensaje varchar (max)
)
select * from usuarios
