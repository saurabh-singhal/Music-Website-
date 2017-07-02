-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2017 at 09:35 PM
-- Server version: 10.1.8-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `soundmatch`
--

-- --------------------------------------------------------

--
-- Table structure for table `ac/dc`
--

CREATE TABLE `ac/dc` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `ac/dc`
--

INSERT INTO `ac/dc` (`music`, `link`, `likes`) VALUES
('Highway to hell', 'https://cldup.com/_TTGaQ-_sm.mp3', 0),
('Moneytalks', 'https://cldup.com/s959zSWEv9.mp3', 0),
('Ride on', 'https://cldup.com/fMTsu7Jp68.mp3', 0),
('Thunderstruck', 'https://cldup.com/2Or3cB-Tk4.mp3', 0),
('Heatseeker', 'https://cldup.com/H_-v7d_y4K.mp3', 0);

-- --------------------------------------------------------

--
-- Table structure for table `brunomars`
--

CREATE TABLE `brunomars` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `brunomars`
--

INSERT INTO `brunomars` (`music`, `link`, `likes`) VALUES
('JUST THE WAY YOU ARE', 'https://cldup.com/gHecpr-1XZ.mp3', 2),
('Lighters', 'https://cldup.com/NRQeOklfe4.mp3', 0),
('The Lazy Song', 'https://cldup.com/EzGm3etye5.mp3', 0),
('Uptown Funk', 'https://cldup.com/5yO_v4TcGT.mp3', 2),
('24K Magic', 'https://cldup.com/Mjb_3NgPe3.mp3', 0);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `artist` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`artist`, `type`) VALUES
('Benjamin', 'ROCK'),
('IMAGINE DRAGONS', 'ROCK'),
('NICKELBACK', 'ROCK'),
('TWENTY ONE PILOTS', 'ROCK'),
('BRUNO MARS', 'POP'),
('JUSTIN BEIBER', 'POP'),
('RIHANNA', 'POP'),
('SIA', 'POP'),
('THE WEEKND', 'POP'),
('ALAN WALKER', 'EDM'),
('CALVIN HARRIS', 'EDM'),
('MAJOR LAZER', 'EDM'),
('MARSHMELLO', 'EDM'),
('THE CHAINSMOKERS', 'EDM'),
('AVICII', 'PROGRESSIVE'),
('DAVID GUETTA', 'PROGRESSIVE'),
('HARDWELL', 'PROGRESSIVE'),
('SKRILLEX', 'PROGRESSIVE'),
('AVENGED SEVENFOLD', 'METAL'),
('LAMB OF GOD', 'METAL'),
('MEGADETH', 'METAL'),
('METALLICA', 'METAL'),
('MOTORHEAD', 'METAL'),
('Coldplay', 'ALTERNATIVE ROCK'),
('NIRAJ SHRIDHAR', 'BOLLYWOOD'),
('GREEN DAY', 'ALTERNATIVE ROCK'),
('MOHIT CHAUHAN', 'BOLLYWOOD'),
('SHREYA GHOSHAL', 'BOLLYWOOD'),
('SHAAN', 'BOLLYWOOD'),
('LINKIN PARK', 'ALTERNATIVE ROCK'),
('YO YO HONEY SINGH', 'BOLLYWOOD'),
('ARIJIT', 'BOLLYWOOD'),
('ATIF ASLAM', 'BOLLYWOOD'),
('RAHAT FATEH ALI KHAN', 'BOLLYWOOD'),
('NIRVANA', 'ALTERNATIVE ROCK'),
('benjamin', 'ROCK');

-- --------------------------------------------------------

--
-- Table structure for table `categorya`
--

CREATE TABLE `categorya` (
  `music` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `artist` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL,
  `type` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `categorya`
--

INSERT INTO `categorya` (`music`, `artist`, `link`, `likes`, `type`) VALUES
('Sooch na sake', 'arijit', 'https://cldup.com/b1q9qhdUSf.mp3', 13, 'bollywood'),
('Humari aadhuri kahani', 'arijit', 'https://cldup.com/7--fik_75h.mp3', 16, 'bollywood'),
('Tum hi ho', 'arijit', 'https://cldup.com/S-eDHB-jDs.mp3', 26, 'bollywood'),
('Sooraj duba hain', 'arijit', 'https://cldup.com/p8fIfxIZFc.mp3', 8, 'bollywood'),
('Waiting For Love', 'avicii', 'https://cldup.com/6LuQX9FTgc.mp3', 1, 'PROGRESSIVE'),
('Wake me up', 'avicii', 'https://cldup.com/NK_9lUSuSE.mp3', 7, 'PROGRESSIVE'),
('You Make Me', 'avicii', 'https://cldup.com/qo4b1AUCwZ.mp3', 2, 'PROGRESSIVE'),
('Levels', 'avicii', 'https://cldup.com/MbMp6ExpMu.mp3', 0, 'PROGRESSIVE'),
('The Nights', 'avicii', 'https://cldup.com/SL8w6dr3dE.mp3', 5, 'PROGRESSIVE'),
('Please Don''t Stop The Music', 'rihana', 'https://cldup.com/-jLyGg0bR9.mp3', 0, 'POP'),
('This Is What You Came For', 'rihana', 'https://cldup.com/VcyieQaGtj.mp3', 2, 'POP'),
('Work', 'rihana', 'https://cldup.com/7WvOIFOgK4.mp3', 0, 'POP'),
('Kiss It Better', 'rihana', 'https://cldup.com/Jek5_8Aa0N.mp3', 0, 'POP'),
('Bitch Better Have My Money', 'rihana', 'https://cldup.com/StkNzTsjKB.mp3', 2, 'POP'),
('NOTHING ELSE MATTERS', 'metallica', 'https://cldup.com/3BLrWfaKG7.mp3', 0, 'METAL'),
('Sad But True', 'metallica', 'https://cldup.com/ucDS5BlASP.mp3', 0, 'METAL'),
('THE UNFORGIVEN', 'metallica', 'https://cldup.com/OgqDKM_bu9.mp3', 0, 'METAL'),
('Fade To Black', 'metallica', 'https://cldup.com/Rn-ppNSshx.mp3', 1, 'METAL'),
('Master of puppets', 'metallica', 'https://cldup.com/31njzIXuNg.mp3', 0, 'METAL'),
('Be intihaan', 'atif aslam', 'https://cldup.com/NEVXST1-gz.mp3', 6, 'bollywood'),
('Badlapur', 'atif aslam', 'https://cldup.com/huIFAfbLK9.mp3', 5, 'bollywood'),
('Tu chahiye', 'atif aslam', 'https://cldup.com/pKYQv2aXZR.mp3', 2, 'bollywood'),
('khair mangda', 'atif aslam', 'https://cldup.com/rOnKdZ_zc7.mp3', 3, 'bollywood'),
('Apollo', 'hardwell', 'https://cldup.com/lr-8Xk5kSS.mp3', 0, 'PROGRESSIVE'),
('Mad World', 'hardwell', 'https://cldup.com/4WFS_lVhUm.mp3', 1, 'PROGRESSIVE'),
('SPACEMAN', 'hardwell', 'https://cldup.com/LwRlUbCOZU.mp3', 0, 'PROGRESSIVE'),
('Thinking About You', 'hardwell', 'https://cldup.com/1Pl2RwrQ5x.mp3', 2, 'PROGRESSIVE'),
('Young Again', 'hardwell', 'https://cldup.com/CDwh8MLCc2.mp3', 1, 'PROGRESSIVE'),
('Hymn For The Weekend', 'coldplay', 'https://cldup.com/LUZUYjmr3h.mp3', 0, 'ALTERNATIVE ROCK'),
('Up and Up', 'coldplay', 'https://cldup.com/Dto84rVBKq.mp3', 0, 'ALTERNATIVE ROCK'),
('Paradise', 'coldplay', 'https://cldup.com/XCBzMSzvKI.mp3', 0, 'ALTERNATIVE ROCK'),
('Yellow', 'coldplay', 'https://cldup.com/B4N6UccqdF.mp3', 0, 'ALTERNATIVE ROCK'),
('Fix You', 'coldplay', 'https://cldup.com/BG3zq6SwEK.mp3', 0, 'ALTERNATIVE ROCK'),
('A Sky Full Of Stars', 'coldplay', 'https://cldup.com/-lsGcQcd6f.mp3', 0, 'ALTERNATIVE ROCK'),
('Come as you are', 'nirvana', 'https://cldup.com/6dHUQc7ZwG.mp3', 1, 'ALTERNATIVE ROCK'),
('lithium', 'nirvana', 'https://cldup.com/B26ivOgd0X.mp3', 4, 'ALTERNATIVE ROCK'),
('Tegos', 'drake', 'https://cldup.com/OrVLoCQJvr.mp3', 0, 'EDM'),
('one dance', 'drake', 'https://cldup.com/PlLZtxi9FJ.mp3', 2, 'EDM'),
('started from the bottom', 'drake', 'https://cldup.com/Fz3kzLUijl.mp3', 4, 'EDM'),
('childs play', 'drake', 'https://cldup.com/bQ116es64N.mp3', 7, 'EDM'),
('Diary Of Jane', 'benjamin', 'https://cldup.com/yST1DN5Szg.mp3', 5, 'ROCK'),
('Without you', 'benjamin', 'https://cldup.com/nWe_R6UHJO.mp3', 7, 'ROCK'),
('You', 'benjamin', 'https://cldup.com/UwzhoIQhOY.mp3', 4, 'ROCK'),
('Breath', 'benjamin', 'https://cldup.com/Aq8KI5E9He.mp3', 5, 'ROCK'),
('Crawl', 'benjamin', 'https://cldup.com/JD-UV2phTH.mp3', 13, 'ROCK'),
('DEAR GOD', 'avenged sevenfold', 'https://cldup.com/0Ml3HOm5iD.mp3', 0, 'METAL'),
('SCREAM', 'avenged sevenfold', 'https://cldup.com/QpQ7qK2eGD.mp3', 0, 'METAL'),
('SO FAR AWAY', 'avenged sevenfold', 'https://cldup.com/QQqhy65y99.mp3', 0, 'METAL'),
('Afterlife', 'avenged sevenfold', 'https://cldup.com/DUDHhGd3JN.mp3', 1, 'METAL'),
('ALMOST EASY', 'avenged sevenfold', 'https://cldup.com/96kBfyp4st.mp3', 0, 'METAL'),
('No love', 'eminem', 'https://cldup.com/JdLz5yGiif.mp3', 4, 'EDM'),
('Not afraid', 'eminem', 'https://cldup.com/WuTS0PGJ8w.mp3', 3, 'EDM'),
('Rap God', 'eminem', 'https://cldup.com/DFiTAzrkJU.mp3', 2, 'EDM'),
('Lose yourself', 'eminem', 'https://cldup.com/5EvZ52Rd6d.mp3', 1, 'EDM'),
('love that you will lie', 'eminem', 'https://cldup.com/BG52EDe4fc.mp3', 0, 'EDM'),
('Lift Me Up', 'david guetta', 'https://cldup.com/iuMHsejnQo.mp3', 0, 'PROGRESSIVE'),
('Sun Goes Down', 'david guetta', 'https://cldup.com/XRuPwLF0wB.mp3', 0, 'PROGRESSIVE'),
('TURN ME ON', 'david guetta', 'https://cldup.com/27A4ddF8Wx.mp3', 1, 'PROGRESSIVE'),
('Dangerous', 'david guetta', 'https://cldup.com/Z3rnXp_O-L.mp3', 0, 'PROGRESSIVE'),
('Hey Mama', 'david guetta', 'https://cldup.com/4Rb3L2cikA.mp3', 0, 'PROGRESSIVE'),
('The catalyst', 'linkin park', 'https://cldup.com/l7FAMd-2pW.mp3', 21, 'ALTERNATIVE ROCK'),
('Waiting for the end', 'linkin park', 'https://cldup.com/nohFdAhHkB.mp3', 10, 'ALTERNATIVE ROCK'),
('Bleed it out', 'linkin park', 'https://cldup.com/F8hSqrwz32.mp3', 30, 'ALTERNATIVE ROCK'),
('Castle of glass', 'linkin park', 'https://cldup.com/F8hSqrwz32.mp3', 11, 'ALTERNATIVE ROCK'),
('In the end', 'linkin park', 'https://cldup.com/NnjX6fpJcw.mp3', 7, 'ALTERNATIVE ROCK'),
('AMERICAN IDIOT', 'greenday', 'https://cldup.com/B5pkdhPhzj.mp3', 0, 'ROCK'),
('BASKET CASE', 'greenday', 'https://cldup.com/7sQcUipq9H.mp3', 0, 'ROCK'),
('HOLIDAY', 'greenday', 'https://cldup.com/6XSspxDgl2.mp3', 0, 'ROCK'),
('21 GUNS', 'greenday', 'https://cldup.com/SoqVY40Vtb.mp3', 0, 'ROCK'),
('Wake Me Up When September Ends', 'greenday', 'https://cldup.com/U5bTlbCyaL.mp3', 0, 'ROCK'),
('Fallen', 'imagine dragons', 'https://cldup.com/4EgldYzUur.mp3', 2, 'ROCK'),
('Radioactive', 'imagine dragons', 'https://cldup.com/6mL0o766Sb.mp3', 10, 'ROCK'),
('Rocks', 'imagine dragons', 'https://cldup.com/4fQxGJbd31.mp3', 3, 'ROCK'),
('America', 'imagine dragons', 'https://cldup.com/8PKjSINEi6.mp3', 3, 'ROCK'),
('Darkness', 'imagine dragons', 'https://cldup.com/laZl-vPb2t.mp3', 0, 'ROCK'),
('DEMONS', 'imagine dragons', 'https://cldup.com/AAw-lDLcSJ.mp3', 0, 'ROCK'),
('Love Yourself', 'Justin beiber', 'https://cldup.com/9GIGkLtUPN.mp3', 1, 'POP'),
('What Do You Mean', 'Justin beiber', 'https://cldup.com/mIFxpYUbJB.mp3', 0, 'POP'),
('Where Are U Now', 'Justin beiber', 'https://cldup.com/Lz72qT4EuM.mp3', 0, 'POP'),
('Cold Water', 'Justin beiber', 'https://cldup.com/seg1DYjzdj.mp3', 0, 'POP'),
('Let Me Love You', 'Justin beiber', 'https://cldup.com/Q8vlsPa6AW.mp3', 1, 'POP'),
('behti hawa sa tha', 'shaan', 'https://cldup.com/-PyTRkvHOs.mp3', 2, 'bollywood'),
('chaar kadam', 'shaan', 'https://cldup.com/dB_vzT0xOx.mp3', 3, 'bollywood'),
('desiboyz', 'shaan', 'https://cldup.com/MKaAGx2X9n.mp3', 5, 'bollywood'),
('My Way', 'calvin harris', 'https://cldup.com/FAfJaFmEmp.mp3', 1, 'EDM'),
('Summer', 'calvin harris', 'https://cldup.com/LyXuDQocMv.mp3', 1, 'EDM'),
('This Is What You Came For', 'calvin harris', 'https://cldup.com/YFJQot8Zpo.mp3', 1, 'EDM'),
('Blame', 'calvin harris', 'https://cldup.com/F1Cze0z73Z.mp3', 0, 'EDM'),
('How Deep Is Your Love', 'calvin harris', 'https://cldup.com/Emjr2LAONF.mp3', 1, 'EDM'),
('Faded', 'alan walker', 'https://cldup.com/tPQgIvT8yL.mp3', 1, 'EDM'),
('Spectre', 'alan walker', 'https://cldup.com/-AXeiQeBYa.mp3', 1, 'EDM'),
('Sing Me To Sleep', 'alan walker', 'https://cldup.com/Zwy5FXXQL7.mp3', 1, 'EDM'),
('Force', 'alan walker', 'https://cldup.com/INTfBSoJYA.mp3', 1, 'EDM'),
('Purple Lamborghini', 'Skrillex', 'https://cldup.com/RJY6XRUmKq.mp3', 0, 'PROGRESSIVE'),
('To U', 'Skrillex', 'https://cldup.com/n31LszSOsJ.mp3', 0, 'PROGRESSIVE'),
('Mind', 'Skrillex', 'https://cldup.com/71lVb4V2iL.mp3', 0, 'PROGRESSIVE'),
('Where Are U Now', 'Skrillex', 'https://cldup.com/hj16H5JErA.mp3', 0, 'PROGRESSIVE'),
('Bangarang', 'Skrillex', 'https://cldup.com/6NuJ76frr4.mp3', 2, 'PROGRESSIVE'),
('Lean On', 'major lazer', 'https://cldup.com/Z-IaNX-ysC.mp3', 1, 'EDM'),
('Light It Up', 'major lazer', 'https://cldup.com/piCkUb7uUO.mp3', 1, 'EDM'),
('Cold Water', 'major lazer', 'https://cldup.com/Uq05Mf1K5M.mp3', 0, 'EDM'),
('BUBBLE BUTT', 'major lazer', 'https://cldup.com/lQezai-fP5.mp3', 0, 'EDM'),
('Don''t Let Me Down', 'Chainsmokers', 'https://cldup.com/PCdGjkgSj0.mp3', 0, 'EDM'),
('Rozes', 'Chainsmokers', 'https://cldup.com/Bqmi21KpsJ.mp3', 0, 'EDM'),
('Selfie', 'Chainsmokers', 'https://cldup.com/yDFJ0dNPgn.mp3', 0, 'EDM'),
('SETTING FIRES', 'Chainsmokers', 'https://cldup.com/zmGmlXR8ld.mp3', 0, 'EDM'),
('All We Know', 'Chainsmokers', 'https://cldup.com/-7-1hX8fx3.mp3', 1, 'EDM'),
('Closer', 'Chainsmokers', 'https://cldup.com/H7McY_RM1N.mp3', 2, 'EDM'),
('aashiyan', 'Shreya Ghoshal', 'https://cldup.com/g5pW0JSmr2.mp3', 1, 'bollywood'),
('samander', 'Shreya Ghoshal', 'https://cldup.com/PC1eBMW1K5.mp3', 2, 'bollywood'),
('Radha', 'Shreya Ghoshal', 'https://cldup.com/BHoaGKT31i.mp3', 2, 'bollywood'),
('Heathens', '21 pilots', 'https://cldup.com/u7SeB2TNjB.mp3', 6, 'METAL'),
('Lovely', '21 pilots', 'https://cldup.com/O-sAcl9qre.mp3', 0, 'METAL'),
('Migraine', '21 pilots', 'https://cldup.com/gP4WrT4dJK.mp3', 6, 'METAL'),
('Ride', '21 pilots', 'https://cldup.com/j11ZPJ22en.mp3', 7, 'METAL'),
('Clear', '21 pilots', 'https://cldup.com/_qN7hkq87x.mp3', 0, 'METAL'),
('KILLED BY DEATH', 'Motor Head', 'https://cldup.com/H5mFm0pgfy.mp3', 0, 'METAL'),
('Overkill', 'Motor Head', 'https://cldup.com/IkqpOJT1-c.mp3', 0, 'METAL'),
('ROCK OUT', 'Motor Head', 'https://cldup.com/2lCOAhXZAU.mp3', 0, 'METAL'),
('THE GAME', 'Motor Head', 'https://cldup.com/WjQIu3WKtt.mp3', 0, 'METAL'),
('AceOfSpades', 'Motor Head', 'https://cldup.com/ISUxOg24Br.mp3', 0, 'METAL');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `name` varchar(30) NOT NULL,
  `id` varchar(20) NOT NULL,
  `song` varchar(40) NOT NULL,
  `comment` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`name`, `id`, `song`, `comment`) VALUES
('null', 'null', 'Sooraj duba hain', 'bhadiya song h\r\n'),
('Saurabh Singhal', '1793661520875876', 'one dance', 'mast song h'),
('Saurabh Singhal', '1793661520875876', 'Sooch na sake', 'okk'),
('Saurabh Singhal', '1793661520875876', 'The catalyst', 'last time'),
('Saurabh Singhal', '1793661520875876', 'Bleed it out', 'bhai bhai'),
('Saurabh Singhal', '1793661520875876', 'Migraine', 'AWESOME SONG');

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `idx` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `namex` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `emailx` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `musicx` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `mcount` int(30) NOT NULL,
  `friendx` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `fcount` int(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`idx`, `namex`, `emailx`, `musicx`, `mcount`, `friendx`, `fcount`) VALUES
('1270553496363456', 'Tanmay Joshi', 'tanmayjoshi.12@gmail.com', 'DJs Amira & Kayla,Bryan Adams,The vampires diary,Bone Thugs-N-Harmony,Trina,80Fitz,Karmin,Collido,Break of Reality,Maati Baani,DJ Potato,Prince Ea,Spectacular,Linkin Park India,Raghav Anand,Shawn Mendes,Ketika Sharma,The Mistri,marshmello,BORGEOUS,VINAI,Dillon Francis,I AM Hardwell,Headhunterz,Firebeatz,', 0, '', 0),
('1186761751371310', 'Shubham Kumar', 'shubhamkmr900@gmail.com', 'Skrillex,YAWAR,SAR The Band,Ðj Varun,Paz,Diljit Dosanjh - Rockstar of Punjabi Industry.,Jassie Gill,Sharry Mann,Babbal Rai,Kaur B,Shraddha Sharma,Zaeden,BORGEOUS,Crescendo : Music Hub of JIIT,Manthan,The Rahasya,Taher Shah,Chloe Adams,Dabu Davout,RISH,United India,The Chainsmokers,Conor Maynard', 0, '', 0),
('1793661520875876', 'Saurabh Singhal', 'saurabh.singhal333@gmail.com', 'Linkin Park,Hardwell,Yo! Yo! Honey Singh,Raver Girls,Zaeden,Nikhil D''souza,MTV Bollyland,Adapted Records,The Local Train,Ye ''''engineering'''' hai bidu.,Red FM,Arijit Singh,Virgin Radio Lebanon,Shreya Ghoshal,Michael Jackson,Atif Aslam,YO YO HONEY SINGH,', 17, '1186761751371310 1270553496363456 1667258910237466 1793661520875876 ', 4);

-- --------------------------------------------------------

--
-- Table structure for table `dataa`
--

CREATE TABLE `dataa` (
  `namex` varchar(30) NOT NULL,
  `emailx` varchar(40) NOT NULL,
  `passwordx` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dataa`
--

INSERT INTO `dataa` (`namex`, `emailx`, `passwordx`) VALUES
('aaaaaaaaaaaa', 'gggg@gmail.com', 'wdedheihdinwns'),
('sddd', 'jjjjjjjjj@.com', 'hiugufyfudtyx'),
('kkkkkkk', 'kkkkkkk@.com', 'jjjjjjjjjjjjjjjjjjj'),
('hhh', 'saurabh.singhal333@gmail.com', 'kkkkkkkkk');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` varchar(30) NOT NULL,
  `song` varchar(100) NOT NULL,
  `link` varchar(150) NOT NULL,
  `time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP
) ;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `song`, `link`, `time`, `type`) VALUES
('1186761751371310', 'Bleed it out', 'https://cldup.com/F8hSqrwz32.mp3', '2017-05-01 18:17:48.925426', 'ALTERNATIVE ROCK'),
('1270553496363456', 'Tum hi ho', 'https://cldup.com/S-eDHB-jDs.mp3', '2017-05-01 18:18:46.469483', 'bollywood'),
('1793661520875876', 'Afterlife', 'https://cldup.com/DUDHhGd3JN.mp3', '2017-05-01 18:42:04.000000', 'METAL'),
('1793661520875876', 'Bleed it out', 'https://cldup.com/F8hSqrwz32.mp3', '2017-05-01 18:55:41.000000', 'ALTERNATIVE ROCK'),
('null', 'Humari aadhuri kahani', 'https://cldup.com/7--fik_75h.mp3', '2017-05-02 05:05:06.000000', 'bollywood'),
('1793661520875876', 'Migraine', 'https://cldup.com/gP4WrT4dJK.mp3', '2017-05-02 05:10:58.000000', 'METAL'),
('1793661520875876', 'Tum hi ho', 'https://cldup.com/S-eDHB-jDs.mp3', '2017-05-02 06:21:27.000000', 'bollywood'),
('1793661520875876', 'Migraine', 'https://cldup.com/gP4WrT4dJK.mp3', '2017-05-02 06:21:51.000000', 'METAL');

-- --------------------------------------------------------

--
-- Table structure for table `lambofgod`
--

CREATE TABLE `lambofgod` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `lambofgod`
--

INSERT INTO `lambofgod` (`music`, `link`, `likes`) VALUES
('REDNECK', 'https://cldup.com/Ftlje_Agmw.mp3', 0),
('SET TO FAIL', 'https://cldup.com/mJYp_b2Uxs.mp3', 0),
('WALK WITH ME IN HELL', 'https://cldup.com/3rUOvweqmv.mp3', 0),
('Laid to rest', 'https://cldup.com/QgYoZCrrDy.mp3', 0);

-- --------------------------------------------------------

--
-- Table structure for table `marshmello`
--

CREATE TABLE `marshmello` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `marshmello`
--

INSERT INTO `marshmello` (`music`, `link`, `likes`) VALUES
('Alone', 'https://cldup.com/r5PSL8YL_K.mp3', 1),
('Freal Luv', 'https://cldup.com/BGQ5tN4HQc.mp3', 0),
('Summer', 'https://cldup.com/RKSrj8DKre.mp3', 0),
('Sing Me To Sleep Marshmello', 'https://cldup.com/IdsebkkLvf.mp3', 0);

-- --------------------------------------------------------

--
-- Table structure for table `megadeth`
--

CREATE TABLE `megadeth` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `megadeth`
--

INSERT INTO `megadeth` (`music`, `link`, `likes`) VALUES
('PEACE SELLS', 'https://cldup.com/dSRZrdhppV.mp3', 0),
('Sweating Bullets', 'https://cldup.com/fIpMFIGhp9.mp3', 0),
('Symphony of Destruction', 'https://cldup.com/fbCADXYyca.mp3', 0),
('Fatal Illusion', 'https://cldup.com/w86ZbegJae.mp3', 0),
('HOLY WARS', 'https://cldup.com/LTToVb_fZn.mp3', 0);

-- --------------------------------------------------------

--
-- Table structure for table `mohitchauhan`
--

CREATE TABLE `mohitchauhan` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `mohitchauhan`
--

INSERT INTO `mohitchauhan` (`music`, `link`, `likes`) VALUES
('Is jahaan mein', 'https://cldup.com/eAvfDleiTb.mp3', 1),
('Illahi', 'https://cldup.com/kxYil_9Ts3.mp3', 2),
('Rockstar', 'https://cldup.com/A4w26_BcRE.mp3', 4),
('Tum se hi', 'https://cldup.com/D4NHQowjRz.mp3', 13),
('Jo bhi mein ', 'https://cldup.com/ZAXnfGnZlR.mp3', 7);

-- --------------------------------------------------------

--
-- Table structure for table `nickelback`
--

CREATE TABLE `nickelback` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nickelback`
--

INSERT INTO `nickelback` (`music`, `link`, `likes`) VALUES
('Dirty Laundry', 'https://cldup.com/T5xQjL8KHg.mp3', 3),
('Far Away', 'https://cldup.com/H6rzCtJjlM.mp3', 4);

-- --------------------------------------------------------

--
-- Table structure for table `nirajshridhar`
--

CREATE TABLE `nirajshridhar` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nirajshridhar`
--

INSERT INTO `nirajshridhar` (`music`, `link`, `likes`) VALUES
('Ek villan', 'https://cldup.com/V7G77fUXSr.mp3', 2),
('Tera bina', 'https://cldup.com/e93iZP2jHG.mp3', 5),
('Bhula dena', 'https://cldup.com/GEpLKxCxnI.mp3', 3);

-- --------------------------------------------------------

--
-- Table structure for table `rahatfatehalikhan`
--

CREATE TABLE `rahatfatehalikhan` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `rahatfatehalikhan`
--

INSERT INTO `rahatfatehalikhan` (`music`, `link`, `likes`) VALUES
('veer', 'https://cldup.com/LI01A3CHNu.mp3', 1),
('O re piya', 'https://cldup.com/aWCxt3Lbc3.mp3', 2);

-- --------------------------------------------------------

--
-- Table structure for table `sia`
--

CREATE TABLE `sia` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sia`
--

INSERT INTO `sia` (`music`, `link`, `likes`) VALUES
('Cheap Thrills', 'https://cldup.com/M711vbjEkP.mp3', 0),
('The Greatest', 'https://cldup.com/AbhK_MJYCC.mp3', 0),
('Titanium', 'https://cldup.com/cgg4ZC0XUC.mp3', 0),
('Alive', 'https://cldup.com/wDNpPBkNeu.mp3', 0),
('CHANDELIER', 'https://cldup.com/weX-tWtZzO.mp3', 0);

-- --------------------------------------------------------

--
-- Table structure for table `theweeknd`
--

CREATE TABLE `theweeknd` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `theweeknd`
--

INSERT INTO `theweeknd` (`music`, `link`, `likes`) VALUES
('PRISONER', 'https://cldup.com/Sf-MBcSdEi.mp3', 0),
('Starboy', 'https://cldup.com/CtwRuS-kh8.mp3', 0),
('The Hills', 'https://cldup.com/JRfqgc8Wz6.mp3', 0),
('False Alarm', 'https://cldup.com/FjGnBXuKOB.mp3', 1),
('Love Me Harder', 'https://cldup.com/Tk8MIQBvaa.mp3', 2);

-- --------------------------------------------------------

--
-- Table structure for table `threedaysgrace`
--

CREATE TABLE `threedaysgrace` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `threedaysgrace`
--

INSERT INTO `threedaysgrace` (`music`, `link`, `likes`) VALUES
('paln', 'https://cldup.com/vaKwYejX62.mp3', 4),
('the good life', 'https://cldup.com/TxB26q0zci.mp3', 7),
('Animal i have become', 'https://cldup.com/RFsqu1zSdq.mp3', 0),
('Never too late', 'https://cldup.com/6dHUQc7ZwG.mp3', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tyga`
--

CREATE TABLE `tyga` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tyga`
--

INSERT INTO `tyga` (`music`, `link`, `likes`) VALUES
('Faded', 'https://cldup.com/KftheANl04.mp3', 4),
('Ice cream man', 'https://cldup.com/G_DZ9qA1tA.mp3', 2),
('orgasm', 'https://cldup.com/qfDlQt5iOg.mp3', 5),
('STIMULATED', 'https://cldup.com/_P_JLOAt7s.mp3', 0);

-- --------------------------------------------------------

--
-- Table structure for table `yoyohoneysingh`
--

CREATE TABLE `yoyohoneysingh` (
  `music` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(5) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `yoyohoneysingh`
--

INSERT INTO `yoyohoneysingh` (`music`, `link`, `likes`) VALUES
('one bottel down', 'https://cldup.com/z1mJtA3U-S.mp3', 1),
('Birthday bash', 'https://cldup.com/xoQGVv0NIU.mp3', 3),
('Manali trance ', 'https://cldup.com/ur57Fq3o61.mp3', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`idx`);

--
-- Indexes for table `dataa`
--
ALTER TABLE `dataa`
  ADD PRIMARY KEY (`emailx`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
