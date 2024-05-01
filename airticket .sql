-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3307
-- Thời gian đã tạo: Th5 01, 2024 lúc 03:07 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ticketmanager`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chuyenbay`
--

CREATE TABLE `chuyenbay` (
  `id` int(11) NOT NULL,
  `idMayBay` int(11) NOT NULL,
  `maSanBayDi` varchar(20) NOT NULL,
  `maSanBayDen` varchar(20) NOT NULL,
  `ngayDi` datetime NOT NULL,
  `ngayDen` datetime NOT NULL,
  `thoiGianBay` time(6) NOT NULL,
  `ghiChu` longtext DEFAULT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chuyenbay`
--

INSERT INTO `chuyenbay` (`id`, `idMayBay`, `maSanBayDi`, `maSanBayDen`, `ngayDi`, `ngayDen`, `thoiGianBay`, `ghiChu`, `tinhTrang`) VALUES
(1, 1, 'SGN', 'HAN', '2024-04-11 04:50:12', '2024-04-11 07:50:12', '03:00:12.055000', 'Bao gồm:\r\n\r\ncheck\r\nHành lý xách tay: 10kg.\r\n\r\ncheck\r\nHành lý ký gửi: 30kg và 01 bộ dụng cụ chơi golf (nếu có).\r\n\r\ncheck\r\nPhòng chờ sang trọng (không áp dụng trên các chuyến bay nội địa Thái Lan và các sân bay có phòng chờ không đạt tiêu chuẩn hoặc đóng cửa trong giờ hoạt động của chuyến bay)\r\n\r\ncheck\r\nƯu tiên làm thủ tục trước chuyến bay\r\n\r\ncheck\r\nƯu tiên phục vụ hành lý\r\n\r\ncheck\r\nƯu tiên qua cửa an ninh (tùy theo điều kiện từng sân bay)\r\n\r\ncheck\r\nPhục vụ đưa đón riêng ra tàu bay (áp dụng trường hợp tàu bay đậu bãi; không áp dụng đối với sân bay không cung cấp dịch vụ xe đưa đón riêng)\r\n\r\ncheck\r\nƯu tiên chọn chỗ ngồi trên tàu bay (không áp dụng các hàng ghế dành cho khách Business)\r\n\r\ncheck\r\nThưởng thức ẩm thực tươi ngon suốt chuyến bay\r\n\r\ncheck\r\nBộ tiện ích (chuyến bay từ 04 tiếng trở lên)\r\n\r\ncheck\r\nHoàn bảo lưu định danh tiền vé trong vòng 02 (hai) năm kể từ ngày khởi hành dự kiến\r\n\r\ncheck\r\nBảo hiểm Sky Care (chưa áp dụng cho các chuyến bay do Thai Vietjet khai thác)', b'1'),
(2, 1, 'HAN', 'SGN', '2024-05-01 08:00:00', '2024-05-01 10:30:00', '02:30:00.000000', 'Chuyến bay thường xuyên giữa Hà Nội và TP Hồ Chí Minh.', b'1'),
(3, 1, 'SGN', 'HAN', '2024-05-02 09:30:00', '2024-05-02 12:00:00', '02:30:00.000000', 'Chuyến bay thường xuyên giữa TP Hồ Chí Minh và Hà Nội.', b'1'),
(4, 1, 'SGN', 'VCA', '2024-05-03 10:00:00', '2024-05-03 11:30:00', '01:30:00.000000', 'Chuyến bay từ TP Hồ Chí Minh đến Cần Thơ.', b'1'),
(5, 1, 'VCA', 'SGN', '2024-05-04 11:30:00', '2024-05-04 13:00:00', '01:30:00.000000', 'Chuyến bay từ Cần Thơ đến TP Hồ Chí Minh.', b'1'),
(6, 1, 'HAN', 'VCA', '2024-05-05 12:00:00', '2024-05-05 13:30:00', '01:30:00.000000', 'Chuyến bay từ Hà Nội đến Cần Thơ.', b'1'),
(7, 1, 'VCA', 'HAN', '2024-05-06 14:00:00', '2024-05-06 15:30:00', '01:30:00.000000', 'Chuyến bay từ Cần Thơ đến Hà Nội.', b'1'),
(8, 1, 'HAN', 'SGN', '2024-05-07 15:30:00', '2024-05-07 18:00:00', '02:30:00.000000', 'Chuyến bay từ Hà Nội đến TP Hồ Chí Minh.', b'1'),
(9, 1, 'SGN', 'HAN', '2024-05-08 17:00:00', '2024-05-08 19:30:00', '02:30:00.000000', 'Chuyến bay từ TP Hồ Chí Minh đến Hà Nội.', b'1'),
(10, 1, 'SGN', 'VCA', '2024-05-09 18:30:00', '2024-05-09 20:00:00', '01:30:00.000000', 'Chuyến bay từ TP Hồ Chí Minh đến Cần Thơ.', b'1'),
(11, 1, 'VCA', 'SGN', '2024-05-10 20:00:00', '2024-05-10 21:30:00', '01:30:00.000000', 'Chuyến bay từ Cần Thơ đến TP Hồ Chí Minh.', b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hangthanthiet`
--

CREATE TABLE `hangthanthiet` (
  `id` int(11) NOT NULL,
  `tenHang` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `diemTichLuy` int(11) NOT NULL,
  `khuyenMai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hangthanthiet`
--

INSERT INTO `hangthanthiet` (`id`, `tenHang`, `diemTichLuy`, `khuyenMai`) VALUES
(1, 'Đồng', 100, 5),
(2, 'Bạc', 200, 8),
(3, 'Vàng', 300, 14),
(4, 'Bạch Kim', 500, 20),
(5, 'Sắt', 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadonveban`
--

CREATE TABLE `hoadonveban` (
  `id` int(11) NOT NULL,
  `idNhanVien` varchar(12) NOT NULL,
  `idKhachHangLapHoaDon` varchar(12) NOT NULL,
  `ngayLapHoaDon` datetime NOT NULL,
  `tongTien` decimal(15,4) NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadonveban`
--

INSERT INTO `hoadonveban` (`id`, `idNhanVien`, `idKhachHangLapHoaDon`, `ngayLapHoaDon`, `tongTien`, `tinhTrang`) VALUES
(1, '090000000000', '080000000000', '2024-04-30 16:56:42', 2000000.0000, b'1'),
(2, '090000000000', '080000000000', '2024-05-01 10:15:23', 4000000.0000, b'1'),
(3, '090000000000', '080000000000', '2024-05-02 11:30:45', 6000000.0000, b'1'),
(4, '090000000000', '080000000000', '2024-05-03 12:45:56', 3000000.0000, b'1'),
(5, '090000000000', '080000000000', '2024-05-04 14:00:34', 2500000.0000, b'1'),
(6, '090000000000', '080000000000', '2024-05-05 15:30:12', 3500000.0000, b'1'),
(7, '090000000000', '080000000000', '2024-05-06 17:00:59', 4500000.0000, b'1'),
(8, '090000000000', '080000000000', '2024-05-07 18:45:38', 5000000.0000, b'1'),
(9, '090000000000', '080000000000', '2024-05-08 20:15:21', 5500000.0000, b'1'),
(10, '090000000000', '080000000000', '2024-05-09 21:30:10', 7000000.0000, b'1'),
(11, '090000000000', '080000000000', '2024-05-10 23:00:47', 8000000.0000, b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoanve`
--

CREATE TABLE `hoanve` (
  `id` int(11) NOT NULL,
  `idVeMayBay` int(11) NOT NULL,
  `phiHoanVe` decimal(15,4) NOT NULL,
  `lyDoHoan` longtext NOT NULL,
  `ngayHoan` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `cmnd` varchar(12) NOT NULL,
  `hoTen` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `soDienThoai` varchar(10) NOT NULL,
  `diaChi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ngaySinh` date DEFAULT NULL,
  `diemTichLuy` int(11) NOT NULL,
  `idHangThanThiet` int(11) NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`cmnd`, `hoTen`, `soDienThoai`, `diaChi`, `ngaySinh`, `diemTichLuy`, `idHangThanThiet`, `tinhTrang`) VALUES
('012345678901', 'Lê Thị Bích', '0978123456', '789 Đường XYZ, Quận ABC, TP HCM', '2000-05-25', 2000, 3, b'1'),
('021365984723', 'Lê Văn Hòa', '0934567812', '678 Đường XYZ, Quận ABC, TP HCM', '1975-11-12', 3500, 3, b'1'),
('032165498732', 'Hoàng Văn Tuấn', '0945612378', '890 Đường ABC, Quận XYZ, TP HCM', '1992-04-18', 2500, 1, b'1'),
('036598741254', 'Phạm Văn Bình', '0912345678', '234 Đường ABC, Quận XYZ, TP HCM', '1998-12-03', 1500, 4, b'1'),
('036598741258', 'Phan Văn Thành', '0912345678', '234 Đường XYZ, Quận ABC, TP HCM', '1990-08-15', 5000, 5, b'1'),
('054123698745', 'Trần Thị Ngọc', '0956781234', '567 Đường XYZ, Quận ABC, TP HCM', '1993-07-08', 3000, 5, b'1'),
('080000000000', 'Nguyễn Ngọc Thành Trúc', '0938814487', '38/4v xã Xuân Thới Đông ,Huyện Tân Phú Q7 ,TP HCM', '2003-12-10', 0, 5, b'1'),
('085678945612', 'Trần Thị Mai', '0987654321', '123 Đường ABC, Quận XYZ, TP HCM', '1995-03-15', 500, 1, b'1'),
('087412369854', 'Đỗ Thị Lan', '0923456781', '345 Đường XYZ, Quận ABC, TP HCM', '1985-09-30', 4000, 2, b'1'),
('098745123698', 'Nguyễn Thị Hằng', '0967812345', '901 Đường ABC, Quận XYZ, TP HCM', '1987-02-28', 4500, 4, b'1'),
('098745612378', 'Nguyễn Văn An', '0901234567', '456 Đường XYZ, Quận ABC, TP HCM', '1980-10-20', 1000, 2, b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaivemaybay`
--

CREATE TABLE `loaivemaybay` (
  `id` int(11) NOT NULL,
  `idChuyenBay` int(11) NOT NULL,
  `hangVe` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `giaVe` decimal(15,4) NOT NULL,
  `soLuongVeTong` int(11) NOT NULL,
  `soLuongVeCon` int(11) NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `loaivemaybay`
--

INSERT INTO `loaivemaybay` (`id`, `idChuyenBay`, `hangVe`, `giaVe`, `soLuongVeTong`, `soLuongVeCon`, `tinhTrang`) VALUES
(1, 1, 'Phổ Thông', 2000000.0000, 228, 228, b'1'),
(2, 1, 'Thương Gia', 4000000.0000, 54, 54, b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `maybay`
--

CREATE TABLE `maybay` (
  `id` int(11) NOT NULL,
  `ten` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `soGheH1` int(11) NOT NULL,
  `soGheH2` int(11) NOT NULL,
  `status` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `maybay`
--

INSERT INTO `maybay` (`id`, `ten`, `soGheH1`, `soGheH2`, `status`) VALUES
(1, 'B52', 54, 228, b'1'),
(2, 'A380', 80, 300, b'1'),
(3, 'Boeing 737', 60, 200, b'1'),
(4, 'Airbus A320', 50, 180, b'1'),
(5, 'Boeing 777', 70, 250, b'1'),
(6, 'Embraer E195', 40, 150, b'1'),
(7, 'Airbus A350', 65, 270, b'1'),
(8, 'Boeing 787', 75, 280, b'1'),
(9, 'Airbus A330', 55, 220, b'1'),
(10, 'ATR 72', 30, 90, b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `cmnd` varchar(12) NOT NULL,
  `soDienThoai` varchar(10) NOT NULL,
  `ho` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ten` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ngaySinh` date DEFAULT NULL,
  `gioiTinh` bit(1) NOT NULL,
  `tinhTrang` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`cmnd`, `soDienThoai`, `ho`, `ten`, `ngaySinh`, `gioiTinh`, `tinhTrang`) VALUES
('012345678901', '0901234567', 'Nguyễn', 'An', '1990-01-01', b'1', b'1'),
('090000000000', '0900000000', 'Nguyễn Nhân ', 'Viên', '2004-04-01', b'1', b'1'),
('123456789012', '0909876543', 'Trần', 'Bình', '1995-05-05', b'0', b'1'),
('234567890123', '0905678912', 'Lê', 'Cường', '1998-10-10', b'1', b'1'),
('345678901234', '0902345678', 'Phạm', 'Danh', '2000-02-15', b'0', b'1'),
('456789012345', '0906789123', 'Hồ', 'Đức', '1993-08-20', b'1', b'1'),
('567890123456', '0903456789', 'Nguyễn', 'Anh', '1985-12-25', b'0', b'1'),
('678901234567', '0907891234', 'Trần', 'Bảo', '1987-06-30', b'1', b'1'),
('789012345678', '0904567890', 'Lê', 'Chiến', '1991-03-12', b'0', b'1'),
('890123456789', '0908912345', 'Phạm', 'Cường', '1988-09-05', b'1', b'1'),
('901234567890', '0901237890', 'Hồ', 'Đăng', '1996-07-08', b'0', b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanbay`
--

CREATE TABLE `sanbay` (
  `maSanBay` varchar(20) NOT NULL,
  `ten` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sanbay`
--

INSERT INTO `sanbay` (`maSanBay`, `ten`, `status`) VALUES
('BMV ', 'Buôn Ma Thuột', b'1'),
('HAN', 'Hà Nội', b'1'),
('SGN', 'TP Hồ Chí Minh', b'1'),
('VCA', 'Cần Thơ ', b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `userName` varchar(40) NOT NULL,
  `passWord` varchar(40) NOT NULL,
  `ngayCap` date DEFAULT NULL,
  `tinhTrang` bit(1) NOT NULL,
  `cmndNhanVien` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`userName`, `passWord`, `ngayCap`, `tinhTrang`, `cmndNhanVien`) VALUES
('admin', 'admin', '2024-04-30', b'1', '090000000000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vemaybay`
--

CREATE TABLE `vemaybay` (
  `id` int(11) NOT NULL,
  `idHoaDonVeBan` int(11) NOT NULL,
  `idKhachHang` varchar(12) NOT NULL,
  `loaiVeMayBiDi` int(11) NOT NULL,
  `tinhTrang` bit(1) NOT NULL,
  `loaiVeMayBayVe` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `vemaybay`
--

INSERT INTO `vemaybay` (`id`, `idHoaDonVeBan`, `idKhachHang`, `loaiVeMayBiDi`, `tinhTrang`, `loaiVeMayBayVe`) VALUES
(1, 1, '080000000000', 1, b'1', NULL);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idMayBay` (`idMayBay`),
  ADD KEY `maSanBayDi` (`maSanBayDi`),
  ADD KEY `maSanBayDen` (`maSanBayDen`);

--
-- Chỉ mục cho bảng `hangthanthiet`
--
ALTER TABLE `hangthanthiet`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `hoadonveban`
--
ALTER TABLE `hoadonveban`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idKhachHangLapHoaDon` (`idKhachHangLapHoaDon`),
  ADD KEY `idNhanVien` (`idNhanVien`);

--
-- Chỉ mục cho bảng `hoanve`
--
ALTER TABLE `hoanve`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idVeMayBay` (`idVeMayBay`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`cmnd`),
  ADD KEY `idHangThanThiet` (`idHangThanThiet`);

--
-- Chỉ mục cho bảng `loaivemaybay`
--
ALTER TABLE `loaivemaybay`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idChuyenBay` (`idChuyenBay`);

--
-- Chỉ mục cho bảng `maybay`
--
ALTER TABLE `maybay`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`cmnd`);

--
-- Chỉ mục cho bảng `sanbay`
--
ALTER TABLE `sanbay`
  ADD PRIMARY KEY (`maSanBay`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`userName`),
  ADD KEY `cmndNhanVien` (`cmndNhanVien`);

--
-- Chỉ mục cho bảng `vemaybay`
--
ALTER TABLE `vemaybay`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idHoaDonVeBan` (`idHoaDonVeBan`),
  ADD KEY `idKhachHang` (`idKhachHang`),
  ADD KEY `idLoaiVeMayBay` (`loaiVeMayBiDi`),
  ADD KEY `loaiVeMayBayVe` (`loaiVeMayBayVe`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chuyenbay`
--
ALTER TABLE `chuyenbay`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `hangthanthiet`
--
ALTER TABLE `hangthanthiet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `hoadonveban`
--
ALTER TABLE `hoadonveban`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `hoanve`
--
ALTER TABLE `hoanve`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `loaivemaybay`
--
ALTER TABLE `loaivemaybay`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `maybay`
--
ALTER TABLE `maybay`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `vemaybay`
--
ALTER TABLE `vemaybay`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD CONSTRAINT `chuyenbay_ibfk_1` FOREIGN KEY (`idMayBay`) REFERENCES `maybay` (`id`),
  ADD CONSTRAINT `chuyenbay_ibfk_2` FOREIGN KEY (`maSanBayDi`) REFERENCES `sanbay` (`maSanBay`),
  ADD CONSTRAINT `chuyenbay_ibfk_3` FOREIGN KEY (`maSanBayDen`) REFERENCES `sanbay` (`maSanBay`);

--
-- Các ràng buộc cho bảng `hoadonveban`
--
ALTER TABLE `hoadonveban`
  ADD CONSTRAINT `hoadonveban_ibfk_1` FOREIGN KEY (`idKhachHangLapHoaDon`) REFERENCES `khachhang` (`cmnd`),
  ADD CONSTRAINT `hoadonveban_ibfk_2` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`cmnd`);

--
-- Các ràng buộc cho bảng `hoanve`
--
ALTER TABLE `hoanve`
  ADD CONSTRAINT `hoanve_ibfk_1` FOREIGN KEY (`idVeMayBay`) REFERENCES `vemaybay` (`id`);

--
-- Các ràng buộc cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`idHangThanThiet`) REFERENCES `hangthanthiet` (`id`);

--
-- Các ràng buộc cho bảng `loaivemaybay`
--
ALTER TABLE `loaivemaybay`
  ADD CONSTRAINT `loaivemaybay_ibfk_1` FOREIGN KEY (`idChuyenBay`) REFERENCES `chuyenbay` (`id`);

--
-- Các ràng buộc cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`cmndNhanVien`) REFERENCES `nhanvien` (`cmnd`);

--
-- Các ràng buộc cho bảng `vemaybay`
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
