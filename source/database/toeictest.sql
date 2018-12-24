-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2018 at 02:55 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toeictest`
--
CREATE DATABASE IF NOT EXISTS `toeictest` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `toeictest`;

-- --------------------------------------------------------

--
-- Table structure for table `listening`
--

CREATE TABLE `listening` (
  `id` int(4) NOT NULL,
  `ques` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ansA` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ansB` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ansC` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ansD` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `correctAns` varchar(1) COLLATE utf8_unicode_ci NOT NULL,
  `img` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `listening`
--

INSERT INTO `listening` (`id`, `ques`, `ansA`, `ansB`, `ansC`, `ansD`, `correctAns`, `img`) VALUES
(1, '', '', '', '', '', 'c', 'img/imgQuestion/1.png'),
(2, '', '', '', '', '', 'a', 'img/imgQuestion/2.png'),
(3, '', '', '', '', '', 'b', 'img/imgQuestion/3.png'),
(4, '', '', '', '', '', 'b', 'img/imgQuestion/4.png'),
(5, '', '', '', '', '', 'd', 'img/imgQuestion/5.png'),
(6, '', '', '', '', '', 'c', 'img/imgQuestion/6.png'),
(7, '', '', '', '', '', 'a', 'img/imgQuestion/7.png'),
(8, '', '', '', '', '', 'b', 'img/imgQuestion/8.png'),
(9, '', '', '', '', '', 'd', 'img/imgQuestion/9.png'),
(10, '', '', '', '', '', 'b', 'img/imgQuestion/10.png'),
(11, '', '', '', '', '', 'c', ''),
(12, '', '', '', '', '', 'a', ''),
(13, '', '', '', '', '', 'c', ''),
(14, '', '', '', '', '', 'b', ''),
(15, '', '', '', '', '', 'b', ''),
(16, '', '', '', '', '', 'c', ''),
(17, '', '', '', '', '', 'c', ''),
(18, '', '', '', '', '', 'b', ''),
(19, '', '', '', '', '', 'c', ''),
(20, '', '', '', '', '', 'b', ''),
(21, '', '', '', '', '', 'c', ''),
(22, '', '', '', '', '', 'c', ''),
(23, '', '', '', '', '', 'c', ''),
(24, '', '', '', '', '', 'b', ''),
(25, '', '', '', '', '', 'a', ''),
(26, '', '', '', '', '', 'a', ''),
(27, '', '', '', '', '', 'b', ''),
(28, '', '', '', '', '', 'b', ''),
(29, '', '', '', '', '', 'c', ''),
(30, '', '', '', '', '', 'c', ''),
(31, '', '', '', '', '', 'a', ''),
(32, '', '', '', '', '', 'b', ''),
(33, '', '', '', '', '', 'c', ''),
(34, '', '', '', '', '', 'b', ''),
(35, '', '', '', '', '', 'c', ''),
(36, '', '', '', '', '', 'a', ''),
(37, '', '', '', '', '', 'b', ''),
(38, '', '', '', '', '', 'b', ''),
(39, '', '', '', '', '', 'c', ''),
(40, '', '', '', '', '', 'a', ''),
(41, 'What service is the woman asking about?', 'Room cleaning', 'Laundry service', 'Express check-in', 'Conference room rental', 'b', ''),
(42, 'When most likely will the woman give a speech?', 'On Sunday', 'On Monday', 'On Tuesday', 'On Webnesday', 'c', ''),
(43, 'What will the man probably do next?', 'Process the woman\'s payment', 'Help the woman with her luggage', 'Take the woman\'s jacket', 'Give the woman a bag', 'd', ''),
(44, 'Why does the woman say the meeting should be postponed?', 'Some important data is missing', 'Some employees will be absent', 'The computer systems has a problem', 'An excutive is scheduled to visit the office', 'b', ''),
(45, 'When will the meeting most likely be held?', 'Thursday morning', 'Thursday afternoon ', 'Friday morning', 'Friday afternoon', 'c', ''),
(46, 'What will the man probably do next?', 'Visit a computer facility', 'Take a lunch break', 'Reserve a meeting room', 'Write an e-mail message', 'b', ''),
(47, 'Why is the man traveling to India?', 'To study at a university', 'To sell his company\'s products', 'To attend a conference', 'To look for an apartment', 'b', ''),
(48, 'What does the man say about the bag?', 'It is lightweight', 'It is fashionable', 'It is too expensive', 'It is too small', 'd', ''),
(49, 'What does the woman offer to do?', 'Show the man a different part of the shop', 'Look for other products on a computer', 'Give the man a discount', 'Repair an item for the man', 'b', ''),
(50, 'Why most likely is the woman calling?', ' an appointment\'s meeting  place', 'To remind the man of his appointment', 'To offer the man an appointment', 'To reschedule the man\'s appointment', 'c', ''),
(51, 'At what time Friday will the man most likely visit the Stone Complex?', '5:00 PM', '5:30 PM', '6:00 PM', '6:30 PM', 'b', ''),
(52, 'What does the woman ask the man to do?', 'Bring photo identification', 'Park in an indoor garage', 'Use public transportation', 'Phone her office shortly before arriving', 'a', ''),
(53, 'Why is the woman concerned?', 'She missed a deadline', 'She is giving a presentation', 'She is staring a new job', 'She left her home late', 'c', ''),
(54, 'What is causing the problem?', 'Bad weather conditions', 'A lots passenger', 'Railway construction work', 'Electricity problems in the city', 'a', ''),
(55, 'Where does the man most likely work?', 'At a bank', 'At a real estate office', 'At a publishing firm', 'At an electricity company', 'b', ''),
(56, 'What department does the man most likely work in?', 'Sales ', 'Accounting', 'Human Resources', 'Operations', 'b', ''),
(57, 'When will the man probably go to Max?s Supply?', 'On Monday ', 'On Tuesday', 'On Wednesday', 'On Friday', 'd', ''),
(58, 'What will the woman probably do next?', 'Phone a delivery person', 'Give the man a catalogue', 'Go to a supply room', 'Make a list', 'd', ''),
(59, 'What is the main purpose of the woman?s call?', 'To arrange a demonstration of a product', 'To explain how to use a product', 'To check on a customer\'s satisfaction with a product', 'To explain the procedure for returning a product', 'c', ''),
(60, 'According to the conversation, what is special about the DTC-10?', 'Its low price', 'Its techno;ogy', 'Its compact size', 'Its speed of operation', 'd', ''),
(61, 'What does the man say will happen next month?', 'He will have a production deadline.', 'He will buy another Ten-Tech product.', 'Clothing will be sent to stores.', ' A new factory will open.', 'c', ''),
(62, 'What does the man indicate about the restaurant?', 'It has a lunch buffet.', 'It is near the speakers? workplace.', 'It offers delivery service.', 'It has inexpensive menu items.', 'd', ''),
(63, 'What does the man offer to do?', 'Pay for the woman?s meal', 'Postpone a meeting', 'Help the woman prepare a report', 'Design a brochure for the woman', 'c', ''),
(64, 'What does the woman?s colleague say about the restaurant?', ' It is expensive.', 'It is small.', ' The service is slow.', 'It has outdoor seating.', 'b', ''),
(65, 'Who most likely is the man?', 'A factory worker', 'A festival organizer', 'A driving instructor', 'A news reporter', 'd', ''),
(66, 'What kind of company does the woman probably work for?', 'A video game design firm', 'An event planning company', 'A vehicle manufacturer', 'An advertising agency', 'c', ''),
(67, 'When will the Vista be released on the market?', 'In January', 'In February', 'In March', 'In April', 'c', ''),
(68, 'Why is the woman calling the man?', 'To answer his questions about a neighborhood', 'To give details about a vacant apartment', 'To find out his preferences in apartments', 'To postpone a meeting with him', 'b', ''),
(69, 'What does the man say is important to him?', 'Living near public transportation', 'The apartment?s rental price', 'The size of the apartment', 'Living in the downtown area', 'b', ''),
(70, 'What most likely will happen in the afternoon?', 'The woman will meet the man at her office.', 'The man will view an apartment.', 'The woman will send the man a list.', 'The man will sign a rental contract.', 'c', ''),
(71, 'Why have the airline?s jets changed appearance?', 'It purchased new planes', 'It changed its slogan.', 'It is celebrating an anniversary.', 'It merged with another airline.', 'd', ''),
(72, 'What will the airline do next month?', 'Begin an online reservations system', 'Expand its hours of its operation', 'Change its name to Globe Airways', 'Open new ticket counters at airports', 'b', ''),
(73, 'Who will receive a discount with the airline this month?', 'New customers', 'Frequent fliers', 'First-class travelers', 'Holders of travel discount cards', 'a', ''),
(74, 'When will the office open again?', 'On Thursday', 'On Friday', 'On Monday', 'On Tuesday', 'd', ''),
(75, 'According to the recording, what does STS provide?', 'A list of local hotels', 'Tour guides for groups', 'Updates on ski conditions', 'Information for volunteers', 'a', ''),
(76, 'What should a caller do to speak to a representative?', 'Record a message', 'Dial a different extension', 'Press number one', 'Stay on the line', 'b', ''),
(77, 'What is the audience encouraged to do?', 'Take photos of the performers', 'Make recordings of the performance', 'Applaud while standing', 'Sing during part of the show', 'd', ''),
(78, 'What is available in the lobby?', 'T-shirts', 'Photos', 'Music recordings', 'Video games', 'b', ''),
(79, 'What most likely will happen next?', 'The musical performance will start.', 'Some of the audience will be served a beverage.', 'Tickets for upgraded seats will go on sale', 'The audience will visit the lobby area.', 'b', ''),
(80, 'What happened yesterday?', 'A sports contest was postponed.', 'Some local stores were closed.', 'A flower show took place.', 'Local schools canceled classes.', 'a', ''),
(81, 'What does the speaker recommend that the audience do?', 'Drive more slowly', 'Avoid outdoor exercise', 'Turn down their home heating', 'Visit a nature area', 'd', ''),
(82, 'What most likely will be heard next?', 'Sports news', 'Commercials', 'Medical news', 'Traffic updates', 'b', ''),
(83, 'What is the purpose of the speech?', 'To discuss the health benefits of an ', 'To review employee attendance policies', 'To explain a promotional event', 'To welcome new staff', 'c', ''),
(84, 'How long has the speaker worked with the company?', 'For 3 years', 'For 5 years', 'For 10 years', 'For 20 years', 'c', ''),
(85, 'What most likely will the speaker do next?', 'Show a video', 'Distribute brochures', 'Demonstrate an exercise', 'Meet with a customer', 'b', ''),
(86, 'Where most likely is this announcement being given?', 'In a tour bus', 'At a cooking school', 'At a restaurant', 'In a museum', 'c', ''),
(87, 'What is indicated about Longman Folk Village?', 'It is closed for renovations.', 'It is part of a history museum.', 'It includes a farm.', 'It does not allow photography.', 'c', ''),
(88, 'What does the speaker recommend that the audience do?', 'Sit on the right side of the tour bus', 'Carry snacks in their backpacks', 'Unpack their umbrellas', 'Put away their cameras', 'c', ''),
(89, 'What department does the speaker most likely work in?', 'Training', 'Market research', 'Human resources', 'Customer service', 'c', ''),
(90, 'What is the audience instructed to do?', 'Register for training', 'Go to a computer room', 'Complete some paperwork', 'Collect identification tags', 'b', ''),
(91, 'What most likely will happen in 10 minutes?', 'A meal break will begin.', 'Procedures will be explained.', 'A workshop will conclude.', 'Job interviews will take place.', 'b', ''),
(92, 'Where most likely is the announcement being given?', 'At a software company?s office', 'At a camera store', 'At a convention center', 'At a public park', 'a', ''),
(93, 'Who most likely is Rachel Kim?', 'A magazine writer', 'A software developer', 'A store owner', 'A nature photographer', 'd', ''),
(94, 'What are the listeners asked to do?', 'Visit a Web site', 'Attend a training seminar', 'Test a software program', 'Finish work early for the day', 'a', ''),
(95, 'Where most likely does the speaker work?', 'At a factory', 'At a restaurant', 'At a delivery company', 'At a lighting supply store', 'd', ''),
(96, 'What problem has occurred?', 'Some items were out of stock.', 'The wrong items were delivered.', 'Some items were damaged in shipping.', 'An item was sent to the wrong address.', 'c', ''),
(97, 'What does the speaker ask Ms. Farley to do?', 'Place a new order', 'Confirm a date', 'Visit a warehouse', 'Pay a delivery fee', 'b', ''),
(98, 'Who is John Mason?', 'An auto buyer', 'An auto designer', 'An auto company president', 'An auto industry analyst', 'b', ''),
(99, 'According to the broadcast, who is the Delta aimed at?', 'People who are beginning drivers', 'People with large families', 'People wanting a small car', 'People who drive sports cars', 'b', ''),
(100, 'What is mentioned about the Delta?', 'It is expensive.', 'It has a large engine.', 'It will come in two colors.', 'It will be sold in limited numbers.', 'c', ''),
(101, 'Heavy rain caused the ----- of Taylor City?s third annual outdoor arts and crafts festival.', '', '', '', '', 'd', ''),
(102, 'Our banquet rooms are capable of ---- events of all types and sizes.', '', '', '', '', 'c', ''),
(103, 'The monthly rent cost includes heat and hot water, ------- not electricity and cooking gas.', '', '', '', '', 'b', ''),
(104, 'It can often be difficult to ------- real antique furniture from imitation items.', '', '', '', '', 'c', ''),
(105, 'Upon ------- of your r?sum?, one of our skilled recruiters will review it to determine the most suitable position for you.', '', '', '', '', 'c', ''),
(106, 'Creating a book of ------- own can be fun and simple with the help of the Writer-Pro desktop publishing program.', '', '', '', '', 'b', ''),
(107, 'Riverdale Estates is a luxury condominium community that offers an outstanding ------- of life.', '', '', '', '', 'c', ''),
(108, 'You should become thoroughly ------ with your computer and all of its software programs before you take an on-line class.', '', '', '', '', 'd', ''),
(109, '109. The shipment of TK-421 laptops arrived in stores earlier ------- expected.', '', '', '', '', 'c', ''),
(110, 'Most warranties on electronic items do not ------- damage caused by improper use of the device.', '', '', '', '', 'a', ''),
(111, 'Call-Tech Plus offers ------- cell phone service at low monthly rates.', '', '', '', '', 'a', ''),
(112, 'The car?s trunk is ------- enough to hold luggage for four passengers.', '', '', '', '', 'd', ''),
(113, 'The Eagle Room, our largest and most elegant banquet facility, allows groups of up to 200 people to enjoy meals in -------.', '', '', '', '', 'a', ''),
(114, 'Telecommuting provides a lot of benefits for ------- the company and the employee.', '', '', '', '', 'b', ''),
(115, 'Our summer interns performed all their tasks ------- even though they received only brief training.', '', '', '', '', 'b', ''),
(116, 'Hanby Developers specializes in the construction of modest yet comfortable townhomes that even first-time homebuyers can -------.', '', '', '', '', 'a', ''),
(117, 'You should not use the Erlian Peak trail ------- you are ready for a long and fairly difficult hike.', '', '', '', '', 'c', ''),
(118, '118. Market research reports show that a hotel?s level of ------- is an important factor in determining guests? overall satisfaction.', '', '', '', '', 'd', ''),
(119, 'The Liberty Heights Department Store is now proud to offer gift cards in various ------- from $25 to $300.', '', '', '', '', 'c', ''),
(120, '.------- with a valid driver?s license or state photo ID may use the city?s historical research library.', '', '', '', '', 'a', ''),
(121, 'The development of freight containers in specific sizes and shapes helped encourage ------ across the entire shipping industry.', '', '', '', '', 'd', ''),
(122, 'The Quick Shot 3 digital camera was recently ------- due to a lack of consumer demand.', '', '', '', '', 'c', ''),
(123, 'Frequent ------- with clients will help a company better understand the customers? basic needs and preferences.', '', '', '', '', 'c', ''),
(124, 'Trusty Mortgage Company makes it easy to get a home loan ------- your present financial situation.', '', '', '', '', 'b', ''),
(125, 'Your inquiry will be given ------- attention and you will receive a reply e-mail within one business day.', '', '', '', '', 'a', ''),
(126, 'Participants in the science conference will have the chance to take an afternoon------- to Shockley Research Park.', '', '', '', '', 'c', ''),
(127, '. ------- use our online bill payment system, you must first complete our registration process.', '', '', '', '', 'c', ''),
(128, 'Laramie Motors recently announced plans to increase ------- of its popular Nida Model 320 sedan.', '', '', '', '', 'd', ''),
(129, 'This year?s warm and dry spring weather had a positive ------- on tourism in the entire Tri-County region', '', '', '', '', 'c', ''),
(130, 'Managers of several local shops are reporting stronger sales this quarter------- the region?s weak economy', '', '', '', '', 'd', ''),
(131, 'When ------- the cost of a construction project, you need an accurate estimate of the price of the building materials you will use.', '', '', '', '', 'b', ''),
(132, 'Team building workshops are designed to ------- cooperation and teamwork among employees.', '', '', '', '', 'c', ''),
(133, 'All regular staff meetings ------- until Friday afternoon so that team leaders can complete their monthly sales reports.', '', '', '', '', 'c', ''),
(134, 'Each branch office has a payroll manager who can ------- employees? concerns about pay and benefits.', '', '', '', '', 'b', ''),
(135, 'The company wants to get a patent for its L38 computerized metal polishing machine, but the management cannot determine ------- the inventor was.', '', '', '', '', 'c', ''),
(136, 'At Daley Stores, soft music, attractive decorations, and pleasant aromas are coordinated into an environment-------to enhance the shopping experience.', '', '', '', '', 'a', ''),
(137, 'The battery life of your cell phone can------- by storing the phone in a cool environment.', '', '', '', '', 'c', ''),
(138, '. ------- some equipment problems at our Stone Park production facility, shipments of our new Series II mountain bike were delayed.', '', '', '', '', 'd', ''),
(139, 'Skilled presenters always have -------\nplans ready in the event of equipment failure.', '', '', '', '', 'b', ''),
(140, 'Sales of the company?s PD-70 tablet computer increased last month, -------\nsales of its other handheld devices remained flat.', '', '', '', '', 'c', ''),
(141, '', 'flexible', 'flexibly', 'flexibility', 'more flexible', 'c', 'img/imgQuestion/rd1.png'),
(142, '', 'weight', 'value', 'degree', 'rate', 'd', 'img/imgQuestion/rd1.png'),
(143, '', 'besides', 'except', 'until', 'between', 'a', 'img/imgQuestion/rd1.png'),
(144, '', 'centrally', 'centralize', 'centralized', 'centralization', 'c', 'img/imgQuestion/rd2.png'),
(145, '', 'requested', 'requesting', 'are requested', 'requests', 'c', 'img/imgQuestion/rd2.png'),
(146, '', 'habits', 'supplies', 'sources', 'factors', 'b', 'img/imgQuestion/rd2.png'),
(147, '', 'acquire', 'acquired', 'acquiring', 'acquisition', 'b', 'img/imgQuestion/rd3.png'),
(148, '', 'choose', 'choosing', 'to choose ', 'to have chosen', 'c', 'img/imgQuestion/rd3.png'),
(149, '', 'keeps', 'passes', 'streams', 'runs', 'd', 'img/imgQuestion/rd3.png'),
(150, '', 'visit', 'to visit', 'to be visited', 'have visited', 'b', 'img/imgQuestion/rd4.png'),
(151, '', 'pleasing', 'pleasingly', 'pleased', 'please', 'c', 'img/imgQuestion/rd4.png'),
(152, '', 'disaposable', 'winnable', 'valueable', 'avoidable', 'c', 'img/imgQuestion/rd4.png'),
(153, 'What is NOT indicated about Tower Park?', '', '', '', '', 'b', 'img/imgQuestion/r1.png'),
(154, 'What is mentioned about the park?s East Gate?', '', '', '', '', 'c', 'img/imgQuestion/r1.png'),
(155, ' What kind of company most likely is\nbeing advertised?', '', '', '', '', 'b', 'img/imgQuestion/r2.png'),
(156, 'What is NOT mentioned in the\nadvertisement?', '', '', '', '', 'c', 'img/imgQuestion/r2.png'),
(157, 'What is indicated about the Mosley Building?', '', '', '', '', 'c', 'img/imgQuestion/r3.png'),
(158, 'What is NOT mentioned about the space for rent?', '', '', '', '', 'd', 'img/imgQuestion/r3.png'),
(159, 'What is one purpose of the e-mail?', '', '', '', '', 'a', 'img/imgQuestion/r4.png'),
(160, 'What can be inferred about Mr. Munson?', '', '', '', '', 'b', 'img/imgQuestion/r4.png'),
(161, 'When most likely will Mr. Santos?s moving crew visit Mr. Munson?', '', '', '', '', 'c', 'img/imgQuestion/r4.png'),
(162, 'What has changed about the picnic?', '', '', '', '', 'b', 'img/imgQuestion/r5.png'),
(163, 'What is NOT mentioned about Pierce Picnic Ground?', '', '', '', '', 'b', 'img/imgQuestion/r5.png'),
(164, 'What can be inferred about Eastern Technologies?', '', '', '', '', 'c', 'img/imgQuestion/r5.png'),
(165, 'What is indicated about the hotel?', '', '', '', '', 'c', 'img/imgQuestion/r5.png'),
(166, 'How much does the hotel charge for each extra adult guest?', '', '', '', '', 'd', 'img/imgQuestion/r5.png'),
(167, 'What is NOT mentioned about the Rosewood Restaurant?', '', '', '', '', 'c', 'img/imgQuestion/r5.png'),
(168, 'What is one purpose of this memo?', '', '', '', '', 'd', 'img/imgQuestion/r6.png'),
(169, 'The word ?enlist? in paragraph 2, line 2 is closest in meaning to', '', '', '', '', 'a', 'img/imgQuestion/r6.png'),
(170, 'Who most likely started the Clean Earth', '', '', '', '', 'c', 'img/imgQuestion/r6.png'),
(171, 'Which items are NOT collected beside the photocopier?', '', '', '', '', 'c', 'img/imgQuestion/r6.png'),
(172, 'What is the purpose of the e-mail?', '', '', '', '', 'a', 'img/imgQuestion/r7.png'),
(173, 'What is required to receive an online discount?', '', '', '', '', 'b', 'img/imgQuestion/r7.png'),
(174, 'What is NOT indicated about the Web site?', '', '', '', '', 'd', 'img/imgQuestion/r7.png'),
(175, 'What is mentioned about the summer sale?', '', '', '', '', 'b', 'img/imgQuestion/r7.png'),
(176, 'What is indicated about Market Focus Inc.?', '', '', '', '', 'a', 'img/imgQuestion/r8.png'),
(177, 'How most likely would a person register to be a product tester?', '', '', '', '', 'b', 'img/imgQuestion/r8.png'),
(178, 'The words ?pick up? in paragraph 1, line 2 are closest in meaning to', '', '', '', '', 'c', 'img/imgQuestion/r8.png'),
(179, 'What is NOT indicated about the research room?', '', '', '', '', 'b', 'img/imgQuestion/r8.png'),
(180, 'What can be inferred about the company?s product tests?', '', '', '', '', 'd', 'img/imgQuestion/r8.png'),
(181, 'Why most likely did Mr. Goebel get a discount?', '', '', '', '', 'a', 'img/imgQuestion/r9.png'),
(182, 'How most likely will Mr. Goebel pay for the tour?', '', '', '', '', 'b', 'img/imgQuestion/r9.png'),
(183, 'What amount does Mr. Goebel want deducted from his invoice?', '', '', '', '', 'd', 'img/imgQuestion/r9.png'),
(184, 'The word ?cover? in paragraph 2, line 3 of the e-mail is closest in meaning to', '', '', '', '', 'c', 'img/imgQuestion/r9.png'),
(185, 'What can be inferred about Mr. Goebel?', '', '', '', '', 'a', 'img/imgQuestion/r9.png'),
(186, 'What is NOT sold in the store?', '', '', '', '', 'b', 'img/imgQuestion/r10.png'),
(187, 'When most likely could Mr. Nelson only be reached online?', '', '', '', '', 'b', 'img/imgQuestion/r10.png'),
(188, 'On what day did Mr. Sanders most likely visit the store?', '', '', '', '', 'c', 'img/imgQuestion/r10.png'),
(189, 'What did Mr. Sanders say he liked most about the store?', '', '', '', '', 'a', 'img/imgQuestion/r10.png'),
(190, 'What is indicated about Mr. Nelson?', '', '', '', '', 'b', 'img/imgQuestion/r10.png'),
(191, 'What is NOT indicated about the sales event?', '', '', '', '', 'd', 'img/imgQuestion/r11.png'),
(192, 'What can be inferred about Milford Mall?', '', '', '', '', 'd', 'img/imgQuestion/r11.png'),
(193, 'When most likely will Ms. Lopez do product demonstrations?', '', '', '', '', 'c', 'img/imgQuestion/r11.png'),
(194, 'What is indicated about Ms. Sato?', '', '', '', '', 'b', 'img/imgQuestion/r11.png'),
(195, 'What did Ms. Lopez request?', '', '', '', '', 'c', 'img/imgQuestion/r11.png'),
(196, 'What is inferred about Mr. Kamal?', '', '', '', '', 'b', 'img/imgQuestion/r12.png'),
(197, 'The word ?field? in paragraph 2, line 2 of the first e-mail is closest in meaning to', '', '', '', '', 'b', 'img/imgQuestion/r12.png'),
(198, 'Which site visit most likely involves a stay at a Standard Class hotel?', '', '', '', '', 'c', 'img/imgQuestion/r12.png'),
(199, 'On what topic does Mr. Bonner say he has no knowledge?', '', '', '', '', 'd', 'img/imgQuestion/r12.png'),
(200, 'What does Mr. Bonner include with his e-mail?', '', '', '', '', 'c', 'img/imgQuestion/r12.png');

-- --------------------------------------------------------

--
-- Table structure for table `users_info`
--

CREATE TABLE `users_info` (
  `fname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `lname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `pass` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `users_info`
--

INSERT INTO `users_info` (`fname`, `lname`, `email`, `pass`) VALUES
('Huy', 'Dao', 'huy.daoanh@gmail.com', '11967d5e9addc5416ea9224eee0e91fc');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `listening`
--
ALTER TABLE `listening`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `listening`
--
ALTER TABLE `listening`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
