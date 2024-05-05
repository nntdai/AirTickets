-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2024 at 04:59 PM
-- Server version: 8.3.0
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airticket`
--

-- --------------------------------------------------------

--
-- Table structure for table `chuyenbay`
--

CREATE TABLE `chuyenbay` (
  `id` int NOT NULL,
  `idMayBay` int NOT NULL,
  `maSanBayDi` varchar(20) NOT NULL,
  `maSanBayDen` varchar(20) NOT NULL,
  `ngayDi` datetime NOT NULL,
  `ngayDen` datetime NOT NULL,
  `thoiGianBay` time(6) NOT NULL,
  `ghiChu` longtext,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `chuyenbay`
--

INSERT INTO `chuyenbay` (`id`, `idMayBay`, `maSanBayDi`, `maSanBayDen`, `ngayDi`, `ngayDen`, `thoiGianBay`, `ghiChu`, `tinhTrang`) VALUES
(1, 1, 'SGN', 'HAN', '2024-04-11 04:50:12', '2024-04-11 07:50:12', '03:00:12.055000', 'Bao gồm:\r\n\r\ncheck\r\nHành lý xách tay: 10kg.\r\n\r\ncheck\r\nHành lý ký gửi: 30kg và 01 bộ dụng cụ chơi golf (nếu có).\r\n\r\ncheck\r\nPhòng chờ sang trọng (không áp dụng trên các chuyến bay nội địa Thái Lan và các sân bay có phòng chờ không đạt tiêu chuẩn hoặc đóng cửa trong giờ hoạt động của chuyến bay)\r\n\r\ncheck\r\nƯu tiên làm thủ tục trước chuyến bay\r\n\r\ncheck\r\nƯu tiên phục vụ hành lý\r\n\r\ncheck\r\nƯu tiên qua cửa an ninh (tùy theo điều kiện từng sân bay)\r\n\r\ncheck\r\nPhục vụ đưa đón riêng ra tàu bay (áp dụng trường hợp tàu bay đậu bãi; không áp dụng đối với sân bay không cung cấp dịch vụ xe đưa đón riêng)\r\n\r\ncheck\r\nƯu tiên chọn chỗ ngồi trên tàu bay (không áp dụng các hàng ghế dành cho khách Business)\r\n\r\ncheck\r\nThưởng thức ẩm thực tươi ngon suốt chuyến bay\r\n\r\ncheck\r\nBộ tiện ích (chuyến bay từ 04 tiếng trở lên)\r\n\r\ncheck\r\nHoàn bảo lưu định danh tiền vé trong vòng 02 (hai) năm kể từ ngày khởi hành dự kiến\r\n\r\ncheck\r\nBảo hiểm Sky Care (chưa áp dụng cho các chuyến bay do Thai Vietjet khai thác)', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `hangthanthiet`
--

CREATE TABLE `hangthanthiet` (
  `id` int NOT NULL,
  `tenHang` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `diemTichLuy` int NOT NULL,
  `khuyenMai` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `hangthanthiet`
--

INSERT INTO `hangthanthiet` (`id`, `tenHang`, `diemTichLuy`, `khuyenMai`) VALUES
(1, 'Đồng', 100, 5),
(2, 'Bạc', 200, 8),
(3, 'Vàng', 300, 14),
(4, 'Bạch Kim', 500, 20),
(5, 'Sắt', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `hoadonveban`
--

CREATE TABLE `hoadonveban` (
  `id` int NOT NULL,
  `idNhanVien` varchar(12) NOT NULL,
  `idKhachHangLapHoaDon` varchar(12) NOT NULL,
  `ngayLapHoaDon` datetime NOT NULL,
  `tongTien` decimal(15,4) NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `hoadonveban`
--

INSERT INTO `hoadonveban` (`id`, `idNhanVien`, `idKhachHangLapHoaDon`, `ngayLapHoaDon`, `tongTien`, `tinhTrang`) VALUES
(1, '090000000000', '080000000000', '2024-04-30 16:56:42', 2000000.0000, b'1');

-- --------------------------------------------------------

--
-- Table structure for table `hoanve`
--

CREATE TABLE `hoanve` (
  `id` int NOT NULL,
  `idVeMayBay` int NOT NULL,
  `phiHoanVe` decimal(15,4) NOT NULL,
  `lyDoHoan` longtext NOT NULL,
  `ngayHoan` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `cmnd` varchar(12) NOT NULL,
  `hoTen` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `soDienThoai` varchar(10) NOT NULL,
  `diaChi` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `ngaySinh` date DEFAULT NULL,
  `diemTichLuy` int NOT NULL,
  `idHangThanThiet` int NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`cmnd`, `hoTen`, `soDienThoai`, `diaChi`, `ngaySinh`, `diemTichLuy`, `idHangThanThiet`, `tinhTrang`) VALUES
('080000000000', 'Nguyễn Ngọc Thành Trúc', '0938814487', '38/4v xã Xuân Thới Đông ,Huyện Tân Phú Q7 ,TP HCM', '2003-12-10', 0, 5, b'1');

-- --------------------------------------------------------

--
-- Table structure for table `loaivemaybay`
--

CREATE TABLE `loaivemaybay` (
  `id` int NOT NULL,
  `idChuyenBay` int NOT NULL,
  `hangVe` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `giaVe` decimal(15,4) NOT NULL,
  `soLuongVeTong` int NOT NULL,
  `soLuongVeCon` int NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `loaivemaybay`
--

INSERT INTO `loaivemaybay` (`id`, `idChuyenBay`, `hangVe`, `giaVe`, `soLuongVeTong`, `soLuongVeCon`, `tinhTrang`) VALUES
(1, 1, 'Phổ Thông', 2000000.0000, 228, 228, b'1'),
(2, 1, 'Thương Gia', 4000000.0000, 54, 54, b'1');

-- --------------------------------------------------------

--
-- Table structure for table `maybay`
--

CREATE TABLE `maybay` (
  `id` int NOT NULL,
  `ten` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `soGheH1` int NOT NULL,
  `soGheH2` int NOT NULL,
  `status` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `maybay`
--

INSERT INTO `maybay` (`id`, `ten`, `soGheH1`, `soGheH2`, `status`) VALUES
(1, 'B52', 54, 228, b'1');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `cmnd` varchar(12) NOT NULL,
  `soDienThoai` varchar(10) NOT NULL,
  `ho` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `ten` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `ngaySinh` date DEFAULT NULL,
  `gioiTinh` bit(1) NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`cmnd`, `soDienThoai`, `ho`, `ten`, `ngaySinh`, `gioiTinh`, `tinhTrang`) VALUES
('090000000000', '0900000000', 'Nguyễn Nhân ', 'Viên', '2004-04-01', b'1', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `sanbay`
--

CREATE TABLE `sanbay` (
  `maSanBay` varchar(20) NOT NULL,
  `ten` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `status` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `sanbay`
--

INSERT INTO `sanbay` (`maSanBay`, `ten`, `status`) VALUES
('BMV ', 'Buôn Ma Thuột', b'1'),
('HAN', 'Hà Nội', b'1'),
('SGN', 'TP Hồ Chí Minh', b'1'),
('VCA', 'Cần Thơ ', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `userName` varchar(40) NOT NULL,
  `passWord` varchar(40) NOT NULL,
  `ngayCap` date DEFAULT NULL,
  `tinhTrang` bit(1) NOT NULL,
  `cmndNhanVien` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`userName`, `passWord`, `ngayCap`, `tinhTrang`, `cmndNhanVien`) VALUES
('nguyennhanvien', 'hahahaha', '2024-04-30', b'1', '090000000000');

-- --------------------------------------------------------

--
-- Table structure for table `vemaybay`
--

CREATE TABLE `vemaybay` (
  `id` int NOT NULL,
  `idHoaDonVeBan` int NOT NULL,
  `idKhachHang` varchar(12) NOT NULL,
  `loaiVeMayBiDi` int NOT NULL,
  `tinhTrang` bit(1) NOT NULL,
  `loaiVeMayBayVe` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `vemaybay`
--

INSERT INTO `vemaybay` (`id`, `idHoaDonVeBan`, `idKhachHang`, `loaiVeMayBiDi`, `tinhTrang`, `loaiVeMayBayVe`) VALUES
(1, 1, '080000000000', 1, b'1', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idMayBay` (`idMayBay`),
  ADD KEY `maSanBayDi` (`maSanBayDi`),
  ADD KEY `maSanBayDen` (`maSanBayDen`);

--
-- Indexes for table `hangthanthiet`
--
ALTER TABLE `hangthanthiet`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hoadonveban`
--
ALTER TABLE `hoadonveban`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idKhachHangLapHoaDon` (`idKhachHangLapHoaDon`),
  ADD KEY `idNhanVien` (`idNhanVien`);

--
-- Indexes for table `hoanve`
--
ALTER TABLE `hoanve`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idVeMayBay` (`idVeMayBay`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`cmnd`),
  ADD KEY `idHangThanThiet` (`idHangThanThiet`);

--
-- Indexes for table `loaivemaybay`
--
ALTER TABLE `loaivemaybay`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idChuyenBay` (`idChuyenBay`);

--
-- Indexes for table `maybay`
--
ALTER TABLE `maybay`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`cmnd`);

--
-- Indexes for table `sanbay`
--
ALTER TABLE `sanbay`
  ADD PRIMARY KEY (`maSanBay`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`userName`),
  ADD KEY `cmndNhanVien` (`cmndNhanVien`);

--
-- Indexes for table `vemaybay`
--
ALTER TABLE `vemaybay`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idHoaDonVeBan` (`idHoaDonVeBan`),
  ADD KEY `idKhachHang` (`idKhachHang`),
  ADD KEY `idLoaiVeMayBay` (`loaiVeMayBiDi`),
  ADD KEY `loaiVeMayBayVe` (`loaiVeMayBayVe`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `hangthanthiet`
--
ALTER TABLE `hangthanthiet`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `hoadonveban`
--
ALTER TABLE `hoadonveban`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `hoanve`
--
ALTER TABLE `hoanve`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `loaivemaybay`
--
ALTER TABLE `loaivemaybay`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `maybay`
--
ALTER TABLE `maybay`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `vemaybay`
--
ALTER TABLE `vemaybay`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD CONSTRAINT `chuyenbay_ibfk_1` FOREIGN KEY (`idMayBay`) REFERENCES `maybay` (`id`),
  ADD CONSTRAINT `chuyenbay_ibfk_2` FOREIGN KEY (`maSanBayDi`) REFERENCES `sanbay` (`maSanBay`),
  ADD CONSTRAINT `chuyenbay_ibfk_3` FOREIGN KEY (`maSanBayDen`) REFERENCES `sanbay` (`maSanBay`);

--
-- Constraints for table `hoadonveban`
--
ALTER TABLE `hoadonveban`
  ADD CONSTRAINT `hoadonveban_ibfk_1` FOREIGN KEY (`idKhachHangLapHoaDon`) REFERENCES `khachhang` (`cmnd`),
  ADD CONSTRAINT `hoadonveban_ibfk_2` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`cmnd`);

--
-- Constraints for table `hoanve`
--
ALTER TABLE `hoanve`
  ADD CONSTRAINT `hoanve_ibfk_1` FOREIGN KEY (`idVeMayBay`) REFERENCES `vemaybay` (`id`);

--
-- Constraints for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`idHangThanThiet`) REFERENCES `hangthanthiet` (`id`);

--
-- Constraints for table `loaivemaybay`
--
ALTER TABLE `loaivemaybay`
  ADD CONSTRAINT `loaivemaybay_ibfk_1` FOREIGN KEY (`idChuyenBay`) REFERENCES `chuyenbay` (`id`);

--
-- Constraints for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`cmndNhanVien`) REFERENCES `nhanvien` (`cmnd`);

--
-- Constraints for table `vemaybay`
--
ALTER TABLE `vemaybay`
  ADD CONSTRAINT `vemaybay_ibfk_1` FOREIGN KEY (`idHoaDonVeBan`) REFERENCES `hoadonveban` (`id`),
  ADD CONSTRAINT `vemaybay_ibfk_2` FOREIGN KEY (`idKhachHang`) REFERENCES `khachhang` (`cmnd`),
  ADD CONSTRAINT `vemaybay_ibfk_3` FOREIGN KEY (`loaiVeMayBiDi`) REFERENCES `loaivemaybay` (`id`),
  ADD CONSTRAINT `vemaybay_ibfk_4` FOREIGN KEY (`loaiVeMayBayVe`) REFERENCES `vemaybay` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
