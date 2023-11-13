CREATE TABLE IF NOT EXISTS `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` int(11) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `image` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

INSERT INTO `products` (`id`, `name`, `price`, `description`, `image`) VALUES
(3, 'kalem', 10, 'çok amaçlı yazdırgaç', 'pendrive.jpeg'),
(4, 'defter', 20, 'kapağı olan okumalık', 'book.jpg'),
(5, 'silgi', 50, 'temizlik ürünü :D', 'eraser.jpg');

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `vehicle` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `image` varchar(45) NOT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `user` (`username`, `password`, `gender`, `vehicle`, `country`, `image`, `role`) VALUES
('demo', 'demo', 'Erkek', 'Araba', 'Türkiye', 'hibernate.png', 'ROLE_ADMIN'),
('Hüseyin', 'java1234', 'Erkek', '3 Tekerlekli Psiklet', 'Afrika', 'java.png', 'ROLE_USER'),
('Ömer Faruk', 'minecraft123', 'Herif', 'Bisiklet', 'usa', 'minecraft.png', 'ROLE_USER');