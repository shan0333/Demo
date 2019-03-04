CREATE TABLE `incident` (
  `incidentid` varchar(100) NOT NULL,
  `incidenttype` varchar(100) NOT NULL,
  `priority` varchar(100) NOT NULL,
  `reporteddate` date DEFAULT NULL,
  `storeno` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `workedby` varchar(100) DEFAULT NULL,
  `occurnce` varchar(100) DEFAULT NULL,
  `breachedtime` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
