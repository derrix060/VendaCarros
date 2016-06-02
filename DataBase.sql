SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

CREATE DATABASE IF NOT EXISTS `concessionaria_old` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `concessionaria_old`;

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `cpf` varchar(11) NOT NULL,
  `nomeCompleto` varchar(45) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `ddd` int(11) DEFAULT NULL,
  `telefone` int(11) DEFAULT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `cliente` (`cpf`, `nomeCompleto`, `idade`, `ddd`, `telefone`) VALUES
('34485930017', 'Fransisco da Rocha', 30, 11, 900000000),
('43191814841', 'Mario Apra', 20, 11, 968000000);

DROP TABLE IF EXISTS `veiculo`;
CREATE TABLE IF NOT EXISTS `veiculo` (
  `marca` varchar(15) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `ano` int(11) DEFAULT NULL,
  `cor` varchar(10) DEFAULT NULL,
  `transmissao` varchar(10) DEFAULT NULL,
  `motor` varchar(3) DEFAULT NULL,
  `placa` varchar(8) DEFAULT NULL,
  `renavam` int(11) DEFAULT NULL,
  `chassi` int(11) NOT NULL,
  `valorCompra` float DEFAULT NULL,
  `odometro` int(11) DEFAULT NULL,
  `disponivel` bit(1) DEFAULT NULL,
  `categoria` varchar(15) DEFAULT NULL,
  `arCondicionado` bit(1) DEFAULT NULL,
  `abs` bit(1) DEFAULT NULL,
  `tetoSolar` bit(1) DEFAULT NULL,
  `kitEletrico` bit(1) DEFAULT NULL,
  `bancoCouro` bit(1) DEFAULT NULL,
  `direcaoHidraulica` bit(1) DEFAULT NULL,
  `farolMilha` bit(1) DEFAULT NULL,
  `centralMultimidia` bit(1) DEFAULT NULL,
  `pilotoAutomatico` bit(1) DEFAULT NULL,
  `luzDiurna` bit(1) DEFAULT NULL,
  `comandoVolante` bit(1) DEFAULT NULL,
  `airBag` bit(1) DEFAULT NULL,
  `nomeImagem` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`chassi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `veiculo` (`marca`, `modelo`, `ano`, `cor`, `transmissao`, `motor`, `placa`, `renavam`, `chassi`, `valorCompra`, `odometro`, `disponivel`, `categoria`, `arCondicionado`, `abs`, `tetoSolar`, `kitEletrico`, `bancoCouro`, `direcaoHidraulica`, `farolMilha`, `centralMultimidia`, `pilotoAutomatico`, `luzDiurna`, `comandoVolante`, `airBag`, `nomeImagem`) VALUES
('Renault', 'Clio', 2013, 'prata', 'Manual', '1.0', 'AAA-0000', 0, 1, 12500, 0, b'1', 'Carro', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 'clio.jpg'),
('Toyota', 'Corolla', 2015, 'prata', 'Automatico', '1.0', 'AAA-0001', 0, 2, 75500, 0, b'1', 'Carro', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 'corolla.jpg'),
('Ford', 'Fusion', 2014, 'preto', 'Automatico', '1.0', 'AAA-0002', 0, 3, 70500, 0, b'1', 'Carro', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 'fusion.jpg'),
('Volkswagen', 'Gol', 2012, 'prata', 'Manual', '1.0', 'AAA-0003', 0, 4, 15500, 0, b'1', 'Carro', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 'gol.jpg'),
('Ford', 'Ka', 2013, 'prata', 'Manual', '1.0', 'AAA-0004', 0, 5, 30500, 0, b'1', 'Carro', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 'ka.jpg'),
('Renault', 'Sandero', 2014, 'vermelho', 'Manual', '1.0', 'AAA-0005', 0, 6, 25500, 0, b'1', 'Carro', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 'sandero.jpg'),
('Fiat', 'Uno', 2013, 'vermelho', 'Manual', '1.0', 'AAA-0006', 0, 7, 12500, 0, b'1', 'Carro', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', b'1', 'uno.jpg');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
