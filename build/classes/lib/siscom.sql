-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-06-2017 a las 18:48:25
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `siscom`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `criterio_evaluacion`
--

CREATE TABLE `criterio_evaluacion` (
  `id` tinyint(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `criterio_evaluacion`
--

INSERT INTO `criterio_evaluacion` (`id`, `nombre`, `estado`) VALUES
(1, 'Ejercicios', 1),
(2, 'Examen Teórico', 1),
(3, 'Examen Práctico', 1),
(4, 'Asistencia', 1),
(5, 'Participacion', 1),
(6, 'Notas', 1),
(7, 'Portafolio de Evidencia', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `id` tinyint(4) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `duracion` tinyint(4) NOT NULL,
  `requerimientos` text NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `codigo` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `id_materia` tinyint(4) NOT NULL,
  `bienvenida` text,
  `id_instructor` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`id`, `nombre`, `duracion`, `requerimientos`, `fecha_inicio`, `fecha_fin`, `codigo`, `estado`, `id_materia`, `bienvenida`, `id_instructor`) VALUES
(1, 'Introducción a la programación', 90, 'Word 2010 o superior.\r\nAdobe reader.\r\nPseInt\r\nScratch 2.0\r\nPlataforma educativa.', '2017-04-19', '2017-04-27', 'BARG', 1, 2, 'Este es un curso de introducción a la programación en donde le damos la más cordial bienvenida.', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evaluacion`
--

CREATE TABLE `evaluacion` (
  `id` smallint(6) NOT NULL,
  `id_criterio` tinyint(4) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `ponderacion` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instructor`
--

CREATE TABLE `instructor` (
  `id` tinyint(4) NOT NULL,
  `nombre` varchar(35) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `apellidos` varchar(50) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `email` varchar(100) NOT NULL,
  `foto` blob,
  `semblanza` text CHARACTER SET latin1 COLLATE latin1_spanish_ci,
  `password` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `instructor`
--

INSERT INTO `instructor` (`id`, `nombre`, `apellidos`, `email`, `foto`, `semblanza`, `password`, `estado`) VALUES
(1, 'GABRIEL', 'BARRON RODRIGUEZ', 'gbarron@utng.edu.mx', NULL, 'Mi nombre es Gabriel Barrón Rodríguez actualmente trabajo para la UTNG y CBTis75', 'gabo2017', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id` tinyint(6) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `nivel_educativo` varchar(20) NOT NULL DEFAULT 'Superior',
  `grado` tinyint(4) NOT NULL DEFAULT '1',
  `horas_semana` tinyint(4) NOT NULL,
  `objetivo` text,
  `competencia` text,
  `descripcion` text,
  `duracion` smallint(4) NOT NULL DEFAULT '6',
  `estado` tinyint(1) NOT NULL DEFAULT '1',
  `tipo` varchar(30) NOT NULL DEFAULT 'Asignatura'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id`, `nombre`, `nivel_educativo`, `grado`, `horas_semana`, `objetivo`, `competencia`, `descripcion`, `duracion`, `estado`, `tipo`) VALUES
(2, 'Metodología de la programación', 'Superior', 2, 6, 'El alumno  diseñará algoritmos en pseudocódigo y diagramas de flujo, para resolver un problema determinado por computadora.', 'Implementar aplicaciones de software; mediante técnicas de programación y considerando los requerimientos de la organización; para eficientar sus procesos.', NULL, 90, 1, 'Asignatura');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `participante`
--

CREATE TABLE `participante` (
  `id` smallint(6) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(1000) NOT NULL,
  `email` varchar(150) NOT NULL,
  `password` varchar(15) NOT NULL,
  `nivel` tinyint(4) DEFAULT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL,
  `rol` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `participante`
--

INSERT INTO `participante` (`id`, `nombre`, `apellidos`, `email`, `password`, `nivel`, `ciudad`, `estado`, `rol`) VALUES
(3, 'Juan Gabriel', 'Barrón Rodríguez', 'gbarroa@utng.edu.mx', '12345', 11, 'Guanajuato', 0, 'estudiante'),
(6, 'Gabriel', 'Barrón Rodríguez', 'gbarronaa@utng.edu.mx', '1234', 10, 'Dolores Hidalgo', 1, 'participante');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `ape1` varchar(50) NOT NULL,
  `ape2` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema`
--

CREATE TABLE `tema` (
  `id` smallint(6) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `saber` tinytext,
  `saber_hacer` tinytext,
  `ser` tinytext,
  `id_unidad` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tema`
--

INSERT INTO `tema` (`id`, `nombre`, `saber`, `saber_hacer`, `ser`, `id_unidad`) VALUES
(1, 'Adquisición, procesamiento y almacenamiento de datos', 'Identificar los elementos básicos del proceso de información (entrada - proceso - salida)', 'Esquematizar el proceso de información.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\n', 1),
(2, 'Conceptos de Algoritmos, Pseudocódigo y Diagrama de Flujo', 'Reconocer la diferencia entre un algoritmo, pseudocódigo y diagrama de flujo', 'Determinar de los distintos tipos de técnicas la adecuada para la solución de problemas.', 'Analítico.\r\nSistemático\r\nOrdenado\r\nAsertivo.\r\n', 1),
(3, 'Tipos de datos (numéricos, caracteres / cadenas, booleanos.', 'Identificar los diferentes tipos de datos utilizados en la programación, aplicándolo en la resolución de un problema.', 'Determinar el tipo de dato a utilizar dependiendo de los requerimientos de información a manipular.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\n', 1),
(4, 'Identificadores, variables y  constantes', 'Reconocer los conceptos de identificador, variable y constante.\r\nDescribir las reglas de creación de identificadores.\r\n', 'Determinar las variables y constantes a utilizar, dependiendo del tipo de datos a emplear y los requerimientos.', 'Analítico.\r\nOrdenado.\r\nSistemático\r\n', 1),
(5, 'Metodología para la solución de problemas por medio de computadoras', 'Identificar las etapas de la metodología de solución de problemas por medio de computadoras.', 'Determinar las entradas, proceso y salidas de un problema.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nHábil para trabajo en equipo.\r\n', 1),
(6, 'Operadores aritméticos, relacionales y lógicos', 'Identificar los tipos de operadores existentes.', 'Localizar los tipos de operadores', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nAsertivo\r\n', 2),
(7, 'Jerarquía de operadores', 'Identificar la jerarquía de los operadores.', 'Resolver expresiones aritméticas y lógicas.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\n', 2),
(8, 'Expresiones', 'Identificar las expresiones aritméticas y/o lógicas inmersas en el planteamiento de un problema.', 'Convertir expresiones algebraicas, aritméticas y lógicas a expresiones algorítmicas', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nHábil para trabajo en equipo.\r\n', 2),
(9, 'Reglas para elaborar algoritmos, Pseudocódigo y diagramas de flujo.', 'Reconocer la sintaxis utilizada para el desarrollo de pseudocódigo.\r\n\r\nIdentificar la simbología utilizada en el desarrollo de diagramas de flujo.\r\n\r\nDescribir el procedimiento para realizar una prueba de escritorio.\r\n', 'Plantear la solución de un problema empleando pseudocódigo y diagramas de flujo.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\n', 3),
(10, 'Contadores y  acumuladores.', 'Reconocer el funcionamiento de un contador y un acumulador.', 'Comparar entre un contador y un acumulador.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo.\r\n', 3),
(11, 'Estructuras de control de selección', 'Reconocer el funcionamiento de las estructuras de control selectivas\r\nSimples\r\nCompuestas\r\n\r\nMúltiples\r\n', 'Resolver un problema determinado aplicando las   estructuras de control selectivas y verificar la solución a través de una prueba de escritorio.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nPlanificador.\r\nCreativo\r\nHábil para trabajo en equipo.\r\n', 3),
(12, 'Estructuras de repetición', 'Reconocer el funcionamiento de las estructuras de control repetitivas\r\n\r\n    a) Para-hasta\r\n    b) Repite\r\n    c) Mientras.\r\n', 'Resolver un problema determinado aplicando las estructuras de control repetitivas y verificar la solución a través de una prueba de escritorio.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nPlanificador.\r\nCreativo\r\nHábil para trabajo en equipo.\r\n', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema_curso`
--

CREATE TABLE `tema_curso` (
  `id` smallint(6) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `saber` tinytext,
  `saber_hacer` tinytext,
  `ser` tinytext,
  `id_unidad_curso` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tema_curso`
--

INSERT INTO `tema_curso` (`id`, `nombre`, `saber`, `saber_hacer`, `ser`, `id_unidad_curso`) VALUES
(1, 'Adquisición, procesamiento y almacenamiento de datos', 'Identificar los elementos básicos del proceso de información (entrada - proceso - salida)', 'Esquematizar el proceso de información.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\n', 1),
(2, 'Conceptos de Algoritmos, Pseudocódigo y Diagrama de Flujo', 'Reconocer la diferencia entre un algoritmo, pseudocódigo y diagrama de flujo', 'Determinar de los distintos tipos de técnicas la adecuada para la solución de problemas.', 'Analítico.\r\nSistemático\r\nOrdenado\r\nAsertivo.\r\n', 1),
(3, 'Tipos de datos (numéricos, caracteres / cadenas, booleanos.', 'Identificar los diferentes tipos de datos utilizados en la programación, aplicándolo en la resolución de un problema.', 'Determinar el tipo de dato a utilizar dependiendo de los requerimientos de información a manipular.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\n', 1),
(4, 'Identificadores, variables y  constantes', 'Reconocer los conceptos de identificador, variable y constante.\r\nDescribir las reglas de creación de identificadores.\r\n', 'Determinar las variables y constantes a utilizar, dependiendo del tipo de datos a emplear y los requerimientos.', 'Analítico.\r\nOrdenado.\r\nSistemático\r\n', 1),
(5, 'Metodología para la solución de problemas por medio de computadoras', 'Identificar las etapas de la metodología de solución de problemas por medio de computadoras.', 'Determinar las entradas, proceso y salidas de un problema.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nHábil para trabajo en equipo.\r\n', 1),
(6, 'Operadores aritméticos, relacionales y lógicos', 'Identificar los tipos de operadores existentes.', 'Localizar los tipos de operadores', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nAsertivo\r\n', 2),
(7, 'Jerarquía de operadores', 'Identificar la jerarquía de los operadores.', 'Resolver expresiones aritméticas y lógicas.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\n', 2),
(8, 'Expresiones', 'Identificar las expresiones aritméticas y/o lógicas inmersas en el planteamiento de un problema.', 'Convertir expresiones algebraicas, aritméticas y lógicas a expresiones algorítmicas', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nHábil para trabajo en equipo.\r\n', 2),
(9, 'Reglas para elaborar algoritmos, Pseudocódigo y diagramas de flujo.', 'Reconocer la sintaxis utilizada para el desarrollo de pseudocódigo.\r\n\r\nIdentificar la simbología utilizada en el desarrollo de diagramas de flujo.\r\n\r\nDescribir el procedimiento para realizar una prueba de escritorio.\r\n', 'Plantear la solución de un problema empleando pseudocódigo y diagramas de flujo.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\n', 3),
(10, 'Contadores y  acumuladores.', 'Reconocer el funcionamiento de un contador y un acumulador.', 'Comparar entre un contador y un acumulador.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo.\r\n', 3),
(11, 'Estructuras de control de selección', 'Reconocer el funcionamiento de las estructuras de control selectivas\r\nSimples\r\nCompuestas\r\n\r\nMúltiples\r\n', 'Resolver un problema determinado aplicando las   estructuras de control selectivas y verificar la solución a través de una prueba de escritorio.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nPlanificador.\r\nCreativo\r\nHábil para trabajo en equipo.\r\n', 3),
(12, 'Estructuras de repetición', 'Reconocer el funcionamiento de las estructuras de control repetitivas\r\n\r\n    a) Para-hasta\r\n    b) Repite\r\n    c) Mientras.\r\n', 'Resolver un problema determinado aplicando las estructuras de control repetitivas y verificar la solución a través de una prueba de escritorio.', 'Analítico.\r\nOrdenado.\r\nSistemático.\r\nCoherente.\r\nProactivo.\r\nAsertivo\r\nPlanificador.\r\nCreativo\r\nHábil para trabajo en equipo.\r\n', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unidad`
--

CREATE TABLE `unidad` (
  `id` smallint(6) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` tinytext,
  `duracion` tinyint(4) NOT NULL,
  `objetivo` text,
  `horas_teoricas` tinyint(4) NOT NULL DEFAULT '0',
  `horas_practicas` tinyint(4) NOT NULL DEFAULT '0',
  `id_materia` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `unidad`
--

INSERT INTO `unidad` (`id`, `nombre`, `descripcion`, `duracion`, `objetivo`, `horas_teoricas`, `horas_practicas`, `id_materia`) VALUES
(1, 'Unidad I Conceptos básicos', 'En ésta unidad se desarrollarán', 18, 'El alumno determinará las entradas, procesos y salidas de un problema, utilizando los elementos básicos de programación, para el planteamiento de una solución.', 10, 8, 2),
(2, 'Unidad II Expresiones', 'En ésta unidad temática se crearán expresiones.', 12, NULL, 4, 8, 2),
(3, 'Unidad III Algortimos y Diagramas de Flujo', 'Unidad III', 60, NULL, 12, 48, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unidad_curso`
--

CREATE TABLE `unidad_curso` (
  `id` smallint(6) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` tinytext,
  `duracion` tinyint(4) NOT NULL,
  `objetivo` text,
  `horas_teoricas` tinyint(4) NOT NULL DEFAULT '0',
  `horas_practicas` tinyint(4) NOT NULL DEFAULT '0',
  `id_curso` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `unidad_curso`
--

INSERT INTO `unidad_curso` (`id`, `nombre`, `descripcion`, `duracion`, `objetivo`, `horas_teoricas`, `horas_practicas`, `id_curso`) VALUES
(1, 'Unidad I Conceptos básicos', 'En ésta unidad se desarrollarán', 18, 'El alumno determinará las entradas, procesos y salidas de un problema, utilizando los elementos básicos de programación, para el planteamiento de una solución.', 10, 8, 1),
(2, 'Unidad II Expresiones', 'En ésta unidad temática se crearán expresiones.', 12, NULL, 4, 8, 1),
(3, 'Unidad III Algortimos y Diagramas de Flujo', 'Unidad III', 60, NULL, 12, 48, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `criterio_evaluacion`
--
ALTER TABLE `criterio_evaluacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_nombre_curso` (`nombre`);

--
-- Indices de la tabla `evaluacion`
--
ALTER TABLE `evaluacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_email_instructor` (`email`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_nombre_materia` (`nombre`);

--
-- Indices de la tabla `participante`
--
ALTER TABLE `participante`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tema`
--
ALTER TABLE `tema`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_idunidad_tema` (`id_unidad`);

--
-- Indices de la tabla `tema_curso`
--
ALTER TABLE `tema_curso`
  ADD KEY `id_unidad_curso` (`id_unidad_curso`);

--
-- Indices de la tabla `unidad`
--
ALTER TABLE `unidad`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_idmateria` (`id_materia`);

--
-- Indices de la tabla `unidad_curso`
--
ALTER TABLE `unidad_curso`
  ADD KEY `id_curso` (`id_curso`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `criterio_evaluacion`
--
ALTER TABLE `criterio_evaluacion`
  MODIFY `id` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `id` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `evaluacion`
--
ALTER TABLE `evaluacion`
  MODIFY `id` smallint(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `instructor`
--
ALTER TABLE `instructor`
  MODIFY `id` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id` tinyint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `participante`
--
ALTER TABLE `participante`
  MODIFY `id` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tema`
--
ALTER TABLE `tema`
  MODIFY `id` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `unidad`
--
ALTER TABLE `unidad`
  MODIFY `id` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
